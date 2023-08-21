package escribiendo;


import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public void escribir() {
        String frase = "Esto es una prueba de escritura2";
        try {
            FileWriter escritura = new FileWriter("Texto_nuevo.txt",true);
            for(int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
