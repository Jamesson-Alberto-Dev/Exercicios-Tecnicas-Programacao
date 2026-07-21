package lista1JAMESSON;

public class Ex14OrgãoDePlanejamentoUrbano {
	
	public static void main(String[] args) {
	
		double populacao = 1000.00;
		double crescimento = 0.03; 
		int anos = 0;
		
		while(populacao < 5000 ) {
			
			populacao = populacao + (populacao * crescimento);
			anos ++;
			
		}
		
		System.out.println("Serão necessarios " + anos + " Anos para a população atingir 5000 habitantes.");
	}

}
