package Eventos;

import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class PruebaEventosVentana extends JFrame {

    public PruebaEventosVentana() {
        setVisible(true);
       /* Ventana ventana = new Ventana();
        addWindowListener(ventana);*/
        addWindowListener(new Ventana());
    }
    public static void Crearventana(PruebaEventosVentana ventana, PruebaEventosVentana ventana2){
        ventana.setTitle("Ventana 1");
        ventana.setBounds(300, 300, 500, 350);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana2.setTitle("Ventana 2");
        ventana2.setBounds(900, 300, 500, 350);
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Ventana extends WindowAdapter {


    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }



}



