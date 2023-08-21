package com.mycompany.practica;

import java.util.Scanner;

public class AnalizadorDeCuentas {
      
    public void cuentaBancaria1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al BBVA");
        System.out.println("Introduce el numero de la cuenta");

        String ibanCompleto = scanner.nextLine();
        String codigoDelPais = ibanCompleto.substring(0, 2);
        String digitoDeControl = ibanCompleto.substring(2, 4);
        String codigoDeCaja = ibanCompleto.substring(4, 8);
        String codigoSucursal = ibanCompleto.substring(8, 12);
        String digitoDeControl2 = ibanCompleto.substring(12, 14);
        String numeroCuenta = ibanCompleto.substring(14, ibanCompleto.length());

        if (digitoDeControl.equals(digitoDeControl2)) {
            System.out.println("Correcto");
        } else {
            System.out.println("ERROR");
        }
        int totalIban = ibanCompleto.length();
        System.out.println("La cantidad de caracteres es : " + totalIban);

        if (codigoDelPais.equals("ES")) {
            System.out.println("Es una cuenta española");
        } else {
            System.out.println("No es una cuenta española");

        }
        String binarioDeControl = Integer.toBinaryString(Integer.parseInt(digitoDeControl));
    }
}
