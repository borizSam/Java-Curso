/*Sumar dos valores introducidos por el usuario y el rango de numeros */
/*mostrar valores enteros del inicio al final*/
public class SumaInterval {
	public static void main(String[]args){
		System.out.println( "inici?" );
		int vain = Integer.parseInt(Entrada.readLine());
		System.out.println( "final?" );
                int vafi = Integer.parseInt(Entrada.readLine());
		int suma = 0;

		if ( vain < vafi ) {
			for ( ; vain < vafi; vain++ ) {
				suma = vain + suma;
			}
			System.out.println( suma + vain );
		} else if ( vain > vafi) {
			for ( ; vain > vafi; vafi++ ) {
				suma = vafi + suma;
			}
			System.out.println( suma + vafi );
		} else if ( vain == vafi) {
                        System.out.println( vain );
		}
	}
}
