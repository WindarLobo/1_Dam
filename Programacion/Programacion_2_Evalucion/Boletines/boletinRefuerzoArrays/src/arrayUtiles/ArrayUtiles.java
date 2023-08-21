package arrayUtiles;

import java.util.Arrays;

public class ArrayUtiles {

    public int visualizar(int[] crear) {

        for (int i = 0; i < crear.length; i++) {

            System.out.print(crear[i] + " ");
        }
        return 0;
    }

    public int contar(int numero[]) {
        int nuemeroDado = 3;
        int contarNumero = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == nuemeroDado) {
                contarNumero++;
            }
        }
        return contarNumero;
    }

    public String Ordenar(int[] numero) {

        String cadena = "";
        Arrays.sort(numero);
        for (int i = 0; i < numero.length; i++) {
            cadena += " " + numero[i];

        }
        return cadena;
    }
      public int contarNumero(int[] numero) {

        int nuemeroConsulta= 5;
        int contarNumero = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == nuemeroConsulta) {
                contarNumero++;
            }
        }
        return contarNumero;
    }
}
