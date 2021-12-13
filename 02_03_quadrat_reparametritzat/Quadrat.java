
/*crear un cuadrado introducido por parametro y mostrarlo con las letras*/
public class Quadrat{
	public static void main (String[]args){
	int costat=Integer.parseInt(args[0]);
	char caracter=args[1].charAt(0);
	dibuixaQuadrat(costat,caracter);
	}
	public static void dibuixaQuadrat(int costat, char caracter){
		for (int filas=1; filas<=costat; filas++){
			for (int colu=1; colu<=costat; colu++){
				System.out.print(" "+caracter);
			}
			System.out.println();
		}	
	}
}
