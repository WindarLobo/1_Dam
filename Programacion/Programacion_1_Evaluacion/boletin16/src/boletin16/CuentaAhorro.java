package boletin16;

public class CuentaAhorro extends Cuenta {

    private double interesAnual;
    private double saldoMino = 1000;

    public CuentaAhorro() {
    }

    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldo, double interesAnual) {
        super(numeroCuenta, cliente, saldo);
        this.interesAnual = interesAnual;
    }

    @Override
    public void actualizarSaldo() {
        if (super.getSaldo() >= saldoMino) {
            double saldo= super.getSaldo()- super.getSaldo()*(interesAnual/100);
     
     super.setSaldo(saldo);
            
        }
    }

}
