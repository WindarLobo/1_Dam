package ejemploGui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaDos extends JFrame {

    //Damos las caracteristica
    public void iniciar() {
        setSize(800, 400);
        setLocationRelativeTo(this);
        JPanel panel = (JPanel) getContentPane();
        panel.setBackground(Color.yellow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
