package your_way_impacta.modulo1.aula7;

public class MetodoRecursivo {

    public static int metodoRecursivo(int i) {
        if (i < 1) {
            return i;
        }
        System.out.println(i);
        return metodoRecursivo(i - 1);
    }

    public static void main(String args[]) {
        metodoRecursivo(10);
    }

}
