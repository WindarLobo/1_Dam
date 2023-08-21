package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
      

        String genero=pedirString("Escribe un genero");
        String titulo = pedirString("Escribe un titulo musical");
        String autor = pedirString("Escribe un autor musical");
        String formato = pedirString("Escribe un formato musical");
        
         String actorPrincipal= pedirString("Escribe un actorPrincipal");
        String actrizPrincipal= pedirString("Escribe una  actrizPrincipal");
        String tituloPelicula = pedirString("Escribe un titulo de la pelicula");
        String  autorPelicula = pedirString("Escribe un autor de la pelicula ");
        String formatoPelicula = pedirString("Escribe un formato de la pelicula ");

        Pelicula peli = new Pelicula( actorPrincipal, actrizPrincipal,  tituloPelicula, autorPelicula, formatoPelicula, 126.00f);
        System.out.println("La pelicula es \n " + peli.toString());
        
        
        Disco disco = new Disco(genero, titulo, autor, formato, 1.30f);
        System.out.println("El disco es \n " + disco.toString());

    }
    public static  String pedirString(String mensaje ){
        return JOptionPane.showInputDialog(mensaje );
        
    }

} 
