package lista1JAMESSON;
import java.util.Scanner;

public class Ex12PeçasAprovadasDefeituosas {
	
	public static void main(String[] args) {
		
		int valor; 
		int aprovado=0; 
		int defeituosa=0; 
		Scanner scanner = new Scanner(System.in);
				
		for (int i=1 ; i<=10 ; i++) { 
					
			System.out.print("Digite 1 para APROVADO e 0 para DEFEITUOSAS: "); 
			valor = scanner.nextInt(); 
					
			if (valor == 1) {
				
				aprovado = aprovado + 1; 
				
			} else if (valor == 0) {
				
				defeituosa = defeituosa + 1; 
				
			} else {
				System.out.println("NUMERO INVALIDO!!!");
			}
			
			
			}
		
			System.out.println("Peças APROVADAS: "+aprovado);
			System.out.println("Peças DEFEITUOSA: "+defeituosa); 
			scanner.close();

		
	}

}
