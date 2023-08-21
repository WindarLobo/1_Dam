package ejemploarrayobx;

public class Xogador implements Comparable<Xogador> {

    private String nombre;
    private int dorsal;

    public Xogador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public Xogador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Xogador xogador) {
        /* return (this.nombre.compareTo(xogador.nombre));*/

        Xogador xogadores = (Xogador) xogador;
        if (this.nombre.compareToIgnoreCase(xogadores.nombre) > 0) {
            return 1;
        } else if (this.nombre.compareToIgnoreCase(xogadores.nombre) < 0) {
            return -1;

        } else {
            return 0;
        }
    }

    /*@Override
    public int compareTo(Xogador xogador) {
        Xogador xogadores = (Xogador) xogador;
        if (this.dorsal > xogadores.dorsal) {
            return 1;
        } else if (this.dorsal < xogadores.dorsal) {
            return -1;

        } else {
            return 0;
        }

    }*/
    @Override
    public String toString() {
        return " El nombre del jugador  : " + nombre + "\n y el numero de camiseta  es : " + dorsal;

    }

}
