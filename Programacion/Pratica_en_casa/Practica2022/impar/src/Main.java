import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* El usuario introduce un numero y el programa muestra por pantalla si es par o impar */

        Scanner scanner = new Scanner(System.in);
        int  numero = scanner.nextInt();

       if (numero%2==0) {
           System.out.println("par");

       }

       else {
           System.out.println("impar");
       }



    }
}