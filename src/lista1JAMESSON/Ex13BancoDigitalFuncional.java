package lista1JAMESSON;
import java.util.Scanner;

public class Ex13BancoDigitalFuncional {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		double saldo = 1000.00;
		double deposito, saque;
		
		while (opcao != 3) {
			
			System.out.println("\n---BANCO DIGITAL---");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Sair");
			System.out.println("Escolha uma das opções: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.print("Digite o valor do Deposito: ");
					deposito = scanner.nextDouble();		
					saldo = deposito + saldo;
					System.out.print("Seu novo saldo é: "+saldo);
					break;
					
				case 2:
					System.out.print("Digite o valor do Saque: ");
					saque = scanner.nextDouble();
					
					if (saque < saldo) {
						saldo = saldo - saque;
						System.out.print("Saldo atual: "+saldo);
					
					}else {
						System.out.println("SALDO INSUFICIENTE!!!");
						
					}
					break;
					
				case 3:
					System.out.println("...SAINDO DO BANCO...");
					break;
					
				default:
					System.out.println("Opção Invalida!!!");
			
			}
			
		}
		scanner.close();
	
		

	}

}
