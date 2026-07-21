package lista1JAMESSON;
import java.util.Scanner;

public class Ex06SistemaDeAcessoRestrito {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String senha="1234";
		
		// ESTRUTURA DE REPETIÇAO
		do {
			System.out.print("Digite a senha de 4 Digitos: ");
			senha = scanner.nextLine();
			
		// SE A SENHA FOR DIFERENTE ( ! ) DE 1234 "Senha Incorreta!!!".
			if ( ! senha.equals("1234")) {
				System.out.println("Senha incorreta!!!");
					}
			
		// ENQUANTO A SENHA NAO FOR "1234" REPETE O ´do´
		// SEMPRE QUE FOR DIFRENTE ELE REPETE A PERGUNTA INICIAL.
		// CASO SEJA IGUAL A 1234 TERMINA O LOOP.
		} while ( ! senha.equals("1234"));
		
		System.out.println("Acesso LIBERADO");
		scanner.close();
		
	}

}
