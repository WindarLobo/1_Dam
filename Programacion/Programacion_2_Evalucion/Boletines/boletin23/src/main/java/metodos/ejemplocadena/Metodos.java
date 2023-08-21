package metodos.ejemplocadena;

import java.util.Arrays;

public class Metodos {

    String nome = "Nabuconodosor";

    public int contarNumeroLetras() {

        for (int i = 0; i < 1; i++) {

        }

        return nome.length();
    }

    public String pasarAMayuscula() {

        String mayuscula = nome.toUpperCase();
        return mayuscula;

    }

    public String pasarAMinuscula() {

        String minuscula = nome.toLowerCase();
        return minuscula;

    }

    public String Comparar() {
        String nombreComparar = nome;

        if (nombreComparar.equals(nome)) {

        }
        return nome;
    }

    public String pasarNombreAUnArrays() {

        char[] nome2 = nome.toCharArray();
        return Arrays.toString(nome2);

    }

    public String contar() {

        String cadenaDeTexto1 = nome.substring(0, 4);
        return cadenaDeTexto1;

    }

}
