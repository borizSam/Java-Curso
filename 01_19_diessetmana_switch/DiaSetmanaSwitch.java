/*Dia de la semana por parametro segun los numeros del 1 al 7 si pone otro numero error  */

public class DiaSetmanaSwitch {
	public static void main(String[] args){
	int dia = Integer.parseInt(args[0]);
	String diaString;
	switch (dia)
	{
		case 1: diaString = "Dilluns";
			break;
		case 2: diaString = "Dimarts";
                        break;
		case 3: diaString = "Dimecres";
                        break;
		case 4: diaString = "Dijous";
                        break;
		case 5: diaString = "Divendres";
                        break;
		case 6: diaString = "Dissabte";
                        break;
		case 7: diaString = "Diumenge";
                        break;
		default: diaString = "Error";
			break;
	}
	System.out.println(diaString);
	}
}

