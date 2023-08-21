package modelo;
public class Marca extends Modelo {
    private String nombre;

    public Marca(String nombre) {

        this.nombre = nombre;
    }

    public Marca(int Id, String nombre) {
        super.Id = Id;
        this.nombre = nombre;
    }
    @Override
    public String toString() {

        return "\n Nombre : " + nombre +  " , Id : " + Id + " ";
    }

    public String toStringFichero() {

        return Id + "," + nombre;
    }
}
