/*Suma positivos cuando el usuario introduzca un valor negativo el programa acaba*/
public class SumaPositius {
	public static void main(String[]args){
	System.out.println("Introdueix el primer valor");
	int num=Integer.parseInt(Entrada.readLine());
	int suma=0;
		while (num >=0){
			suma=suma+num;
			System.out.println("Introdueix el primer valor");
			num=Integer.parseInt(Entrada.readLine());
		}
	System.out.println("La suma és "+suma);
	}
}
