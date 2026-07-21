package lista1JAMESSON;
import java.util.Scanner;

public class Ex07DiaDaSemanaCorrespondente {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dia;
		
		System.out.println("Digite um numero de 1 á 7");
		dia = scanner.nextInt();
		scanner.close();
		
		
		System.out.println("----Dia correspondente----");
		switch (dia){
			
			case 1: 
				System.out.println("DOMINGO!!!");
				break;
				
			case 2:
				System.out.println("SEGUNDA!!!");
				break;
				
			case 3:
				System.out.println("TERÇA-FEIRA!!!");
				break;					
			
			case 4:
				System.out.println("QUARTA-FEIRA!!!");
				break;
				
			case 5:
				System.out.println("QUINTA-FEIRA!!!");
				break;	
				
			case 6:
				System.out.println("SEXTA-FEIRA!!!");
				break;
				
			case 7:
			System.out.println("SÁBADO!!!");
				break;

				
		
		}
	}

}
