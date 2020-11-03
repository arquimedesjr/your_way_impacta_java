package your_way_impacta.modulo1.aula9;

public class MetodoEstatico {
    public static void main(String[] args) {
        Classe2.metodoEstatico(); // Não precisa ser instanciada
        new Classe2().metodoNaoEstatico(); // Está sendo instanciada
    }
}
