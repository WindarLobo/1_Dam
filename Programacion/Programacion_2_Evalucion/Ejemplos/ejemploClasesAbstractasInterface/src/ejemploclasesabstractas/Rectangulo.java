package ejemploclasesabstractas;

public class Rectangulo extends FiguraGeometrica implements IDibujable,IRotable {

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

    @Override
    public void dibujable() {
        System.out.println("Dibujamos el rectangulo");
        
    }

    @Override
    public void rotable() {
        System.out.println("Rotamos el rectangulo");
        
    }
    

}
