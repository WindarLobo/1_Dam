public class Silla extends Mueble{
    private String color;
    public Silla(String nombre, float precio,String color) {
        super(nombre, precio);
        this.color=color;

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()  +","+
                "de color = " + color ;
    }
}
