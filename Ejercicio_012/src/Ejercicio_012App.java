import javax.swing.JOptionPane;
public class Ejercicio_012App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
		se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
		la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n
		de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
		
		String password = JOptionPane.showInputDialog("Introduzca una contrase�a:");
		String passwordCheck;
		int passwordTry = 0;
				
		do {
			passwordCheck = JOptionPane.showInputDialog("Introduzca de nuevo la contrase�a:");
			passwordTry++;
		}while(!password.equals(passwordCheck) && passwordTry <= 2);
		
		if(password.equals(passwordCheck)) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}

	}

}
