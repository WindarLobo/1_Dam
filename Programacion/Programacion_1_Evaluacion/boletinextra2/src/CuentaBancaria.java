public class CuentaBancaria {
    // Atributos

    private String nombredelcliente;
    private String numerodecuenta;
    private double tipodeintereces;

    private double elsaldo;

    // Constructor

    public CuentaBancaria(String nombredelcliente, String numerodecuenta, double tipodeintereces, double elsaldo) {
        this.nombredelcliente = nombredelcliente;
        this.numerodecuenta = numerodecuenta;
        this.tipodeintereces = tipodeintereces;
        this.elsaldo = elsaldo;
    }

    // Constructor por defecto
    public CuentaBancaria() {

    }

    //Métodos setters/ getters

    public String getNombredelcliente() { // este devuelve el valor de atributo private
        return nombredelcliente;
    }

    public void setNombredelcliente(String nombredelcliente) { // cambia el valor
        this.numerodecuenta = nombredelcliente;
    }

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public double getTipodeintereces() {
        return tipodeintereces;
    }

    public void setTipodeintereces(double tipoDeIntereces) {
        this.tipodeintereces = tipoDeIntereces;
    }

    public void setSaldo(double saldo) {
        this.elsaldo = elsaldo;
    }

    public double getElSaldo() {
        return elsaldo;
    }

    public void Ingresar(double euros) {
        this.elsaldo += Math.abs(euros);
    }

    public void Retirar(double euros) {
        this.elsaldo -= Math.abs(euros);
    }

    public void Transferir(CuentaBancaria destino, double euros) {
       destino.Ingresar(euros);
       Retirar(euros);

    }
}