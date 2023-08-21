package ejemploclasesabstractas;

public abstract class FiguraGeometrica {

    private float base;
    private float altura;
// Contructor para poder crear las figuras con los atributos
    public FiguraGeometrica(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

}
