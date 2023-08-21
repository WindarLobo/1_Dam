package ejemploclasesabstractas;

import javax.swing.JOptionPane;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
 
         
       float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce una base"));
       float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
       
        /*fRectangulo re = new Rectangulo(base, altura);
        System.out.println("El area es :" + re.calcularArea());
        System.out.println("El perimetro es :" + re.calcularPerimetro());

        Triangulo tri = new Triangulo(base, altura);
        System.out.println("El area es :" + tri.calcularArea());
        System.out.println("El perimetro es :" + tri.calcularPerimetro());

        //FiguraGeometrica fi= new FiguraGeometrica(3,6); no se puede instancia por que es asbtracta
        FiguraGeometrica fi = new Rectangulo(base, altura);
        System.out.println("El area es :" + re.calcularArea());
        System.out.println("El perimetro es :" + re.calcularPerimetro());

        FiguraGeometrica fig = new Triangulo(base, altura);
        System.out.println("El area es :" + fig.calcularArea());
        System.out.println("El perimetro es :" + fig.calcularPerimetro());*/
       Rectangulo rect= new Rectangulo(base,altura);
       rect.dibujable();
       
        Triangulo fig = new Triangulo(base, altura);
        fig.dibujable();
    
       

    }

}
