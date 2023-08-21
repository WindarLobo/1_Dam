public class Metodos {
    /**
     * Creo un atributo privado static final de Suma = "+".
     */
    private static final String Suma = "+";
    /**
     * Creo un atributo privado static final de Resta = "-".
     */
    private static final String Resta = "-";
    /**
     * Creo un atributo privado static final de Multiplicacion = "*".
     */
    private static final String Multiplicacion = "*";
    /**
     * Creo un atributo privado static final de Divison  = "/".
     */
    private static final String Division = "/";
    /**
     * Creo un atributo privado static final de Raiz = "%".
     */
    private static final String Raiz = "%";

    /**
     * Creo un atributo privado static  de total en donde guardar los resultados .
     */
    private static Float total = null;

    /**
     * En el metodo realizarOperacion  no recibe nada y no devuelve nada.
     * Istacion el objeto Métodos, solicito que introduzca qué operación quiere realizar.
     * Luego pido a y b, realizó un try catch para tener el control de los errores.
     */
    public static void realizarOperacionBasicas() {

        try {
            String operacion = LibreriaEntradSalida.entradaString("Que operacion quieres hacer " + "( \"+\" = Suma , \"-\" = Resta , \"*\" " + "= Multiplicacion , \"/\" = Division ,  \"%\" = Raiz ", LibreriaEntradSalida.CONSOLA);

            float a = LibreriaEntradSalida.recibefloat("Introduce un numero", LibreriaEntradSalida.CONSOLA);
            float b = LibreriaEntradSalida.recibefloat("Introduce un numero", LibreriaEntradSalida.CONSOLA);
            float resultado = operacionesBasicas(a, b, operacion);
            LibreriaEntradSalida.salida("El resulta es " + resultado, LibreriaEntradSalida.CONSOLA);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    /**
     * Creo un método privado de operacionesBasicas que recibe tres parametros, float numero1, float numero2, String operacion
     *
     * @param operacion tendra varias opciones, sumar,restar,multiplicar , dividir y raices
     * @param operacion de la division realizo un throw  Exception para capturar el error de la division entre 0.
     * @return un total.
     * @throws Exception
     */

    private static float operacionesBasicas(float numero1, float numero2, String operacion) throws Exception {

        switch (operacion) {
            case Suma:
                total = numero1 + numero2;
                break;
            case Resta:
                total = numero1 - numero2;
                break;

            case Multiplicacion:
                total = numero1 * numero2;
                break;

            case Division:
                if (numero2 == 0) {
                    throw new Exception("No se puede dividir entre 0");
                }
                total = numero1 / numero2;
                break;
            case Raiz:
                total = (float) Math.pow(numero1, (1/ numero2));
                break;


        }
        return total;
    }

    /**
     * @param operacion
     * @throws Exception
     */
    private static void validarOperacion(String operacion) throws Exception {
        if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/") && !operacion.equals("%")) {
            throw new Exception("La operacion inválida");
        }

    }
}









