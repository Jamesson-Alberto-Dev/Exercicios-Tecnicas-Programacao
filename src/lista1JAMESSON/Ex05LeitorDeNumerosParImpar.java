//Leitor de numeros e sua respectiva Classificação.
package lista1JAMESSON;
import java.util.Scanner;

public class Ex05LeitorDeNumerosParImpar {
	
	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para analisar: ");
		num = scanner.nextInt();
		scanner.close();
		
		
		// CONDIÇAO PARA IMPAR OU PAR.
		if (num%2 == 0) {
			System.out.println("O numero é PAR.");
		}else {
			System.out.println("O numero é IMPAR.");
		}
		
	
		// CONDIÇAO PARA POSITIVO, NEGATIVO OU NULO.
		if (num >=1 ) {
			System.out.println("O numero é POSITIVO.");
			
		} else if(num == 0) {
			System.out.println("O numero é NULO.");
			
		}else {
			System.out.println("O numero é NEGATIVO.");
			
		}
		
		
		}

}
