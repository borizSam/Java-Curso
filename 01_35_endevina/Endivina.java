/*Adivina el numero pensado */
public class Endivina{
	public static void main (String[]args){
	//System.out.println("Introdueix un nombre entre el 1 i el 100");
	int num=1;
		while (num!=42 ){
			System.out.println("Introdueix un nombre entre el 1 i el 100");
			num=Integer.parseInt(Entrada.readLine());
			if (num>100 ){
				System.out.println("Com a màxim 100");
			}else if (num==0 ){
				System.out.println("Com a mínim 1");
			}else if (num > 42 ){
				System.out.println("És més petit que "+num);
			}else if (num > 0){
				System.out.println("És més gran que "+num);
			}
		}
		System.out.println("Has encertat!");
	}
}
