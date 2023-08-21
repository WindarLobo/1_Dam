package modelo;

public class CompraArticulo extends Modelo {
    private Articulo articulo;
    private int idArticulo;
    private int idCompra;
    private double cantidad;
    private double precio;

    public CompraArticulo(Articulo articulo, double cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(int Id, Articulo articulo, double cantidad, double precio) {
        super.Id = Id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(int Id, int idCompra, int idArticulo, double cantidad, double precio) {
        super.Id = Id;
        this.idCompra = idCompra;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return articulo
                + ", cantidad : " + cantidad
                + ", precio   : " + precio + "\n";
    }

    public String toStringFichero() {

        return Id + "," + idCompra + "," + articulo.Id + "," + cantidad + "," + precio;
    }
}
