package boletin11;

import javax.swing.JOptionPane;


public class Boletin11_5 {

    public void programaSalario() {

        int salario;
        int empleadosTotales = 0;
        int empleadosQueGanaMenosDe1000 = 0;
        int empledosDelIntervalo = 0;

        do {

            salario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su salario"));

            if (salario >= 0) {

                if (salario == 0) {
                    break;
                } else if (salario < 1000) {
                    empleadosQueGanaMenosDe1000++;
                } else if (salario >= 1000 && salario <= 1750) {
                    empledosDelIntervalo++;
                }

                empleadosTotales++;

                System.out.println("El porcentaje de empleados que gana menos de mil euros es: " + (empleadosQueGanaMenosDe1000 * 100) / empleadosTotales + "%");
                System.out.println("El numero de trabajadores que ganan entre 1000 y 1750 es: " + empledosDelIntervalo);
            } else {
                System.out.println("No se admiten sueldos negativos");
            }
        } while (salario != 0);

    }
}

