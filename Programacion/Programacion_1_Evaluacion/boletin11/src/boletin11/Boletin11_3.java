package boletin11;

import javax.swing.JOptionPane;

public class Boletin11_3 {

    public void calculoRectangulo() {
        System.out.println("calculoRectangulo");
        double base=0;
        double altura=0;
        
        do {
            
             base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));
           double area = (base * altura) / 2;
            if (base > 0 && altura > 0) {
                System.out.println("El area es  " + area);
                break;
            }else if (base<0 && altura<0){
                System.out.println("Introduzca un numero positivo");
                
           
            }
            
        } while (base !=0 && altura !=0);
    }

}
