/*Programa que nos enseña el mes anterior y el mes siguiente */

public class MesosAnys {
	public static void main(String[] args) {
		System.out.println("Mes?");
		int mes =Integer.parseInt(Entrada.readLine()); /*coger el mes */
		System.out.println("Any?");
		int any = Integer.parseInt(Entrada.readLine()); /*coger en año */
		int anterior = mes - 1;
		int posterior = mes + 1;
		int mesos= mes - 11;
		int anys= any+1;
		if ( mes <= 11){  /*rango de meses correctos*/
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+posterior+"/"+any);
		}else if (mes==12){
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+mesos+"/"+anys);
		}else if (mes==1){
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+posterior+"/"+any);
		}
	}
}
