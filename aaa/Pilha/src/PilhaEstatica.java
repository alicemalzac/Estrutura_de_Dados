
public class PilhaEstatica {
	 private int total;
     private int v[];
     
     public PilhaEstatica(){
    	 total=0;
    	 v= new int[10];
     }
    void push(int x){
    	if(cheia()){
 		   System.out.println("Pilha Cheia");
 	   }else {
    	v[total] =x;
    	total++;
    }
    	
    }
    int top(){
        if(vazia()){
       		 System.out.println("Pilha vazia");
       		 return -1;
        }else{
    	 return v[total-1];
    	}
  
    }
    		
    int pop(){
    	if(vazia()){
          	 System.out.println("Pilha vazia");
          	 return -1;
        }else{
           total--;
           return v[total];		
          	 }
    	}
    		
    int tamanho(){
    	return total;
    }
    boolean vazia(){
       if(total==0){
    	 return true;
     } else {
        return false;
     }
       
    }
    boolean cheia(){
	   if(total==10){
		   return true;
	   } else {
		   return false;
	   }
   }
  
}
