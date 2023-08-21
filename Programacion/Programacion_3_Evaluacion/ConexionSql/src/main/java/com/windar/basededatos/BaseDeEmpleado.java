package com.windar.basededatos;

import View.Ventana;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.SQLException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BaseDeEmpleado {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Ventana prueba = new Ventana();
        prueba.setVisible(true);

        prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Frame f = new Frame();
        f.setSize(new Dimension(300, 300));
        
    }
}
