/*Sumar dos valores introducidos por el usuario y el rango de numeros */
/*mostrar valores enteros del inicio al final*/
public class SumaInterval {
	public static void main(String[]args){
	System.out.println("inici?");
	int vinicial=Integer.parseInt(Entrada.readLine());
	System.out.println("final?");
	int vfinal=Integer.parseInt(Entrada.readLine());
	int suma=0;
	if (vinicial<vfinal){
		for (vinicial=vinicial; vinicial<=vfinal; vinicial++)
			suma=suma+1;
			System.out.println("suma ; "+suma);
			System.out.println(vinicial);
	//}else if(vinicial>vfinal){
		//for (vinicial=vinicial; vinicial>=vfinal; vinicial=vinicial-1)
			//System.out.println(vinicial);
	//}else{
		//System.out.println(vinicial);
	}
	}
}
