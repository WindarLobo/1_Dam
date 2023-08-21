package ficheroserializado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerEscribirSerializado {

    ObjectInputStream ler = null;
    ObjectOutputStream escr = null;

    public void escribiArchivo(File archivo) throws IOException {
        try {
            escr = new ObjectOutputStream(new FileOutputStream(archivo));
            AlumnadoSerializado a11 = new AlumnadoSerializado("a", 5);
            AlumnadoSerializado a12 = new AlumnadoSerializado("a", 6);
            AlumnadoSerializado a13 = new AlumnadoSerializado("a", 7);
            escr.writeObject(a11);
            escr.writeObject(a12);
            escr.writeObject(a13);

        } catch (FileNotFoundException ex) {
            System.out.println("Error 1  al escribir al fichero" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error 2  lectura"+ex.getMessage());
        } finally {
            try {
                escr.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }

    }

    public void leerArchivo(File archivo) throws IOException, ClassNotFoundException {
        AlumnadoSerializado al = null;

        try {
        ler = new ObjectInputStream(new FileInputStream(archivo));
        do {
            al = (AlumnadoSerializado) ler.readObject();
            if (al != null) {
                System.out.println(al);
            }
        } while (al != null);
    } catch (ClassNotFoundException ex) {
        System.out.println("Error lectura1 3 " + ex.getMessage());
    } catch (FileNotFoundException ex) {
        System.out.println("Error lectura 4" + ex.getMessage());
    } catch (EOFException ex) {
        // Este catch captura la excepción EOFException que se lanza cuando se alcanza el final del archivo.
        // Como esta excepción es esperada, no es necesario imprimir su mensaje de error.
    } catch (IOException ex) {
        System.out.println("Error lectura 5 " + ex.getMessage());
    } finally {
        if (ler != null) {
            try {
                ler.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());
            }
        }
    }

    }
      public void añadirAlumno(File archivo) {
          MeuObjectOutpuStrem out = null;
          
        try {
            out = new MeuObjectOutpuStrem (new FileOutputStream(archivo,true));
            AlumnadoSerializado a11 = new AlumnadoSerializado("wi", 5);
            AlumnadoSerializado a12 = new AlumnadoSerializado("Adr", 6);
            
            out.writeObject(a11);
            out.writeObject(a12);

            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 al escribir al fichero" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error 2 lectura"+ex.getMessage());
        } finally {
            try {
                out.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }

        
    }
}
