package your_way_impacta.modulo1.laboratorio.aula7.lab1;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        fun.nome = "João";
        fun.sobrenome = "Pedro";
        fun.cargo = "Programador";
        fun.salario = 4000.0;

        System.out.println("Nome: "+ fun.nome);
        System.out.println("Sobrenome: "+ fun.sobrenome);
        System.out.println("Cargo: "+ fun.cargo);
        System.out.println("Salario: "+ fun.salario);
    }
}
