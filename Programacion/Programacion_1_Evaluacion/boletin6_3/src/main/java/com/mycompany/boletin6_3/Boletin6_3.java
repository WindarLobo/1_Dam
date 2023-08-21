
package com.mycompany.boletin6_3;

public class Boletin6_3 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.39f, 3.14f);

        circulo.AreaCirculo();

        System.out.println("El area del círculo es: " + circulo.AreaCirculo());

        circulo.Longitud();

        System.out.println("La longitud del círculo es: " + circulo.Longitud());

    }
}
