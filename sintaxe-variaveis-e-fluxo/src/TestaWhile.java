
public class TestaWhile {

	public static void main(String[] args) {

		int contagem = 0;
		int somatorio = 0;
		while (contagem <= 10) {
			somatorio += contagem;
		    System.out.println(contagem);
			//System.out.println(somatorio);
			contagem++;
		}
		System.out.println("A soma dos n�meros de 0 a 10 � " + somatorio + ".");
	}
}