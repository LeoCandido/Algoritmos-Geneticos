package OitoRainhas;

import java.util.ArrayList;

import OitoRainhas.Tabuleiro;

import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class AlgoritimoGenetico {

	public static final double FITNESS_ESPERADO = 28;	
	public static final int RAINHAS = 8;
	public static int GERACAO = 100;
	public static int POPULACAO = 60;
	static ArrayList<Double> melhoresFitness = new ArrayList<Double>();

	public static Tabuleiro resolve() throws InvalidConfigurationException {
		Tabuleiro tabuleiro = new Tabuleiro();

		Configuration conf = new DefaultConfiguration();
		conf.setPreservFittestIndividual(true);
		FitnessFunction fitneesRainhas = new FitnessRainhas();
		conf.setFitnessFunction(fitneesRainhas);

		Gene[] sampleGene = new Gene[RAINHAS];
		for (int i = 0; i < sampleGene.length; i++) {
			sampleGene[i] = new IntegerGene(conf, 0, (RAINHAS - 1));
		}
		IChromosome sampleChromosome = new Chromosome(conf, sampleGene);
		conf.setSampleChromosome(sampleChromosome);

		conf.setPopulationSize(POPULACAO);

		Genotype population = Genotype.randomInitialGenotype(conf);

		while (GERACAO > 0) {
			population.evolve();
			IChromosome bestSolutionSoFar = population.getFittestChromosome();			
			Main.setFitness_Obtido(bestSolutionSoFar.getFitnessValue());
			melhoresFitness.add(bestSolutionSoFar.getFitnessValue());			
			
			if (bestSolutionSoFar.getFitnessValue() == FITNESS_ESPERADO) {								
				break;
			}
			GERACAO--;						
		}

		// gerando a matriz com melhor solucao para montar tabuleiro
		int linha;
		int coluna = 0;
		int[][] posicionamento = new int[RAINHAS][RAINHAS];
		for (Gene gene : population.getFittestChromosome().getGenes()) {
			linha = (Integer) gene.getAllele();
			posicionamento[linha][coluna] = 1;
			coluna++;
		}
		tabuleiro.setPosicionamento(posicionamento);		
		return tabuleiro;
	}			
	
	//para executar a frame novamente ao clicar no botao
	public static void AG(Main frame) {
        new Thread(new ExecutaAG(frame)).start();
    }
	
	private static class ExecutaAG implements Runnable {

        private Main frame;

        public ExecutaAG(Main frame) {
            this.frame = frame;
        }

        public void run() {        	
            frame.setEstadoIniciarBotao(false);  
            Tabuleiro t = new Tabuleiro();          
            
            try {          
            	melhoresFitness.clear();
            	frame.getTabuleiroVisual().setTabuleiro(t = AlgoritimoGenetico.resolve());
				frame.getPainelAbas().setTitleAt(0, "Tabuleiro com ' "+t.ataques()+" ' Ataques");
				frame.getjTextFieldFitnessObtido().setText(""+melhoresFitness.get(melhoresFitness.size()-1));				
			} catch (InvalidConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            for (int i=0; i < melhoresFitness.size(); i++){                        	
            	frame.setLog("Geracao " + (i+1) + ":\n"
                        + "Melhor Fitness: " +melhoresFitness.get(i)+"\n"                    
                        + "-------------------------------------");
                                
                if (melhoresFitness.get(i) == FITNESS_ESPERADO) {                	
                    frame.setLog("SOLUCAO ENCONTRADA!");                
                    break;
                }                
            }            
            frame.setEstadoIniciarBotao(true);
        }
    }
	
	public static void setGeracao(int geracao) {
		GERACAO = geracao;
	}

	public static void setPopulacao(int populacao) {
		POPULACAO = populacao;
	}
}