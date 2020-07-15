import javax.swing.JOptionPane;
public class Ejercicio_10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realiza una aplicación que nos pida un número de ventas a introducir, después nos
		pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
		mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		String ventas = JOptionPane.showInputDialog("Introduzca nº de ventas:");
		double ventasDouble = Double.parseDouble(ventas);
		
		double precio = 0;
		for (int i = 1; i < (ventasDouble)+1; i++) {
			String ventasPrecio = JOptionPane.showInputDialog("Introduzca el precio de la :" + i + "º venta");
			double ventasPrecioDouble = Double.parseDouble(ventasPrecio);
			
			precio += ventasPrecioDouble;			
			
		}
		
		System.out.println("Nº de ventas: " + ventasDouble);
		System.out.println("Precio total de las ventas: " + precio);


	}

}
