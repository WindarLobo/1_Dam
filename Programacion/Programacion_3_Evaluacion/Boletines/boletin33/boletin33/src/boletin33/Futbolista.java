package boletin33;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    public void entrevista() {
        System.out.println("No tienes entrevista ");

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
      void planificarEntrenamiento(){
        System.out.println("No tiene planifacion");
        
    }
      @Override
    public void concentrarse() {
          System.out.println("futbolista no se  concentrarse");
    }

    @Override
    public void viajar() {
        System.out.println("Futbolista Viajar");
       
    }

   
    @Override
    public void entrenar() {
        System.out.println("Futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }


    @Override
    public String toString() {
        return super.toString()+ "\nDorsal: " + dorsal + "\nDemarcacion: " + demarcacion;
    }

}
