/*Escribir un triangulo de numeros introducidos por el usuario*/
public class TriangleNombres{
	public static void main (String[]args){
	System.out.println("Nombre?");
	int num=Integer.parseInt(Entrada.readLine());
	if(num >0){
		for (int linea=1; linea<=num; linea++){
			for(int colum=linea; colum>=1; colum--){
				int a=linea-colum;
				System.out.print(" "+colum);
			}
			System.out.println();
		}
	}else{
	}	
	}
}
