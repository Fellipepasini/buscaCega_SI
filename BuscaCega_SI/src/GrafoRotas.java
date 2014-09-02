
public class GrafoRotas {
	public Object rotas[][] = new Object[Cidades.values().length][Cidades.values().length];
	
	public void inicializaMatriz(){
		for (int i = 0; i < Cidades.values().length; i++) {
			rotas[0][i] = Cidades.values()[i];
			rotas[i][0] = Cidades.values()[i];
		}
		adicionaRotas();
		printMatriz();
		
	}
	
	private void adicionaRotas() {
		
	}

	private void printMatriz() {
		for (int i = 0; i < rotas.length; i++) {
		    for (int j = 0; j < rotas.length; j++) {
		        System.out.print(rotas[i][j] + " ");
		    }
		    System.out.print("\n");
		}
		
	}

	public static void main(String[] args) {
		new GrafoRotas().inicializaMatriz();
	}
}
