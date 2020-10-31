package your_way_impacta.modulo1.aula7;

public class TesteEmpregado {
	public static void main(String args[]){
		Empregado emp = new Empregado();
		emp.setEndereco("Centro");
		emp.setIdade(40);
		
		System.out.println(emp.mostrar());
	}
}
