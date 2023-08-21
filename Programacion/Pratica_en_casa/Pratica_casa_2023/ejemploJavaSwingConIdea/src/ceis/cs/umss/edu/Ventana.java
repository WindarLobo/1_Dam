package ceis.cs.umss.edu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JTextField TextoUsuario;
    private JPasswordField passwordField1;
    private JButton ingresarButton;
    private JButton salirButton;
    private JLabel usuarioLabel;
    private JLabel textPassword;
    private JMenuBar menuBar;
    private JMenu archicho;
    private JMenuItem salir;


    public Ventana() {
        super("Ejemplo de Java Swing con Idea");
        setContentPane(panel1);
        menuBar = new JMenuBar();
        archicho = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        menuBar.add(archicho);
        archicho.add(salir);
        setJMenuBar(menuBar);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bienvenido a swing");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);


            }
        });
    }
}
