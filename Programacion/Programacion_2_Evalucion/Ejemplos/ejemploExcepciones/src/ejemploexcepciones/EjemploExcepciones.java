package ejemploexcepciones;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    public static void main(String[] args) {

        DividirExcepciones excepcion = new DividirExcepciones();

        int numerador = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        int denominador = Integer.parseInt(JOptionPane.showInputDialog("introduce un numerp"));
        try {
            // excepcion.divirTratandoException(6 , 3);
            //excepcion.divirTratandoException(6, 0);
            //excepcion.divirtresbloqueException(7, 0);
            // excepcion.propagarExce(8, 0);

            excepcion.dividirNuestraExcepcion(numerador, denominador);
            System.out.println(numerador + " /  " + denominador + " es =" + numerador / denominador);

        } catch (NuestraExcepcion e) {

            System.out.println(" no dividir entre 0 " + e.toString());

        }
        System.out.println("Fin del programa ");

    }

}
