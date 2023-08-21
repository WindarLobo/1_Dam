package ejemploarrayobx;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {

    public void agregar(ArrayList<Xogador> xogadores) {
        Xogador xogador = new Xogador(PedirDatos.pedirString("nombre :"), PedirDatos.pedirInt("numero"));
        xogadores.add(xogador);
    }

    public void mostrar1(ArrayList<Xogador> xogadores) {
        System.out.println(xogadores);
    }

    public void mostar2(ArrayList<Xogador> xogadores) {
        for (Xogador xogador : xogadores) {
            System.out.println(xogador);
        }
    }

    public void mostrar3(ArrayList<Xogador> xogadores) {
        for (int i = 0; i < xogadores.size(); i++) {
            System.out.println(xogadores.get(i));
        }
    }

    public void mostrar4(ArrayList<Xogador> xogadores) {

        Iterator it = xogadores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public int buscarXogador(ArrayList<Xogador> xogadores) {
        int numeroBuscado = PedirDatos.pedirInt("Que numero buscas : ");
        int atopado = 0;// no se atopo
        for (Xogador xogador : xogadores) {
            if (numeroBuscado == xogador.getDorsal()) {
                System.out.println(" el jugador se llama : " + xogador.getNombre());
                atopado = 1;
                break;
            }
        }
        if (atopado == 0) {
            System.out.println("El jugador no esta en el equipo");
        }
        return atopado;
    }

    public void borrarXogador(ArrayList<Xogador> xogadores) {
        String nombreBuscado = PedirDatos.pedirString("Que jugador quieres eliminar");
        Iterator nombre = xogadores.iterator();
        while (nombre.hasNext()) {
            if (nombre.next().equals(nombreBuscado)) {
                nombre.remove();
            }
        }
    }

    public void borrarXogador2(ArrayList<Xogador> xogadores) {
        int buscar = buscarXogador(xogadores);
        if (buscar == 1) {
            String nombreBuscado = PedirDatos.pedirString("Que jugador quieres eliminar");
            System.out.println("Borrado");
            Iterator nombre = xogadores.iterator();
            while (nombre.hasNext()) {
                Xogador xogador = (Xogador) nombre.next();
                if (xogador.getNombre().equals(nombreBuscado)) {
                    nombre.remove();
                }
            }
        }
    }

    public void mostrarTodos(ArrayList<Xogador> xogadores) {
        for (Xogador xogador : xogadores) {
            System.out.println(xogador);
        }
    }

    public void eliminar(ArrayList<Xogador> xogadores) {
        int dorsal = PedirDatos.pedirInt("Que numero buscas : ");

        for (Xogador xogador : xogadores) {
            if (xogador.getDorsal() == dorsal) {
                xogadores.remove(xogador);
                break;
            }
        }
    }

 
     public void ordenar(ArrayList<Xogador> xogadore){
         Collections.sort(xogadore);
       
                 


     }

}

