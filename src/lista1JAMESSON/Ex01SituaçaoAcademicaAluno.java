//Nota final do aluno e sua situação academica
package lista1JAMESSON;
import java.util.Scanner;

public class Ex01SituaçaoAcademicaAluno {
	
	public static void main (String[]args) {
		
		double nota1, nota2, nota3, media;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua Primeira Nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("Digite sua Segunda Nota: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("Digite sua Terceira Nota: ");
		nota3 = scanner.nextDouble();
		
		scanner.close();
		media = (nota1 + nota2 + nota3)/ 3;
		
		if(media >= 7) {
			System.out.println("APROVADO!!! Sua média foi: "+media);
			
		}else if(media < 7 && media >=5) {
			System.out.println("RECUPERÇÃO!!! Sua média foi: "+media);
			
		}else {
			System.out.println("REPROVADO!!! Sua média foi: "+media);
		}
	

		
	}

}
