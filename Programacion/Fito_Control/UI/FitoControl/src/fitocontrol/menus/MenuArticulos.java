package fitocontrol.menus;

import fitocontrol.Repositorio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.Articulo;
import modelo.Modelo;
import modelo.TipoMedida;

import static fitocontrol.validaciones.validarIdMarca;
import static fitocontrol.validaciones.validarnombre;

public class MenuArticulos {
    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};

    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Articulos", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            if (Opcion == null) {
                break;
            }

            switch (Opcion.toUpperCase()) {

                case "AÑADIR":
                    añadirArticulos();
                    break;

                case "OBTENER TODOS":
                    mostraTodoLosArticulo();
                    break;

                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void añadirArticulos() throws Exception {

        ArrayList<Modelo> marcas = Repositorio.Marcas.ObtenerTodos();

        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la articulo");

        validarnombre(nombre);

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Kilos \n1-->"
                + " Gramos \n2--> Litros \n3--> Centrilitros \n4--> Mililitros"))];

        String IdMarcaString = JOptionPane.showInputDialog("Introduce el Id de Marca " + marcas.toString());

        int idMarca = validarIdMarca(IdMarcaString, marcas);

        Articulo articulo = new Articulo(nombre, tipoMedida, idMarca);

        Repositorio.Articulos.Añadir(articulo);

        JOptionPane.showMessageDialog(null, "Articulo creado correctamente.");
    }

    private static void mostraTodoLosArticulo() {

        JOptionPane.showMessageDialog(null, Repositorio.Articulos.ObtenerTodos());
    }



}

