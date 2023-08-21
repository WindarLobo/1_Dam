package boletin16;

public class Cuenta {

    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(long numeroCuenta, Persona cliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public double Ingresar(double euros) {
        if (euros > 0) {
            saldo += euros;
        }
        return saldo;
    }
    
    public double Retirar(double euros) {
        if (euros > 0) {
            saldo -= euros;
        }
        return saldo;
    }

    public void actualizarSaldo() {
    }
    
    @Override
    public String toString() {
        return " numeroCuenta = " + numeroCuenta + "\n saldo = " + saldo + "\n  cliente = " + cliente;
    }

}
