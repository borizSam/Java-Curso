/*sumar tres positivos*/
public class SumaPositius{
    public static void main(String[] args) {
	System.out.println("Introdueix el primer valor");
	int nota=Integer.parseInt(Entrada.readLine());
	int suma=0;
		while (nota >=0){
			suma = suma+nota;
			System.out.println("Introdueix el primer valor");
			nota=Integer.parseInt(Entrada.readLine());

		}
		System.out.println("La suma és "+suma);
    }
}
