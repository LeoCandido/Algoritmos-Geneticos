package OitoRainhasAnderson;

public class Tabuleiro {
	private int[][] estado;
	
	public int[][] getEstado() {
		return estado;
	}

	public void setEstado(int[][] estado) {
		this.estado = estado;
	}

	public int ataques() {
            int valorLinha = 0, valorColuna = 0;	
            int numAtaques = 0;
            int tamanho = estado.length;

            for (int coluna = 0; coluna < estado.length; coluna++) {
                //procura a rainha na coluna
                for (int linha = 0; linha < estado.length; linha++) {

			if (estado[linha][coluna] == 1) {
				valorLinha = linha;
				valorColuna = coluna;
				break;
			}
		}

		//Computando os ataques 
		for (int i = 1; i < tamanho; i++) {
			// Testa na diagonal superior a direita em relação a posição da rainha
        		if ( ( ( (valorLinha - i) >= 0) && (valorColuna + i) < tamanho)
				&& estado[valorLinha - i][valorColuna + i] == 1) {
				numAtaques += 1;
			}
			// Testa na diagonal inferior a direita em relação a posição da rainha
			if ((((valorLinha + i) < tamanho) && (valorColuna + i) < tamanho)
				&& estado[valorLinha + i][valorColuna + i] == 1) {
				numAtaques += 1;
			}
				// verifica o lado direito
			if (((valorColuna + i) < tamanho) && estado[valorLinha][valorColuna + i] == 1) {
				numAtaques += 1;
			}
		}
                        
            }

            return numAtaques;
	}

        public void gerar(){
		for (int linha = 0; linha < estado.length; linha++) {

			for (int coluna = 0; coluna < estado.length; coluna++) {
				if(estado[linha][coluna] != 0){
                                    Janela.RAINHAS[linha][0] = (coluna*70+20+coluna);
                                    Janela.RAINHAS[linha][1] = (linha*70+80+linha);
                                }                                
                        }
                }
                Janela principal = new Janela();
                principal.setSize(610,690);
                principal.setLocationRelativeTo(null);  
                principal.setVisible(true);
		System.out.println("Ataques: " + this.ataques());
	}
}
