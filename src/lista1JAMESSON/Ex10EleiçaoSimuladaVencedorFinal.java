package lista1JAMESSON;
import java.util.Scanner;

//SISTEMA DE CONTAGEM DE VOTOS E O GANHADOR FINAL
public class Ex10EleiçaoSimuladaVencedorFinal {
	
	public static void main (String[] args) {
	
		int voto;
		int CA=0, CB=0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite 1 para A e 2 para B (0 para Encerrar!!!): ");
			voto = scanner.nextInt();
			
			//LOGICA PARA CONTAGEM DE VOTOS PARA CANDITADO
			if (voto == 1) {
				CA = CA + 1;
				
			}else if (voto == 2) {
				CB = CB + 1;
				
			}else {
				
				System.out.println("SESSÃO ENCERRADA!!!");
				System.out.println("O total de votos para A: " +CA);
				System.out.println("O tatal de votos para B: "+CB);
				
				//LOGICA PARA QUEM FOI O VENCEDOR
				if(CA > CB) {
					System.out.println("Candidato A foi o VENCEDOR!!!");
					
				}else {
					System.out.println("Canditado B foi o VENCEDOR!!!");
					
				}
			}
	
		}while (voto != 0);
			scanner.close();
	
		
	}

}
