/*Programa que pide al usuario una palabra y el loro lo repite cuando el usiario introduza un spacio el programa termina yse despide*/
public class Lloro {
	public static void main (String[]args){
	System.out.println("El lloro espera paraula:");
	String space= Entrada.readLine();
	
		while (!space.isBlank() && !space.isEmpty()){

			System.out.println("El lloro espera paraula:");
			System.out.println("El lloro repeteix: "+space);
			space =Entrada.readLine();
			//System.out.println("El lloro repeteix: "+space);

		}
		System.out.println("Adéu");
	}
}

