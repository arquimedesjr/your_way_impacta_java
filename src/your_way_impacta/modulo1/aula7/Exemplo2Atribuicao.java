package your_way_impacta.modulo1.aula7;

public class Exemplo2Atribuicao {
	public static void main(String[] args){
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.sexo = 'M';
		joao.idade = 45;
		
		maria.sexo = 'F';
		maria.idade = 17;
		
		joao = maria; // atribuiçãoo realizada
		// as variáveis joao e maria fazem referéncia ao mesmo objeto
		System.out.println("João sexo = " + joao.sexo);
		System.out.println("João idade = " + joao.idade);
		// qualquer alteraçãoo efetuada no objeto refletirá nas duas variáveis
		joao.idade = 50;
		System.out.println("Maria idade = " + maria.idade);
		
		joao.sexo = 'M';
		System.out.println("Maria sexo = " + maria.sexo);
	}
}
