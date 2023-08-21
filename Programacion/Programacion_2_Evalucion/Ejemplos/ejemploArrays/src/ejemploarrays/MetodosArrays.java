package ejemploarrays;

import com.windar.datos.PedirDatos;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MetodosArrays {

    public float[] crearArraysFloat() {

        float[] temperatura = new float[5];

        for (int i = 0; i < temperatura.length; i++) {

            temperatura[i] = PedirDatos.pedirfloat("Temperatura");

        }
        return temperatura;
    }

    public void mostrarArrayz(float[] temperatura) {
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println(" su temperatura es :" + i + temperatura[i] + " Grados ");
        }

    }

    public void mostrarArrayzPorPosicion(float[] temperatura, int posicion) {

        posicion = PedirDatos.pedirInt("Escribe la  posicion");

        System.out.println("La posicion   " + posicion + " tiene una temperatura " + temperatura[posicion - 1] + " Grados");
    }

    public void mostrarArrayForech(float[] temperatura) {
        for (Float elemento : temperatura) {
            System.out.println(elemento + " *****");

        }

    }

    public void pedirTemperatura(float[] temperatura) {

        int atopadoTemperatura = 0;
        float buscartemperatura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura"));
        for (int i = 0; i < temperatura.length; i++) {
            if (buscartemperatura == temperatura[i]) {
                JOptionPane.showMessageDialog(null, "La temperatura buscada es  : " +(i+1));
                atopadoTemperatura = 1;
                break;
            }
        }
        if (atopadoTemperatura == 0) {
            JOptionPane.showInputDialog("No esta la temperatura");

        }
    }

    public void ordenarTemperatura(float[] temperatura) {
       /* float aux;
        for (int i = 0; i < temperatura.length - 1; i++) {
            for (int j = i + 1; j < temperatura.length; j++) {

                if (temperatura[i] > temperatura[j]) {
                    aux = temperatura[i];
                    temperatura[i] = temperatura[j];
                    temperatura[j] = aux;
                }
               
            }
        }
        JOptionPane.showMessageDialog(null,"Array ordenado" );*/
       Arrays.sort(temperatura);
       

    }
     public void Insertar(float[] temperatura) {
         
     }
    public void Borrar(float[] temperatura) {
        
    }

}
