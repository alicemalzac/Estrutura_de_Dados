
public class Spec {
	private	float capacidade;
	private	int andar;
	private	int qtPessoas;
	private	int totalAndar;
	
	Spec(){
		totalAndar = 8; //setando o valor no metodo construtor.
		capacidade = 6; //kg.
	}
	
	public int getAndar(){
		return andar;
	}
		
	public void subir(){
		if(andar >= totalAndar){
			System.out.println("Impossivel subir");
		}
		else{
			andar++;
		}
	}
	public void descer(){
		if(andar <= 0){
			System.out.println("Impossivel descer");
		}
		else{
			andar --;
		}
	}
	public void entrar(){
		if(qtPessoas >= capacidade){
			System.out.println("Excesso de pessoas");
		}
		else{
			qtPessoas ++;
		}
	}	
	public void sair(){
		if(qtPessoas <= 0){
			System.out.println("Elevador vazio");
		}
		else{
			qtPessoas --;
		}
	}
}
