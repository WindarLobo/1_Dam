public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Windar", "0116-5454-2525-8972", 10.5, 2000);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Adrian", "0116-5454-2525-4543", 10.5, 1000);

        cuentaBancaria1.Ingresar(500);

        cuentaBancaria2.Retirar(-100);

        cuentaBancaria1.Transferir(cuentaBancaria2, -750);


        System.out.println(" ****** BbvaOrigin.transferencia ****** +\n " + " Bienvenido ");
        System.out.println("El saldo de: " + cuentaBancaria1.getNombredelcliente() + " es " + cuentaBancaria1.getElSaldo());
        System.out.println("El saldo de: " + cuentaBancaria2.getNombredelcliente() + " es " + cuentaBancaria2.getElSaldo());

    }
}