import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	ArrayList<Producto> listaProductos = new ArrayList<>();
	Producto producto ; 
	 int bandera = 0; 
	
	public Procesos() {
		iniciar();
	}
	
	private void iniciar() {
		String menu = "REGISTRO DE PRODUCTOS\n" + 
	                  "1. Registrar Productos\n" + 
				      "2. Imprimir Lista\n" + 
	                  "3. Editar Producto\n" + 
				      "4. Buscar Producto\n" + 
	                  "5. Eliminar Producto\n" + 
				      "6. Salir"; 
		int opc;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			
			switch (opc) {
			case 1:
				pedirDatos(); 
				break;
			case 2:
				imprimirLista(); 
				break; 
			case 3:
				actualizarProducto();
				break; 
				
			case 4: 
				buscarProducto(); 
				
				break; 
				
			case 5: 
				
				eliminarProducto(); 
				break; 
			case 6: 
				
				break; 

			default:
				JOptionPane.showMessageDialog(null, "ERROR", "Opcion invalida", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(opc != 6); 
		
		
		
		
		
		
	}
	
	
	private void pedirDatos() {
		 int cantRegistro = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos va a registrar?")); 
		 
		 for(int i = 0; i < cantRegistro; i++) {
			 
			 String nombre = JOptionPane.showInputDialog("Nombre del producto " + (i+1) +" :");
			 int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto " + (i+1) + " : ")); 
			 double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto " + (i+1) + " :")); 
			 
			 producto = new Producto(nombre, 1, 1); 
			 
			 boolean cantidadValida = producto.setCantidad(cantidad); 
			 boolean precioValido = producto.setPrecio(precio); 
			 
			 
			 if(cantidadValida && precioValido) {
				 
				 listaProductos.add(producto);
				 bandera++;
				 
			 }
			 
		 }
		 
		  
		 
		 
		 
		  
	}
	
	
	private void imprimirLista() {
		String mensaje = ""; 
		
		
		if(bandera != 0) {
			for(Producto p : listaProductos) {
				mensaje += "Nombre producto: " + p.getNombre() + "\n" +
						   "Cantidad: "+ p.getCantidad() + "\n" + 
						   "Precio: " + p.getPrecio() + "\n" + 
						   "-------------------------\n"; 
			}
			
			System.out.println(mensaje);
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe registrar primero los productos", "ERROR", JOptionPane.ERROR_MESSAGE); 
		}
		
	}
	
	
	private void actualizarProducto() {
		
		if(bandera != 0) {
			String nombreBuscar = JOptionPane.showInputDialog("Nombre del producto a modificar: "); 
			
			String nuevoNombre; 
			int nuevaCantidad; 
			double nuevoPrecio; 
			
			for(Producto p : listaProductos) {
				
				if(p.getNombre().equalsIgnoreCase(nombreBuscar)) {
					
					nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre del producto:"); 
					nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Nueva cantidad del producto:")); 
					nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio del producto:")); 
					
					p.setNombre(nuevoNombre);
					p.setCantidad(nuevaCantidad);
					p.setPrecio(nuevoPrecio);
					
					JOptionPane.showMessageDialog(null,"Producto actualizado" , "Exito", JOptionPane.WARNING_MESSAGE);
					
					return; 
					
				} 
			}
			
			JOptionPane.showMessageDialog(null,"Este nombre no fue encontrado en los productos registrados" , "ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			
			JOptionPane.showMessageDialog(null, "Debe registrar primero los productos", "ERROR", JOptionPane.ERROR_MESSAGE); 
		}
		
		
		
	}
	
	
	private void buscarProducto() {
		
		
		if(bandera != 0) {
			String nombre = JOptionPane.showInputDialog("Nombre del producto a buscar"); 
	    	 
	    	 for(Producto p : listaProductos) {
	    		 
	    		 if(p.getNombre().equalsIgnoreCase(nombre)) {
	    			 
	    			 System.out.println("Nombre Producto: " + p.getNombre()); 
	    	    	 System.out.println("Cantidad Producto: " + p.getCantidad()); 
	    	    	 System.out.println("Precio Producto: " + p.getPrecio()); 
	    	    	 System.out.println("-------------------------");
	    	    	 
	    	    	 return; 
	    		 }
	    			     			    		 
	    	 }
	    	 JOptionPane.showMessageDialog(null,"Producto no encontrado" , "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			 
			JOptionPane.showMessageDialog(null, "Debe registrar primero los productos", "ERROR", JOptionPane.ERROR_MESSAGE); 
		}
		
    	 
    	 
		 
		
	}
	
	private void eliminarProducto() {
		
		if(bandera != 0) {
			
			int indice = Integer.parseInt(JOptionPane.showInputDialog("Indice del producto a eliminar")); 
			
			if(indice >= 0 && indice < listaProductos.size()) {
				
				listaProductos.remove(indice); 
				JOptionPane.showMessageDialog(null,"Producto Eliminado" , "Exito", JOptionPane.WARNING_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(null,"Indice invalido" , "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Debe registrar primero los productos", "ERROR", JOptionPane.ERROR_MESSAGE); 
		}
		
		
		
		
	}
	

}
