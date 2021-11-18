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
	}
}
