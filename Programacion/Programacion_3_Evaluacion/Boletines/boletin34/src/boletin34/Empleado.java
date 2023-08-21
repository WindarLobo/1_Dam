package boletin34;

import java.time.LocalDate;



public  abstract  class   Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
      private double salarioBase;
    private LocalDate  fechaDeIngreso;

    public Empleado(String dni, String nombre, String apellidos,double salarioBase, LocalDate fechaDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase=salarioBase;
        this.fechaDeIngreso=fechaDeIngreso;
    
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
    

    public LocalDate  getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate  fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return  "\ndni:" + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEL salario Base es: " +salarioBase+ "€" + "\nFecha de Ingreso : " +fechaDeIngreso ;
    }
    
    
    
}
