/* hacer un triangulo de forma dcreciente*/
public class TriangleInvertit{
	public static void main (String[]args){
	System.out.println("Nombre?");
	int num=Integer.parseInt(Entrada.readLine());
		for(int linea=1; linea<=num; linea++){
			for (int colum=1; colum<=linea; colum++){
		
				System.out.print(linea);
			}
			System.out.println();
		}
	}
}
