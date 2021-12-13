/*pasar un numero por parametro y escribir las un cuadrado*/
public class Quadrat{
	public static void main (String[]args){
	int parametro=Integer.parseInt(args[0]);
		cuadrado(parametro);
	}
	public static void cuadrado (int parametro){
		for (int filas=1; filas<=parametro; filas++){
			for(int colu=1; colu<=parametro; colu++){
				System.out.print(" X");
			}
			System.out.println();
		}
	}
}
