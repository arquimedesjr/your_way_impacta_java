package your_way_impacta.modulo1.laboratorio;

public class Laboratorio3 {

    public static void main(String[] args) {
        int numero, divisoes;

        numero = 14;
        divisoes = 0;

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                divisoes++;
            }
        }

        if (divisoes == 2) {
            System.out.println(numero + " é numero primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}
