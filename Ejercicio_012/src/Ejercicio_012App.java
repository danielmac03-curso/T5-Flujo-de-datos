import javax.swing.JOptionPane;
public class Ejercicio_012App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
		se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
		la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición
		de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
		
		String password = JOptionPane.showInputDialog("Introduzca una contraseña:");
		String passwordCheck;
		int passwordTry = 0;
				
		do {
			passwordCheck = JOptionPane.showInputDialog("Introduzca de nuevo la contraseña:");
			passwordTry++;
		}while(!password.equals(passwordCheck) && passwordTry <= 2);
		
		if(password.equals(passwordCheck)) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}

	}

}
