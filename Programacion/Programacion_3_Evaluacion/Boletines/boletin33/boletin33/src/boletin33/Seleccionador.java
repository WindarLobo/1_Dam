
package boletin33;


public class Seleccionador extends SeleccionFutbol{
    
    public Seleccionador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }
     void seleccionarXogador(){
        System.out.println("Selecion de jugador");
        
    }
       void planificarEntrenamiento(){
        System.out.println("No tiene planifacion");
        
    }
      @Override
    public void concentrarse() {
          System.out.println("Seleccion de futbol Concentrarse");
    }

    @Override
    public void viajar() {
        System.out.println("Seleccion Viaja");
       
    }

   
    @Override
    public void entrenar() {
        System.out.println("Seleccion entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El Seleccionador juega un partido");
    }

      @Override
    public String toString() {
        return super.toString();
    }

    
}
