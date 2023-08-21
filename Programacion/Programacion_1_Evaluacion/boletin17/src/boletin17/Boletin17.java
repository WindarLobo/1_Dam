package boletin17;

import javax.swing.JOptionPane;

public class Boletin17 {

    final static double porcentanje = 40;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " ******* FP Daniel Castelao *******  ");
        String usuario;
        do {
            usuario = JOptionPane.showInputDialog("Quieres calcular una nota ? (si/no)");

            if (usuario.toUpperCase().equals("SI")) {

                double calificacionEscrita = Math.round(introducirNotasPruebaEscrita());

                double calificacionPractica =  Math.round(introducirNotaPractica());

                double calificacionBoletin =  Math.round (introducirNotasBoletines());

                double notaTotal =  Math.round(calificacionEscrita + calificacionPractica + calificacionBoletin);
                JOptionPane.showMessageDialog(null, " Prueba teorica " + calificacionEscrita
                        + "\n Prueba pratica " + calificacionPractica
                        + "\n Boletines " + calificacionBoletin
                        + "\n La nota nota  es : " + notaTotal);

            }
        } while (usuario.toUpperCase().equals("SI"));

    }

    private static double introducirNotasPruebaEscrita() {
        double pruebaUno = Double.parseDouble(JOptionPane.showInputDialog("Escribe la primera nota"));
        double pruebados = Double.parseDouble(JOptionPane.showInputDialog("Escribe la segunda nota"));
        double calificacionEscrita = (pruebaUno + pruebados) / 2 * (porcentanje / 100);
        return calificacionEscrita;
    }

    private static double introducirNotaPractica() {
        double pruebaPractica1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe la nota de la prueba practica"));
        double calificacionPractica = (pruebaPractica1 * (porcentanje / 100));
        return calificacionPractica;
    }

    private static double introducirNotasBoletines() {
        final int totalBoletines = 27;
        double boletinesEntregados = Double.parseDouble(JOptionPane.showInputDialog("Cantidad de boletines "));
        double porcentaEntregados = (boletinesEntregados * 100) / totalBoletines;

        if (porcentaEntregados >= 90) {
            return 2;

        } else if (porcentaEntregados >= 70 && porcentaEntregados < 90) {
            return 1;

        } else {
            return 0;
        }

    }

}
