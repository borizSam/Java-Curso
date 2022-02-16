public class LlloroVocalMinuscules{
	public static void main (String[]args){
	System.out.println("El lloro pregunta paraula que comince amb voal");
	String paraula=Entrada.readLine();
	
		while (!paraula.isBlank() && !paraula.isEmpty()){
			//if (paraula.charAt(0)=='a' or paraula.charAt(0)== 'e' or paraula.charAt(0)== 'i' or paraula.charAt(0)== 'o' or paraula.charAt(0)== 'u' ){
				System.out.println("El lloro diu: "+paraula.toUpperCase(0));
			//}
			System.out.println("El lloro diu: "+paraula);
			Sytem.out.println("El lloro pregunta paraula que cominci amb vocal en minuscules");
			paraula=Entrada.readLine();
		
		}
		System.out.println("Adeu");
	
	}
}
