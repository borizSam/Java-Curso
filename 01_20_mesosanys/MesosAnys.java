/*Programa que nos enseña el mes anterior y el mes siguiente */

public class MesosAnys {
	public static void main(String[] args) {
		System.out.println("Mes?");
		int mes =Integer.parseInt(Entrada.readLine()); /*coger el mes */
		System.out.println("Any?");
		String any = Entrada.readLine(); /*coger en año */
		int anterior = mes - 1;
		int posterior = mes + 1;
		/*int mesos= mes - 11;*/
		if ( mes >=2 && mes <=11){  /*rango de meses correctos*/
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+posterior+"/"+any);
		/* }else if (mes==12){
			int a=mes-11;
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+a+"/"+any);
		}else if (mes==1){ 
			int b = mes+11;
			System.out.println("Anterior "+b+"/"+any+" i posterior "+posterior+"/"+any);*/
		}else{ /*error de meses introducidos*/
			System.out.println("Solo existen 12 meses introduce un mes correcto!");
		}
	}
}
