import javax.swing.JOptionPane;

public class Producto {

    private String nombre; 
    private int cantidad; 
    private double precio; 
    
    
    public Producto(String nombre, int cantidad, double precio) {
    	
    	this.nombre = nombre; 
    	setCantidad(cantidad);
    	setPrecio(precio); 
    	
    		
    		
        	
    	
    	
    }
    
    
    public void setNombre(String nombre) {
    	
    	this.nombre = nombre; 
    	
    }
    
    
    public String getNombre() {
    	return nombre; 
    	
    }
    
    
    public boolean setCantidad(int cantidad) {
    	if(cantidad <= 0) {
    		JOptionPane.showMessageDialog(null, "No se permite esta cantidad " + cantidad + " debe ser mayor a 0");
    		 return false; 
    	}else {
    		this.cantidad = cantidad;
    		return true; 
    	}
    	 
    	
    }
       
    public int getCantidad() {
    	
    	return cantidad; 
    	
    }
    
    public boolean setPrecio(double precio) {
    	
    	if(precio <= 0) {
    		JOptionPane.showMessageDialog(null, "No se permite este precio " + precio + " debe ser mayor a 0");
    		return false; 
    	}else {
    		this.precio = precio; 
    		return true; 
    	}
    	
    	
    	
    }
    
    public double getPrecio() {
    	
    	return precio; 
    	
    }
    
    
    
    
    
    
    

}

