package com.mycompany.boletin7;

import javax.swing.JOptionPane;

public class Boletin7_5 {

    public void numeroDistintos() {
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero :"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo numero :"));
        int tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer  numero :"));
        

                    if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
                       System.out.println(" El numero mayor es :" + primerNumero);

        }  
                       else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
                       System.out.println("El nuemro mayor es : " + segundoNumero);
                    
        }     
                           else {
                            System.out.println("El nuemro mayor es : " + tercerNumero);
        }
        

    }

}
