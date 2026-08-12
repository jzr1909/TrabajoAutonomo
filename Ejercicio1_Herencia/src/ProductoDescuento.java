import javax.swing.JOptionPane;

public class ProductoDescuento extends Productos {
	
	private double descuento; 
	private double precioFinal; 
	
	
	
	public void calcularDescuento() {
		
		int categoria = Integer.parseInt(JOptionPane.showInputDialog("Cual es su categoria? \n 1 - 2 - 3 ")); 
		setCategoria(categoria); 
		
		switch (categoria) {
		case 1:
			descuento = 0.05; 
			
			break;
			
		case 2:
			descuento = 0.1; 
			
			break; 
		case 3:
			descuento = 0.15;
			
			break; 

		default:
			JOptionPane.showMessageDialog(null, "Categoria inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
	
	public void calcularPrecioFinal() {
		
		precioFinal = getPrecio() - (getPrecio() * descuento); 
		
		
		setPrecio(precioFinal);  
	}

}
