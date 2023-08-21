package boletin16;

public class CuentaCorriente extends Cuenta {

    final double Interes = 1.5;

    public CuentaCorriente(long numeroCuenta, Persona cliente, double saldo) {
        super(numeroCuenta, cliente, saldo);

    }

    public CuentaCorriente() {
    }

    @Override
    public void actualizarSaldo() {

        double saldo = super.getSaldo() - super.getSaldo() * (Interes / 100);

        super.setSaldo(saldo);
    }

}
