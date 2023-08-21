
package javaapplication25;

import com.windar.base.Vehiculo;



public class Camion  extends Vehiculo {

    public Camion() {
    }

    public Camion(String modelo, double velocidadMaxima, boolean tieneABS) {
        super(modelo, velocidadMaxima, tieneABS);
    }
    
    public void Acelera(){
        super.Acelerar(5);
       
        }
     public void Frenar(){
         super.Frenar(5);
    
    }
    
}
/* Acelerar(velocidad) => Incrementa la velocidad en 5km/h / No puede superar la velocidad maxima
	Frenar(velocidad) => Decrementa la velocidad en 5km/h  / Si tiene ABS decrementa +1km/h (6km/h)
	*/