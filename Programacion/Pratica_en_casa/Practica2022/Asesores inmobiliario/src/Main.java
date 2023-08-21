import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



             /*-- ASESOR INMOBILIARIO --
             -------------------------

           1. Pedir al usuario sus ahorros
           2. El programa muestra por pantalla los siguiente segun:

         2.0 Si tiene ahorrado entre 0 y 1000 puedo VIVIR BAJO UN PUENTE
        2.1 Si tiene ahorrado entre 1000 y 5000 puedo comprar una AUTOCARAVANA
	    2.2 Si tiene ahorrado entre 5000 y 15000 puedo comprar una CASA DE MADERA
	    2.3 Si tiene ahorrado entre 15000 y 100000 puedo comprar un PISO
	    2.4 Si tiene ahorrado entre 100000 y 200000 puedo comprar un CHALET
	    2.5 Si tiene ahorrado mas de 200000 puedo comprar una MANSION.

           Ejemplo:

          Usuario introduce: 55678
         Programa muestra: PISO

       */
        Scanner scanner = new Scanner(System.in);

        System.out.println("cuanto tienes ahorrado!");
        long ahorro = scanner.nextLong();

        if (ahorro > 0 && ahorro < 1000) {
            System.out.println("PUEDE VIVIR BAJO UN PUENTE");
        } else if (ahorro >= 1000 && ahorro <= 5000) {
            System.out.println("AUTOCARAVANA!");
        } else if (ahorro > 5000 && ahorro <= 15000) {
            System.out.println("CASA DE MADERA!");
        } else if (ahorro > 15000 && ahorro <= 100000) {
            System.out.println("UN PISO!");
        } else if (ahorro > 100000 && ahorro <= 200000) {
            System.out.println("UN CHALET!");
        } else if (ahorro > 200000) {
            System.out.println("UNA MANSION =D");
        } else {
            System.out.println("ERROR");
        }
    }
}