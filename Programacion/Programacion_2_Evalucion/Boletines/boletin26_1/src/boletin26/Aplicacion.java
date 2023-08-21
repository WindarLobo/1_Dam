package boletin26;

import com.windar.datos.PedirDatos;


public class Aplicacion {

    public static void main(String[] args) {
        apliacion1();
    }

    private static void apliacion1() {
        
        ColeccionGenerico<Integer> objectoLista = new ColeccionGenerico<>();

        int canidadNumeros = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
        for (int i = 0; i < canidadNumeros; i++) {
            int numero = PedirDatos.pedirInt("introduce un numero");
            objectoLista.agregar(numero);
        }

        objectoLista.mostrar();
        objectoLista.minimaLista();
        objectoLista.maximoLista();

        int canidadNumerosBuscador = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
        for (int i = 0; i < canidadNumerosBuscador; i++) {
            int numero = PedirDatos.pedirInt("introduce un numero");
            objectoLista.buscar(numero);
        }
        
      /* ArrayList<Integer> lista = objectoLista.GetList();
       System.out.println(lista);*/
    }
}
