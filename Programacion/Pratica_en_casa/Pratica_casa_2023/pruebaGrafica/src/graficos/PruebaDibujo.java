package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo extends JFrame {
    public PruebaDibujo(){
        setTitle("Marco Con dibujo");

        setBounds(700,300,400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaConFiguraFuentesr milamina= new LaminaConFiguraFuentesr();
        add(milamina);
    }
}
class LaminaConFigura extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       // g.drawRect(80,80,200,200);// Dibuja un Cuadrado
      //  g.drawLine(100,100,300,200);// Dibuja una linea
       //g.drawArc(50,100,100,200,120,150);//Dibuja un arco

        Graphics2D graphics2D=(Graphics2D) g;
        Rectangle2D rectangle2D=new Rectangle2D.Double(100,100,200,150);
        graphics2D.draw(rectangle2D);
        Ellipse2D  ellipse2D= new Ellipse2D.Double();
        ellipse2D.setFrame(rectangle2D);
        graphics2D.draw(ellipse2D);
        graphics2D.draw(new Line2D.Double(100,100,300,250));
        double CentroenX= rectangle2D.getCenterX();
        double CentroenY= rectangle2D.getCenterY();
        double radio=130;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
        graphics2D.draw(circulo);//dibuja utiliza draw

    }
}
