/*El programa pide dos numeros al usuario el inicial y el valor final y al final los suma*/
public class SumaInterval{
	public static void main (String[]args){
	System.out.println("inici?");
	int vinicial=Integer.parseInt(Entrada.readLine());
	System.out.println("final?");
	int vfinal=Integer.parseInt(Entrada.readLine());
		for (vinicial=vinicial;vinicial<=vfinal && vfinal<=vinicial ;vinicial=vinicial+vfinal){
			System.out.println(vinicial);
		}
	}
}
