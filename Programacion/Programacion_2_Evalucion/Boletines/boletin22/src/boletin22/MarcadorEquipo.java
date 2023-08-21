package boletin22;

import java.util.Arrays;

public class MarcadorEquipo implements Comparable<MarcadorEquipo> {

    private String nombre;

    private int[] goles;
    private String golesTotales = "";

    public MarcadorEquipo(String nombre, int[] goles) {
        this.nombre = nombre;
        this.goles = goles;
        this.golesTotales = Integer.toString(getTotalGoles());
    }

    private int getTotalGoles() {
        int total = 0;
        for (int i = 0; i < goles.length; i++) {
            total += goles[i];
        }

        return total;
    }

    @Override
    public int compareTo(MarcadorEquipo o) {

        return this.golesTotales.compareTo(o.golesTotales);
    }

    @Override
    public String toString() {

        return " \n " + nombre + Arrays.toString(goles);

    }

    public String getNombre() {
        return nombre;
    }

    public int[] getGoles() {
        return goles;
    }
    

}
