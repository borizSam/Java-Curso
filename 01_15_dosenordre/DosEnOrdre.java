/*
 * Programa que ordena dos numeros de mayor a menor
 */
public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
	System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        if (segon > primer){
            System.out.println(primer + " i " + segon);

	} else if (primer == segon){ /*cuando las dos variables son iguales*/
	    System.out.println(primer + " i " + segon);

	}else{
	    System.out.println(segon+ " i " + primer);
	}
    }
}
