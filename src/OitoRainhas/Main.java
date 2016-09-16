package OitoRainhas;

import OitoRainhas.Tabuleiro;

import java.awt.BorderLayout;

import org.jgap.InvalidConfigurationException;

@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame {

    private TabuleiroVisual tabuleiroVisual;    
    public static double fitness_obtido;
    
    public static void setFitness_Obtido(double fitness_Obtido) {
		fitness_obtido = fitness_Obtido;
	}

	public Main() throws InvalidConfigurationException {
        super("Problema das 8 Rainhas - Leandro Martins");
        initComponents();
        this.setLocationRelativeTo(null);          
      
        Tabuleiro t = new Tabuleiro();
		tabuleiroVisual = new TabuleiroVisual(t = AlgoritimoGenetico.resolve(), painelTabuleiro.getWidth());

        painelTabuleiro.setLayout(new BorderLayout());
        painelTabuleiro.add(tabuleiroVisual, BorderLayout.CENTER);
        
        getPainelAbas().setTitleAt(0, "Tabuleiro com ' "+t.ataques()+" ' Ataques"); 
        
        getjTextFieldFitnessObtido().setText(""+fitness_obtido);
    }

    @SuppressWarnings({ "deprecation" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        logArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        IniciarBotao = new javax.swing.JButton();
        painelAbas = new javax.swing.JTabbedPane();
        painelTabuleiro = new javax.swing.JPanel();        
        painelControles = new javax.swing.JPanel();
        jLabelRainhas = new javax.swing.JLabel();
        jTextFieldRainhas = new javax.swing.JTextField();
        jLabelGeracoes = new javax.swing.JLabel();
        jTextFieldGeracoes = new javax.swing.JTextField();              
        jLabelPopulacao = new javax.swing.JLabel();
        jTextFieldPopulacao = new javax.swing.JTextField();  
        jLabelFitnessEsperado = new javax.swing.JLabel(); 
        jLabelFitnessObtido = new javax.swing.JLabel(); 
        jTextFieldFitnessEsperado = new javax.swing.JTextField();
        jTextFieldFitnessObtido = new javax.swing.JTextField(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);        

        jSplitPane1.setDividerLocation(230);

        javax.swing.GroupLayout painelTabuleiroLayout = new javax.swing.GroupLayout(painelTabuleiro);
        painelTabuleiro.setLayout(painelTabuleiroLayout);
        painelTabuleiroLayout.setHorizontalGroup(
            painelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        painelTabuleiroLayout.setVerticalGroup(
            painelTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getPainelAbas().addTab("tab1", painelTabuleiro);             

        jSplitPane1.setRightComponent(getPainelAbas());

        jLabelRainhas.setText("Numero de Rainhas:");
        jTextFieldRainhas.setText(""+AlgoritimoGenetico.RAINHAS);
        jTextFieldRainhas.enable(false);        

        jLabelGeracoes.setText("Numero de Geracoes:");
        jTextFieldGeracoes.setText("100");             

        jLabelPopulacao.setText("Tamanho da Populacao:");   
        jTextFieldPopulacao.setText("60");        
        
        jLabelFitnessEsperado.setText("Fitness Esperado:");
        jTextFieldFitnessEsperado.setText(""+AlgoritimoGenetico.FITNESS_ESPERADO);        
        jTextFieldFitnessEsperado.enable(false);
        
        jLabelFitnessObtido.setText("Fitness Obtido:");        
        jTextFieldFitnessObtido.enable(false);
        
        IniciarBotao.setText("Executar");
        IniciarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarBotaoActionPerformed(evt);
            }
        });    
        
        logArea.setEditable(false);
        logArea.setColumns(20);
        logArea.setRows(5);
        jScrollPane1.setViewportView(logArea);

        javax.swing.GroupLayout painelControlesLayout = new javax.swing.GroupLayout(painelControles);
        painelControles.setLayout(painelControlesLayout);
        painelControlesLayout.setHorizontalGroup(
            painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelControlesLayout.createSequentialGroup()
                        .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelControlesLayout.createSequentialGroup()
                                .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                		.addComponent(jLabelFitnessObtido)
                                		.addComponent(jLabelFitnessEsperado)
                                		.addComponent(jLabelGeracoes)
                                    .addComponent(jLabelRainhas))
                                .addGap(8, 8, 8))
                            .addGroup(painelControlesLayout.createSequentialGroup()                            		
                            		.addComponent(jLabelPopulacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)                            
                            .addComponent(jTextFieldRainhas, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)                            
                            .addComponent(jTextFieldGeracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldPopulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldFitnessEsperado, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(getjTextFieldFitnessObtido(), javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                        .addComponent(IniciarBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addContainerGap()));
        painelControlesLayout.setVerticalGroup(
            painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRainhas)
                    .addComponent(jTextFieldRainhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)               
                .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGeracoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPopulacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldFitnessEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelFitnessEsperado))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(painelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getjTextFieldFitnessObtido(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFitnessObtido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)));
        
        jSplitPane1.setLeftComponent(painelControles);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents  
    
    private void IniciarBotaoActionPerformed(java.awt.event.ActionEvent evt) throws NumberFormatException{//GEN-FIRST:event_IniciarBotaoActionPerformed
    	AlgoritimoGenetico.setGeracao(Integer.valueOf((jTextFieldGeracoes).getText().toString()));
        AlgoritimoGenetico.setPopulacao(Integer.valueOf((jTextFieldPopulacao).getText().toString()));
        logArea.setText(null);
        AlgoritimoGenetico.AG(this);
    }

    public static void main(String args[]) {
        
        //carregamento do tema para frame
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Main().setVisible(true);
				} catch (InvalidConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
    
    public void setLog(String texto) {
        logArea.append(texto + "\n");
        logArea.setCaretPosition(logArea.getText().length() - 1);
    }
    
    public TabuleiroVisual getTabuleiroVisual() {
        return tabuleiroVisual;
    }
    
    public void setEstadoIniciarBotao(boolean estado) {
        IniciarBotao.setEnabled(estado);
    }
         
    public javax.swing.JTabbedPane getPainelAbas() {
		return painelAbas;
	}	

	public javax.swing.JTextField getjTextFieldFitnessObtido() {
		return jTextFieldFitnessObtido;
	}	

	private javax.swing.JButton IniciarBotao;
    private javax.swing.JLabel jLabelRainhas;    
    private javax.swing.JLabel jLabelGeracoes; 
    private javax.swing.JLabel jLabelPopulacao;
    private javax.swing.JLabel jLabelFitnessEsperado;
    private javax.swing.JLabel jLabelFitnessObtido;
    private javax.swing.JTextField jTextFieldRainhas;
    private javax.swing.JTextField jTextFieldGeracoes;    
    private javax.swing.JTextField jTextFieldPopulacao;
    private javax.swing.JTextField jTextFieldFitnessEsperado;
    private javax.swing.JTextField jTextFieldFitnessObtido;
    private javax.swing.JSplitPane jSplitPane1; 
    private javax.swing.JTextArea logArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelControles;    
    private javax.swing.JPanel painelTabuleiro;
    
}
