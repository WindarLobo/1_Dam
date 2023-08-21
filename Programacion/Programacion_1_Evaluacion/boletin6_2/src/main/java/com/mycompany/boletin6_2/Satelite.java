
package com.mycompany.boletin6_2;


public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
     public Satelite(double  meridiano,double paralelo,double distanciaTerra){
        
       this.meridiano = meridiano;
       this.paralelo = paralelo;
        this.distanciaTerra = distanciaTerra;
     }
  
    public Satelite(){
     
    }
    public double Meridiano(){
        return meridiano;
        
    }
    public void Meridiano(double meridiano){
       this.meridiano=meridiano;    
    }
    
  public double Paralelo(){
       return paralelo;
  }
   public void Pararelo (double paralelo){
       this.paralelo=paralelo; 
   }
   
  public double DistanciaTerra(){
      return distanciaTerra;
  }
   public void DistanciaTerra (double distanciaTerra){
       this.distanciaTerra=distanciaTerra;    
  }
   
    public void verPosicion(){
       
 System.out.println("o satelite atopase  no paralelo " + paralelo + " km "  + " meridiano " +  meridiano + " km " + " a unha distancia da terra " + distanciaTerra + " km/h " );  

        
    }
  
    }
    
  
      

    

