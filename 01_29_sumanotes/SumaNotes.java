public class SumaNotes {
	public static void main (String[]args){
	System.out.println("Introdueix una nota");
        int nota=Integer.parseInt(Entrada.readLine());
	int suma=0;
		while (nota >=0 && nota <=100){
			suma = suma+nota;
			System.out.println("Introdueix una nota");
			nota=Integer.parseInt(Entrada.readLine());

		}
		System.out.println("La suma de les notes valides es "+suma);
	}
}
