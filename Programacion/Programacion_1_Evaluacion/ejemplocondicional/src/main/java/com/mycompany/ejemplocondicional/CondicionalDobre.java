
package com.mycompany.ejemplocondicional;

public class CondicionalDobre {
    public void ConsultaEdad(int edad){
        
        if(edad>=18){
            
            System.out.println("Es mayor de edad");
        }
        
        else{
        System.out.println("Es menor");
    } 
       
              
    }
     public void operarEdad(int edad){
           String res=(edad>=18)? "Es mayor edad": "Es menor edad";
           System.out.println(res);
       }
}
