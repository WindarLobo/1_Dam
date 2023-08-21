public abstract class Mueble {
    private String nombre;
    private  float precio;
    public Mueble(String nombre,float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "\n " + nombre  +","+
                " De valor " + precio+"€";
    }
}
