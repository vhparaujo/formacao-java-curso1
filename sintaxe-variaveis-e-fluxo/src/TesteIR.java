
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Sua al�quota incidente ser� de 7,5% e a dedu��o de R$142,00 ");
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("Sua al�quota incidente ser� de 15% e a dedu��o de R$350,00 ");
		} else if (salario >= 3750.01 && salario <= 4664.00) {
			System.out.println("Sua al�quota incidente ser� de 22,5% e a dedu��o de R$636,00 ");
		}
	}
}