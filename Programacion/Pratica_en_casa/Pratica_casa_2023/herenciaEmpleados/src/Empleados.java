import java.util.Date;

public class Empleados {

    private String dni;
    private Date fechaDeNacimiento;
    private Date fechaDeContratacion;
    private String nombre;
    private double salario;
     static double salarioBase =1000;

    public Empleados( String dni,Date fechaDeNacimiento,Date nombre,String fechaDeContratacion,double salario) {
        this.dni=dni;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.fechaDeContratacion=fechaDeContratacion;
        this.nombre=nombre;
        this.salario=salarioBase + (añosdeantiguedad/3)*salarioBase*0,05;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(String fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleados.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "dni='" + dni + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
