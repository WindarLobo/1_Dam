package boletin28;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventanas {

    JFrame marco;
JFrame marco2;
    JPanel panel;
    JPanel pane2;
    JLabel etiqueta1;
     JLabel etiqueta3;
    JLabel etiqueta2;

    JTextField lineaDeTexto;
    JPasswordField lineaDeTexto2;
    JButton pulsar, limpiar,cerrar;
    JTextArea areaTexto;

    public void iniciarVentana() {
       
        //Definir Componentes:
        marco = new JFrame();

        panel = new JPanel();

        lineaDeTexto = new JTextField();
        etiqueta1 = new JLabel(" Name ");

        lineaDeTexto2 = new JPasswordField();
        etiqueta2 = new JLabel(" Posword ");

        areaTexto = new JTextArea(" Text area");

        pulsar = new JButton("Press");
        limpiar = new JButton("Clean");

        // Caracteristica:
        marco.setBounds(500, 200, 500, 600);
     
        panel.setBounds(5, 5, 750, 750);

        lineaDeTexto.setBounds(200, 100, 200, 50);
        etiqueta1.setBounds(100, 100, 100, 50);

        lineaDeTexto2.setBounds(200, 200, 200, 50);
        lineaDeTexto2.setEchoChar('*');
        
        etiqueta2.setBounds(100, 200, 100, 50);

        areaTexto.setBounds(100, 300, 300, 100);

        pulsar.setBounds(100, 450, 100, 50);
        
        pulsar.setToolTipText(" Pressing ");
    
        limpiar.setBounds(300, 450, 100, 50);

        limpiar.setToolTipText(" We left the program ");
        
        //Agregamos componentes al panel
        
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lineaDeTexto);
        panel.add(lineaDeTexto2);
        panel.add(areaTexto);
        panel.add(pulsar);
        panel.add(limpiar);

        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
}
