import javax.swing.JOptionPane; //Permite llamar al JOptionPane

public class Numeros { //Crea la clase Numeros

	
	int numero; // variable que guarda cada numero ingresado
    int i, neg = 0, par = 0; // Variable de numero de repeticiones, contador de numeros negativos y pares

    
    public void entrada() { // En este metodo se realiza la logica si es par o negativo

        for (i = 0; i < 5; i++) { //repite esto mismo 5 veces

            numero = ingresarDatos("digite 1 numero"); // Pide un numero y lo guarda en numero 

            if (numero % 2 == 0) { // condicion que valida si es par
                par++; // contador que suma 1 a 1 si la condicion de par se cumple
            }

            if (numero < 0) { // condicion que valida si es negativo
                neg++; // contador que suma 1 a 1 si la condicion negativos se cumple
            }
        }

        JOptionPane.showMessageDialog(null,
                "el numero de numeros pares es: " + par + "\n"
                + "y el numero de numeros negativos es: " + neg); // Muestra en una ventana el numero de pares que se encontraron y el numero de negativos
    }

    public static int ingresarDatos(String mensaje) { // metodo que almacena el numero

        String cadena;
        int valor;

        cadena = JOptionPane.showInputDialog(null, mensaje);
        valor = Integer.parseInt(cadena); // convierte el dato ingresado a numero

        return valor; // retorna el numero
    }
}
