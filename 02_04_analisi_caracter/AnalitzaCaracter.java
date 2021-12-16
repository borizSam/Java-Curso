/*Nueva version de analitzaCaracter*/
public class AnalitzaCaracter {
	public static void main (String[]args){
	System.out.println("Text");
	String palabra=Entrada.readLine();
	System.out.println("Posició");
	int pos=Integer.parseInt(Entrada.readLine());
	
	System.out.println("-------");
	System.out.println(palabra.length());
	System.out.println("-------");
		for(int i=0; i < palabra.length(); i++ ){
			//System.out.println(i);
			//System.out.print(palabra.charAt(i));
			if (i == pos){ /*Comprobar si es una letra BETA*/
				System.out.println(palabra.charAt(i)+" és una lletra");
			}
			if (palabra.isDigiit()){ /*Comprobar si la cadena es un numero BETA*/
			
			}
		}
	}
}
