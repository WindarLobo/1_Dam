package modelo;

public class Articulo extends Modelo {
    private String nombre;
    private TipoMedida tipoMedida;
    private int idMarca;
    private double cantidad;

    public Articulo(String nombre, TipoMedida tipoMedida, int idMarca) {
        this.nombre = nombre;
        this.tipoMedida = tipoMedida;
        this.idMarca = idMarca;
    }

    public Articulo(int Id, String nombre, TipoMedida tipoMedida, int idMarca, double cantidad) {
        super.Id = Id;
        this.nombre = nombre;
        this.tipoMedida = tipoMedida;
        this.idMarca = idMarca;
        this.cantidad = cantidad;
    }

    public double getCantidad() {

        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMedida getTipoMedida() {
        return tipoMedida;
    }

    @Override
    public String toString() {
        return " Articulo : " + Id
                + " , nombre : " + nombre
                + " , tipoMedida : " + tipoMedida
                + " , idMarca : " + idMarca
                + " , la cantidad es : " + cantidad + "\n";
    }

    public String toStringFichero() {
        return Id + "," + nombre + "," + tipoMedida.ordinal() + "," + idMarca + "," + cantidad;
    }
}

