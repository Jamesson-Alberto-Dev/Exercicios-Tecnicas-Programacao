package lista1JAMESSON;

public class Ex16IdentificaçãoNumerosPrimos1a100 {
	
	public static void main(String[] args) {
	
		System.out.println("Números primos entre 1 e 100:");

        for (int num = 1; num <= 100; num++){
        	
            int divisores = 0; 

            for (int i = 1; i <= num; i++){
            	
                if (num % i == 0){ 
                	
                    divisores++;
                }
            }

            if (divisores == 2){
            	
                System.out.print(num + " ");
                
            }
        }
	}

}
