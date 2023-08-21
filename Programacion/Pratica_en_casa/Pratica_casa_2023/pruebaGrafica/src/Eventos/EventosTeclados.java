package Eventos;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class EventosTeclados extends JFrame {
    public EventosTeclados() {
            setVisible(true);
            addKeyListener(new EventoDeTeclado());
            setBounds(700,300,600,450);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
}
class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra=e.getKeyChar();
        System.out.println(letra);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
       // System.out.println(codigo);

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
