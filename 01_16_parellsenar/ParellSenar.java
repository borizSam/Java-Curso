/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
       	int operacion = numero % 2;

        if (operacion == 0 ){
            System.out.println("El número " + operacion + " és parell");

        } else {
            System.out.println("El número " + operacion + " és senar");
        }
    }
}
