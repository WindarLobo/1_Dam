import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        /* Necesitas un programa para convertir los dias en segundos. El codigo dado toma la cantidad
         de dias como entrada. completa el codigo para convertirlo en segundos y genera el resultado.

        entrada : 12

        ejemplo de salida. 1036800     */

        Scanner scanner = new Scanner(System. in);
        int days = scanner.nextInt();

        System.out.println(days*24*60*60);

    }
}