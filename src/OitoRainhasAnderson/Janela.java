package OitoRainhasAnderson;

import org.jgap.InvalidConfigurationException;

public class Janela extends javax.swing.JFrame {
    public static int[][] RAINHAS = new int[8][2]; 
  
    public Janela() {
        //initComponents();
        
        iniciar();
          
    }
 private void iniciar() {

        rainha1 = new javax.swing.JLabel();
        rainha2 = new javax.swing.JLabel();
        rainha3 = new javax.swing.JLabel();
        rainha4 = new javax.swing.JLabel();
        rainha5 = new javax.swing.JLabel();
        rainha6 = new javax.swing.JLabel();
        rainha7 = new javax.swing.JLabel();
        rainha8 = new javax.swing.JLabel();
        tabuleiro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);

        rainha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha1);
        rainha1.setBounds(RAINHAS[0][0],RAINHAS[0][1], 60, 60);

        rainha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha2);
        rainha2.setBounds(RAINHAS[1][0],RAINHAS[1][1], 60, 60);

        rainha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha3);
        rainha3.setBounds(RAINHAS[2][0],RAINHAS[2][1], 60, 60);

        rainha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha4);
        rainha4.setBounds(RAINHAS[3][0],RAINHAS[3][1], 60, 60);

        rainha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha5);
        rainha5.setBounds(RAINHAS[4][0],RAINHAS[4][1], 60, 60);

        rainha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha6);
        rainha6.setBounds(RAINHAS[5][0],RAINHAS[5][1], 60, 60);

        rainha7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha7);
        rainha7.setBounds(RAINHAS[6][0],RAINHAS[6][1], 60, 60);

        rainha8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha8);
        rainha8.setBounds(RAINHAS[7][0],RAINHAS[7][1], 60, 60);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Solucao 8 Rainhas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 580, 50);

        tabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/rainhas_sem_atacar-se.jpg"))); // NOI18N
        getContentPane().add(tabuleiro);
        tabuleiro.setBounds(10, 70, 584, 584);

        pack();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rainha1 = new javax.swing.JLabel();
        rainha2 = new javax.swing.JLabel();
        rainha3 = new javax.swing.JLabel();
        rainha4 = new javax.swing.JLabel();
        rainha5 = new javax.swing.JLabel();
        rainha6 = new javax.swing.JLabel();
        rainha7 = new javax.swing.JLabel();
        rainha8 = new javax.swing.JLabel();
        tabuleiro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);

        rainha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha1);
        rainha1.setBounds(90, 80, 60, 60);

        rainha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha2);
        rainha2.setBounds(20, 150, 60, 60);

        rainha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha3);
        rainha3.setBounds(520, 580, 60, 60);

        rainha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha4);
        rainha4.setBounds(20, 80, 60, 60);

        rainha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha5);
        rainha5.setBounds(20, 80, 60, 60);

        rainha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha6);
        rainha6.setBounds(20, 80, 60, 60);

        rainha7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha7);
        rainha7.setBounds(20, 80, 60, 60);

        rainha8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rainha8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/quen.png"))); // NOI18N
        getContentPane().add(rainha8);
        rainha8.setBounds(20, 80, 60, 60);

        tabuleiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OitoRainhasAnderson/rainhas_sem_atacar-se.jpg"))); // NOI18N
        getContentPane().add(tabuleiro);
        tabuleiro.setBounds(10, 70, 584, 584);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Solucao 8 Rainhas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 580, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {

            Tabuleiro tabuleiro = AlgGenetico.solucao();
            tabuleiro.gerar();

        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel rainha1;
    private javax.swing.JLabel rainha2;
    private javax.swing.JLabel rainha3;
    private javax.swing.JLabel rainha4;
    private javax.swing.JLabel rainha5;
    private javax.swing.JLabel rainha6;
    private javax.swing.JLabel rainha7;
    private javax.swing.JLabel rainha8;
    private javax.swing.JLabel tabuleiro;
    // End of variables declaration//GEN-END:variables
}
