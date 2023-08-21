import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int meses = scanner.nextInt();
        switch (meses) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                System.out.println("cumple de la reina");
                break;
            case 4:
                System.out.println("Abril");
                System.out.println("El cumple del amor de mi vida");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                System.out.println("Feliz verano =D");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                System.out.println("Feliz navidad =D");
                break;
            default:
                System.out.println("Nuevo año");

        }
    }
}