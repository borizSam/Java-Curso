/* hacer un triangulo de forma dcreciente de forma invertida*/
public class TriangleInvertit{
	public static void main (String[]args){
	System.out.println("Nombre?");
	int num=Integer.parseInt(Entrada.readLine());
		for(int linea=num; linea>=1; linea--){
			for(int colum=1; colum<=linea; colum++){
				System.out.print(""+colum);
				if (linea > colum){
					System.out.print(","+" ");
				}
			}
		System.out.println();
		}

	}
}
