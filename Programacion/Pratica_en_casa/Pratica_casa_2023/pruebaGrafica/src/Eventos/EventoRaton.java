package Eventos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoRaton extends JFrame {

    public EventoRaton() {
            setVisible(true);
            addMouseListener(new EventoDeRaton());
            setBounds(700,300,600,450);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
/*class EventoDeRaton implements MouseListener{


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar ");


    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");

    }
}*/
class EventoDeRaton extends MouseAdapter{
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");

    }
}
