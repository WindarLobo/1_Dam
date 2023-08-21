public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        LibreriaEntradSalida.salida("gua gua", LibreriaEntradSalida.CONSOLA);
    }
    @Override
    public String toString() {
        return "La raza es :" + raza + '\'' + super.toString();
    }
}
