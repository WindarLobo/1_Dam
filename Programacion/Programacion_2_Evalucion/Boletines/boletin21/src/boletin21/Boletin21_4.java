package boletin21;

import javax.swing.JOptionPane;

public class Boletin21_4 {

    public void arraysCalculoNif() throws Exception {
        try {
            char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            int resto;
            int numero = 23;

            int nif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del dni"));

            if (nif == 0) {
                throw new Exception("DNI no valido.");
            }

            resto = nif % numero;

            JOptionPane.showMessageDialog(null, "El dni es :" + nif + letrasDni[resto]);
        } catch (Exception ex) {

           JOptionPane.showMessageDialog(null,ex.getMessage());

        }
         JOptionPane.showMessageDialog(null,"Fin del programa");
    }
}
