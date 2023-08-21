
package com.mycompany.ejemplocondicional;

/**
 *
 * @author dam1
 */
public class CondicionalAnidados {
    public void verEdad(int edad){
        if (edad>18)
            System.out.println("Es mayor de 18");
        
        else if (edad==18)
        
           System.out.println("Tiene 18 años");
        
        else
        
        System.out.println("es menor que  18");
    }
    
    public void verDia(int dia){
        
    
        if(dia == 1)
            System.out.println("Lunes");
        
        
           else if(dia ==2)
                System.out.println("Martes");
            
              else if(dia == 3)
                System.out.println("Miercoles");
                    
                else if(dia == 4)
                System.out.println("Jueves");
                    
                  else if(dia == 5)
                    System.out.println("Viernes");
        
                    else   if(dia == 6)
                       System.out.println("Sabados =D");
        
                       else  if(dia == 7)
                          System.out.println("Domingo");
        
                              else
                                 System.out.println(" ******* Error no hay dia ***** ");
            
            
        }
    
    public void verDiaSwitchCase(int dia){
        
        switch(dia){
                 case 1:
                System.out.println("Lunes");
                break;
                
                 case 2:
                System.out.println("Martes");
                break;
                
                 case 3:
                System.out.println("Miercoles");
                break;
                
                 case 4:
                System.out.println("Juves");
                break;
                
                 case 5:
                System.out.println("Viernes");
                break;
                
                 case 6:
                System.out.println("Sabado");
                break;
                
                 case 7:
                System.out.println("Domingo");
                break;
                
                default:
                System.out.println("Error");
                
                
        }
               
                   
            
        }
}
        
        
        
        
        
        
    
    
    
    

    
    
    
    




    

