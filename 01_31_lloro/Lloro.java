/*Programa que pide al usuario una palabra y el loro lo repite cuando el usiario introduza un spacio el programa termina yse despide*/
public class Lloro {
	public static void main (String[]args){
	//System.out.println("El lloro espera paraula:");
	
	String space= "hola";
	
		while (!space.isBlank() && !space.isEmpty()){
			System.out.println("El lloro espera paraula:");
			space =Entrada.readLine();
			System.out.println("El lloro repeteix: "+space);

		}
		System.out.println("Adéu");
	}
}

