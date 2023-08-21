package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.nio.file.WatchEvent;

public class CambioEstado extends JFrame {
    public CambioEstado() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        addWindowStateListener(new CambiaEstado());

    }
}
class CambiaEstado implements WindowStateListener {
    @Override
    public void windowStateChanged(WindowEvent e) {
       // System.out.println("La ventana  ha cambiado de estado");
       // System.out.println(e.getNewState());
        if(e.getNewState()== Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla completa");
        } else if (e.getNewState()==Frame.NORMAL) {
            System.out.println("La venta esta normal");
        } else if (e.getNewState()==Frame.ICONIFIED) {
            System.out.println("La ventana esta minimizada");
        }
    }
}
