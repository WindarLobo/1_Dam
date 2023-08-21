import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int cienEuros = 100, veinteEuros = 20, cincoEuros = 5;

        /*3-	Fai un programa , para o software dunha máquina, que converta una
        cantidade enteira de diñeiro, que está en billetes de 100, 20, 5
        e moedas de 1 € , no seu equivalente en  euros ( exp.  2 billetes de 100,
        3 -> 20 , 6 moedas de 1  visualizaríamos 266 € ).
         */

        System.out.println("********************" + "\n"
                + "*** Cajero WindarBank ****" + "\n"
                + "********************");

        System.out.println("*******Hola bienvenido******");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos billetes de 100 deseas ingresar?");
        long billetesDeCien = scanner.nextLong();

        System.out.println("Cuantos billetes de 20 deseas ingresar?");
        long billetesDeVeinte = scanner.nextLong();

        System.out.println("Cuantos billetes de 5 deseas ingresar?");
        long billetesDeCinco = scanner.nextLong();

        System.out.println("Cuantas monedas de 1 deseas ingresar?");
        long monedasDeUno = scanner.nextLong();

        System.out.println("El Total del ingreso  es = " + ((billetesDeCien * cienEuros) + (billetesDeVeinte * veinteEuros) +
                (billetesDeCinco * cincoEuros) + (monedasDeUno)) + " Euros " + "\n" +
                " *****Fin de sistema del cajero WindarBank ****");
    }
}