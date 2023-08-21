package javaapplication25;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        String tipoDeCoche = JOptionPane.showInputDialog("Que tipo de coche deseas (C/D) ");
        switch (tipoDeCoche.toUpperCase()) {

            case "C":

                Camion Camion2 = new Camion("Citroe", 50, true);
                Camion2.Arrancar();
                Camion2.Acelera();
                Camion2.setColor("amarrillo");
                System.out.println(Camion2.toString());
                break;

            case "D":
                Deportivo depor = new Deportivo("Mercedez", 80, false);
                depor.Arrancar();
                depor.Acelerar();
                 depor.Acelerar();

                depor.setColor("Rojo");
                System.out.println(depor.toString());
                break;
        }

    }

}
