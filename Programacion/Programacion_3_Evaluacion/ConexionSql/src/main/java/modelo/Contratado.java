package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Contratado extends Empleado {

    public Contratado(String dni, String nombre, String apellidos, double salarioBase, LocalDate fechaDeIngreso) {
        super(dni, nombre, apellidos, salarioBase, fechaDeIngreso);
    }

    public Contratado(int IdEmpleado, String nombre, String apellidos, String dni, double salarioBase, LocalDate fechaDeIngreso) {
        super(IdEmpleado, nombre, apellidos, dni, salarioBase, fechaDeIngreso);
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

}
