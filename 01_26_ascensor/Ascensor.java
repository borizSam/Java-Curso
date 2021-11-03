/*Considerem un ascensor d’un edifici amb planta baixa i dos pisos (primer pis i segon pis) que tingui els següents botons: ‘pujar un”, ‘pujar dos”, ‘baixar un” i ‘baixar dos”. */
public class Ascensor {
	public static void main (String[]args){
	System.out.println("pis?");
	String pis=Entrada.readLine();
	System.out.println("botó?");
	String boto=Entrada.readLine();
		if (boto.equals("pujar un") && pis.equals("planta baixa")){
			System.out.println("primer pis");
		}else if (boto.equals("pujar dos")&& pis.equals("planta baixa")){
			System.out.println("segon pis");
		}else if (boto.equals("pujar un")&& pis.equals("primer pis")){
			System.out.println("segon pis");
		}else if (boto.equals("baixar un")&& pis.equals("primer pis")){
			System.out.println("planta baixa");
		}else if (boto.equals("baixar un")&& pis.equals("segon pis")){
			System.out.println("primer pis");
		}else if (boto.equals("baixar dos")&& pis.equals("segon pis")){
			System.out.println("planta baixa");
		}else{
			System.out.println("error");
		}
	}
}
