/*Una nueva version del lloro el lloro repite palabras si al lloro se le pone la palabra quadrat escribe un cuadrado 5x5 y si esribe rectagulo escribe un rectangulo 5x10 si al lloro se le pasa un texto en blank + un enter acaba el programa adeu*/
public class LloroQuadrat{
	public static void main(String[] args){
	System.out.println("El lloro espera paraula:");
	String palabra=Entrada.readLine();
		while(!palabra.isBlank() && !palabra.isEmpty()){
		//System.out.println("El lloro repeteix: "+palabra);
			if (palabra.equals("dibuixa quadrat")){
				cuadrado();
			}
			if (palabra.equals("dibuixa rectangle")){
				rectangle();
			}
			System.out.println("El lloro espera paraula:");
			//palabra=Entrada.readLine();
			System.out.println("El lloro repeteix: "+palabra);
			palabra=Entrada.readLine();
			System.out.println("El lloro espera paraula:");
			//palabra=Entrada.readLine();
		}
		System.out.println("Adéu");
	}
	public static void cuadrado(){
			for (int linia=1; linia <= 5; linia++) {
        			for (int columna=1; columna <= 5; columna++) {
            				System.out.print(" X");
        			}
        			System.out.println();
    				}	
			}
	public static void rectangle(){
	/*condicion para dibujar el rectangulo*/
			for (int linia=1; linia <= 5; linia++) {
        			for (int columna=1; columna <= 10; columna++) {
          			System.out.print(" X");
        			}
        			System.out.println();
    				}
	}
}
