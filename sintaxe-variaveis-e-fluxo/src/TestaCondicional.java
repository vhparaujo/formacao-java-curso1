
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais ");
		
		int idade = 16;
		int acompanhantes = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos ");
			System.out.println("Seja bem vindo");
		} else {
			if (acompanhantes >= 1) {
				System.out.println("Seja bem vindo");
				System.out.println("Voc� pode entrar, pois est� acompanhado");
			} else {
				System.out.println("Voc� n�o pode entrar, pois tem menos de 18 anos e n�o est� acompanhado");
			}
		}
	}
}