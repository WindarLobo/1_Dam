public class Main {
    public static void main(String[] args) {


        /*
        Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        Si son iguales indicarlo también.
        Ves cambiando los valores para comprobar que funciona.


         */

        int numero1 = 20;
        int numero2 = 45;
        if (numero1 <= numero2) {
            if (numero1 == numero2) {

                System.out.println("Los numeros " + numero1 + " y " + numero2 + " son iguales");

            } else if (numero1 <= numero2) {
                System.out.println("los numero " + numero1 + " es menor que el " + numero2);


            }
        }
    }
}