package boletin34;

import java.time.LocalDate;

public class Permanente extends Empleado {

    private int clientesCaptados;

    public Permanente(String dni, String nombre, String apellidos, int clientesCaptados, double salarioBase, LocalDate fechaDeIngreso) {
        super(dni, nombre, apellidos, salarioBase, fechaDeIngreso);
        this.clientesCaptados = clientesCaptados;

    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (clientesCaptados * 100);

    }

    @Override
    public String toString() {
        return super.toString() +"\nClientes Contratados : "+ clientesCaptados;
    }

}
