package lista1JAMESSON;
import java.util.Scanner;

public class Ex11DesempenhoFuncionarios {
	
	public static void main(String[] args) {
		
		double nota;
		double maior = 0;
		double menor = 10;
		Scanner scanner = new Scanner(System.in);

		
		for (int i=1 ; i<=10 ; i++) {
			System.out.print("Digite a nota do Funcionario " + i + ": ");
			nota = scanner.nextDouble();
			
			
			if (nota > maior) {
				maior = nota;
				
			}
			if (nota < menor) {
				menor=nota;
				
			}
		}
		
		System.out.println("A maior nota foi: "+maior);
		System.out.println("A menor nota foi: "+menor);
		scanner.close();
	}

}
