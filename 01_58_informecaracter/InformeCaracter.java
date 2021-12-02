/*Realizar un informe sovre los caracteres en java :D*/

public class InformeCaracter{
	public static void main (String[]args){
	System.out.println("Caràcter?");
	String caracter=Entrada.readLine();
	//String letra=caracter.charAt(0);
	//System.out.println(letra);
		if(!caracter.isEmpty()){
			System.out.println("Character.getName('"+caracter.charAt(0)+"'): "+Character.getName(caracter.charAt(0)));
			System.out.println("Character.isDigit('"+caracter.charAt(0)+"'): "+Character.isDigit(caracter.charAt(0)));
			System.out.println("Character.isJavaIdentifierStart('"+caracter.charAt(0)+"'): "+Character.isJavaIdentifierPart(caracter.charAt(0)));
			System.out.println("Character.isJavaIdentifierPart('"+caracter.charAt(0)+"'): "+Character.isJavaIdentifierPart(caracter.charAt(0)));
			System.out.println("Character.isLetter('"+caracter.charAt(0)+"'): "+Character.isLetter(caracter.charAt(0)));
			System.out.println("Character.isLowerCase('"+caracter.charAt(0)+"'): "+Character.isLowerCase(caracter.charAt(0)));
			System.out.println("Character.isUpperCase('"+caracter.charAt(0)+"'): "+Character.isUpperCase(caracter.charAt(0)));
			System.out.println("Character.isWhitespace('"+caracter.charAt(0)+"'): "+Character.isWhitespace(caracter.charAt(0)));
			System.out.println("Character.toLowerCase('"+caracter.charAt(0)+"'): "+Character.toLowerCase(caracter.charAt(0)));
			System.out.println("Character.toUpperCase('"+caracter.charAt(0)+"'): "+Character.toUpperCase(caracter.charAt(0)));
		}else{
			System.out.println("Caràcter buit");
		}
	}
}
