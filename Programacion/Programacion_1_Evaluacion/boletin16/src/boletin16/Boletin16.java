package boletin16;

import javax.swing.JOptionPane;

public class Boletin16 {

    public static void main(String[] args) {

        Persona cliente1 = new Persona("Windar", "Lobo", "Y37762h");
        String tipoCuenta = JOptionPane.showInputDialog(null, "Cuenta Corriente: C  Cuenta Ahorro: A");

        switch (tipoCuenta.toUpperCase()) {
            case "C":
                CuentaCorriente cuenC = new CuentaCorriente(54511244, cliente1, 10800);
                realizarOperacion(cuenC);
                break;

            case "A":
                CuentaAhorro cueA = new CuentaAhorro(9876542, cliente1, 10000, 2);
                realizarOperacion(cueA);
                break;
        }
    }

    private static void realizarOperacion(Cuenta cuenta) {
        String operacion;
        double euros;
        operacion = JOptionPane.showInputDialog(null, "******** Bienvenido a BBva ******* \n . "
                + "Su saldo es : " + cuenta.getSaldo() + "\n"
                + " Ingresar: I  Retirar: R  Actualizar: A");

        switch (operacion.toUpperCase()) {
            case "I":
                euros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad"));
                cuenta.Ingresar(euros);

                break;

            case "R":
                euros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad"));
                cuenta.Retirar(euros);
                break;

            case "A":
                cuenta.actualizarSaldo();
                break;

        }
        JOptionPane.showMessageDialog(null, "su saldo es : " + cuenta.getSaldo());

    }
}
