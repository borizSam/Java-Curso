/*Calculadora simple el pedimos al usuario dos numeros y un operador */
public class CalculadoraSenzilla {
	public static void main(String[]args){
		System.out.println("Operand1?");
		double operand1 = Double.parseDouble(Entrada.readLine());
		System.out.println("Operador?");
		char operador = Entrada.readLine().charAt(0);
		System.out.println("Operand2?");
		double operand2 = Double.parseDouble(Entrada.readLine());
		double suma = operand1 + operand2;
		double resta = operand1 - operand2;
		double multiplicacion = operand1 * operand2;
		double division = operand1 / operand2;

		if (operador == '+'){
			System.out.println(operand1+" + "+operand2+" = "+suma);
		}else if (operador == '-'){
			System.out.println(operand1+" - "+operand2+" = "+resta);
		}else if (operador == '*'){
			System.out.println(operand1+" * "+operand2+" = "+multiplicacion);
		}else if (operador == '/' && operand2 == 0){
			System.out.println("No es pot dividir entre 0");
		}else if (operador == '/'){
                        System.out.println(operand1+" / "+operand2+" = "+division);
		}else{
			System.out.println("L'operador "+operador+" no està disponible");
		}
	}
}
