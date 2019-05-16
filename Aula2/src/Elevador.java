
public class Elevador {
	private int capacidade;
	private int andar;
	private int qtdPessoas;
	private int totalAndar;
	
	Elevador(){
		totalAndar = 8;
		capacidade = 6;
	}
	
	public void subir(){
		if(andar==totalAndar){
			System.out.println("Erro");
		}else{
			andar++;
		}	
	}
	public void descer(){
		if(andar==0){
			System.out.println("Erro");
		}else{
			andar--;
		}
	}
	public void entrar(){
		if(qtdPessoas==capacidade){
			System.out.println("Elevador cheio");
		}else{
			qtdPessoas++;
		}
	}
	public void sair(){
		if(qtdPessoas==0){
			System.out.println("Elevador vazio");
		}else{
			qtdPessoas--;
		}
	}
}
