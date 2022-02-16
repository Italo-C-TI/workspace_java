import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	    int numero,aux = 0,resultado;
		Scanner input = new Scanner(System.in);
		do{
		   numero = input.nextInt();
		   resultado = numero;
		   if(numero == 0) {
			   System.out.println("");
			   break;
		   }
		   if(numero%2 != 0){
		      numero +=1;
		    }
		    for(int i = 0;i < 5;i++){
		    	if(i == 0) {
		    		resultado = numero;
		    		aux = numero + 2; 
		    	}else {
		    		resultado+= aux;
		    		aux += 2;    		    	
		    	}
		    	
		    }
		    System.out.println(resultado);
	    }while(numero != 0);
	input.close();	    
}
    
}