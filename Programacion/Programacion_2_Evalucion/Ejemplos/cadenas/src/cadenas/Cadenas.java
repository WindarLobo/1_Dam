package cadenas;

public class Cadenas {

    public static void main(String[] args) {
        //longitud();
        // carácter();
        //Invertir() ;
        //reversaTexto()();
        //sinEspacio();
        // vocalesYConsonantes();
        // divicionDeCadenaDeTexto();
        // trasnformarCadenaDeTexto();
        //sustituirCadenaDeTexto();
        sustituirCadenaDeTextoAscii();
    }

    private static void longitud() {
        //Muestra la longitud del texto: “This is Java!”
        String texto = "This is Java!";
        for (int i = 0; i < 1; i++) {
            System.out.println("La longitud del texto es : " + texto.length());

        }
        System.out.println("La longitud del texto es : " + texto.length());
    }

    private static void carácter() {
        //Desmenuza el String “Java” mostrándolo por pantalla carácter a carácter.

        for (int i = 0; i < 4; i++) {
            String texto = "Java";
            char caracter = texto.charAt(i);
            System.out.println(caracter);

        }
        System.out.println("---------------- ");

        for (int i = 0; i < 4; i++) {
            String texto = "Java";
            char caracter = texto.charAt(i);
            System.out.println(caracter);
        }
    }

    private static void Invertir() {
        //Invertir el texto: “Java desde 0”+
        for (int i = 0; i < 2; i++) {
            String cadena = "Java desde 0.com";
            cadena = reverse(cadena);
            System.out.println("El texto original  es : Java desde 0.com  y  revertido es : " + cadena);
        }
    }

    public static String reverse(String cadena) {
        return new StringBuilder(cadena).reverse().toString();

    }

    public static void reversaTexto() {
        String cadena = "Java desde 0.com";
        String reversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {

            reversa += cadena.charAt(i);

        }

        System.out.println("El texto original  es : Java desde 0.com  y  revertido es : " + reversa);

    }

    public static void sinEspacio() {
        //Elimina los espacios del texto: “James Gosling Created Java”
        String texto = "James Gosling Created Java";
        System.out.println("El texto original es :" + texto
                + "\nEl texto sin espacio es : " + texto.replace(" ", ""));

    }

    public static void vocalesYConsonantes() {
        //Cuenta las vocales y las consonantes del String “Java Java Java”. ¡OJO CON LOS ESPACIOS!
        String cadena = "Java Java Java";
        int vcount = 0, ccount = 0;

        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Numero de vocales es: " + vcount + " Numero de consonante es: " + ccount);

    }

    public static void divicionDeCadenaDeTexto() {
        //Divide la cadena de texto “www.javadesde0.com” en dos partes “www.java”
        // y “desde0.com”. Para posteriormente concaténalas y mostrarlas de nuevo.
        String cadena = "www.javadesde0.com";
        String cadenaDeTexto1 = cadena.substring(0, 8);
        String cadenaDeTexto2 = cadena.substring(8);
        System.out.println(cadenaDeTexto1);
        System.out.println(cadenaDeTexto2);
        System.out.println(cadena);

    }

    public static void trasnformarCadenaDeTexto() {
        /*Transforma la cadena de texto “javeros” a mayúsculas. 
        Guarda el valor en la variable y posteriormente conviértela nuevamente a minúsculas.*/
        String cadena = "javeros";
        String mayuscula = cadena.toUpperCase();
        System.out.println("javeros a mayusculas : " + mayuscula);
        String minuscula = cadena.toLowerCase();
        System.out.println(mayuscula + " minusculas : " + minuscula);
    }

    public static void sustituirCadenaDeTexto() {

        /*Sobre la cadena de texto “Jeve jeve jeve”, sustituye/reemplaza
todas las vocales e por la vocal a dando como resultado “Java java java”.*/
        String cadena = "Jeve jeve jeve";
        String reemplazar = "";

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == 'e') {
                reemplazar += 'a';

            } else {
                reemplazar += cadena.charAt(i);
            }

        }
        System.out.println("El texto original : " + cadena + "\nEL texto reemplazado  : " + reemplazar);
    }

    public static void sustituirCadenaDeTextoAscii() {
        //Transforma los caracteres del String: “ABCD” a ASCII.
        String cadena = "ABCD abcd";

        for (char reemplazarAscii : cadena.toCharArray()) {
            System.out.println("ASCII : " + (int) reemplazarAscii + " Es equivalente " + reemplazarAscii);

        }

    }

}
