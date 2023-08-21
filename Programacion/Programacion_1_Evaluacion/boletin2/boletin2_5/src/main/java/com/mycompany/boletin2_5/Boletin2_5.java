
package com.mycompany.boletin2_5;

import java.util.Scanner;
 
public class Boletin2_5 {

    public static void main(String[] args) {
            /*- Escribe un programa que lea o valor dunha distancia 
        en millas mariñas e a pase a metros ( 1 milla mariña = 1852 m ).
   Codifica o programa correspondente para executar o programa
       
        
        */
            Scanner scanner = new Scanner(System.in);
 
        System.out.println("cuantas millas quieres calcular?");
       double millas = scanner.nextDouble();
         
          double metro = millas*1852;
        
        
        System.out.println("el metro es= "+metro);
    }
}
