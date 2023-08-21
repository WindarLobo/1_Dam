package boletin26;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {

        ColeccionGenerico<Integer> objectoLista = new ColeccionGenerico<>();
        ArrayList<Integer> lista = new ArrayList();
        int usuario = 0;

        do {

            try {
                usuario = PedirDatos.pedirInt(" \n1--> Introducir. \n2--> Mostrar. \n3--> Mostrar la Minina. "
                        + "\n4--> Mostrar la maxima  \n5--> Ordenar \n6--> Buscar \n7---> Eliminar \n8--> Salir");
                switch (usuario) {
                    case 1:
                        int canidadNumeros = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
                        for (int i = 0; i < canidadNumeros; i++) {
                            int numero = PedirDatos.pedirInt("introduce un numero");
                            objectoLista.agregar(numero, lista);
                        }
                        break;
                    case 2:

                        objectoLista.mostrar(lista);
                        break;
                    case 3:
                        objectoLista.minimaLista(lista);
                        break;
                    case 4:
                        objectoLista.maximoLista(lista);
                        break;
                    case 5:
                        objectoLista.ordenar(lista);
                        break;
                    case 6:

                        int canidadNumerosBuscador = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
                        for (int i = 0; i < canidadNumerosBuscador; i++) {
                            int numero = PedirDatos.pedirInt("introduce un numero");
                            objectoLista.buscar(numero, lista);
                        }
                        break;
                    case 7:
                        int numero = PedirDatos.pedirInt("Introduce el elemento que deseas eliminar: ");
                        objectoLista.eliminar(lista, numero);
                        objectoLista.mostrar(lista);
                        break;

                    default:
                       
                        break;
                }
            } catch (Exception ex) {
                System.out.println( ex.getMessage());
            }
        } while (usuario < 8);
    }
}
