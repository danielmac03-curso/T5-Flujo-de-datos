import javax.swing.JOptionPane;
public class Ejercicio_03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
		(recuerda usar JOptionPane).*/
		String name = JOptionPane.showInputDialog("Introduzca su nombre:");
		
		//Mostrar resultado
		System.out.println("Bienvenido " + name);

	}

}
