package leyendoyescribiendo_byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {


    public  static void crea_fichero(int datos_nuevo_fichero[]) {
        try {
            FileOutputStream fichero_nuevo = new FileOutputStream("Lorraine-Warren-con-la-muneca-Annabelle-copia.jpg");
            for (int i = 0; i < datos_nuevo_fichero.length; i++) {
                fichero_nuevo.write(datos_nuevo_fichero[i]);

            }
            fichero_nuevo.close();

        } catch (IOException ex) {
            System.out.println("No se encuntra ");

        }
    }

    public void lecturaByte() {
        int contador = 0;
        int datos_entrada[] = new int[23301];
        try {
            FileInputStream archivo_lectura = new FileInputStream("Lorraine-Warren-con-la-muneca-Annabelle-.jpg");
            boolean final_ar = false;
            while (!final_ar) {
                int byte_entrada = archivo_lectura.read();
                if (byte_entrada != -1)
                    datos_entrada[contador] = byte_entrada;
                else
                    final_ar = true;
                System.out.println(datos_entrada[contador]);
                contador++;
            }
            archivo_lectura.close();

        } catch (IOException ex) {
            System.out.println("Error de lecturaByte ");
        }
        System.out.println(contador);
        crea_fichero(datos_entrada);
    }

}


