package uso_arrays;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Uso_Arrays {

    public static void main(String[] args) {

        //sumaNumero();
        //pidePAis();
        //forEach();
        // bidimesionales();
        // ejercicio2();
        //ejercicio3();
        // ejercicio4();
        //matrizSimetrica();
        //bloqueMatrices();
        // sumaMatrizNxM();
        matrices6();

    }

    private static void sumaNumero() {

        int matriz[] = new int[5];
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            int usuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            matriz[i] = usuario;

        }

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i];
        }

        System.out.println("La suma es " + suma);

    }

    private static void pidePAis() {

        String matriz[] = new String[3];

        String cadena = "";

        for (int i = 0; i < matriz.length; i++) {
            String pais = JOptionPane.showInputDialog("Introduce un pais ");
            matriz[i] = pais;

        }

        for (int i = 0; i < matriz.length; i++) {
            cadena += matriz[i] + " - ";

        }
        System.out.print("Los paises son = " + cadena);

    }

    private static void forEach() {
        int matriz_leatorio[] = new int[100];
        for (int i = 0; i < matriz_leatorio.length; i++) {
            matriz_leatorio[i] = (int) Math.round(Math.random() * 100);
        }
        for (int numero : matriz_leatorio) {
            System.out.print(numero + " ");
        }

    }

    private static void bidimesionales() {
        //Crear una matriz de 3×3 con los números del 1 al 9.
        //Mostrar por pantalla, tal como aparece en la matriz

        int[][] matriz_bidimesionales = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},};
        for (int[] fila : matriz_bidimesionales) {
            System.out.println();

            for (int columna : fila) {

                System.out.print(columna + " ");
            }
        }

    }

    private static void ejercicio2() {
        //Crear una matriz de 5 filas y n columnas (se pide al usuario). 
        //Rellenarlo con números aleatorios entre 0 y 10.

        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int[][] matriz_bidimesionales = new int[5][n];
        for (int i = 0; i < matriz_bidimesionales.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz_bidimesionales[0].length; j++) {
                matriz_bidimesionales[i][j] = numero(0, 9);
                System.out.println(matriz_bidimesionales[i][j] + " ");
            }

        }

    }

    private static int numero(int min, int max) {
        return (int) (Math.floor(Math.random() * (min - (max + 1)) + max + 1));

    }

    private static void ejercicio3() {

        //Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
        //Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce que tamaño queires "));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce que tamaño queires "));

        int matriz1[][] = new int[fila][columna];
        int matriz2[][] = new int[fila][columna];
        int sumaDeMatriz[][] = new int[fila][columna];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la primera matriz "));
            }
        }
        System.out.print(Arrays.deepToString(matriz1) + "");

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la segunda matriz"));
            }
        }
        System.out.print("\n " + Arrays.deepToString(matriz2));

        for (int i = 0; i < sumaDeMatriz.length; i++) {
            for (int j = 0; j < sumaDeMatriz.length; j++) {

                sumaDeMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.print("\n " + Arrays.deepToString(sumaDeMatriz));
    }

    private static void ejercicio4() {

        int matriz[][], fila, columna;

        fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila "));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna "));
        matriz = new int[fila][columna];
        System.out.println("Digite la matriz");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("La matriz  [" + i + "][" + j + "] : ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("\n la matriz es :  ");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");

        }

    }

    private static void matrizSimetrica() {
        boolean simetrica = true;
        int matriz[][], nfila, ncolumna;
        nfila = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de fila "));
        ncolumna = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de  columna "));
        matriz = new int[nfila][ncolumna];
        System.out.println("Digite la matriz");
        for (int i = 0; i < nfila; i++) {
            for (int j = 0; j < ncolumna; j++) {
                System.out.print("La matriz  [" + i + "][" + j + "] : ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.print(matriz[i][j] + " ");
            }
        }
        if (nfila == ncolumna) {
            int i, j;
            i = 0;
            while (i < nfila && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "Es simetrica");

            } else {
                JOptionPane.showMessageDialog(null, "No es simetrica");

            }
        } else {
            JOptionPane.showMessageDialog(null, "No es simetrica");
        }
    }

    private static void bloqueMatrices() {
        // Crear y cargar una matriz de  tamaño 3x3, transponerla y mostrarla.
        int matriz[][] = new int[3][3];
        System.out.println("Digite la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");

        }
        System.out.println("\n Matriz original : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
        // transponiendo la matriz 
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }

        }
        System.out.println("\n La matriz traspuesta : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }

    private static void sumaMatrizNxM() {

        int matriz[][], fila, columna, sumafila, sumaColumna;
        fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila "));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna "));
        matriz = new int[fila][columna];
        System.out.println("Digite la matriz");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("La matriz  [" + i + "][" + j + "] : ");
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("La matriz es : ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        //sumar la filas
        for (int i = 0; i < fila; i++) {
            sumafila = 0;
            for (int j = 0; j < columna; j++) {
                sumafila += matriz[i][j];
            }
            System.out.print("\n La suma de la fila [" + i + "] es : " + sumafila);

        }
        System.out.println("");

        //sumar la columna
        for (int j = 0; j < columna; j++) {
            sumaColumna = 0;
            for (int i = 0; i < fila; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print("\n La suma de la columna  [" + j + "] es : " + sumaColumna);
        }
        System.out.println("");

    }

    private static void matrices6() {
        int aux1;
        int aux;
        //Utilizando de tamaño 5x9 y 9x5, carga trasponerla en la segunda
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];
        System.out.println("Digite la matriz 1 ");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.print(matriz1[i][j] + " ");

            }
            System.out.println("");

        }
        System.out.println("\n Matriz original : ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }

            System.out.println("");
        }

        System.out.println("Digite la matriz 2 ");

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                System.out.print(matriz2[i][j] + " ");

            }

            System.out.println("");
        }
        System.out.println("\n Matriz original 2 : ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");

        }
        // transponiendo la matriz 

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz2[j][i] = matriz1[i][j];

            }

        }

        System.out.println("\n La matriz traspuesta : ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
