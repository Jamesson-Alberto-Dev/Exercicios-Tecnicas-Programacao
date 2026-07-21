package lista1JAMESSON;
import java.util.Scanner;

public class Ex18AnalisarSalariosFuncionarios {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double salario, salarioTotal = 0;
		double media;
		int numFuncionarios = 0;
		int salSuperior = 0;
		
		do {
			System.out.print("Informe o salario do funcionario: R$");
			salario = scanner.nextDouble();
			salarioTotal = salarioTotal + salario; 
			numFuncionarios ++;
			
			if(salario > 2000.00) {
				salSuperior ++;
			}
			
			
		}while(salario != 0);
		media = salarioTotal / (numFuncionarios-1);
		
		System.out.println("SESSÃO ENCERRADA!!!");
		System.out.println("O numero de Salarios acima de R$2000 foi: " +salSuperior);
		System.out.println("A Media Salarial foi: R$"+media);

		scanner.close();
		

	}

}
