package your_way_impacta.modulo1.aula7;

public class Teste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.numero = 2005;
		c1.nome = "Joao";
		c1.depositar(2530.15);
		
		c1.depositar(1000);
		c1.retirar(2000);
		
		System.out.println("Dados da conta:");
		System.out.println(c1.numero);
		System.out.println(c1.nome);
		System.out.println(c1.getSaldo());
	}
}
