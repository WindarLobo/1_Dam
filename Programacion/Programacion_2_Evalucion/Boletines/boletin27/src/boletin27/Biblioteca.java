package boletin27;

import com.windar.datos.PedirDatos;
import java.io.IOException;

public class Biblioteca {

    static String titulo;

    public static void añadirLibro() throws IOException {
        System.out.println(Mantenimeinto.libros);
        String nombre = PedirDatos.pedirString("Escribe un titulo");
        String autor = PedirDatos.pedirString("Escribe un autor");
        float precio = PedirDatos.pedirfloat("Escribe el precio");
        int unidad = PedirDatos.pedirInt("Escribe las unidades");
        Libro libro1 = new Libro(nombre, autor, precio, unidad);
        Mantenimeinto.añadirLibro(libro1);

       
    }

    public static void consultarPrecio() throws Exception {
        titulo = PedirDatos.pedirString("Escribe un titulo");
        Libro libro2 = Mantenimeinto.consutarLibro(titulo);
        System.out.println("El precio nuevo es " + libro2.getPrecio() + "€");
    }

    public static void borrarLibroConCeroUnidad() throws IOException {
        Mantenimeinto.borrarLibros();
        Mantenimeinto.guardarLibros();
    }

    public static void cambiarLasUnidades() throws Exception, IOException {
        titulo = PedirDatos.pedirString("Escribe un titulo");
        int nuevoUnidad= PedirDatos.pedirInt("Escribe las unidades");
        Libro libro3 = Mantenimeinto.consutarLibro(titulo);
        libro3.setUnidades(nuevoUnidad);
        Mantenimeinto.guardarLibros();
    }

}
