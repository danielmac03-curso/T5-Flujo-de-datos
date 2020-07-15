import javax.swing.JOptionPane;
public class Ejercicio05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
		debemos indicarlo.*/
		
		String num = JOptionPane.showInputDialog("Introduzca el número:");
		double numDouble = Double.parseDouble(num);
		
		if(numDouble %2 == 0) {
			System.out.println("El numero es divisible entre 2");
		}else {
			System.out.println("El numero NO es divisible entre 2");
		}

	}

}
