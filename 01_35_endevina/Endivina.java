/*Adivina el numero pensado */
public class Endivina{
	public static void main (String[]args){
	System.out.println("Introdueix un nombre entre el 1 i el 100");
	int num=Integer.parseInt(Entrada.readLine());
		while (num!=42){
			num=Integer.parseInt(Entrada.readLine());
			if (num>=1 && num<=5){
				System.out.println("És més gran que ");
			}else if (num>5 && num<=50){
				System.out.println("És més petit que "+num);
			}else if (num==0){
				System.out.println("Com a mínim 1");
			}else if (num>1 && num <=100){
				System.out.println("Com a màxim 100");
			}
		}
	System.out.println("Has encertat!");
	}
}
