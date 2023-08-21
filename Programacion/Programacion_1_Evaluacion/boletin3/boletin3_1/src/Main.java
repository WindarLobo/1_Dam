import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          /*Realiza o ordinograma  correspondente a un programa
         que saque por pantalla a porcentaxe descontada nunha compra.
         Introducindo, por teclado, o prezo da tarifa e o prezo pagado.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Bienvenido a WindaSports*****" + "\n" +
                "********* Hoy estamos de descuento*******");

        System.out.println("Precio tarifa?");
        double precioTarifa = scanner.nextDouble();

        System.out.println("Precio pagado?");
        double precioPagado = scanner.nextDouble();

        double porcentaje = 100 - ((precioPagado * 100) / precioTarifa);

        System.out.println("El Porcentaje descontado de la compra es = " + Math.round(porcentaje) + "%"
                + "\n" + "****** Gracias por su compra **********");


    }
}