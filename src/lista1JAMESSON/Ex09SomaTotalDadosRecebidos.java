package lista1JAMESSON;
import java.util.Scanner;

public class Ex09SomaTotalDadosRecebidos {
	
	public static void main(String[] args) {
		
	int num;
	int soma=0;
	Scanner scanner = new Scanner(System.in);
	
	do {
		System.out.print("Digite um numero: ");
		num = scanner.nextInt();
		
		if (num != 0) {
			soma = soma + num;
					
		}else {
		 System.out.println("SESSAO ENCERRADA");
		 System.out.print("A soma dos numeros: " +soma);

	 
		}
		
	} while(num != 0);
		scanner.close();
		

	}

}
