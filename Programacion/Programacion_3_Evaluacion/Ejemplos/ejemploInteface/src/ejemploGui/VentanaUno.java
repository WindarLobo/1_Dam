package ejemploGui;

import javax.swing.JFrame;

public class VentanaUno {

    JFrame marco;
    
    public void iniciarVentana() {
        
        marco = new JFrame("Primera Gui");
        //Caracteristica a ventana 
        
        marco.setSize(800, 400);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
}
