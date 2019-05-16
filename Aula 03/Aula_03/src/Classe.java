
public class Classe {
	private int numero;
	private int agencia;
	private double saldo;
	
	public void setNumero(int n){
		this.numero = n;
	}
	public void setAgencia(int a){
		this.agencia = a;
	}
	
	public int getNumero(){
		return numero;
	}
	public int getAgencia(){
		return agencia;
	}
	public double getSaldo(){
		return saldo;
	}
	public void depositar (double valor){
		if(valor<=0){
			System.out.println("Valor inválido. Deposite um valor maior ou igual a zero.");
		}
		else{
			saldo = saldo + valor;
		}
	}
	
	public void sacar (double saque){
		if(saque<=0 || saque>saldo){
			System.out.println("Valor inválido.");
		}
		else{
			saldo = saldo - saque;
		}
	}
	
	public void transferir (Classe dest, double valor){
		if(valor<=0 || valor>saldo){
			System.out.println("Valor inválido.");
		}
		else{
			saldo = saldo - valor;
			dest.depositar(valor);
		}
	}
}
