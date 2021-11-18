/*mostrar valores enteros del inicio al final*/
public class MostraInterval {
	public static void main(String[]args){
	System.out.println("inici?");
	int vinicial=Integer.parseInt(Entrada.readLine());
	System.out.println("final?");
	int vfinal=Integer.parseInt(Entrada.readLine());
	if (vinicial<vfinal){
		for (vinicial=vinicial; vinicial<=vfinal; vinicial++)
			System.out.println(vinicial);
	}else if(vinicial>vfinal){
		for (vinicial=vinicial; vinicial>=vfinal; vinicial=vinicial-1)
			System.out.println(vinicial);
	}
	}
}
