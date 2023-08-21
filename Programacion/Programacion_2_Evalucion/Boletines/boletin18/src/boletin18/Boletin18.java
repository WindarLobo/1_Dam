package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {

        ConversorTemperaturas obx = new ConversorTemperaturas();
        JOptionPane.showMessageDialog(null, "***********  Aplicacion de conversor de temperaturas *********** ");
        float temperatura = Float.parseFloat(JOptionPane.showInputDialog("introduce la temperatura"));

        try {
            System.out.println("La temperatura  es:   " + temperatura + "ºC" + "\n Y su  conversion de centigrados a Fharenheir es : " + obx.centigradosAFharenheit(temperatura) + "ºF");
            obx.centígradosAReamur(temperatura);
        } 
        catch (TemperaturaErradaExcepcion e) {
            System.out.println(" no puede ser menor  a la temeperatura " + e.toString());
        }
        System.out.println(" ****** Fin del programa******  ");
    }
}
