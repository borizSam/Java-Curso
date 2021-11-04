/*Programa que pide al usuario que introduzca un valor cuando el usuario introduce un valor negativo el programa termina y nos enseña por pantalla el valor maximo que introduccio el usuario*/

public class TrobaMaxim {
	public static void main (String[]args){
	int maxim=0;
	int numero=0;
		while(numero>=0){
 		System.out.println("Introdueix un valor");
		numero=Integer.parseInt(Entrada.readLine());
			if(numero>0){
				maxim=numero+0;
			}
		}
		System.out.println("El màxim és "+maxim);
	}
}
