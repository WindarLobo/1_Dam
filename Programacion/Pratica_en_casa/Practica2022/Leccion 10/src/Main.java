import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /* Tienes 12.000 dolares para comprar un coche.
        se te da un programa que toma el precio del coche como entrada.

        Tarea : Genera un " Yes" si el precio es inferior o  igual a 12.000.

        ejemplo de entrada : 11000

        ejemplo de salida : yes

         */

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if ( price <= 12000){

            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }



    }
}