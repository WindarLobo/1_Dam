package leyendo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_fichero {
    // acceder a fichero para leer
    // con esto tenemos todo el texto almacenado char de caracteres;
    //Clase reader
    FileReader entrada;
    public void lee(){

        try {
             entrada = new FileReader("ejemplo.txt");
            int c = 0;
            while(c!=-1){
                c=entrada.read();
                char letra =(char)c;
                System.out.print(letra);
            }

        } catch (IOException e) {
            System.out.println("No se  ha encontrado el archivo");
        }finally {
            try {
                entrada.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
    public void buffer(){

        try {
            entrada = new FileReader("ejemplo.txt");
            BufferedReader mibuffer= new BufferedReader(entrada);
           String linea= "";
            while(linea!=null){

                linea=mibuffer.readLine();
                if(linea!=null)
                    System.out.println(linea);

            }

        } catch (IOException e) {
            System.out.println("No se  ha encontrado el archivo");
        }finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }





