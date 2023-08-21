package boletin.ejemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaEnteros {

    ArrayList<Integer> ListaEnteros = new ArrayList<Integer>();// pidemos meter cualquier tipo de datos

    public void Crear2() {
        ListaEnteros.add(2);
        ListaEnteros.add(3);
        ListaEnteros.add(5);

        System.out.println("\nAñadiendiendo");
        ListaEnteros.add(2);
        ListaEnteros.add(9);
        ListaEnteros.add(12);
        ListaEnteros.add(15);

    }

    public void ver() {

        for (int lista : ListaEnteros) {
            System.out.println("" + lista);

        }

    }

    public void añadir() {
        ListaEnteros.add(2, 10);
        System.out.println("" + ListaEnteros);

    }

    public void Verificar() {

        if (ListaEnteros.contains(5) == true) {
            System.out.println("Si hay 5");
        }

    }

    public void  borrar() {
        System.out.println("Borrar");
        Iterator it = ListaEnteros.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 2) {
                it.remove();
            }
            if ((int) it.next() == 5) {
                it.remove();
            }
            
        }
        System.out.println(ListaEnteros);

    }
     public void  ordenar() {
         System.out.println("Ordenado");
         Collections.sort(ListaEnteros);
          System.out.println(ListaEnteros);
         
     }
    public void ordenRevesar(){
        System.out.println("Reversa");
        Collections.sort(ListaEnteros,Collections.reverseOrder());
        System.out.println(ListaEnteros);
        
    }
   
    

}
