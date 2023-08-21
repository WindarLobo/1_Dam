package ejemploexcepciones;

public class DividirExcepciones {

    public void divir(int numerador, int denominador) {

        int resultado = numerador / denominador;
        System.out.println(numerador + " / " + denominador + " = " + resultado);

    }
    public void divirTratandoException(int numerador, int denominador) {
        try {
            int resultado = numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + resultado);
            // } catch (ArithmeticException excepciones) {
        } catch (Exception excepciones) { // se puede asi tambien 

            System.out.println("Error de dividir " + excepciones.getMessage());

        }
        System.out.println(" Remata el metodo ");

    }

    public void divirtresbloqueException(int numerador, int denominador) {
        try {
            int resultado = numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + resultado);
            // } catch (ArithmeticException excepciones) {
        } catch (Exception excepciones) { // se puede asi tambien 

            System.out.println("Error de dividir " + excepciones.getMessage());

        } finally {

            System.out.println("Esto es un bloque q se ejecuta siempre");
        }
        System.out.println(" Remata el metodo ");

    }

    public void propagarExce(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException(" No dividas entre 0");
        } else {
            int resultado = numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + resultado);
        }
        System.out.println(" Remata el metodo ");

    }

    public void dividirNuestraExcepcion(int numerador, int denominador) throws NuestraExcepcion {
        if (denominador == 0) {
            throw new NuestraExcepcion("  **** No dividas entre 0 desde nuestra clase ******");
       /* } else {
            int resultado = numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + resultado);
        }*/

    }
}
}
