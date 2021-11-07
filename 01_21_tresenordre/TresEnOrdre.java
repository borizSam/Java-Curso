/*Programa que ordena tres numeros introducidos por el usuario de menor a mayor */
public class TresEnOrdre{
	public static void main(String[]args){
		System.out.println("Primer?");
		int a = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int b = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int c = Integer.parseInt(Entrada.readLine());

		if (a>b && a>c){
			System.out.println(a+", "+b+" i "+c);
		}else if (a>b && b>c){
			System.out.println(c+", "+a+" i "+b);
		}else if (a>b && c>a){
			System.out.println(b+", "+a+" i "+c);
		}else if (a>c && c>b){
			System.out.println(b+", "+c+" i "+a);
		}else if (b>c && b>a && a>c){
			System.out.println(c+", "+a+" i "+b);
		}else{
			System.out.println(a+", "+c+" i "+b);
		}
	}
}
