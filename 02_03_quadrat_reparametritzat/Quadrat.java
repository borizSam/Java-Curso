/*Introducir por parametro un numero y una letra y nos enseñara un cuadrado introducido por el parametro*/
public class Quadrat {
	public static void main (String[]args){
	int parametro=Integer.parseInt(args[0]);
	//String letra=Entrada.readLine(args[1]);
	char letra=Entrada.readLine(args[1]);
		cuadrado(parametro,letra);
	}
		public static void cuadrado(int parametro,char letra){
			for (int filas=1; filas<=parametro; filas++){
				for(int colum=1; colum<=parametro; colum++){
					
					System.out.println(letra);
				}
				System.out.println();
			}
		}
}
