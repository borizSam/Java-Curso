/*Programa que calcula el precio si falta o sobra */
public class Pagament {
	public static void main (String[]args){
	System.out.println("Preu?");
	int preu=Integer.parseInt(Entrada.readLine());
	System.out.println("Paga?");
	int paga=Integer.parseInt(Entrada.readLine());
	int suma= preu - paga; /*Calculamos el resultado*/
	int resultado= Math.abs(suma); /*Convertimos el resultado en positivo*/
	if (suma>1){
		System.out.println("Falten "+resultado+"€");
	}else if (suma==0){
		System.out.println("No sobra ni falta res");
	}else{
		 System.out.println("Sobren "+resultado+"€");
	}
	}
}
