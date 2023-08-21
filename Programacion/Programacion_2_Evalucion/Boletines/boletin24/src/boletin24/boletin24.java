package boletin24;

import com.windar.metodos.Metodos;
import com.windar.metodos.Libro;
import com.windar.datos.PedirDatos;
import java.util.ArrayList;


public class boletin24 {

    public static void main(String[] args) throws Exception {
        Metodos biblioteca = new Metodos();

        ArrayList<Libro> libros = new ArrayList<>();

        int Opcion = 0;

        do {
            try {
                Opcion = PedirDatos.pedirInt("1- Añadir \n2- Mostar \n3- Vender "
                        + "\n4- Ordenar  \n5- Dar de baja \n6- Consulta \n7- Eliminar \n8- Salir");

                switch (Opcion) {
                    case 1:
                        biblioteca.añadir(libros);
                        break;
                    case 2:
                        biblioteca.mostrar(libros);
                        break;
                    case 3:
                        biblioteca.vender(libros);
                        break;
                    case 4:
                        biblioteca.ordenar(libros);
                        break;
                    case 5:
                        biblioteca.darDeBaja(libros);
                        break;
                    case 6:
                        biblioteca.consultar(libros);
                        break;
                    case 7:
                        biblioteca.eliminar(libros);
                        break;

                    default:
                        System.out.println(" ********* Gracias por tu compra ******** ");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }
        } while (Opcion < 8);
    }
}
