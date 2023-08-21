public class BuilderCoche {

    private Coche _coche;

    public BuilderCoche() {
        _coche = new Coche();
    }

    public BuilderCoche setMarca(String marca) {
        _coche.setMarca(marca);
        return this;
    }

    public BuilderCoche setAno(int ano) {
        _coche.setAno(ano);
        return this;
    }

    public BuilderCoche setTapizadoDeCuero() {
        _coche.setTapizadoDeCuero(true);
        return this;
    }
    public BuilderCoche setModelo(String modelo) {
        _coche.setModelo(modelo);
        return this;
    }

    public BuilderCoche setNumeroDePuertas(int numeroDePuertas) {
        _coche.setNumeroDePuertas(numeroDePuertas);
        return this;
    }

    public BuilderCoche setAireAcondicionado() {
        _coche.setAireAcondicionado(true);
        return this;
    }

    public BuilderCoche setColor(String color) {
        _coche.setColor(color);
        return this;
    }

    public Coche build() {

        return this._coche;
    }


}
