import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	
	ArrayList<Productos> productosList; 
	HashMap<Integer, Productos> productosMap; 
	
	public Procesos() {
		
		productosList = new ArrayList<Productos>(); 
		productosMap = new HashMap <Integer, Productos>();
			
			int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos va a registrar?")); 
			
			for(int i = 0; i < cant; i++) {
				
				pedirDatos(); 
			}
			
			imprimirDatos();
		
		
	}
		
		public void  pedirDatos() {
			
			 
			ProductoDescuento producto = new ProductoDescuento(); 
			
			producto.llenarDatos();
			
			producto.calcularDescuento();
			producto.calcularPrecioFinal();
			
			productosList.add(producto); 
			productosMap.put(producto.getCodigo(), producto); 
			
			
			
			
		}
		
		
		public void imprimirDatos() {
			
			System.out.println("========== Productos registrados ==========");
			
			for( Productos p : productosList) {
				
				System.out.println("Nombre Producto: " + p.getNombre());
				System.out.println("Codigo Producto: " + p.getCodigo());
				System.out.println("Categoria Producto: " + p.getCategoria());
				System.out.println("Precio: " + p.getPrecio());
				System.out.println();
			}
		}
		
		
		
}

	
	


