package ejemploGui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Layout {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void distribuidorFlowLayaout() {
        panel = new JPanel();
        marco = new JFrame("** Layaout **");
        boton1 = new JButton(" Boton1 ");
        boton2 = new JButton(" Boton2 ");
        boton3 = new JButton(" Boton3 ");
        boton4 = new JButton(" Boton4 ");
        boton5 = new JButton(" Boton5 ");

        marco.setSize(600, 400);
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }

    private void distribuidorFlowLayaout2() {
        iniciarComponetes();
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        cerrarVentana();

    }

    private void iniciarComponetes() {

        boton1 = new JButton(" Boton1");
        boton2 = new JButton(" Boton2 ");
        boton3 = new JButton(" Boton3 ");
        boton4 = new JButton(" Boton4 ");
        boton5 = new JButton(" Boton5 ");
        marco = new JFrame("** Layaout **");
        panel = new JPanel();
        marco.setSize(600, 400);

    }

    private void cerrarVentana() {
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);

    }

    public void distribuidorBoxLayout() {
        iniciarComponetes();
        //Aplicar el layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        cerrarVentana();

    }

    public void distribuidorBorderLayout() {
        iniciarComponetes();
        //Aplicar el layout
        panel.setLayout(new BorderLayout());
        //agregamos componentes

        // panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        //panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4, BorderLayout.EAST);
        panel.add(boton5, BorderLayout.WEST);
        marco.add(panel);

        cerrarVentana();

    }

    public void distribuidorGridLayout() {
        iniciarComponetes();
        panel.setLayout(new GridLayout(3, 4));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        cerrarVentana();

    }
}
