package org.sfaci.ventanas.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JTextField tfFechaNacimiento;
    private JButton btRegistrar;
    private JButton btCancelar;


    public Ventana() {

        btRegistrar.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tfNombre.getText();
                String apellidos = tfApellidos.getText();
                String fechaNacimiento = tfFechaNacimiento.getText();
                JOptionPane.showMessageDialog(null, "mensaje", nombre + " " + apellidos, JOptionPane.INFORMATION_MESSAGE);

            }
        });
        btCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfNombre.setText("");
                tfApellidos.setText("");
                tfFechaNacimiento.setText("");


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(600, 300, 500, 350);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}



