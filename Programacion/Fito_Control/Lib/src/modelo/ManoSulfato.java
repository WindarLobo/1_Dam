package modelo;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ManoSulfato extends Modelo {
    private Date fecha;
    private ArrayList<ManoSulfatoArticulo> articulos;

    public ManoSulfato() {
        this.fecha = Date.from(Instant.now());
        this.articulos = new ArrayList<>();
    }

    public ManoSulfato(int Id, Date fecha) {
        super.Id = Id;
        this.fecha = fecha;
        this.articulos = new ArrayList<>();
    }

    public ArrayList<ManoSulfatoArticulo> getArticulos() {
        return articulos;
    }

    public void añadirArticulo(ManoSulfatoArticulo articulo) {
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String compraString;

        compraString = "ManosSulfato: " + Id + " - Fecha: " + formatoFecha.format(fecha) + "\n";
        for (Modelo detalle : articulos) {
            ManoSulfatoArticulo manoSulfatoArticulo = (ManoSulfatoArticulo) detalle;
            compraString += "   Detalle " + manoSulfatoArticulo.Id + " - Articulo " + manoSulfatoArticulo.getArticulo().getNombre() + "\n";
            compraString += "      => Unidades " + manoSulfatoArticulo.getCantidad() + " " + manoSulfatoArticulo.getIdMedida();
        }
        return compraString + "\n\n";
    }

    public String toStringFichero() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return Id + "," + formatoFecha.format(fecha);

    }
}
