/*Escribir un triangulo de numeros introducidos por el usuario*/
public class TriangleNombres{
	public static void main (String[]args){
	System.out.println("Nombre?");
	int num=Integer.parseInt(Entrada.readLine());
		for (int linea=1; linea<=num; linea++){
			for(int colum=1; colum<=linea; colum++){
				int a=linea-colum;	
				System.out.print(" "+a);
			}
			System.out.println();
		}
	}
}
