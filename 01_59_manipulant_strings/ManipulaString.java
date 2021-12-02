/*
 * Programa que demostra diferents manipulacions amb Strings
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();

        // Mostra la longitud de la paraula (quantes lletres conté)
        System.out.println("La longitud és " + paraula.length());
        // Mostra la segona lletra de la paraula
        // XXX TODO: afegeix aquí les línies que facin falta
	System.out.println("La segona lletra és " + "'"+paraula.charAt(1)+"'");
        // Mostra la darrera lletra de la paraula
        // XXX TODO: afegeix aquí les línies que facin falta
	System.out.println("La darrera lletra és " + "'"+paraula.charAt(paraula.length()-1)+"'");
        // Mostra la penúltima lletra de la paraula
        // XXX TODO: afegeix aquí les línies que facin falta
	System.out.println("La penúltima lletra és " + "'"+paraula.charAt(paraula.length()-2)+"'");
        // Mostra la paraula amb totes les lletres en majúscules
        // XXX TODO: afegeix aquí les línies que facin falta
	System.out.println("La paraula en majúscules és " + "\""+paraula.toUpperCase()+"\"");
        // Una composició formada per la primera lletra de la paraula en
        // majúscules, seguida de les següents tres lletres en minúscules. Per
        // exemple, si la paraula és «nEkAnE», resultatà en «Neka».
        // XXX TODO: afegeix aquí les línies que facin falta
	System.out.println("La composició de quatre primeres és " + "\""+paraula.substring(0,4)+"\"");
        // Mostra una composició formada per la darrera lletra de la paraula,
        // seguida de les tres primeres. (ex. si la paraula és «Nekane»
        // mostrarà «eNek»)
        // XXX TODO: afegeix aquí les línies que facin falta
     	String ultima=paraula.substring(0,4);
     	//System.out.println(ultima.charAt(ultima.length()-1)+paraula.substring(0,3));
        System.out.println("La composició de quatre primeres és "+"\""+ultima.charAt(ultima.length()-1)+paraula.substring(0,3)+"\"");
	//System.out.println("La composició de quatre és " + "\""+paraula.replace(ultima,paraula)+"\"");
        // Com en el cas anterior però ara corregint les majúscules i
        // minúscules de manera que la primera sigui majúscules i la resta en
        // minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
        // XXX TODO: afegeix aquí les línies que facin falta
        String compo=ultima.charAt(ultima.length()-1)+paraula.substring(0,3);
	String primeral=compo.substring(0,1);
	String mayus=primeral.toUpperCase();
	String minus=paraula.substring(0,3);
	String minu=minus.toLowerCase();
        System.out.println("La composició de quatre corregint majúscules és "+"\""+mayus+minu+"\"");
        //System.out.println("La composició de quatre corregint majúscules és "+"\""+ultima.charAt(ultima.length()-1)+paraula.substring(0,3)+"\"");
    }
}
