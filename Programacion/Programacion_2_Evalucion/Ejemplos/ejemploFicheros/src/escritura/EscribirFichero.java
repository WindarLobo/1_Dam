package escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {

    FileWriter escritorArchivor = null;
    PrintWriter ficheros = null;

    public void escribirEnElFichero(File fichero) {

        try {
            escritorArchivor = new FileWriter(fichero);
            ficheros = new PrintWriter(escritorArchivor);
            ficheros.println("Lunessssss");
            ficheros.println("Martes");
            ficheros.println("Miercoles");
            ficheros.println("Jueves");

            escritorArchivor.close();
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            ficheros.close();
        }

    }

    public void añadirUnregistro(File fichero) {

        try {
            escritorArchivor = new FileWriter(fichero, true);
            ficheros = new PrintWriter(escritorArchivor);
            ficheros.println("Sabados");

            escritorArchivor.close();
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            ficheros.close();
        }

    }

}
