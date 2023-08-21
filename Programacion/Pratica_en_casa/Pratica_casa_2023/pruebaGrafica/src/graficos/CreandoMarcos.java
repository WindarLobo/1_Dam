package graficos;
import javax.swing.*;
import java.awt.*;

public class CreandoMarcos extends JFrame {
        public CreandoMarcos() {
           // setSize(500, 300);
            //setLocation(500,300);
            setBounds(500,300,550,250);//Funciona setLocation y setSize todo junto
            //setResizable(false);
           // setExtendedState(Frame.MAXIMIZED_BOTH);// abrir toda completa
            setTitle("Mi ventana");//Titulo
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
