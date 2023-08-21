package ejemploclasesabstractas;

public class Triangulo extends FiguraGeometrica  implements IDibujable{

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return (super.getBase() * super.getAltura() / 2);

    }

    @Override
    public float calcularPerimetro() {

        return (float) (super.getBase() + super.getAltura() + Math.sqrt(super.getBase() * super.getBase() + super.getAltura()* super.getAltura()));
    }

    @Override
    public void dibujable() {
        System.out.println("Dibujamos el triangulo");
    }

}
