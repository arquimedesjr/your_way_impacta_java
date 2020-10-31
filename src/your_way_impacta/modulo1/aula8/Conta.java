package your_way_impacta.modulo1.aula8;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int nm, String no, double sl) {
        numero = nm;
        nome = no;
        saldo = sl;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDados() {
        return numero + " - " + nome + " - " + saldo;
    }
}
