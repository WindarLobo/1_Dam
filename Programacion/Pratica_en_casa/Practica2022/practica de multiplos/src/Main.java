import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero");
        int numero = scanner.nextInt();

        if (numero % 4 == 0) {
            numero += 25;
        } else if (numero % 5 == 0) {
            numero += 50;
        } else {
            numero += 100;
        }

        System.out.println(numero);
        System.out.println("=D");
    }
}


