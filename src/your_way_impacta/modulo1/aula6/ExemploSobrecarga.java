package your_way_impacta.modulo1.aula6;

public class ExemploSobrecarga {

	static void exibirNome(String nome, int quantidade) {
		for (int i = 0; i < quantidade ; i++) {
			System.out.println(nome);
		}
	}

	static void exibirNome(String nome) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println(nome);
		}
	}

	static void exibirNome() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Manuel");
		}
	}

	public static void main(String[] args) {
		
		exibirNome("Impacta");
		exibirNome("Java é legal!", 8);
		exibirNome();
	}
}
