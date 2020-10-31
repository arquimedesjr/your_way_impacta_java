package your_way_impacta.modulo1.laboratorio.aula7.lab2;

public class Teste {

    public static void main(String[] args) {
        Garagem g = new Garagem();
        Carro carro = new Carro();
        carro.cor = "Branco";
        carro.modelo = "GOL";
        carro.motor = "1.0";
        carro.potencia = "2.0";
        g.carroPasseio = carro;

        carro = new Carro();
        carro.cor = "Preto";
        carro.modelo = "GOL";
        carro.motor = "1.1";
        carro.potencia = "1.0";
        g.carroUtilitario = carro;

        System.out.println("Carro de Passeio:");
        System.out.println("Cor: " +g.carroPasseio.cor);
        System.out.println("Modelo: " +g.carroPasseio.modelo);
        System.out.println("Potencia: " +g.carroPasseio.potencia);
        System.out.println("-----------------------------------------");
        System.out.println("Carro de Utilitário:");
        System.out.println("Cor: " +g.carroUtilitario.cor);
        System.out.println("Modelo: " +g.carroUtilitario.modelo);
        System.out.println("Potencia: " +g.carroUtilitario.potencia);
    }
}
