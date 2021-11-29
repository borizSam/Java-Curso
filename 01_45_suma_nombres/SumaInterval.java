<<<<<<< HEAD
/*El programa pide dos numeros al usuario el inicial y el valor final y al final los suma*/
public class SumaInterval{
	public static void main (String[]args){
	System.out.println("inici?");
	int vinicial=Integer.parseInt(Entrada.readLine());
	System.out.println("final?");
	int vfinal=Integer.parseInt(Entrada.readLine());
		for (vinicial=vinicial;vinicial<=vfinal && vfinal<=vinicial ;vinicial=vinicial+vfinal){
			System.out.println(vinicial);
=======
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
>>>>>>> e48ecbec8624aa6f36a990df33b296b0a0eb4500
		}
	}
}
