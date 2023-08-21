package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujoColor extends JFrame {
    public PruebaDibujoColor() {
        setTitle("Marco Con Color");

        setBounds(700, 300, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaConFiguraFuentesr milamina = new LaminaConFiguraFuentesr();
        add(milamina);
        milamina.setBackground(SystemColor.window);

    }
}

class LaminaConFiguraColor extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        //dibuja rectangulo
        Rectangle2D rectangle2D = new Rectangle2D.Double(100, 100, 200, 150);
        graphics2D.setPaint(Color.MAGENTA);// borde color
        graphics2D.draw(rectangle2D);
        graphics2D.setPaint(Color.ORANGE.darker());// darker quita el brillo

        graphics2D.fill(rectangle2D);
        //dibuja ellipse
        Ellipse2D ellipse2D = new Ellipse2D.Double();
       // graphics2D.setPaint(Color.red);
        Color micolor= new Color(125,189,200);
        graphics2D.setPaint(micolor);// tambien se puede asi
       // graphics2D.setPaint(new Color(109,172,59).brighter()); //Paramentros de color para establecer varios color y q salga una mezcla y brighter aclara el color
        ellipse2D.setFrame(rectangle2D);
        graphics2D.fill(ellipse2D);
    }
}
