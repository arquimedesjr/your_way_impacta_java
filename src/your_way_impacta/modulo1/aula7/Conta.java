package your_way_impacta.modulo1.aula7;

public class Conta {

	public int numero;
	public String nome;
	private double saldo;
	
	public void depositar(double v) {
		saldo += v;
	}
	
	public void retirar(double v) {
		saldo -= v;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
