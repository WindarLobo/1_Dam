package ejemploGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventoClaseInterna {
        JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField jTnombre;
    JTextArea areaTexto;
    JButton botonCopiar, botonSalir;

    public void iniciarComponentes() {
        //Definir Componentes
        marco = new JFrame(" Componentes ");
        panel = new JPanel();
        etiqueta = new JLabel(" Linea texto ");
        jTnombre = new JTextField();
        areaTexto = new JTextArea();
        botonCopiar = new JButton("Copiar");
        botonSalir = new JButton();

        // Caracteristica
        marco.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);

        //panel.setBackground();
        etiqueta.setBounds(50, 100, 100, 50);
        jTnombre.setBounds(200, 100, 200, 50);
        panel.setBackground(Color.PINK);
        areaTexto.setBounds(50, 200, 200, 300);
        botonCopiar.setBounds(100, 600, 150, 100);
        botonSalir.setBounds(500, 600, 150, 100);
        botonSalir.setText(" Salir ");
        botonSalir.setToolTipText(" Salimos del programa ");
          //gestion eventos clase inetrna
          botonCopiar.addActionListener(new Interna() );
          botonSalir.addActionListener(new Interna());
            marco.setLocationRelativeTo(marco);

        //Agregamos componentes al panel
        panel.setLayout(null);
        panel.add(etiqueta);
        panel.add(jTnombre);
        panel.add(areaTexto);
        panel.add(botonCopiar);
        panel.add(botonSalir);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
      
        

    }
    class Interna implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonSal=  e.getSource();
      if(botonSal==botonCopiar){
        areaTexto.setText(jTnombre.getText());
    }
      else if(botonSalir==botonSal){
          jTnombre.setText("");
          areaTexto.setText("");
          //System.exit(0);
          
      }
          
        }
        
    }

   
    
    }


    


    
    

