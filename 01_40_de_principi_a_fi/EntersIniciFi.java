/*El programa pedira tres valores al usuario valor inicial y el valor final el primer valor siempre sera menor al 2do valor y el usuario nos introducira un salto*/
public class EntersIniciFi{
	public static void main (String []args){
	System.out.println("Valor inicial?");
	int inicial=Integer.parseInt(Entrada.readLine());
	System.out.println("Valor final?");
	int final1=Integer.parseInt(Entrada.readLine());
	System.out.println("Salt?");
	int salto=Integer.parseInt(Entrada.readLine());
	int contador=0;
		while(inicial>final1){
			//contador=contador+salto;
			inicial=inicial+salto;
			//System.out.println(inicial);
			System.out.println(inicial);
			//System.out.println(contador);	
		}
	}
}
