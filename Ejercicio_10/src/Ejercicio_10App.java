import javax.swing.JOptionPane;
public class Ejercicio_10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, despu�s nos
		pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. Al final
		mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		String ventas = JOptionPane.showInputDialog("Introduzca n� de ventas:");
		double ventasDouble = Double.parseDouble(ventas);
		
		double precio = 0;
		for (int i = 1; i < (ventasDouble)+1; i++) {
			String ventasPrecio = JOptionPane.showInputDialog("Introduzca el precio de la :" + i + "� venta");
			double ventasPrecioDouble = Double.parseDouble(ventasPrecio);
			
			precio += ventasPrecioDouble;			
			
		}
		
		System.out.println("N� de ventas: " + ventasDouble);
		System.out.println("Precio total de las ventas: " + precio);


	}

}
