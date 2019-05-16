
public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setAgencia(int agencia){
		this.agencia = agencia;
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
	public void depositar(double valor){
		if(valor<=0){
			System.out.println("Valor invalido");
		}else{
			saldo = saldo + valor;	
		}
	}
	
	public void sacar(double valor){
		if(valor<=0 || valor>saldo){
			System.out.println("Valor invalido");
		}else{
			saldo = saldo - valor;	
		}
	}
	public void transferir(Conta dest, double valor){
		if(valor<=0 || valor>saldo){
			System.out.println("Valor invalido");
		}else{
			saldo = saldo - valor;
			dest.depositar(valor);	
		}
	}
	
}
