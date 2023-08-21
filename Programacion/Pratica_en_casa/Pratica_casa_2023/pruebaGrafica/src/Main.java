import Eventos.EventoRaton;
import Eventos.EventosTeclados;
import graficos.*;


import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
     //  new CreandoMarcos();
        //new CreandoMarcoCentrado();
       // new MarcoConTexto();
       //new PruebaDibujo();
      // new PruebaDibujoColor();
       //new PruebaConFuetes();
        //  new PruebaImagenes();
        // new PruebaEventosColores();
        // determinarTipoDeFuente();
     /*  PruebaEventosVentana ventana = new PruebaEventosVentana();
        PruebaEventosVentana ventana2 = new PruebaEventosVentana();
         Crearventana(ventana,ventana2 );*/
        //new CambioEstado();
       // new EventosTeclados();
         new EventoRaton();

    }


    private static void determinarTipoDeFuente() {

        String fuente = JOptionPane.showInputDialog("Introduce la fuente");
        boolean estalaFuente = false;
        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String fuentes : nombresDeFuentes) {
            if (fuentes.equalsIgnoreCase(fuente)) {
                estalaFuente = true;
            }
        }
        if (estalaFuente) {
            System.out.println("Fuente instalada");
        } else {
            System.out.println("No esta instalada la fuente");
        }
    }
}



