//Leitor de Consumo mensal de energia e sua Classificação correspondente
package lista1JAMESSON;
import java.util.Scanner;

public class Ex02ConsumoMensalEnergia {
	
	public static void main(String[] args) {
		
		int consumoEnergia;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu Consumo de Energia: ");
		consumoEnergia = scanner.nextInt();
		
		scanner.close();
		
		if( consumoEnergia > 300) {
			System.out.println( +consumoEnergia+ "kWh, Alto Consumo!!!");
			
			
		}else if( consumoEnergia >= 151 && consumoEnergia <= 300) {
			System.out.println( +consumoEnergia+ "kWh, Consumo Moderado!!!");
			
			
		}else {
			System.out.println( +consumoEnergia+ "kWh, Baixo Consumo!!!");
		}

	}

}
