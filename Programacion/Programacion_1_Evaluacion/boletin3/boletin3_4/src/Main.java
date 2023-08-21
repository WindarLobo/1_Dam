import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


     /*Realiza un algoritmo e codifica o programa correspondente
     que lea, dende o teclado, unha cantidade enteira en euros e amose
     por pantalla, o seu desglose en billetes de 100, 20, 5 e moedas de 1 € .
      */
        int cien = 0, veinte = 0, cinco = 0, uno = 0, reserva = 0, cantidad = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("******** Hola Bienvenido ************" + "\n"
                + "*** Cajero WindarBank ****" + "\n"
                + "********************");
        System.out.println("******** Cuanto dinero quieres introducir**********");
        cantidad = entrada.nextInt();

        cien = cantidad / 100;
        reserva = cantidad % 100;

        veinte = reserva / 20;
        reserva = reserva % 20;

        cinco = reserva / 5;
        reserva = reserva % 5;
        
        uno = reserva / 1;

        System.out.println("La cantida de desglose es = " + "\n" +
                "Billetes de cien = " + cien + "\n" + "Billetes de veinte = " + veinte + "\n" +
                "Billetes de cinco = " + cinco + "\n" + "Monedas de uno = " + uno);

    }

}
