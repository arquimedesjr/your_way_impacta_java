package your_way_impacta.modulo1.aula8;

public class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrar() {
        System.out.println(modelo + ano);
    }
}
