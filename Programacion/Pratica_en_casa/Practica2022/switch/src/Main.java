import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            /* Eres el portero de una discoteca ...

            1- Pides al cliente su edad en la entrada
            2- Si el cliente tiene menos de 18 años no puede entrar
            3- Si el cliente tiene entre 18 y 25 años paga 5€ (ambos incluidos)
            4- Si el cliente tiene mas de 30 entra gratis

              */

              Scanner scanner = new Scanner(System.in);
              System.out.println("Me permite su dni!");
              int edad = scanner.nextInt();

              if (edad < 18) {
              System.out.println("No puede entrar!");
              }
               if (edad >= 18 && edad <= 25) {
               System.out.println("Paga 5€!");
               }

                else if (edad > 30){
                System.out.println("Entra gratis!");
                System.out.println("Bienvenido!");

            }
    }
}