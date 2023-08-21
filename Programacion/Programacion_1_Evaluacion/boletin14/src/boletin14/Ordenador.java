package boletin14;

import com.windar.partes.Cpu;
import com.windar.partes.Monitor;
import com.windar.partes.Teclado;

public class Ordenador {

    private Monitor monitor;
    private Teclado teclado;
    private Cpu procesador;
    private float precio;

    public Ordenador(Monitor monitor, Teclado teclado, Cpu procesador, float precio) {

        this.monitor = monitor;
        this.teclado = teclado;
        this.procesador = procesador;
        this.precio = precio;

    }

    public Ordenador() {

    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Cpu getProcesador() {
        return procesador;

    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDescripcionCompleta() {

        return "Las pulgadas de monitor es " + monitor.getPulgadas() + "\n" + "La marca del teclado es  " + teclado.getMarca() + "\n" + "El procesador del Cpu  " + procesador.getVelocidad()
                + " millones ciclos por segundos " + "\n" + "El precio del Ordenador  " + precio + "€";
    }
}
