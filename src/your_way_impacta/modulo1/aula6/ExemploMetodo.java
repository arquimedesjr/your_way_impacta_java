package your_way_impacta.modulo1.aula6;

public class ExemploMetodo {

	static void exibirNome(String nome, int quantidade) {
		for (int i = 0; i < quantidade ; i++) {
			System.out.println(nome);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Exibindo o nome:");
		exibirNome("Sandro", 4);
		
		System.out.println("Exibindo o nome novamente:");
		exibirNome("Impacta", 7);
	}
}
