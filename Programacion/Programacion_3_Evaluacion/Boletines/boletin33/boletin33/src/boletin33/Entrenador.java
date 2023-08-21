
package boletin33;


public class Entrenador extends SeleccionFutbol {
    
    private int idFederacio;

    public Entrenador(int id, String nombre, String apellido, int edad,int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacio=idFederacion;
    }

    public int getIdFederacio() {
        return idFederacio;
    }

    public void setIdFederacio(int idFederacio) {
        this.idFederacio = idFederacio;
    }
    
    void planificarEntrenamiento(){
        System.out.println("No tiene planifacion");
        
    }
      @Override
    public void concentrarse() {
          System.out.println("Entrenador no se Concentra");
    }

    @Override
    public void viajar() {
        System.out.println("Entrenador Viaja");
       
    }

   
    @Override
    public void entrenar() {
        System.out.println("Entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega un partido");
    }

     @Override
    public String toString() {
        return  super.toString() + "\nIdFederacio: " + idFederacio ;
    }

}
