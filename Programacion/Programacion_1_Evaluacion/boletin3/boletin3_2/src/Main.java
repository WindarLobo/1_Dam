import java.util.Scanner;

public class Main {
    public static final double Celsius = 1.8;
    public static final double Fahrenheit = 32;
    public static final double Kelvin = 273.15;

    public static void main(String[] args) {


        /*Realiza o ordinograma e,despois codifica un programa que
        representa un algoritmo, que reciba como dato de entrada o valor
        dunha temperatura expresada en graos centígrados e calcule o seu
        equivalente en graos Fahrenheit e graos Kelvin.
         */

        Scanner cscanner = new Scanner(System.in);
        System.out.println("********* Programa para calcular  una temperatura*******" +
                "\n" + "Introduce el valor del grados centigrados!");

        double gradosCentigrados = cscanner.nextDouble();

        System.out.println("El grado fahrenheit es= " + (gradosCentigrados * Celsius + Fahrenheit) + Fahrenheit +
                "F" + "\n El grado de kelvin es= " + (gradosCentigrados + Kelvin) + "K");


    }
}