/*Programa que que pide un colo al usuario rojo marillo o verde si esta en rojo le dice que espere si esta en verde que pase si esta en amarillo que corra  */
public class Semafor {
	public static void main (String[] args){
		System.out.println("Color?");
		String color = Entrada.readLine();
		if (color.equals("groc")){
			System.out.println("corre!");
		}else if (color.equals("verd")){
			System.out.println("passa");
		}else if (color.equals("vermell")){
			System.out.println("espera");
		}else{
			System.out.println("ves a l'oculista");
		}
	}
}
