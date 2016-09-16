package OitoRainhas;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

@SuppressWarnings("serial")
public class FitnessRainhas extends FitnessFunction {
	int linha;
		
	protected double evaluate(IChromosome cromossomo) {
		
		Tabuleiro tabuleiro = new Tabuleiro();
		int[][] posicionamento = new int[8][8];
		
		for (int coluna = 0; coluna < cromossomo.getGenes().length; coluna++) {
			linha = (Integer) cromossomo.getGene(coluna).getAllele();			
			posicionamento[linha][coluna] = 1;
		}
		
		tabuleiro.setPosicionamento(posicionamento);		
		
		return (AlgoritimoGenetico.FITNESS_ESPERADO - tabuleiro.ataques());
	}
}