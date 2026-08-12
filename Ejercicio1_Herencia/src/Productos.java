import javax.swing.JOptionPane;

public class Productos {
	
	private String nombre; 
	private int codigo;
	private double precio; 
	private int categoria; 
	
	
	public void llenarDatos() {
		
		nombre = JOptionPane.showInputDialog("Nombre del producto"); 
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo del producto:")); 
		precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:")); 
	
		
	}
	
	
	public void setNombre (String nombre) {
		this.nombre = nombre; 
	}
	
	
	public String getNombre() {
		return nombre; 
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo; 
	}
	
	public int getCodigo() {
		return codigo; 
	}
	
	public void setPrecio(double precio) {
		this.precio = precio; 
	}
	
	public double getPrecio() {
		return precio; 
	}
	
	public void setCategoria(int categoria) {
		this.categoria = categoria; 
	}
	
	public int getCategoria() {
		return categoria; 
	}
	

}
