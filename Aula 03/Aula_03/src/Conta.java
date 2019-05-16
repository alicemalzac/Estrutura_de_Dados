import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner ler = new Scanner (System.in);

		Classe c1 = new Classe();
		c1.depositar(100);
		c1.sacar(30);
		//c1.sacar(300);
		
		Classe c2 = new Classe();
		c2.depositar(200);
		
		c1.transferir(c2, 50);
		
		//System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}

}