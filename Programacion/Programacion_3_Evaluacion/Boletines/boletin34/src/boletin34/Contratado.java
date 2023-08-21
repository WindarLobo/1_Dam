package boletin34;

import java.time.LocalDate;
import java.time.Period;

public class Contratado extends Empleado {

    public Contratado(String dni, String nombre, String apellidos, double salarioBase, LocalDate fechaDeIngreso) {
        super(dni, nombre, apellidos, salarioBase, fechaDeIngreso);

    }

    @Override
    public double calcularSalario() {
        double porcentajeAdicional;

        LocalDate fechtaActual = LocalDate.now();

        Period period = super.getFechaDeIngreso().until(fechtaActual);

        int totalDeAños = period.getYears();

        if (totalDeAños <= 3) {
            porcentajeAdicional = 0.05;
        } else if (totalDeAños <= 7) {
            porcentajeAdicional = 0.10;
        } else if (totalDeAños <= 15) {
            porcentajeAdicional = 0.15;
        } else {
            porcentajeAdicional = 0.20;
        }
        return super.getSalarioBase() * (1 + porcentajeAdicional);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
