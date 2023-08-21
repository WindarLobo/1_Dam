
package com.mycompany.boletin6_3;


public class Circulo {
     
    private double radio;
    public static final double PI=3.14;
    
    public Circulo(double radio,){
        
        this.radio=radio;
        
    }
    public Circulo(){
        
    }
    public double setRadio(){
        return radio;
        
    }
    public void getRadio(double radio){
        this.radio=radio;
    }
    

  public double AreaCirculo(){
        double areaCirculo =  PI *Math.pow(radio, 2);
        return areaCirculo;
 
    } 
    
    public double Longitud(){
        
       double  longitud = 2 * PI * radio;
         return longitud;
       
    }

}

