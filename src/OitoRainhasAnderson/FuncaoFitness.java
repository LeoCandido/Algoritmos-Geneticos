package OitoRainhasAnderson;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class FuncaoFitness extends FitnessFunction {

	int linha;	
        //Função de Avaliação
        @Override
	protected double evaluate(IChromosome cromossomo) {		
		Tabuleiro tabuleiro = new Tabuleiro();
		int[][] estado = new int[8][8];
                //Recebe a localização das rainhas no Gene e insere na matriz de estado
		for (int coluna = 0; coluna < cromossomo.getGenes().length; coluna++) {
			linha = (Integer) cromossomo.getGene(coluna).getAllele();		
			estado[linha][coluna] = 1;
		}
		
		tabuleiro.setEstado(estado);		
		
		return 56 - tabuleiro.ataques();
	}

}
