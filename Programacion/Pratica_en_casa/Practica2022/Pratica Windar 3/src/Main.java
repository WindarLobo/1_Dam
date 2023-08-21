import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola como te llamas?");

        String nombre  = scanner.nextLine();

        System.out.println("De donde eres " + nombre );

        String Pais = scanner.nextLine();

        System.out.println( Pais  + " es hermoso como tu " + nombre + "=)!");

        System.out.println( nombre +  " cual es tu comida preferida" );

        String comida  = scanner.nextLine();

        System.out.println( nombre +  " eres soltera?" );

        Boolean  soltera =  scanner.nextBoolean();

        System.out.println(" Que edad tienes " + nombre );

        Byte edad = scanner.nextByte();

        System.out.println(" me gusto conocerte " + nombre + "=)" );






    }
}