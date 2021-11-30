/*Una nueva version del lloro el lloro repite palabras si al lloro se le pone la palabra quadrat escribe un cuadrado 5x5 y si esribe rectagulo escribe un rectangulo 5x10 si al lloro se le pasa un texto en blank + un enter acaba el programa adeu*/
public class LloroQuadrat{
	public static void main(String[] args){
	lloro();
	}

	public static void lloro (){
	System.out.println("El lloro espera paraula:");
	String palabra=Entrada.readLine();
		while(!palabra.isBlank() && !palabra.isEmpty()){
			System.out.println("El lloro repeteix: "+palabra);
			System.out.println("El lloro espera paraula:");
			palabra=Entrada.readLine();
		}
		System.out.println("Adéu");	
	}
}
