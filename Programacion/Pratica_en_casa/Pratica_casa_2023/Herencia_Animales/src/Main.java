import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mascota> animales = new ArrayList<>();
        Veterinario veterinario = new Veterinario();

        LibreriaEntradSalida.salida("Animal 1 ", LibreriaEntradSalida.CONSOLA);
        Mascota mascota1 = new Perro("Laky", 12, 6.5f, "palleira");
        animales.add(mascota1);
        veterinario.curarMascota(mascota1);
        LibreriaEntradSalida.salida(veterinario.pesarMascota(mascota1) + "\n" + mascota1, LibreriaEntradSalida.CONSOLA);

        LibreriaEntradSalida.salida("Animal 2 ", LibreriaEntradSalida.CONSOLA);
        Mascota mascota2 = new Perro("Blaca", 15, 10.5f, "Salchicha");
        animales.add(mascota2);
        veterinario.curarMascota(mascota2);
        LibreriaEntradSalida.salida(veterinario.pesarMascota(mascota2) + "\n" + mascota2, LibreriaEntradSalida.CONSOLA);

        LibreriaEntradSalida.salida("Animal 3 ", LibreriaEntradSalida.CONSOLA);
        Mascota mascota3 = new Gato("Nebola", 5, 5f, "Marron");
        animales.add(mascota3);
        veterinario.curarMascota(mascota3);
        LibreriaEntradSalida.salida(veterinario.pesarMascota(mascota3) + "\n" + mascota3, LibreriaEntradSalida.CONSOLA);

        LibreriaEntradSalida.salida("Animal 4", LibreriaEntradSalida.CONSOLA);
        Mascota mascota4 = new Gato("Chesta", 2, 5f, "Blanco con negro");
        animales.add(mascota4);
        veterinario.curarMascota(mascota4);
        LibreriaEntradSalida.salida(veterinario.pesarMascota(mascota4) + "\n" + mascota4, LibreriaEntradSalida.CONSOLA);


    }
}