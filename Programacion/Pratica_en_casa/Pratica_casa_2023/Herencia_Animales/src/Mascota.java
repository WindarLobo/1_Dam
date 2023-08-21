public abstract class Mascota {
    private String nombre;
    private int edad;
    private float peso;

    public Mascota(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "\n Nombre = " + nombre +
                "\n Edad = " + edad +
                "\n Peso = " + peso + "\n"
                ;
    }
}

