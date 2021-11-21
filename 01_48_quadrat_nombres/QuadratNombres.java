/*Cuadrado de numeros cuando el usuario introduce un numero hasta el 9*/
public class QuadratNombres{
	public static void main (String[]args){
	System.out.println("Valor final?");
	int valor=Integer.parseInt(Entrada.readLine());
	if (valor>0 && valor <=9){
		for(int linea=1; linea<=valor; linea++){
			for (int colum=1; colum<=valor; colum++){
				System.out.print(" " + colum);
			}
		System.out.println();
		}
	}	
	}
}
