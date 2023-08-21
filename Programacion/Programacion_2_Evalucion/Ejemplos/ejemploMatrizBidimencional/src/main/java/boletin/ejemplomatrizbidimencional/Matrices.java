package boletin.ejemplomatrizbidimencional;

import java.util.Random;
import javax.swing.JOptionPane;

public class Matrices {

    String[] Nombre1 = {"bb", "aa", "cc"};

    public int[][] notas() {

        int notas[][], fila, columna;

        fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila "));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna "));
        notas = new int[fila][columna];
        Random num = new Random();
        System.out.println("Intodusca las notas ");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                notas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la nota "));

            }
        }

        return notas;

    }

    public void visualizar(int notas[][], float[] mNotas, float[] NumeroDeModulo) {
        String[] nombre = {"aa", "bb", "cc"};
        String[] modulos = {"Pro", "LM", "BD"};
        System.out.println("****** Notas 2023 ******:");
        for (String modulo : modulos) {
            System.out.println(" : " + modulo + " ");
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(" \n " + nombre[i] + " ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println("La nota es : " + notas[i][j] + " ");

            }
            System.out.println(" " + mNotas[i]);

        }
        for (int i = 0; i < NumeroDeModulo.length; i++) {
            System.out.println(NumeroDeModulo[i] + " ");

        }
    }

    public float[][] mediaAlumno(int notas[][]) {
        int acumulador;
        float[] lista = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int j = 0; j < notas[i].length; j++) {
                acumulador = acumulador + notas[i][j];

            }
            System.out.println("La suma de las notas es : " + acumulador);
            lista[i] = acumulador / notas[i].length;
            System.out.println("La media es :  " + lista[i]);
        }

        return null;
    }

    public float[] mediaModulo(int notas[][]) {

        int acumulador;
        float[] modulo = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int[] nota : notas) {
                acumulador = acumulador + nota[i];
            }
            //System.out.println("La suma de las notas es : " + acumulador);
            modulo[i] = acumulador / notas.length;
            System.out.println("La media es :  " + modulo[i]);

        }
        return null;

    }

    public void ordenador(int[][] notas, float mnotas[]) {
        int aux;
        float aux2;
        String nome;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (mnotas[i] < mnotas[j]) {
                    aux2 = mnotas[i];
                    mnotas[i] = mnotas[j];
                    mnotas[j] = aux2;
                    nome = Nombre1[i];
                    Nombre1[i] = Nombre1[j];
                    Nombre1[j] = nome;
                    for (int k = 0; k < notas[i].length; k++) {
                        aux = notas[i][k];
                        notas[i][k] = notas[j][k];
                        notas[i][k] = aux;

                    }
                }
            }

        }

    }

}
