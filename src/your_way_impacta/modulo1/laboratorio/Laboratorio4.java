package your_way_impacta.modulo1.laboratorio;

public class Laboratorio4 {

    public static void main(String[] args) {

        String mes = "Novembro";

        switch (mes){
            case "Janeiro":
            case "Marco":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println("O mês escolhido tem 31 dias");
                break;
            case "Fevereiro":
                System.out.println("o mês escolhido tem 28 dias (29 dias nos anos bissextos)");
                break;
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println("O mês escolhido tem 30 dias");
                break;
            default:
                System.out.println("O mês escolhido não existe.");

        }

    }
}
