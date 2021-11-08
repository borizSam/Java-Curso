<<<<<<< HEAD
/*Programa que pide al usuario que introduzca un valor cuando el usuario introduce un valor negativo el programa termina y nos enseña por pantalla el valor maximo que introduccio el usuario*/

public class TrobaMaxim {
	public static void main (String[]args){
	int maxim=0;
	int valor=0;
	int numero=0;
		while(numero>=0){
 		System.out.println("Introdueix un valor");
		valor=Integer.parseInt(Entrada.readLine());
			if(
){
			}
		}
		System.out.println("El màxim és "+maxim);
=======
/*Encontrar el valor maximo de los numeros introducidos cuando el usuario introduzca un numero negativo el rpograma acabara y nos enseñara un numero mayor */
public class TrobaMaxim {
	public static void main (String[]args){
	System.out.println("Introdueix un valor");
	int valor=Integer.parseInt(Entrada.readLine());
	int maxim=0;
	maxim=valor;
	while (valor >0){
		System.out.println("Introdueix un valor");
		valor=Integer.parseInt(Entrada.readLine());
		if (valor>maxim){
			maxim=valor;
		}
	if (valor<=0){
        System.out.println("El màxim és "+"0");
	}
	System.out.println("El màxim és "+maxim);
	}
>>>>>>> 7d8fcba9e80c480066c46ba86b3d1ff20bd38b23
	}
}
