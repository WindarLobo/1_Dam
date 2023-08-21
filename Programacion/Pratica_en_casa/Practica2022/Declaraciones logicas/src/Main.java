import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* Eres un gestor de viajes y necesitas un programa que indentifique los paises pequeños
        Un pais se considera pequeño si su poblacion es inferior a 10000 y su superficie es inferior a 10000
        hectareas.
        El programa dado toma la poblacion y area como entrada.

        tarea: completa el programa para generar "small country" si se cumple ambas condiciones.
        en caso contrario, no generes nada.

        ejemplo entrada : 9955
        7522

        ejemplo salida: small country.

         */


        Scanner scanner = new Scanner(System.in);
        int poblacion = scanner.nextInt();
        int area = scanner.nextInt();
        if ( poblacion < 10000  && area < 10000){
            System.out.println("small country");

        }



    }
}