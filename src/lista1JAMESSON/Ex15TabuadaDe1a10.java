package lista1JAMESSON;

public class Ex15TabuadaDe1a10 {
	
	public static void main(String[] args) {
		
		int tabuada;
		int resultado;
		
		//ESTRUTURA DA TABUADA
		for (tabuada = 1; tabuada <= 10; tabuada++ ) {
			
			System.out.println("\nTabuada do " +tabuada + ":");
			System.out.println("-------------");
			
			for(int i = 1; i <=10; i++) {
				
				resultado = tabuada * i;
				System.out.println(tabuada + " x " + i + " = " + resultado);
			}
		}
		

	}

}
