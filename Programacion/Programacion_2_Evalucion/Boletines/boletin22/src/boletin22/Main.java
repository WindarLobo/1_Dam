package boletin22;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Futbol futbol = new Futbol();
        int[][] goles;

        goles = futbol.crearMarcador();

        int opcion = 0;

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****\n1--> Crear Marcadador \n2 ---> "
                        + " Goles por Jornadas\n3 ---> ordenar \n4 ----> Mascacion por jornada \n5---> "
                        + "EquipoMasGoles \n6---> Consultas de Equipo y  Jornada\n7 ---> Salir"));

                switch (opcion) {
                    case 1:

                        goles = futbol.crearMarcador();
                        break;
                    case 2:
                        futbol.golesDeCadaJornadas(goles);
                        break;
                    case 3:
                        //futbol.ordenar(goles, futbol.EQUIPO);
                        futbol.pintarOrdenDeMenorGoles(futbol.ordenarMenorGoles());
                        break;

                    case 4:

                        futbol.mascacionGolesMaximoPorJonada(goles);
                        break;

                    case 5:
                        futbol.equipoConMasGolesPorJornada(goles);
                        break;

                    case 6:

                        futbol.ConsultasDeEquipoYJornada(goles);
                        break;
                    default:

                        break;

                }
            } catch (Exception ex) {
                System.out.println("Error al intoducir ");
            }

        } while (opcion < 7);
    }

}
