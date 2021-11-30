/*Probando tipos de string*/
public class InformeString{
	public static void main (String[]args){
	System.out.println("Text principal?");
	String principal=Entrada.readLine();
	System.out.println("Text secundari ?");
	String secuntario=Entrada.readLine();
	System.out.println("Número positiu?");
	int numero=Integer.parseInt(Entrada.readLine());
	System.out.println("\"" + principal+ "\"" +".length(): "+principal.length());
	System.out.println("\"" + principal+ "\"" +".startsWith("+"\""+secuntario+"\""+"): "+secuntario.startsWith(secuntario));
	}
}
