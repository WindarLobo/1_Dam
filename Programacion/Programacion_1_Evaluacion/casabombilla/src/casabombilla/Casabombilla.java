package casabombilla;

import javax.swing.JOptionPane;

public class Casabombilla {

    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();

        bombilla1.setEstaEncendida(false);
        System.out.println(bombilla1.getEstaEncendida());

        Bombilla bombilla2 = new Bombilla();

        bombilla2.setEstaEncendida(false);
        System.out.println(bombilla2.getEstaEncendida());

        Bombilla bombilla3 = new Bombilla();

        bombilla3.setEstaEncendida(false);
        System.out.println(bombilla3.getEstaEncendida());

        Interructor interructor = new Interructor(bombilla1, bombilla2, bombilla3, false);
        // System.out.println(interructor.getEstaEncendida());

        interructor.setEstaEncendido(true);
        System.out.println(interructor.getEstaEncendido() + "\n" + interructor.getestadoBombillas());

        String usuario;
        do {
            usuario = JOptionPane.showInputDialog("Quieres enceder la luz? 1 = encedido y 0 = apagado ");
            if (usuario.equals("1")) {
                interructor.setEstaEncendido(true);
                System.out.println(interructor.getEstaEncendido() + "\n" + interructor.getestadoBombillas());

            } else if (usuario.equals("0")) {
                interructor.setEstaEncendido(false);
                System.out.println(interructor.getEstaEncendido() + "\n" + interructor.getestadoBombillas());
            }

        } while (!usuario.equals("2"));

    }

}
