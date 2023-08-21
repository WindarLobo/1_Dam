package modelo;

import java.time.LocalDate;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private String apellidos;
    private double salarioBase;
    private int IdEmpleado;
    private LocalDate fechaDeIngreso;

    public Empleado(String dni, String nombre, String apellidos, double salarioBase, LocalDate fechaDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.fechaDeIngreso = fechaDeIngreso;
        

    }

    public Empleado(int IdEmpleado, String nombre, String apellidos, String dni, double salarioBase, LocalDate fechaDeIngreso) {
        this.IdEmpleado = IdEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.fechaDeIngreso = fechaDeIngreso;

    }

    public Empleado() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public abstract double calcularSalario();

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

}
