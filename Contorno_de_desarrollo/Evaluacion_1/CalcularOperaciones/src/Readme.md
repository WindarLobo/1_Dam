     Librería de operaciones basicas 

> Ejemplo de Librería de operaciones basicas , en el que vamos a paquetizar el código, para poder reutilizarlo.
> Creo un JavaDoc completo, tanto de atributos como de los métodos.
 ___ 

- Utilizó literales (static final ) para las operación matemáticas.
- Instancio el objeto Métodos y llamó a realizar operación basicas.
- En el método "realizarOperacionBasicas" no recibe nada y no devuelve nada.
- Istacion el objeto Métodos, solicito que introduzca qué operación quiere realizar.
- Luego pido a y b, realizó un try catch para tener el control de la división.
- En el método private de la operaciones básicas recibe 3 parámetros numero1 que recibe un numero float,numero2 recibe
  un numero float y operación que recibe
  un string que tendrá varias opciones,suma,resta,multiplicacion , division y raiz .
- Dentro del método, operaciones basicas controlo posible división entre cero y otros errores mediante en un lanzamiento
  de una Exception.
- Genero un método privado "validarOperacion(String operacion)" que valida la operacion instroducida por el usuario.

```java
public class Metodos {
    public void realizarOperacionBasicas() {
        try {
            String operacion = LibreriaEntradSalida.entradaString("Que operacion quieres hacer " + "( \"+\" = Suma , \"-\" = Resta , \"*\" " + "= Multiplicacion , \"/\" = Division \"%\" = Raiz" ,LibreriaEntradSalida.SALIDA_CONSOLA);
            validarOperacion(operacion);
            float a = LibreriaEntradSalida.recibefloat("Introduce un numero",LibreriaEntradSalida.SALIDA_CONSOLA);
            float b = LibreriaEntradSalida.recibefloat("Introduce un numero",LibreriaEntradSalida.SALIDA_CONSOLA);

            float resultado = operacionesBasicas(a, b, operacion);
            LibreriaEntradSalida.salida("El resulta es " + resultado, LibreriaEntradSalida.SALIDA_CONSOLA);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

```

- Luego realizo el jar de mi libreria de operaciones basicas.......
