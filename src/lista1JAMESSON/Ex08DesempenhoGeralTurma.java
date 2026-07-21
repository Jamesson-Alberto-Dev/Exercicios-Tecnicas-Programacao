package lista1JAMESSON;
import java.util.Scanner;

//LEITOR DE 5 NOTAS E MEDIA TOTAL
public class Ex08DesempenhoGeralTurma {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double nota;
		double soma=0 ;
		double media;
		
		//LOOP COM for QUEM VAI DE 1 ATE 5.
		for (int i=1 ; i<= 5 ; i++) {
			System.out.print("Digite a nota do aluno" + i + ":");
			nota = scanner.nextDouble();
		
			// SOMA VAI GUARDANDO A NOTA ANTERIO E SOMANDO COM A NOVA
			soma = soma + nota;	
		}
		
		//MEDIA TOTAL DOS ALUNOS
		 media = soma / 5;
		 System.out.println("A media da turma é: "+ media);
		 
		 scanner.close();
		
		
	}

}
