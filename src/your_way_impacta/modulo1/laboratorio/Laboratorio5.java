package your_way_impacta.modulo1.laboratorio;

public class Laboratorio5 {

    public static void main(String[] args) {

        for (int ano = 1930; ano <= 2020; ano += 4) {

            if (ano == 1942 || ano == 1946)
                continue;

            System.out.println("Compa de Mundo de "+ano+"!");


        }

    }
}
