package OitoRainhas;

public class Tabuleiro {	
	private int[][] posicionamento;		

	public int ataques() {
		int ataques = 0;
		int posicaoDaLinha = 0, posicaoDaColuna = 0;
		int tamanho = posicionamento.length;

		for (int coluna = 0; coluna < posicionamento.length; coluna++) {

			/* Procurando rainhas em ataque na coluna */
			for (int linha = 0; linha < posicionamento.length; linha++) {
				if (posicionamento[linha][coluna] == 1) {
					posicaoDaLinha = linha;
					posicaoDaColuna = coluna;
					break;
				}
			}

			/* Procurando rainhas em ataque */
			for (int i = 1; i < tamanho; i++) {

				// diagonal cima para baixo
				if ((((posicaoDaLinha - i) >= 0) && (posicaoDaColuna + i) < tamanho) && posicionamento[posicaoDaLinha - i][posicaoDaColuna + i] == 1) {
					ataques += 1;
				}

				// diagonal baixo para cima
				if ((((posicaoDaLinha + i) < tamanho) && (posicaoDaColuna + i) < tamanho) && posicionamento[posicaoDaLinha + i][posicaoDaColuna + i] == 1) {
					ataques += 1;
				}

				// verifica para o lado
				if (((posicaoDaColuna + i) < tamanho) && posicionamento[posicaoDaLinha][posicaoDaColuna + i] == 1) {
					ataques += 1;
				}
			}
		}
		return ataques;
	}	
	
	public int[][] getPosicionamento() {
		return posicionamento;
	}

	public void setPosicionamento(int[][] posicionamento) {
		this.posicionamento = posicionamento;
	}
}