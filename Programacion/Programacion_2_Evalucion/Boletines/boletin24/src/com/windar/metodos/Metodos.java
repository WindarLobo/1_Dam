package com.windar.metodos;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {

    public void añadir(ArrayList<Libro> libros) {
        Libro libroDatos = new Libro(PedirDatos.pedirString("Titulo :"), PedirDatos.pedirString("Autor :"), PedirDatos.pedirString("ISBN :"),
                PedirDatos.pedirfloat("Precio :"), PedirDatos.pedirInt("Numero de unidad : "));

        libros.add(libroDatos);
    }

    public void mostrar(ArrayList<Libro> libros) {
        System.out.println(libros);
    }

    public void vender(ArrayList<Libro> libros) throws Exception {
        String busqueda = PedirDatos.pedirString("Introduce un titulo :");
        Libro libro = Buscar(libros, busqueda);

        if (libro.getNumeroUnidad() > 0) {
            RealizarVenta(libros, libro);
        } else {
            throw new Exception("Sin unidades disponibles.");
        }
    }

    public void ordenar(ArrayList<Libro> libros) {
        Collections.sort(libros);
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void darDeBaja(ArrayList<Libro> libros) {
        Iterator iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libroDarBaja = (Libro) iterator.next();

            if (libroDarBaja.getNumeroUnidad() == 0) {
                iterator.remove();
            }
        }
    }

    public void consultar(ArrayList<Libro> libros) throws Exception {
        String busqueda = PedirDatos.pedirString("Introduce un titulo :");
        Libro libro = Buscar(libros, busqueda);
        System.out.println("El libro es: " + libro.toString());
    }

    public void eliminar(ArrayList<Libro> libros) throws Exception {
        String busqueda = PedirDatos.pedirString("Introduce un titulo :");
        Libro libro = Buscar(libros, busqueda);
        libros.remove(libro);
    }

    private Libro Buscar(ArrayList<Libro> libros, String titulo) throws Exception {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        throw new Exception("El libro no existe.");
    }

    private void RealizarVenta(ArrayList<Libro> libros, Libro libro) {
        libro.setNumeroUnidad(libro.getNumeroUnidad() - 1);

        if (libro.getNumeroUnidad() == 0) {
            libros.remove(libro);
        }
    }
}
