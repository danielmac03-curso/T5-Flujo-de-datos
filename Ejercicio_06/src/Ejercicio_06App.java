import javax.swing.JOptionPane;
public class Ejercicio_06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
		calcule el precio final con IVA. El IVA sera una constante que sera del 21%*/
		
		double IVA = 0.21;
		
		String num = JOptionPane.showInputDialog("Introduzca el precio del producto:");
		double numDouble = Double.parseDouble(num);
		
		System.out.println("El precio sin Iva es " + numDouble + " y con IVA se queda en " + (numDouble*IVA+numDouble));


	}

}
