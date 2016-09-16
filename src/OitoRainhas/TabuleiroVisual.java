package OitoRainhas;

import OitoRainhas.Tabuleiro;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TabuleiroVisual extends JPanel {

    private int tamanhoQuadrado = 50;
    private Tabuleiro tabuleiro;
    private int widthComponent;

    public TabuleiroVisual(Tabuleiro tabuleiro, int w) {
        this.tabuleiro = tabuleiro;
        this.widthComponent = w;
        tamanhoQuadrado = (int) widthComponent / 8;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int cont = 0;
        for (int y = 0; y < 8; y++) {
            cont++;
            for (int x = 0; x < 8; x++) {
                if (cont % 2 == 0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.GRAY);
                }
                cont++;
                g.fillRect(tamanhoQuadrado * x, tamanhoQuadrado * y, tamanhoQuadrado, tamanhoQuadrado);
            }
        }

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (tabuleiro.getPosicionamento()[y][x] == 1) {
                    g.setColor(Color.green);
                    g.fillOval(tamanhoQuadrado * x, tamanhoQuadrado * y, tamanhoQuadrado, tamanhoQuadrado);
                }
            }
        }
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        tamanhoQuadrado = (int) widthComponent / 8;
        paintComponent(super.getGraphics());
    }
}