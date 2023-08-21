package ejemploarrayobx;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;

public class EjemploArrayObx {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        ArrayList<Xogador> xogadores = new ArrayList<>();

        int op;
        do {
            op = PedirDatos.pedirInt("1 Añadir \n2 mostrar \n3 ver con Foreach \n4 con for nomral \n5 ver con iteraro \n6 buscar"
                    + " \n7 Borrar \n8 Borra otra opcion \n9 Mostrar el elemento eliminado \n10 Ordenar \n11 Salir");
            switch (op) {
                case 1:
                    metodos.agregar(xogadores);
                    break;
                case 2:
                    metodos.mostrar1(xogadores);
                    break;
                case 3:
                    metodos.mostar2(xogadores);
                    break;
                case 4:
                    metodos.mostrar3(xogadores);
                    break;
                case 5:
                    metodos.mostrar4(xogadores);
                    break;
                case 6:
                    metodos.buscarXogador(xogadores);
                    break;
                case 7:
                    metodos.borrarXogador(xogadores);
                    break;
                case 8:
                    metodos.borrarXogador2(xogadores);
                    break;
                case 9:
                    metodos.mostrarTodos(xogadores);
                case 10:
                    metodos.ordenar(xogadores);
                    break;
                default:
                    System.out.println("Salir");
            }

        } while (op < 11);
    }
}
