/*Desarrollar un programa que coja un texto u cuente la posicion si es una letra un numero o otra cosa, y si esta fuera de rango*/
public class AnalitzaCaracter{
	public static void main (String[]args){
	System.out.println("Text?");
	String texto=Entrada.readLine();
	char[] caracteres = texto.toCharArray();
	System.out.println("Posició?");
	int posicion=Integer.parseInt(Entrada.readLine());
		for(int i=0; i<caracteres.length; i++){
			//System.out.println(i);
			if (i==posicion){
				System.out.println(caracteres[i]+" és una lletra");
			}
		}
	}
}
