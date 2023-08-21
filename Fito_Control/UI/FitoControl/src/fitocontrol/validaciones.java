package fitocontrol;

import modelo.*;

import java.util.ArrayList;

public class validaciones {
    public static void validarnombre(String nombre) throws Exception {

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("Añade un nombre");
        }
    }

    public static int validarIdMarca(String idMarcaString, ArrayList<Modelo> marcas) throws Exception {

        Modelo marcaEncontrado = null;
        int idMarca;

        if (idMarcaString.isEmpty()) {
            throw new Exception("Valor vacio");
        }

        if (!isNumber(idMarcaString)) {
            throw new Exception("Debe ser un numero");
        }

        idMarca = Integer.parseInt(idMarcaString);

        for (Modelo marca : marcas) {

            if (marca.Id == idMarca) {

                marcaEncontrado = marca;

                break;
            }
        }
        if (marcaEncontrado == null) {
            throw new Exception("Articulo seleccionado no existe ");
        }

        return idMarca;
    }

    public static Modelo validarArticuloEcontrado(String idArticuloString, ArrayList<Modelo> articulos) throws Exception {

        Modelo articuloEncontrado = null;
        int idArticulo;

        if (idArticuloString.isEmpty()) {
            throw new Exception("Valor vacio");
        }

        if (!isNumber(idArticuloString)) {
            throw new Exception("Debe ser un numero");
        }

        idArticulo = Integer.parseInt(idArticuloString);

        for (Modelo articulo : articulos) {

            if (articulo.Id == idArticulo) {

                articuloEncontrado = articulo;

                break;
            }
        }

        if (articuloEncontrado == null) {
            throw new Exception("Articulo seleccionado no existe ");
        }

        return articuloEncontrado;
    }

    public static double validarCantidadIntroducida(String cantidadString) throws Exception {
        double cantidad;

        if (cantidadString.isEmpty()) {
            throw new Exception("La cantidad no es valida");
        }

        if (!isNumber(cantidadString)) {
            throw new Exception("Debe ser un numero");
        }

        cantidad = Double.parseDouble(cantidadString);

        if (cantidad < 0) {
            throw new Exception("La cantidad no puede ser negativa");
        }

        return cantidad;
    }

    public static Modelo validarCompraDetalle(Compra compra, CompraArticulo detalleCompra) throws Exception {
        for (CompraArticulo compraDetalle : compra.getArticulos()) {

            if (compraDetalle.getArticulo().Id == detalleCompra.getArticulo().Id) {

                throw new Exception("El articulo introducido ya existe en la compra");
            }
        }
        return detalleCompra;
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
