import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        --- BUCLE ADIVINADOR DE NUMEROS PARES ---

          1. Pedir al usuario que introduzca un numero.
          2. Mostrar por pantalla todos los numeros PARES desde 1 hasta el numero introducido por el usuario


           EJEMPLO:

           1. El usuario introduce: 20
         2. El programa muestra por pantalla el siguiente resultado:

             2
             4
             6
             8
             10
            12
            14
            16
             18
             20
         */

        System.out.println("Dame un numero");
        long numero = scanner.nextLong();
        for(int m = 1; m<numero; m++) {

            if(m%2==0){
                System.out.println(m);
            }





        }




















        System.out.println("Hello world!");
    }
}