/*
     * Aquest programa mostra capacitats d'endevinació
     *
     * Per executar-ho, fes
     * $ java EndevinaNombre 42
     */

    public class EndevinaNombre {

        public static void main(String[] args) {

            int numeroPensat;   // guardarà el número pensat
            int numero;         // guardarà els càlculs intermitjos

            // pensa un número
            numeroPensat = Integer.parseInt(args[0]);
            // Multiplica'l per 3
            int mult = numeroPensat * 3;
            // Suma-li 6
            int suma = numeroPensat + 6;
            // divideix-ho tot per 3
            int divi = numeroPensat / 3;
            // resta-li el número pensat
            int rest = numeroPensat - numeroPensat;
            // compara el resultat
	    System.out.println("El número pensat és " + numeroPensat);
	    System.out.println("Quan el multipliques per 3 obtens " + mult);
	    System.out.println("Quan li sumer 6 arriba a " + suma);
	    System.out.println("Un cop dividit per 3 queda " + divi);
	    System.out.println("Finalmente, en restar-li el valor inicial, queda " + rest);
	    System.out.println("A que el resultat és 2?");
        }
    }
