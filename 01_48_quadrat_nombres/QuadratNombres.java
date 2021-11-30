<<<<<<< HEAD
/*Programa que escribe los numeros >0 hasta el 9 en filas y columnas*/
public class QuadratNombres{
	public static void main (String[]args){
		System.out.println("Valor final?");
		int vfinal=Integer.parseInt(Entrada.readLine());
		if (vfinal>0 && vfinal<=9){
			for (int linea=1; linea<=vfinal; linea++){
				for (int columna=1; columna <=vfinal; columna++){
					System.out.print(" "+ columna);
				}
				System.out.println();
			}
		}else{
			System.out.println("Valor inadequat");
		}
=======
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
		}else{
		System.out.println("Valor inadequat");
		}	
>>>>>>> e48ecbec8624aa6f36a990df33b296b0a0eb4500
	}
}
