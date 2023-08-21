package fitocontrol;

import fitocontrol.menus.MenuArticulos;
import fitocontrol.menus.MenuCompras;
import fitocontrol.menus.MenuManosSulfato;
import fitocontrol.menus.MenuMarcas;

import javax.swing.JOptionPane;

import static fitocontrol.CargadorDeDatos.cargarDatos;

public class FitoControl {
    public static void main(String[] args) throws Exception {

        String[] opciones = {"Marcas", "Articulos", "Compras", "Mano Sulfatos", "Salir"};
        String Opcion = "";
        cargarDatos();

        do {
            try {
                Opcion = (String) JOptionPane.showInputDialog(null, "FitoControl", "Opcion",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                if (Opcion == null) {
                  break;
                }

                    switch (Opcion.toUpperCase()) {

                        case "MARCAS":
                            MenuMarcas.mostrar();
                            break;

                        case "ARTICULOS":
                            MenuArticulos.mostrar();
                            break;

                        case "COMPRAS":
                            MenuCompras.mostrar();
                            break;

                        case "MANO SULFATOS":
                            MenuManosSulfato.mostrar();
                            break;

                        case "SALIR":
                            break;
                    }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }
}
