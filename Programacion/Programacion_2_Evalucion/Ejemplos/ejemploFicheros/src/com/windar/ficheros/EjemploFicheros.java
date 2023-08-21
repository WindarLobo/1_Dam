package com.windar.ficheros;

import ejemploficheros.LecturaFichero;
import escritura.EscribirFichero;
import ficheroserializado.LeerEscribirSerializado;
import java.io.File;
import java.io.IOException;

public class EjemploFicheros {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // File dato = new File("numeros.txt");
 LecturaFichero obx = new LecturaFichero();

        //System.out.println("leerPalabra - numeros.txt");
      //  obx.leerPalabra(dato, ",");

      // System.out.println("leerlinas - numeros.txt");
        //obx.leerlinas(dato);

        //ArrayList
        //File n = new File("numeroUno.txt");
        //System.out.println("lerNumero - numeroUno.txt");
       // obx.lerNumero(n);

        //arrayList teniendo fichero con comas
      //  File x = new File("numeros3.txt");
      //  System.out.println("lerNumeroDelimitadores - numeros3.txt");
      //  obx.lerNumeroDelimitadores(x);

     File al = new File("alumno.txt");
 
       System.out.println("lerObxecto - alumno.txt");
       obx.leerObjecto(al);

      // File M = new File("C:\\Users\\Windar\\Documents\\numeros.txt");
      //  System.out.println("leerPalabra - numeros.txt");
       // obx.leerPalabra(M, " ");

       // EscribirFichero m = new EscribirFichero();
      //  File f = new File("Archivo.txt");
      // m.escribirEnElFichero(f);
      //  m.añadirUnregistro(f);
        //LecturaFichero obx = new LecturaFichero();
       // obx.leerPalabra(f, "\n");
      //obx.escribirBuffer(f);
      //obx.leerBuffer(f);
   
  //File file = new File("Archivo");
   //LeerEscribirSerializado leerescribir = new LeerEscribirSerializado();
     // leerescribir.escribiArchivo(file);
  //leerescribir.leerArchivo(file);
    // leerescribir.añadirAlumno(file);
      //leerescribir.leerArchivo(file);
      

    }

}
