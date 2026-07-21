package lista1JAMESSON;
import java.util.Scanner;

public class Ex20SistemaSegurançaLimiteDeTentativas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String senha ;
		int tentativas=0;
		
		do {
			System.out.print("Digite a senha: ");
			senha = scanner.nextLine();
			
			if (senha.equals("admin")) {
				break;
				
			} else {
				System.out.println("ACESSO NEGADO!!!");
				tentativas++; 
			
			}
			
		
		} while (tentativas < 3);
		
			if(tentativas == 3) {
				System.out.println("===CONTA BLOQUEADA!!!===");
				System.out.println("tentativas excedidas...");
		
			}else if (senha.equals("admin")) {
				System.out.println("ACESSO LIBERADO!!!");

			}
		
		scanner.close();
	}

}
