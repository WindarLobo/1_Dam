package boletin12;
import javax.swing.JOptionPane;

public class AdivinadorDeNumero {

    public void juegoAdivinador() {

        int usuario ;
        int contadorIntentos;
        int numeroLeatorio = 0;
        int maximoIntentos = 0;
        int numeroPista = 0;
        int maximoRango = 0;

        int nivel;

        do {

            nivel = Integer.parseInt(JOptionPane.showInputDialog(" ********* Bienvenido al juego de adivinar un numero ******* \n"
                    + " Introduce el nivel que quieres jugar \n" + " nivel 1" + "\n nivel 2 " + "\n nivel 3 \n" + " Y 0 para salir "));
              if(nivel!=0){
                  
              
            switch (nivel) {
                case 1:
                    maximoRango = 50;
                    numeroLeatorio = (int) (Math.random() * maximoRango + 1);
                    maximoIntentos = 4;
                    numeroPista = 3;
                    break;
                case 2:
                    maximoRango = 100;
                    numeroLeatorio = (int) (Math.random() * maximoRango + 1);
                    maximoIntentos = 3;
                    numeroPista = 2;
                    break;
                case 3:
                    maximoRango = 200;
                    numeroLeatorio = (int) (Math.random() * maximoRango + 1);
                    maximoIntentos = 2;
                    numeroPista = 1;
                    break;
                    
            }
     
             JOptionPane.showInternalConfirmDialog(null, " Solo tines " + maximoIntentos + " intentos ");
             
            for (contadorIntentos = 1; contadorIntentos <= maximoIntentos; contadorIntentos++) {
                         
                JOptionPane.showMessageDialog(null, " Te quedan  " + (maximoIntentos - contadorIntentos) + " intentos ");
                usuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al " + maximoRango));

                if (usuario == numeroLeatorio) {
                    JOptionPane.showMessageDialog(null, "Enhorabuena has ganado");
                    break;
                } else if (contadorIntentos == maximoIntentos) {
                    JOptionPane.showMessageDialog(null, "Lo siento has perido el nuemero era  " + numeroLeatorio);

                    break;

                } else if (usuario > numeroLeatorio) {
                    JOptionPane.showMessageDialog(null, "EL numero es menor ");

                } else if (usuario < numeroLeatorio) {
                    JOptionPane.showMessageDialog(null, "EL numero es mayor ");

                }
                if (contadorIntentos == numeroPista) {
                    int x = (numeroLeatorio / 10);
                    JOptionPane.showMessageDialog(null, "Te dare un pista el numero empieza por  " + x);

                }

            }
              }

        } while (nivel != 0);

    }
}
