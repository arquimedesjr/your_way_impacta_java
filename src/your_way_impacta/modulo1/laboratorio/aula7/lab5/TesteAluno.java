package your_way_impacta.modulo1.laboratorio.aula7.lab5;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        Aluno.contadorDeAlunos ++;
        aluno.imprimirAluno();
        aluno = new Aluno();
        aluno.setNome("Maria");
        Aluno.contadorDeAlunos ++;
        aluno.imprimirAluno();
        aluno = new Aluno();
        aluno.setNome("Marcos");
        Aluno.contadorDeAlunos ++;
        aluno.imprimirAluno();


    }
}
