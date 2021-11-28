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
            System.out.println("El número pensat és ");
            System.out.print(numeroPensat);

            // Multiplica'l per 3
            numero = numeroPensat * 3;
            System.out.println("Quan el multipliques per 3 obtens ");
            System.out.print(numero);

            // Suma-li 6
            numero = numero + 6;
            System.out.println("Quan li sumes 6 arriba a ");
            System.out.print(numero);

            // divideix-ho tot per 3
            numero = numero / 3;
            System.out.println("Un cop dividit per 3 queda ");
            System.out.print(numero);

            // resta-li el número pensat
            numero = numero - numeroPensat;
            System.out.println("Finalment, en restar-li el valor inicial, queda ");
            System.out.print(numero);

            // compara el resultat
            System.out.println("A que el resultat és 2?");
        }
    }
