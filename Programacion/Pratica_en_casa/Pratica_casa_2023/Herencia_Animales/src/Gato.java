public class Gato extends Mascota {
    private String colorDePelo;

    public Gato(String nombre, int edad, float peso, String colorDePelo) {
        super(nombre, edad, peso);
        this.colorDePelo = colorDePelo;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }
    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }
    @Override
    public void hacerSonido() {
        LibreriaEntradSalida.salida(" miau miau ", LibreriaEntradSalida.CONSOLA);
    }
    @Override
    public String toString() {
        return "El color de pelo es : " + colorDePelo + '\'' +
                super.toString();
    }
}
