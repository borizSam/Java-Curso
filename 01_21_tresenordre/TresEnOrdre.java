/*Programa que ordena tres numeros introducidos por el usuario de menor a mayor */
public class TresEnOrdre{
	public static void main(String[]args){
		System.out.println("Primer?");
		int a = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int b = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int c = Integer.parseInt(Entrada.readLine());
		int mayor;
		int menor;
		int medio;
		if (a > b && a > c) {
            		mayor = a;
       		} else if (b > a && b > c) {
            		mayor = b;
        	} else {
            		mayor = c;
        	}

        	if (a < b && a < c) {
            		menor = a;
        	} else if (b < a && b < c) {
        		menor = b;
        	} else {
 	           	menor = c;
        	}
       	medio = (a + b + c) - (mayor + menor);
        System.out.println(menor+", "+medio+ " i "+ mayor);
    }
}
