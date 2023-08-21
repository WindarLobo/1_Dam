
package com.mycompany.boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
 
        System.out.println("Dame el primer numero");
        int primernumero = numeros.nextInt();
         System.out.println("Dame el segundo numero");
        int segundonumero = numeros.nextInt();
         int suma= primernumero+segundonumero;
        int resta= primernumero-segundonumero;
        int multiplicacion= primernumero*segundonumero;
        int division= primernumero/segundonumero;
        
        System.out.println("la suma es= " + suma + "\n resta= "+ resta + "\n multiplicacion= " 
                + multiplicacion +"\n division = "+ division);
     
 
        
        
        
        
        
    }
}
