import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

    double valorTotalPago = 0;

    ArrayList<Persona> personasList;
    HashMap<String, Persona> personasMap;

    public Procesos() {

        personasList = new ArrayList<Persona>();
        personasMap = new HashMap<String, Persona>();

        int cant = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de empleados:")
        );

        for (int i = 0; i < cant; i++) {
            pedirDatos();
        }

        System.out.println("======================================");
        System.out.println("VALOR TOTAL DE LOS PAGOS: " + valorTotalPago);
        System.out.println("======================================");

        System.out.println("\nLISTA DE EMPLEADOS:");
        System.out.println(personasList);

        System.out.println("\nNOMBRES DE LOS EMPLEADOS:");

        for (int i = 0; i < personasList.size(); i++) {
            System.out.println(personasList.get(i).getNombre());
        }

        System.out.println("\nDOCUMENTO - NOMBRE:");

        for (Persona p : personasList) {
            System.out.println(
                    p.getDocumento() + " - " + p.getNombre()
            );
        }

        System.out.println("\nMAPA DE EMPLEADOS:");
        System.out.println(personasMap);
    }

    public void pedirDatos() {

        Persona persona = new Persona();

        persona.llenarDatos();

        calcularBonificacionDescuento(persona);

        calcularPago(persona);

        System.out.println(persona);

        personasList.add(persona);

        personasMap.put(persona.getDocumento(), persona);
    }

    private void calcularPago(Persona persona) {

        double pago = persona.getSalarioActual()
                + (persona.getSalarioActual() * persona.getBonificacion())
                - (persona.getSalarioActual() * persona.getDescuento());

        persona.setValorPago(pago);

        valorTotalPago = valorTotalPago + persona.getValorPago();

        System.out.println(
                "Hola " + persona.getNombre()
                + ", el pago final es: "
                + persona.getValorPago()
        );
    }

    private void calcularBonificacionDescuento(Persona persona) {

        switch (persona.getCategoria()) {

            case 1:
                persona.setBonificacion(0.15);
                persona.setDescuento(0.02);
                break;

            case 2:
                persona.setBonificacion(0.10);
                persona.setDescuento(0.015);
                break;

            case 3:
                persona.setBonificacion(0.08);
                persona.setDescuento(0.01);
                break;

            case 4:
                persona.setBonificacion(0.0);
                persona.setDescuento(0.0);
                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "La categoría no existe."
                );
                break;
        }
    }
	
	
	
	
	
}
