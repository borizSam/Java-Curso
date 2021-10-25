public class CalculadoraSenzilla {
	public static void main(String[]args){
		System.out.println("Operand 1?");
		double operand1 = Double.parseDouble(Entrada.readLine());
		System.out.println("Operador?");
		char operador = Entrada.readLine().charAt(0);
		System.out.println("Operand 2?");
		double operand2 = Double.parseDouble(Entrada.readLine());
		double suma = operand1 + operand2;
		double resta = operand1 - operand2;
		double multiplicacion = operand1 * operand2;
		double division = operand1 / operand2;
		if (operador == '+'){
			System.out.println(operand1+" + "+operand2+" = "+suma);
		}else{
			System.out.println("L'operador "+operador+" no està disponible");
		}
	}
}
