package boletin14;

import com.windar.partes.Cpu;
import com.windar.partes.Monitor;
import com.windar.partes.Teclado;

public class Boletin14 {

    public static void main(String[] args) {
        Monitor monitor2 = new Monitor(24.0f);
        Cpu cpu2 = new Cpu(3200);
        Teclado teclado2 = new Teclado("Microsoft");
        Ordenador ordenador2 = new Ordenador(monitor2, teclado2, cpu2, 1000.400f);
        
        System.out.println(ordenador2.getDescripcionCompleta());
        
        System.out.println("EL precio del ordenador es :" + ordenador2.getPrecio() + "€");

        System.out.println("La marca del teclado es : " + teclado2.getMarca());
        System.out.println("La velocidad del Cpu es : " + cpu2.getVelocidad() + " millones ciclos por segundos");
    }

}
