package boletin26;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionGenerico<T> 
{
    private final ArrayList<T> lista = new ArrayList(); // es una lista interna por cada objecto q genere lista generica
    
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public void mostrar() {
        for (T elemento : lista) {
            System.out.println("Los elemetos son : " + elemento);
        }
    }

    public void minimaLista() {
        System.out.println("Minima es: " + Collections.min(lista, null));
    }

    public void maximoLista() {
        System.out.println("Maxima es  : " + Collections.max(lista, null));
    }

    public void buscar(T elemento) {

        if (lista.indexOf(elemento) >= 0) {
            System.out.println("El elemento " + elemento + " está en la lista");
        } else {
            System.out.println("El elemento " + elemento + " NO está en la lista");
        }
    }
    
   /* public ArrayList<T> GetList(){
        return lista;
    }*/
}
