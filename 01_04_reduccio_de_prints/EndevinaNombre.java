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
            numero = numeroPensat * 3;
            // Suma-li 6
            numero = numero + 6;
            // divideix-ho tot per 3
            numero = numero / 3;
            // resta-li el número pensat
            numero = numero - numeroPensat;
            // compara el resultat
	    System.out.print("El número pensat és " + numeroPensat + " **Quan el multipliques per 3 obtens" + numero + " **Quan li sumer 6 arriba a " + numero + " **Un cop dividit per 3 queda " + numero + " **Finalmente, en restar-li el valor inicial, queda " + numero + " **A que el resultat és 2? ");
        }
    }
