
package com.mycompany.boletin6;

public class Coche {
    private  int velocidad;
    
    public Coche(int velocidad){
     this.velocidad= velocidad;
       

     }
    public int getVelocidad(){
       return velocidad;
    }
   
    public void Acelerar (int valor){ 
     this.velocidad +=valor;
}
   
    public void Frenar (int valor){
      this.velocidad -= valor;
    }
 
}
                                                                                         