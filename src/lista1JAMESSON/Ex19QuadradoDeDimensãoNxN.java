package lista1JAMESSON;
import java.util.Scanner;

public class Ex19QuadradoDeDimensãoNxN {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("Digite o valor de N para definir o tamanho do Quadrado (N x N):");
		n = scanner.nextInt();
		
		//VETOR NO EIXO X PARA DEFINIR A LINHA
		for ( int i = 0; i < n; i++) {
			
			//VETOR NO EIXO Y, PARA DEFINIR A COLUNA
			for (int j = 0; j < n; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
