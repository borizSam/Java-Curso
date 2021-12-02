/*Probando tipos de string*/
public class InformeString{
	public static void main (String[]args){
	System.out.println("Text principal?");
	String principal=Entrada.readLine();
	System.out.println("Text secundari?");
	String secuntario=Entrada.readLine();
	System.out.println("Número positiu?");
	int numero=Integer.parseInt(Entrada.readLine());
	System.out.println("\"" + principal+ "\"" +".length(): "+principal.length());
	System.out.println("\"" + principal+ "\"" +".startsWith("+"\""+secuntario+"\""+"): "+secuntario.startsWith("4"));
	System.out.println("\"" + principal+ "\"" +".endsWith("+"\""+secuntario+"\""+"): "+principal.endsWith(secuntario));
	System.out.println("\"" + principal+ "\"" +".equals("+"\""+secuntario+"\""+"): "+secuntario.equals("4"));
	System.out.println("\"" + principal+ "\"" +".equalsIgnoreCase("+"\""+secuntario+"\""+"): "+secuntario.equalsIgnoreCase(secuntario));
	System.out.println("\"" + principal+ "\"" +".isBlank(): "+secuntario.isBlank());
	System.out.println("\"" + principal+ "\"" +".isEmpty(): "+secuntario.isEmpty());
	System.out.println("\"" + principal+ "\"" +".charAt"+"("+numero+"): "+secuntario.charAt(numero));
	System.out.println("\"" + principal+ "\"" +".concat("+"\""+secuntario+"\""+"): "+principal.concat(secuntario));
	System.out.println("\"" + principal+ "\"" +".repeat"+"("+numero+"): "+principal.repeat(numero));
	System.out.println("\"" + principal+ "\"" +".toUpperCase(): "+principal.toUpperCase());
	System.out.println("\"" + principal+ "\"" +".toLowerCase(): "+principal.toLowerCase());
	}
}
