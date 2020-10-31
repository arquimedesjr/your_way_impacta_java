package your_way_impacta.modulo1.laboratorio.aula7.lab3and4;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        cal.somar(6,3);
        cal.subtrair(6,3);
        cal.multiplicar(6,3);
        cal.dividir(6,3);

        //
        System.out.println("Chamada subtrair sobrecarregados:");
        System.out.println("Camada a versão de subtrair com 2 double: "+cal.subtrair(3.0,2.7));
        System.out.println("Camada a versão de subtrair com 1 double e um int: "+cal.subtrair(3.0,1));
        System.out.println("Camada a versão de subtrair com 1 int e um double: "+cal.subtrair(3.0,1));
    }
}
