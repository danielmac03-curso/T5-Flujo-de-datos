import javax.swing.JOptionPane;

public class Ejercicio_013App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int) y un signo
		aritmético (String), según este último se realizara la operación correspondiente. Al final
		mostrara el resultado en un cuadro de dialogo*/
		
		String number1 = JOptionPane.showInputDialog("Introduzca el primer número:");
		int numberInt1 = Integer.parseInt(number1);
		
		String number2 = JOptionPane.showInputDialog("Introduzca el segundo número:");
		int numberInt2 = Integer.parseInt(number2);

		String operator = JOptionPane.showInputDialog("Introduzca el operador:");
		
		int result = 0; 
		boolean error = false;

		switch (operator) {
		case "+":
			result = numberInt1 + numberInt2;
			break;
		case "-":
			result = numberInt1 - numberInt2;
			break;
		case "*":
			result = numberInt1 * numberInt2;
			break;
		case "/":
			result = numberInt1 / numberInt2;
			break;
		case "^":
			result = numberInt1 ^ numberInt2;
			break;
		case "%":
			result = numberInt1 % numberInt2;
			break;
		default:
			error = true;
			break;
		}
		
		if(error == false) {
			JOptionPane.showMessageDialog(null, "El resulado de " + number1 + operator + number2 + " es igual a " + result);
		}else{
			JOptionPane.showMessageDialog(null, "Debe introducir un operador valido");
		}

	}

}
