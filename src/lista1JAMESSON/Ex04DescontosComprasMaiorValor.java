//Sistema de Desconto de 10% para compras acima de $100
package lista1JAMESSON;
import java.util.Scanner;

public class Ex04DescontosComprasMaiorValor {
	
	public static void main(String[] args) {
		
		double compra, desconto, valorFinal;
		Scanner scanner = new Scanner(System.in);
		
		// desconto de 10% (10/100 = 0,1).
		desconto = 0.1;
		
		System.out.print("Digite o valor da sua compra:R$");
		compra = scanner.nextDouble();
		scanner.close();
		
		if(compra >=100 ) {
			
			valorFinal = compra - (compra*desconto);
			System.out.println("-=-=-=VOCÊ GANHOU 10% DE DESCONTO!!!-=-=-=");
			System.out.println("O valor da sua compra com Desconto será:R$"+valorFinal);
			
			
		}else{
			System.out.println("-=-=-=INFELIZMENTE VOCÊ NAO GANHOU O DESCONTO-=-=-=");
			System.out.println("O Valor da sua compra será:R$"+compra);
			
			
		}
		
		
		
	}

}
