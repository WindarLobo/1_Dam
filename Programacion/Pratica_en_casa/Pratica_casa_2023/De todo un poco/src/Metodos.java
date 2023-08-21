import javax.swing.*;

public class Metodos {

    /*. Realizar un programa que indique si un número es primo o no. Un número es primo
    cuando sólo tiene 2 divisores : el 1 y el mismo número.*/
    public boolean metodo1() {
        int numero = (int) (Math.random() * 25 + 1);
        System.out.println("EL numero : " + numero);

        if (numero == 0 || numero == 1 || numero == 4) {

            return false;
        }
        for (int x = 2; x != numero / 2; x++) {
            if (numero % x == 0)

                return false;

        }
        return true;
    }

    public static double[] Metodo2(int a, int b, int c) {

        double ecuacuion = (Math.pow(b, 2) - (4 * a * c));

        if (ecuacuion >= 0) {
            double[] respuesta;
            if (ecuacuion == 0) {
                respuesta = new double[1];
                respuesta[0] = ((-b) - (4 * a * c) / (2 * a));

            } else {
                respuesta = new double[2];

                respuesta[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                respuesta[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);


            }
            return respuesta;
        } else {


            return null;
        }
    }

    public void metodos() {
        System.out.println("x^2 - 5x + 6"); // dos soluciones
        double resultados[] = Metodo2(1, -5, 6);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }

        System.out.println("x^2 - 2x + 1"); // una solucion
        resultados = Metodo2(1, -2, 1);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }

        System.out.println("x^2 - x + 1"); // sin solucion
        resultados = Metodo2(1, 1, 1);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }

     /*Realizar un programa que resuelva una ecuación de segundo grado :
     Si a es cero, la solución es :
    - Si b es cero, las soluciones so Siempre y cuando la raíz sea positiva, en caso contrario no tiene solución.
- Si c es cero, las soluciones son:
- Si a b y c son distinto de cero se calculará la solución en base a la
mítica fórmula:
El programa debe asegurarse que existe solución real (es decir que la raíz no
es negativa) ,si no existiese se informaría al usuario de dicha circunstancia
Ayuda: Necesitaréis dos variables para guardar las dos soluciones*/

    }

    public void metodo3( ) {
        /*. Diseñar un programa que calcule el menor de 4 números*/

       int  a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
       int d = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        if (menor(a, b) < menor(c, d)) {
            System.out.println(" El menor de los cuatro numero es :" +menor(a, b) );
        } else {
            System.out.println(" El menor de los cuatro numero es :" + menor(c, d));
        }

    }

    public static int menor(int a, int b) {
      int menor=b;
        if (a < b) {
     menor=a;

        }

        return menor ;
    }
}
















