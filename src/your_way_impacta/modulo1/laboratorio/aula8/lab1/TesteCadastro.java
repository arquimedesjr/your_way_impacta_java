package your_way_impacta.modulo1.laboratorio.aula8.lab1;

public class TesteCadastro {
    public static void main(String[] args) {
        Cadastro cadastro1 = new Cadastro();
        Cadastro cadastro2 = new Cadastro("Claudio", "Abreul");
        Cadastro cadastro3 = new Cadastro("Lourdes","Abreu", 40);

        cadastro1.mostrar();
        cadastro2.mostrar();
        cadastro3.mostrar();
    }
}
