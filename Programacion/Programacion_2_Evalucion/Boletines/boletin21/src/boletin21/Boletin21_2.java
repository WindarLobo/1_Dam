package boletin21;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Boletin21_2 {

    public void arraysModuloProgramacion() throws Exception {

        int cantidaAlumno = 5;
        double notas[] = new double[cantidaAlumno];
        String nombres[] = new String[cantidaAlumno];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Introduce el nombre");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota"));

        }

        System.out.println("Suspensos: " + getNumeroSupendidos(nombres, notas));
        System.out.println("Aprobados: " + getNumeroAprobados(nombres, notas));

        System.out.println("Nota media de la clase: " + getNotaMediaClase(nombres, notas));

        System.out.println("Nota más alta: " + getNotaAlta(nombres, notas));

        System.out.println("Las nota del alumno  " + nombres[1] + " es: " + getNota(nombres, notas, nombres[1]));

        System.out.println("Lista de aprobados " + getListaAprobados(nombres, notas));

        String nombreUsuario = JOptionPane.showInputDialog("Introduce el nombre");
        double notaUsuario = getNota(nombres, notas, nombreUsuario);
        if (notaUsuario == -1) {
            System.out.println("El nombre de alumno no existe");
        } else {
            System.out.println("La nota " + nombreUsuario + " es : " + notaUsuario);
        }
        System.out.println("La notas ordenadas crecientes  son :" + getListaOrdenadas(notas));
    }

    private int getNumeroAprobados(String[] nombres, double[] notas) {
        int aprobados = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }

        return aprobados;

    }

    private int getNumeroSupendidos(String[] nombres, double[] notas) {

        int suspendido = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] < 5) {
                suspendido++;
            }
        }
        return suspendido;
    }

    private double getNotaMediaClase(String[] nombres, double[] notas) {

        double notasSuma = 0;
        for (int i = 0; i < nombres.length; i++) {
            notasSuma += notas[i];
        }
        double notaMedia = notasSuma / notas.length;

        return notaMedia;

    }

    private double getNotaAlta(String[] nombres, double[] notas) {
        double notasSuma = 0;
        double notaMaxima = 0;
        for (int i = 0; i < nombres.length; i++) {

            notasSuma += notas[i];
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];

            }
        }

        return notaMaxima;

    }

    private double getNota(String[] nombres, double[] notas, String nombre) throws Exception {
        //buscas en el array de "nombres" el "nombre"
        //return nota de la matriz de notas con el indice encontrado de nombres
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                return notas[i];
            }

        }
        throw new Exception("Alumno no encontrado.");
    }

    private String getListaAprobados(String[] nombres, double[] notas) {

        String nombreAprobado = "";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                nombreAprobado += "\n" + nombres[i];

            }

        }
        return nombreAprobado;

    }

    private String getListaOrdenadas(double[] notas) {
        String cadena = "";
        Arrays.sort(notas);
        for (int i = 0; i < notas.length; i++) {
            cadena += "\n" + notas[i];
        }

        return cadena;
    }

}
