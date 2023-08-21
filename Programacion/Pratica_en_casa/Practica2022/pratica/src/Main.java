import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dame un numero");

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();

        int resultado = numero1 % 2;

        if (resultado == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }

    }
}