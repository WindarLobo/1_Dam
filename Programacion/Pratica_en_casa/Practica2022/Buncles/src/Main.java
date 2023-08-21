import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* Para tu clase de matematicas necesitas un programa que calcule el factorial de un numero.
        te dan un programa que tome un numero como entrada

        Tarea: completa el programa para calcular el factorial del numero dado y generalo.

        ejemplo de entrada: 6

        ejemplo de salida: 720

        explicacionel: factorial de un numero es igual que el producto de todos los numeros menores
         o igual al numero dado.
         el factor de 6 sera 6*5*4*3*2*1=720

         pista: usa un bucle while para calcular el factorial del numero
         */

        Scanner scanner = new Scanner(System.in);
        long numero = scanner.nextLong();
        long factor = 1;

        while (numero > 0){
            factor = numero * factor;
            numero--;
        }

        System.out.println("Resultado de factorial es:" + factor);

    }
}