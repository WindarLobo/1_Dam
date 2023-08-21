package ejemploclasesabstractas;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return super.getBase() * super.getAltura();

    }

    @Override
    public float calcularPerimetro() {
        return (2*super.getBase() + 2 * super.getAltura());
    }
    

}
