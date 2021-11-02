/*
 * Programa que recorda que els majors d'edat són responsables davant la
 * llei
 */
public class Preso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat >= 0 && edat <=18 ) {
            System.out.println("Vos ja podeu anar a la presó!");
        } else {
            System.out.println("Aneu amb compte "+ nom);
	}
    }
}
