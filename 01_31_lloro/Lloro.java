/*Programa que pide al usuario una palabra y el loro lo repite cuando el usiario introduza un spacio el programa termina yse despide*/
public class Lloro {
	public static void main (String[]args){
<<<<<<< HEAD
	String space= "";
		while (space==space.isEmpty){
=======
	String space="";
		while (space.isBlank()==true){
>>>>>>> 7d8fcba9e80c480066c46ba86b3d1ff20bd38b23
			System.out.println("El lloro espera paraula:");
			space =Entrada.readLine();
			System.out.println("El lloro repeteix: "+space);

		}
		System.out.println("Adéu");
	}
}
