 
public class ListaCircularEstatica {
       private int tamanho;
       private int inicio;
       private int fim;
       private int v[];
       
       
       public ListaCircularEstatica(){
    	   tamanho=0;
    	   inicio=0;
    	   fim=0;
    	   v= new int[10];
       }
       public boolean cheia(){
    	   if (tamanho==10){
    		   return true;
    	   }else {
    		   return false;
    	   }
       }
       public void inserir(int x){
    	   if(cheia()){
    		   System.out.println("Lista Cheia");
    	   }else {
    		   v[fim]=x;
               fim=(fim+1)%10;
               tamanho++;
               
    	   }
       }
       public void exibir(){
    	   int j=0;
    	   for(int i= inicio;j<tamanho;i=(i+10)%10){
    		   System.out.print(v[i]+",");
    		   j++;
    	   }
    	   System.out.println();
       }
     public  void removerInicio(){
    	 if(vazia()){
    		 System.out.println("lista vazia");
    	 }else{
    	 inicio=(inicio+1)%10;
    	 tamanho--;}
     }
     public void removerFim(){
    	 if(vazia()){
    		 System.out.println("lista vazia");
    	 }else{
    		 if(fim==0){
    			 fim=9;
    		 }else{
    		 fim=fim-1;
    	 }
    		 tamanho--;
     }
     }
     public boolean vazia(){
    	 if (tamanho==0){
  		   return true;
  	   }else {
  		   return false;
  	   }
     }
}
