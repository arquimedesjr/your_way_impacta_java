package your_way_impacta.modulo1.laboratorio.aula7.lab5;

public class Aluno {

    private String nome;
    public static int contadorDeAlunos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirAluno() {
        System.out.println("Aluno: " + nome);
        System.out.println("Contagem no objeto " + nome + ":" + contadorDeAlunos+"\n");
    }
}
