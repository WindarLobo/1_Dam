import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Y = a X2 + bX + c
        Crea un programa que pida os coeficientes a, b, c ,
          e o valor de x e calcule o valor de Y
         */

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("********Este programa resuelve ecuaciones de segundo grado******");
        System.out.println("ax^2 + bx+ c = 0");

        System.out.println("Introduce a = ");
        double a = scanner.nextDouble();


        System.out.println("Introduce b = ");
        double b = scanner.nextDouble();

        System.out.println("Introduce c = ");
        double c = scanner.nextDouble();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        System.out.println("El valor de x1 = " + x1 + "\n" + "El valor de x2 =" + x2);


        double y1 = a * Math.pow(x1, 2) + b * x1 + c;
        double y2 = a * Math.pow(x2, 2) + b * x2 + c;

        System.out.println("El valor de y1 = " + y1 + "\n" + "El valor de y2 =" + y2);


    }
}