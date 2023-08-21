

package com.mycompany.bolentin2_3;

import java.util.Scanner;

public class Bolentin2_3 {

    public static void main(String[] args) {
        
        // crear un algoritmo
        
      System.out.println("Cuanto quieres cambiar");
      Scanner scanner = new Scanner(System.in);// instaciamos un objeto tipo scanner
      int valoreuro = scanner.nextInt();
      double cambio= 1.04;
      double valordolar  = cambio*valoreuro;
      System.out.println("El total es = "+ valordolar);
      
      
        
       
    }
}

