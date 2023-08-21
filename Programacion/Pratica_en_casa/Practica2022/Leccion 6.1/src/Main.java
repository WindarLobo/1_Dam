public class Main {
    public static void main(String[] args) {

        /* Tom y Bob estan jugando juego de mesa, en el que ambos jugadores comienza con la misma cantidad de puntos.
        tom gano el primer juego y obtuvo 1 punto, mientras que bob perdio el juego y, por lo tanto, perdio 1 punto.
        se te da un programa que tiene la intencion de tomar la puntuacion de tom en 1 y disminuir la puntuacion
        de bob en 1.
        Pero algo esta mal: el programa genera las puntuacion sin el cambio.

        ambos jugadores tenian 5 puntos al comienzo del juego. Despues del primer juego, tom gano 1 ( 6, el
        primer numero emtido) y bob perdio 1 punto ( 4,el segundo numero emitido).

         */



        int Tom = 5;
        int Bob = 5;

        System.out.println(  Tom++);


        System.out.println( Bob--);
    }
}