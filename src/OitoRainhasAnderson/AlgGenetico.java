package OitoRainhasAnderson;

import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class AlgGenetico {
    
    private static final int QUANT_RAINHAS = 8;
    private static final int POPULACAO = 300;
    private static final double VALOR_OTIMO = 56;
    

    public static Tabuleiro solucao() throws InvalidConfigurationException {
        Tabuleiro tabuleiro = new Tabuleiro();

        Configuration conf = new DefaultConfiguration();
        conf.setPreservFittestIndividual(true);
        FitnessFunction FuncaoFit = new FuncaoFitness();
        conf.setFitnessFunction(FuncaoFit);
        //configuração dos Individuos
        Gene[] sampleGene = new Gene[QUANT_RAINHAS];
        for (int i = 0; i < sampleGene.length; i++) {
            sampleGene[i] = new IntegerGene(conf, 0, (QUANT_RAINHAS - 1));
        }
        IChromosome sampleChromosome = new Chromosome(conf, sampleGene);
        conf.setSampleChromosome(sampleChromosome);

        conf.setPopulationSize(POPULACAO);
        //Gerando a população inicial
        Genotype populacao = Genotype.randomInitialGenotype(conf);
        
        while (true) {
            populacao.evolve();
            IChromosome melhorSolucao = populacao.getFittestChromosome();
            System.out.println(melhorSolucao);

            if (melhorSolucao.getFitnessValue() == VALOR_OTIMO) 
                break;
        }

        //Gerando a matriz
        int linha;
        int coluna = 0;
        int[][] estado = new int[QUANT_RAINHAS][QUANT_RAINHAS];
        for (Gene gene : populacao.getFittestChromosome().getGenes()) {

            linha = (Integer) gene.getAllele();
            estado[linha][coluna] = 1;
            coluna++;
        }

        tabuleiro.setEstado(estado);

        return tabuleiro;
    }
}
