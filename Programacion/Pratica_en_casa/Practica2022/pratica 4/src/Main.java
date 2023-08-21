import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** SUMA DE DOS NUMEROS ***");

        System.out.println("DAME EL PRIMER NUMERO1");
        byte numero1 = scanner.nextByte();

        System.out.println("DAME EL SEGUNDO NUMERO2");
        byte numero2 = scanner.nextByte();

        int SUMATOTAL = numero1 + numero2;

        System.out.println("EL RESULTADO ES :" + SUMATOTAL );










    }
}