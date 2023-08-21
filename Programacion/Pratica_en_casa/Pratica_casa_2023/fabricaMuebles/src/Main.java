import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Mueble> muebles = new ArrayList<>();
            Mueble mesa1 = new Mesa("1 mesa", 250, "redonda", 4);
            Mueble silla1 = new Silla("1 silla", 55, "Crema");
            Mueble silla2 = new Silla("1 silla", 55, "Crema");
            Mueble silla3 = new Silla("1 silla", 55, "Crema");
            Mueble silla4 = new Silla("1 silla", 55, "Crema");
            Mueble cama1 = new Cama("1 cama ", 55, 150, 200);
            Mueble mesa2 = new Mesa("1 mesa", 72, "rectangular", 1);
            Mueble silla5 = new Silla("1 silla", 25, "Azul ");
            muebles.add(mesa1);
            muebles.add(silla1);
            muebles.add(silla2);
            muebles.add(silla3);
            muebles.add(silla4);
            muebles.add(cama1);
            muebles.add(mesa2);
            muebles.add(silla5);
            String pintar = null;

            for (int i = 0; i < muebles.size(); i++) {
                pintar = String.valueOf(muebles);
            }
            LibreriaEntradSalida.salida("Muebles " + pintar, LibreriaEntradSalida.CONSOLA);

        }
    }







