public class Pagament{
	public static void main (String[]args){
	System.out.println("Preu?");
	int preu = Integer.parseInt(Entrada.readLine());
	System.out.println("Paga?");
	int paga = Integer.parseInt(Entrada.readLine());
	int suma= preu - paga;
	System.out.println(suma);
	}
}
