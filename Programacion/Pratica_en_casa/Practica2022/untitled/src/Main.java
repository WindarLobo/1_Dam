import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*le pides un prestamo a un amigo y necesitas calcular cuanto le deberas despues de 3 meses.
        vas a devolver el 10% de la catidad restante del prestamo cada mes.
        crea un programa que tome la cantidad del prestamo como entrada, calcule y gneera la cantida
        de 3 meses.
        ejemplo entrada: 20000
        ejemplo salida : 10628

        aqui esta el calendario de pagos mensuales:
        mes 1:
        pago:10%20000=2000
        cantida restante=18000
        mes 2:
        pago: 10% of 18000=1800
        restante : 16200
        mes 3:
       pago 10% of 16200=1620
       restante 14580.

         */

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();


        for(int m = 0; m<3; m++){
            amount = (int) (amount-amount*0.10);



        }
       System.out.println(amount);



    }
}