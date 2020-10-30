package your_way_impacta.modulo1.aula5;

public class ExemploContinue {
	public static void main(String[] args){
		int num = 0;
		while(num<10){
			++num;
			if(num==5){
				continue;
			}
			System.out.println("Valor de num = " + num);
		}
	}
}
