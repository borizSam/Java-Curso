/*Programa que pide numeros enteros positivos al usuario y cuando el usuario introduzca un numero negativo el programa acabe y nos enseñe cuantos numeros pares introducio en usuario*/

public class ComptaParells {
	public static void main (String[]args){
	int valor =0;
	int comtador=0;
		while (valor > 0){
			System.out.println("Introdueix un valor");
                        valor =Integer.parseInt(Entrada.readLine());
			if (valor % 2==0){
				comtador=comtador+1;
			}
		}

		System.out.println("Valors parells introduïts: "+comtador);
	}
}
