package boletin27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mantenimeinto {

    public static ArrayList<Libro> libros = new ArrayList<>();

    public static void cargarTodos() throws Exception {
    
        File archivo = new File("Libro.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] camposDeArchivo = scanner.nextLine().split(",");
                libros.add(new Libro(camposDeArchivo[0], camposDeArchivo[1], Float.parseFloat(camposDeArchivo[2]),
                        Integer.parseInt(camposDeArchivo[3])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void añadirLibro(Libro libro) throws IOException {
        File archivo = new File("Libro.txt");
        FileWriter fileWriter = new FileWriter(archivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(libro.toFichero());
        fileWriter.close();
        libros.add(libro);
        

    }

    public static Libro consutarLibro(String titulo) throws Exception {
        for (Libro libro : libros) {
            if (libro.getNombre().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        throw new Exception("El libro no existe");
    }

    public static void mostrar() {
        System.out.println(libros.toString());
        
    }

    public static void guardarLibros() throws IOException {
        File archivo = new File("Libro.txt");
        FileWriter fileWriter = new FileWriter(archivo, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Libro libro : libros) {
            printWriter.println(libro);
          
        }
        
        fileWriter.close();
    }

    public static void borrarLibros() {
        ArrayList<Libro> librosConUnidadCero = new ArrayList();
        
        for (Libro libro : libros) {
            if (libro.getUnidades()== 0) {
                librosConUnidadCero.add(libro);
            }
        }
        for (Libro libro : librosConUnidadCero) {
            libros.remove(libro);
        }
    }

}
