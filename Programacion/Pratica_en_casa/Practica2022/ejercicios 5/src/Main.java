import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Dame el segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("Que operacion quieres hacer ( \"+\" = Suma , \"-\" = Resta , \"*\" " +
                "= Multiplicacion , \"/\" = Division");

        String operacion = scanner.next();

        switch (operacion) {
            case "+":
                System.out.println(numero1 + numero2);
                break;

            case "-":
                System.out.println(numero1 - numero2);
                break;

            case "*":
                System.out.println(numero1 * numero2);
                break;

            case "/":
                System.out.println(numero1 / numero2);
                break;
        }
    }
}