/*Dias de la semana segun los nuemros*/
public class DiaSetmana {
	public static void main (String[] args){
		int dia = Integer.parseInt(args[0]);
		if ( dia == 1 ){
			System.out.println("Dilluns");
		} else if ( dia == 2){
			System.out.println("Dimarts");
		} else if (dia == 3){
			System.out.println("Dimecres");
		} else if (dia == 4){
			System.out.println("Dijous");
		} else if (dia == 5){
			System.out.println("Divendres");
		} else if (dia == 6){
			System.out.println("Dissabte");
		} else if (dia == 7){
			System.out.println("Diumenge");
		} else {
			System.out.println("Error");
		}
	}
}
