package your_way_impacta.modulo1.aula8;

public class Teste {

	public static void main(String[] args) {

		Conta c1 = new Conta(4003, "Manuel", 1530.15);
		Conta c2 = new Conta(4005, "Joaquim", 2823.56);
		Conta c3 = new Conta(4007, "Maria", 1250.44);

		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
		System.out.println(c3.getDados());
	}
}
