import javax.swing.JOptionPane;
public class Ejercicio_04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Haz una aplicaci�n que calcule el �rea de un circulo (pi*R2
		). El radio se pedir� por teclado
		(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
		m�todo pow de Math.*/
		final double PI = 3.14;
		
		//Pedir al usuario el radio y guardarlo en una varible
		String radio = JOptionPane.showInputDialog("Introduzca el radio del circulo:");
		
		//Pasar de string a double
		double radioDouble = Double.parseDouble(radio);
		
		//Formula  (pi*R2)
		double resultado = (PI * (Math.pow(radioDouble, 2)));
		
		//Mostrar resultado
		System.out.println(resultado);
		
	}

}
