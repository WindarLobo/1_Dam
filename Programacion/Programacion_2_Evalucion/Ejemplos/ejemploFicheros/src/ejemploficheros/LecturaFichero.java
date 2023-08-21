package ejemploficheros;

import com.windar.ficheros.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LecturaFichero {

    Scanner scann;

    public void leerPalabra(File fichero, String del) {
        try {
            scann = new Scanner(fichero).useDelimiter("\\s*" + del + "\\s*");
            while (scann.hasNext()) {
                String dato = scann.next();
                System.out.println(dato);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro 1 " + ex.getMessage());
        } finally {
            scann.close();
        }
    }

    //Leerlo por liñas
    public void leerlinas(File ficheiro) {
        try {
            scann = new Scanner(ficheiro);
            while (scann.hasNext()) {
                String dato = scann.nextLine();
                System.out.println(dato);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro 2 " + ex.getMessage());
        } finally {
            scann.close();
        }
    }
    //arrayList

    public ArrayList<Integer> leerNumero(File ficheiro) {
        int num;
        //int aux;
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            scann = new Scanner(ficheiro);
            while (scann.hasNext()) {
                num = scann.nextInt();
                //aux = Integer.parseInt(num);
                lista.add(num);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error leer numero" + ex.getMessage());
        } finally {
            scann.close();
        }

        for (Integer ele : lista) {
            System.out.println(ele);
        }

        return lista;
    }

    public ArrayList<Integer> lerNumeroDelimitadores(File ficheiro) {
        int num;
        // int aux;
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            scann = new Scanner(ficheiro).useDelimiter(",");
            while (scann.hasNext()) {
                num = scann.nextInt();
                //aux = Integer.parseInt(num);
                lista.add(num);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error leer numero" + ex.getMessage());
        } finally {
            scann.close();
        }

        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        return lista;
    }

    public void leerObjecto(File ficheiro) {
        ArrayList<Alumno> lista = new ArrayList();
        String[] aux = new String[5];
        try {
            scann = new Scanner(ficheiro);
            while (scann.hasNextLine()) {
                aux = scann.nextLine().split(",");
                lista.add(new Alumno(aux[0], Integer.parseInt(aux[1]),Integer.parseInt(aux[2]),
                        aux[3],Double.parseDouble(aux[4])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("non se pode ler do ficheiro");
        } finally {
            scann.close();
        }
        for (Alumno al : lista) {
            System.out.println(al);
        }

    }

    public void leerBuffer(File fichero) throws IOException {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(fichero));
            String linea;
            linea = bf.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error lectura buffer" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error lectura");
        } finally {
            try {
                bf.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }

    }

    public void escribirBuffer(File fichero) {
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(fichero, true));
            String linea;
            bf.write("hola \n");
            bf.write("que \n");
            bf.write("tal \n");
        } catch (FileNotFoundException ex) {
            System.out.println("Error lectura buffer" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                bf.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }

        }

    }

}
