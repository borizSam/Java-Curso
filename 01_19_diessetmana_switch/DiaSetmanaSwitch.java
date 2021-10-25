public class DiaSetmanaSwitch {
	public static void main(String[] args){
	int dia = Integer.parseInt(args[0]);
	String diaString;
	switch (dia)
	{
		case 1: diaString = "Lunes";
			break;
		case 2: diaString = "Martes";
                        break;
		case 3: diaString = "Miercoles";
                        break;
		case 4: diaString = "Jueves";
                        break;
		case 5: diaString = "Viernes";
                        break;
		case 6: diaString = "Sabado";
                        break;
		case 7: diaString = "Domingo";
                        break;
		default: diaString = "Error!!";
			break;
	}
	System.out.println(diaString);
	}
}

