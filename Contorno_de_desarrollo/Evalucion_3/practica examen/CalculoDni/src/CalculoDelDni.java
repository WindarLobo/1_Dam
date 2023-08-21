/**
 * Esta clase Calcula el dni y  que contienen  enteros y caracteres  como se le definen al crear un objeto.
 */
public class CalculoDelDni {

    /**
     * private static final int numero = 23;
     */
    private static final int numero = 23;
    /**
     * private static final int si = "s";
     */
    private static final String si = "s";
    /**
     * private static final int no = "n";
     */
    private static final String no = "n";

    /**
     * Metodo  char[] arraysCalculoNif que no recibe nada.
     *
     * @return devuelve letrasDni.
     */
    private static char[] arraysCalculoNif() {

        char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasDni;
    }

    /**
     * Metodo  procedimiento()  no recibe nada y no devuelve nada.
     * El metodo  procedimiento() calcula mentiante el numero del nif la letra.
     *
     * @throws Exception calcula los errores.
     */
    public static void procedimiento() throws Exception {
        String persona;
        do {
            persona = LibreriaEntradSalida.entradaString("¿Quieres calcular un  dni? \nSi-->S  \nNo--> N", LibreriaEntradSalida.CONSOLA);

            try {
                if (persona.equalsIgnoreCase("S")) {

                    int nif = LibreriaEntradSalida.recibeInt("Introduce el numero del dni", LibreriaEntradSalida.CONSOLA);
                    char[] letrasDni = arraysCalculoNif();
                    if (nif == 0) {
                        throw new Exception(" !!!!! DNI incorrecto  !!!!!!");
                    }

                    int resto = nif % numero;

                    LibreriaEntradSalida.salida("El dni es :" + nif + letrasDni[resto], LibreriaEntradSalida.CONSOLA);
                }
            } catch (Exception ex) {
                LibreriaEntradSalida.salida(ex.getMessage(), LibreriaEntradSalida.CONSOLA);
            }
            LibreriaEntradSalida.salida("Fin del programa", LibreriaEntradSalida.CONSOLA);


        } while (persona.equalsIgnoreCase("S"));
        LibreriaEntradSalida.salida("******** Servicio oficial ******+", LibreriaEntradSalida.CONSOLA);
        System.out.println();
    }
}


