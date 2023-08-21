package fitocontrol.menus;

import fitocontrol.Repositorio;

import javax.swing.JOptionPane;

import modelo.Marca;

import static fitocontrol.validaciones.validarnombre;

public class MenuMarcas {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};

    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Marcas", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            if (Opcion == null) {
              break;
            }

            switch (Opcion.toUpperCase()) {

                case "AÑADIR":
                    añadirMarca();
                    break;

                case "OBTENER TODOS":
                    mostraTodaLasMarcas();
                    break;

                case "VOLVER ATRAS":
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void añadirMarca() throws Exception {

        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la marca");

        validarnombre(nombre);

        Marca marca = new Marca(nombre);

        Repositorio.Marcas.Añadir(marca);

        JOptionPane.showMessageDialog(null, "Marca creada correctamente.");
    }

    private static void mostraTodaLasMarcas() {
        JOptionPane.showMessageDialog(null, Repositorio.Marcas.ObtenerTodos());
    }
}
