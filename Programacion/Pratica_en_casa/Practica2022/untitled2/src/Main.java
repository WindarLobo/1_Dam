import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



            /*-- PUERTA DE SEGURIDAD --
             -------------------------

           - La puerta de seguridad solo se abre con el código acceso: 2345
          - Solicitar código de acceso al usuario repetitivamente hasta que introduzca el código correcto
          - Si el usuario introduce el código correcto, la puerta se abre.*/

        Scanner scanner = new Scanner(System.in);
        int acceso;
        int codigo = 2345;



        do {
            System.out.println("Introduce el codigo de seguridad");
            acceso = scanner.nextInt();
        }
            while (acceso!=codigo);


            System.out.println("puerta abierta");
        }



    }


