package your_way_impacta.modulo1.laboratorio.aula7.lab3and4;

public class Calculadora {

    public int somar(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        System.out.println("calc.somar(" + valor1 + ", " + valor2 + ") = " + resultado);
        return resultado;
    }

    public int subtrair(int valor1, int valor2) {
        int resultado;
        resultado = valor1 - valor2;
        System.out.println("calc.subtrair(" + valor1 + ", " + valor2 + ") = " + resultado);
        return resultado;
    }

    public double subtrair(double valor1, double valor2) {
        double resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public double subtrair(int valor1, double valor2) {
        return subtrair((double) valor1, valor2);
    }

    public double subtrair(double valor1, int valor2) {
        return subtrair(valor1, (double) valor2);

    }

    public int multiplicar(int valor1, int valor2) {
        int resultado;
        resultado = valor1 * valor2;
        System.out.println("calc.multiplicar(" + valor1 + ", " + valor2 + ") = " + resultado);
        return resultado;
    }

    public int dividir(int valor1, int valor2) {
        int resultado;
        resultado = valor1 / valor2;
        System.out.println("calc.dividir(" + valor1 + ", " + valor2 + ") = " + resultado);
        return resultado;
    }


}
