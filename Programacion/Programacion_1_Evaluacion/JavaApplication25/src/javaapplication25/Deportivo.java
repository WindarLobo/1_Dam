
package javaapplication25;

import com.windar.base.Vehiculo;


public class Deportivo extends Vehiculo {

    public Deportivo() {
    }

    public Deportivo(String modelo, double velocidadMaxima, boolean tieneABS) {
        super(modelo, velocidadMaxima, tieneABS);
    }
    
     public void Acelerar(){
        super.Acelerar(20);
       
        }
     public void Frenar(){
         super.Frenar(20);
    
    }
    
}
