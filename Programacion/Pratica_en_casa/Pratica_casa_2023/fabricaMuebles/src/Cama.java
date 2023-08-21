public class Cama extends Mueble{
    private int ancho;
    private int largo;
    public Cama(String nombre, float precio,int ancho,int largo) {
        super(nombre, precio);
        this.ancho=ancho;
        this.largo=largo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    @Override
    public String toString() {
        return  super.toString() +","+
                "ancho = " + ancho +
                " largo = " + largo  ;
    }
}
