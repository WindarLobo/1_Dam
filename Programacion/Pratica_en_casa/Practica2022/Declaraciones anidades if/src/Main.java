import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edadwindar = scanner.nextInt();

        if (edadwindar < 35) {
            System.out.println("Si es esa edad ");
        }
        else if ( edadwindar == 41){

        }
        else {
            System.out.println("No es esa edad ");
        }

        System.out.println("¿De que color es tu piel?");

        String colordepiel = scanner.next();

        if (colordepiel.equalsIgnoreCase("morena")) {
            System.out.println("Baila morena baila morena!!");
        }
        else if ( colordepiel.equalsIgnoreCase ("rubia" )){
            System.out.println("Rubia de bote chocho morenote");
        }
        else if ( colordepiel.equalsIgnoreCase( "peliroja")){
            System.out.println("Peliroja sin culo");
        }
        else {
            System.out.println("Enton que carrallo eres!!");
        }



    }
}

