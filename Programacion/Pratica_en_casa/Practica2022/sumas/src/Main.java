import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        /*-- SUMA NUMEROS -----
         -------------------------

1. Pedir al usuario un "numeroMaximo"
2. Pedir al usuario repetitivamente numeros y ir sumandolos
3. Cuando la suma de los numeros sea superior al "numeroMaximo" mostrar por pantalla el resultado de las sumas.

    Usuario mete numMax = 100;

    Usuario mete: 20
    Usuario mete: 5
    Usuario mete: 25
    Usuario mete: 30
    Usuario mete: 40

    Prgrama pinta: 120
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero!");
        long numeroMaximo = scanner.nextLong();
        long numero=0;
        long suma = 0;
        do {
            System.out.println("dame un numero!");
            numero = scanner.nextLong();
            suma= numero+suma;

        }
        while (numeroMaximo>suma);
        System.out.println(" el numero  es " +  suma);












    }
}