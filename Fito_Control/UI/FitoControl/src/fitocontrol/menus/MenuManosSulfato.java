package fitocontrol.menus;

import fitocontrol.Repositorio;
import fitocontrol.Utiles;
import modelo.*;

import javax.swing.*;
import java.util.ArrayList;

import static fitocontrol.validaciones.*;

public class MenuManosSulfato {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar Articulo", "Finalizar"};

    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Manos de Sulfato", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            if (Opcion == null) {
                break;
            }

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    opcionesMenuManoDeSulfato();
                    break;

                case "OBTENER TODOS":
                    mostraTodaLasManosDeSulfato();
                    break;

                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void opcionesMenuManoDeSulfato() throws Exception {
        String Opcion;

        ManoSulfato manoSulfato = new ManoSulfato();

        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);

            if (Opcion == null) {
               break;
            }

            switch (Opcion.toUpperCase()) {

                case "AGREGAR ARTICULO":
                    ManoSulfatoArticulo producto = añadirManoSulfato();

                    manoSulfato.añadirArticulo(producto);
                    break;

                case "FINALIZAR":
                    if (manoSulfato.getArticulos().size() == 0) {

                        throw new Exception("La manoSulfato no contiene nigun producto");
                    }
                    Repositorio.ManoSulfato.Añadir(manoSulfato);

                    Repositorio.ManoSulfato.guardarEnFichero();

                    Repositorio.Articulos.guardarEnFichero();
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar"));
    }

    private static void mostraTodaLasManosDeSulfato() {

        JOptionPane.showMessageDialog(null, Repositorio.ManoSulfato.ObtenerTodos());
    }

    private static ManoSulfatoArticulo añadirManoSulfato() throws Exception {

        ArrayList<Modelo> articulos = Repositorio.Articulos.ObtenerTodos();

        String IdArticuloString = JOptionPane.showInputDialog("Introduce el Id del articulo \n " + articulos.toString());

        Articulo articuloEncontrado = (Articulo)validarArticuloEcontrado(IdArticuloString, articulos);

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog(Utiles.obtenerTiposMedida(articuloEncontrado.getTipoMedida())))];

        String cantidadString = JOptionPane.showInputDialog("Introduce la cantidad");

        double cantidad = validarCantidadIntroducida(cantidadString);

        return new ManoSulfatoArticulo(articuloEncontrado, tipoMedida, cantidad);
    }

}
