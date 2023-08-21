package com.mycompany.practica;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Pueba2 {

    String frase = JOptionPane.showInputDialog("Introduce una frase");

    public void programaDeFrases() {

        //a) 
        StringTokenizer numeroDePalabra = new StringTokenizer(frase);
        JOptionPane.showMessageDialog(null, "Numero de  fraces introducido es :" + numeroDePalabra.countTokens());

    }

    public void numeroCaracter() {

        //b)
        int nuneroDeCaracteres = frase.length();
        JOptionPane.showMessageDialog(null, "Numero de  fraces introducido es :" + nuneroDeCaracteres);

    }

    public void digitos() {
        String digitos= frase;
        char resultado= digitos.charAt(0);
      
        System.out.println("EL resultado es " + Character.isDigit(resultado));
        
    }
    

    public void espacio() {
        String espacio = frase;
        System.out.println("la posicion del primer espacio es " + espacio.indexOf(" "));

    }
}