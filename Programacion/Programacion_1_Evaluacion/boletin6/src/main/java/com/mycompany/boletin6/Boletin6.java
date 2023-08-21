
package com.mycompany.boletin6;

public class Boletin6 {

    public static void main(String[] args) {
        
       Coche coche1 = new Coche(120);      
       System.out.println("su velocidad es :" + coche1.getVelocidad());
       
       coche1.Acelerar(20);
       System.out.println("su velocidad es :" + coche1.getVelocidad());
     
       coche1.Frenar(40);
       System.out.println("su velocidad es :" + coche1.getVelocidad());
       
    }
}
