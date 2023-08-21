package modelo;

import java.time.LocalDate;

public class Permanente extends Empleado {

    private int clientesCaptados;

   public Permanente(String dni, String nombre, String apellidos, int clientesCaptados, double salarioBase, LocalDate fechaDeIngreso) {
        super(dni, nombre, apellidos, salarioBase,fechaDeIngreso);
        this.clientesCaptados = clientesCaptados;

    }
   public Permanente(int IdEmpleado,String nombre, String apellidos,String dni,  int clientesCaptados, double salarioBase, LocalDate fechaDeIngreso) {
        super(IdEmpleado, nombre, apellidos,dni, salarioBase, fechaDeIngreso);
        this.clientesCaptados = clientesCaptados;
   }
    public Permanente() {
       super();
   }
    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }
  
    @Override
  public  double calcularSalario() {
        return super.getSalarioBase() + (clientesCaptados * 100);

    }


}

