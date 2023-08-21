package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaEventosColores extends JFrame {
    public PruebaEventosColores() {
        setTitle("Marco con botones");
        setBounds(700, 300, 500, 300);
        LaminaBoton milamina = new LaminaBoton();
        add(milamina);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class LaminaBoton extends JPanel {
    // Creamos los botones
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBoton() {
        //añadimos los botones
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo amarrillo = new ColorFondo(Color.yellow);
        ColorFondo azul = new ColorFondo(Color.blue);
        ColorFondo rojo = new ColorFondo(Color.red);

        //Declaramos 3 botones fuentes
        botonAzul.addActionListener(azul);// addActionListener es para hacer el clip y boton azul es obejcto fuente el obejcto this indicamos si es evento tipo action
        botonAmarillo.addActionListener(amarrillo);
        botonRojo.addActionListener(rojo);
    }

    private class ColorFondo implements ActionListener {
        private Color colorDeFondo;

        public ColorFondo(Color color) {
            colorDeFondo = color;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }
    }

}






