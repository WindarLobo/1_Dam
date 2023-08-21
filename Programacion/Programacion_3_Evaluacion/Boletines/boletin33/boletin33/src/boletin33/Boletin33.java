package boletin33;

import java.util.ArrayList;

public class Boletin33 {

    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> seleccionFutbol = crearSeleccion();

        presentarSeleccion(seleccionFutbol);
    }

    private static void presentarSeleccion(ArrayList<SeleccionFutbol> seleccionFutbol) {
        for (SeleccionFutbol seleccionFutbolista : seleccionFutbol) {
            
            if (seleccionFutbolista instanceof Futbolista) {// Comprueba si seleccion futbolista es un objecto futbolista con instanceof(palabra reservada);
                Futbolista futbolista = (Futbolista) seleccionFutbolista;
                System.out.println("\n Futbolista : " + futbolista.toString());
                futbolista.entrevista();
            }

            if (seleccionFutbolista instanceof Entrenador) {// Comprueba si seleccion entrenador es un objecto futbolista con instanceof(palabra reservada);
                Entrenador entrenador = (Entrenador) seleccionFutbolista;
                System.out.println("\n Entrenador : " + entrenador.toString());
                entrenador.planificarEntrenamiento();
            }

            if (seleccionFutbolista instanceof Masajista) {// Comprueba si seleccion masajista es un objecto futbolista con instanceof(palabra reservada);
                Masajista masajista = (Masajista) seleccionFutbolista;
                System.out.println("\n Masajista : " + masajista.toString());
                masajista.darMasaje();
            }
            if (seleccionFutbolista instanceof Seleccionador) {// Comprueba si seleccion seleccionador es un objecto futbolista con instanceof(palabra reservada);
                Seleccionador seleccionador = (Seleccionador) seleccionFutbolista;
                System.out.println("\n Seleccionador : " + seleccionador.toString());
                seleccionador.seleccionarXogador();
            }

            seleccionFutbolista.concentrarse();
            seleccionFutbolista.entrenar();
            seleccionFutbolista.jugarPartido();
            seleccionFutbolista.viajar();
        }
    }

    private static ArrayList<SeleccionFutbol> crearSeleccion() {
        ArrayList<SeleccionFutbol> seleccionFutbol = new ArrayList<>();
        SeleccionFutbol futbolista1 = new Futbolista(1, "Juan", "Lopez", 35, 5, "d");
        seleccionFutbol.add(futbolista1);
        SeleccionFutbol entrenador1 = new Entrenador(2, "Pedro", "Mendez", 18, 25);
        seleccionFutbol.add(entrenador1);
        SeleccionFutbol masajista1 = new Masajista(3, "Jesus", "Mendez", 16, "Portero", 5);
        seleccionFutbol.add(masajista1);
        SeleccionFutbol seleccionador1 = new Seleccionador(4, "Jesus", "Mendez", 21);
        seleccionFutbol.add(seleccionador1);
        return seleccionFutbol;
    }
}
