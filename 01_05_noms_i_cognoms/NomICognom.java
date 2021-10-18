/*
 * Aquest programa demana el nom i el primer cognom als usuaris
 * i els mostra un missatge amistós.
 *
 * El programa no controla valors no adequats d'entrada
 */

public class NomICognom {
    public static void main(String[] args) {
        // obté el nom
        System.out.println("Com et dius?");
        String nom = "Renat";
	System.out.println(nom);

        // obté el cognom
        System.out.println("I quin és el teu primer cognom?");
        String cognom = "Taner";
	System.out.println(cognom);

        // Mostra resultat
        System.out.println("Ei " + nom + ", tinc una amiga que també és " +  cognom);
    }
}
