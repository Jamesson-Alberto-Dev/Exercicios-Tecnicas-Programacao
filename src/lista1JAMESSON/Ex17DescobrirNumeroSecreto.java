package lista1JAMESSON;
import java.util.Scanner;

public class Ex17DescobrirNumeroSecreto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numSecreto = 11;
		int numUsuario=0 ;
		
		System.out.println("\n=====JOGO DE ADIVINHAÇÃO====");
		
		do {
			System.out.print("Tente acertar o numero Secreto do Sistema: ");
			numUsuario = scanner.nextInt();
			
			if (numUsuario > numSecreto) {
				System.out.println("NUMERO ERRADO!!!");
				System.out.println("O valor que voce escolheu é Maior!!!");
				
			}else if (numUsuario < numSecreto) {
				System.out.println("NUMERO ERRADO!!!");
				System.out.println("O valor que voce escolheu é Menor!!!");	
				
				}
		} while (numUsuario != numSecreto);
		
		System.out.println("PARABENS ACERTOU!!!");
		scanner.close();
		
	}

}
