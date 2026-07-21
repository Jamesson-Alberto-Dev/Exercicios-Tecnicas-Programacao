//Leitor de Temperatura e suaClassificação correspondente.
package lista1JAMESSON;
import java.util.Scanner;

public class Ex03MonitoramentoCondiçoesTermicas {
	
	public static void main(String[] args) {
		
		int temp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Temperatura em Celsius: ");
		temp = scanner.nextInt();
		
		scanner.close();
		
		if( temp > 30) {
			System.out.println("ALERTA DE CALOR!!!");
			
		}else if(temp <=30 && temp >= 20 ) {
		System.out.println("CONFORTO TÉRMICO!!!");
		
		}else {
			System.out.println("FRIO!!!");
			
		}
	}

}
