package boletin11;

public class Boletin11_2 {

    public void calculoSum() {

        int sum = 0;

        for (int numero = 10; numero < 90; numero++) {
            System.out.println(numero);
            sum = sum + numero;

        }
        System.out.println("La suma es " + sum);

    }

    public void calculoProducto() {

       double producto = 1;

        for (int numero = 10; numero < 90; numero++) {
            System.out.println(numero);
            producto *= numero;
            

        }
        System.out.println("El producto es " + producto);
    }

}
