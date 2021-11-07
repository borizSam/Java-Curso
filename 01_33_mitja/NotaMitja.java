/*El programa pedira notas >=0 y <=100  y las sumara y nos enseñara el resultado final, cuando el usuario introduzca un numero negativo o mayor a 100 el programa acabara  */
public class NotaMitja {

        public static void main (String[]args){
        System.out.println("Introdueix una nota");
        int nota=Integer.parseInt(Entrada.readLine());
        int suma=0;
        int total=0;
        if (nota>=0){
                while (nota<=100){
                	suma = suma+nota;
                	System.out.println("Introdueix una nota");
                        nota=Integer.parseInt(Entrada.readLine());
                        total=total+1;
                }
          	System.out.println("La mitja de les notes vàlides és "+suma/total);
         }else{
          	System.out.println("Cap nota vàlida introduïda");
          	}
	}
}
