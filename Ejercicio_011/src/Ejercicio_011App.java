import javax.swing.JOptionPane;
public class Ejercicio_011App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un d�a laboral
		o no. Usa un switch para ello.*/
		
		String dia = JOptionPane.showInputDialog("Introduzca un d�a de la semana:");
		String diaMayuscula = dia.toUpperCase();
		
		boolean laboral = false;
		boolean switchDefault = false;
		
		switch (diaMayuscula) {
			case "LUNES":
				laboral = true;
				break;
			case "MARTES":
				laboral = true;
				break;
			case "MIERCOLES":
				laboral = true;	
				break;
			case "JUEVES":
				laboral = true;
				break;
			case "VIERNES":
				laboral = true;
				break;
			case "SABADO":
				laboral = false;
				break;
			case "DOMINGO":
				laboral = false;
				break;
			default:
				System.out.println("Introduce un d�a de la semana corretamente");
				switchDefault = true;
				break;
		}
		
		//Compuebo s� es un d�a laboral indico que es un d�a laboral
		//Si no lo fuera y pero si es un dia indico que no es un d�a laboral
		if(laboral == true) {
			String result = "El " + dia + " es un dia laboral";
			System.out.println(result);
		}else if (switchDefault == false){
			String result = "El " + dia + " NO es un dia laboral";
			System.out.println(result);
		}
				
	}

}
