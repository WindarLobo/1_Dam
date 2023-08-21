package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PruebaConFuetes extends JFrame {
    public PruebaConFuetes() {
        setTitle("Marco Con tipo de Fuente");

        setBounds(700, 300, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaConFiguraFuentesr milamina = new LaminaConFiguraFuentesr();
        add(milamina);
        milamina.setForeground(Color.MAGENTA.brighter());

    }
}

class LaminaConFiguraFuentesr extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Font miFuente= new Font("Courier",Font.BOLD,26);
        graphics2D.setFont(miFuente);
      //  graphics2D.setColor(Color.ORANGE);
        graphics2D.drawString("Windar",100,100);
        graphics2D.setFont(new Font("Arial",Font.ITALIC,24));
       // graphics2D.setColor(new Color(128,90,90).brighter());
        graphics2D.drawString("Curso de java",100,200);
    }
}
