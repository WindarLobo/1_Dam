package modelo;

public class ManoSulfatoArticulo extends Modelo {
    private int idManoSulfato;
    private Articulo articulo;
    private int idArticulo;
    private TipoMedida idMedida;
    private double cantidad;

    public ManoSulfatoArticulo(Articulo articulo, TipoMedida idMedida, double cantidad) {

        this.articulo = articulo;
        this.idMedida = idMedida;
        this.cantidad = cantidad;

    }

    public ManoSulfatoArticulo(int Id, Articulo articulo, TipoMedida idMedida, double cantidad) {
        super.Id = Id;
        this.idMedida = idMedida;
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public ManoSulfatoArticulo(int Id, int idManoSulfato, int idArticulo, TipoMedida idMedida, double cantidad) {
        super.Id = Id;
        this.idManoSulfato = idManoSulfato;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.idMedida = idMedida;
    }

    public int getIdManoSulfato() {
        return idManoSulfato;
    }

    public void setIdManoSulfato(int idManoSulfato) {
        this.idManoSulfato = idManoSulfato;
    }

    public int getIdArticulo() {
        return idArticulo;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public TipoMedida getIdMedida() {
        return idMedida;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return   articulo
                + ", cantidad=" + cantidad
                + ", idMedida=" + idMedida + "\n";
    }
    public String toStringFichero() {
        return Id + "," + idManoSulfato + "," + articulo.Id + "," + idMedida.ordinal() + "," + cantidad;
    }
}
