package modelo;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Compra extends Modelo {
    private Date fecha;
    private ArrayList<CompraArticulo> articulos;

    public Compra() {
        this.fecha = Date.from(Instant.now());
        this.articulos = new ArrayList<>();
    }

    public Compra(int Id, Date fecha) {
        super.Id = Id;
        this.fecha = fecha;
        this.articulos = new ArrayList<>();
    }

    public ArrayList<CompraArticulo> getArticulos() {
        return articulos;
    }

    public void añadirArticulo(CompraArticulo articulo) {
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String compraString = "";
        double total = 0;

        compraString = "Compra: " + Id + " - Fecha: " + formatoFecha.format(fecha) + "\n";

        for (Modelo detalle : articulos) {
            CompraArticulo compraArticulo = (CompraArticulo) detalle;
            compraString += "   Detalle " + compraArticulo.Id + " - Articulo " + compraArticulo.getArticulo().getNombre() + "\n";
            compraString += "      => Unidades " + compraArticulo.getCantidad() + "\n";
            compraString += "      => Precio " + compraArticulo.getPrecio() + "\n";
            total += compraArticulo.getCantidad() * compraArticulo.getPrecio();
        }

        compraString += "Total: " + total;

        return compraString + "\n\n";
    }
    public String toStringFichero() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return Id + "," + formatoFecha.format(fecha);
    }
}
