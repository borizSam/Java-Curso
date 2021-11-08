/*Encontrar el valor maximo de los numeros introducidos cuando el usuario introduzca un numero negativo el rpograma acabara y nos enseñara un numero mayor */
public class TrobaMaxim {
	public static void main (String[]args){
	//System.out.println("Introdueix un valor");
	int valor=1;
	int maxim=0;
		while(valor>0){
			System.out.println("Introdueix un valor");
			valor=Integer.parseInt(Entrada.readLine());
			//valor=maxim;
			if (valor>maxim){
				maxim=valor;
			}
		}
	System.out.println("El màxim és "+maxim);
	}
}
