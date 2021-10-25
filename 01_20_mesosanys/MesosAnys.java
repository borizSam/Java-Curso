public class MesosAnys {
	public static void main(String[] args) {
		System.out.println("Mes?");
		int mes =Integer.parseInt(Entrada.readLine()); /*coger el mes */
		System.out.println("Any?");
		String any = Entrada.readLine(); /*coger en año */
		int anterior = mes - 1;
		int posterior = mes + 1;
		if ( mes >=1 && mes <=12){  /*rango de meses correctos*/
			System.out.println("Anterior "+anterior+"/"+any+" i posterior "+posterior+"/"+any);
		}else{ /*error de meses introducidos*/
			System.out.println("Solo existen 12 meses trata de introducir un mes correcto!");
		}
	}
}
