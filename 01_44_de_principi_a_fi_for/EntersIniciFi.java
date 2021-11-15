/*Incicial final y el salto */
public class EntersIniciFi{
	public static void main (String[]args){
	System.out.println("Valor inicial?");
	int inicial=Integer.parseInt(Entrada.readLine());
	System.out.println("Valor final");
	int final1=Integer.parseInt(Entrada.readLine());
	System.out.println("Salt?");
	int salto=Integer.parseInt(Entrada.readLine());
	for (inicial=inicial; inicial<=final1 && salto>0; inicial=inicial+salto){
		System.out.println(inicial);
	}
	
	}
}
