
public class Aluno {
	private int idade;

	public void setIdade(int idade){
		if(idade<0){
			System.out.println("Idade invalida");
		}else{
			this.idade = idade;
		}
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void falar(){
		System.out.println("Oi gente. Tenho "+idade+" anos");
	}
}
