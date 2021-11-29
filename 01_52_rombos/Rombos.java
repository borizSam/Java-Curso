/*
Programa que pide al usuario un numero entero y dibuja los rombos
*/
public class Rombos {
      public static void main(String[] args) {
    	System.out.println( "quants?" );
        int valor = Integer.parseInt(Entrada.readLine());
        int contador = 0;
        while(contador != valor) {
        for(int linia = 9; linia >= 0; linia--) {
                for(int espais = 0; espais < linia; espais++) {

                        System.out.print( "." );
                }
                for(int columna = linia; columna <= 9; columna++) {
                        System.out.print(columna);
                }
                for(int i = 9; i >= linia; i--) {
                        if(i == 9)continue;
                        System.out.print(i);
                }
                for(int k = linia; k > 0; k--) {
                        System.out.print( "." );
                }
                System.out.println( "" );
	}
		for(int linia1 = 1; linia1 <= 9; linia1++) {
			for(int espais1 = 1; espais1 <= linia1; espais1++) {
				System.out.print( "." );
			}
			for(int columna1 = linia1; columna1 < 9; columna1++) {
				if(columna1 == 9) {
					continue;
				}
				System.out.print(columna1);
			}
			for(int l = 9; l >= linia1; l--) {
				System.out.print(l);
			}
			for(int m = linia1; m > 0; m--) {
                                System.out.print( "." );
                        }
			System.out.println( "" );
		}
       		contador++;
	}
    }
}
