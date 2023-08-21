package graficos;

import javax.swing.*;
import java.awt.*;

public class MarcoConTexto extends JFrame {
    public MarcoConTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(600, 300);
        setTitle("Primer Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lamina lamina= new Lamina();
      add(lamina);

    }

}

class Lamina extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
        g.drawString("Estamos Aprendiedo Swing", 100, 100);

    }
}

