package boletinrepaso_1;

import javax.swing.JOptionPane;

public class Boletin1 {

    public void Bucle() {

        int numero = 0;

        while (numero < 5) {
            numero++;
            System.out.println(" Esto es un bucle ");

        }

    }

    public void Bucle2() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));

        while (numero < 30) {
            System.out.println(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        }

    }

    public void Bucle3() {

        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
            if (numero >= 0) {
                if (numero == 0) {
                    break;
                }
                System.out.println(numero);
            }
        } while (numero != 0);
    }
    public void Bucle4(){
        
         int numero ;
         
         do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
            if (numero >= 0) {
                if (numero==0){
                    break;
                }
             
            } else {
               
                break;
            }
            
             System.out.println(numero);
        } while (numero!= 0);
    }
}
