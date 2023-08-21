

package com.mycompany.ejemplocondicional;

import javax.swing.JOptionPane;


public class Ejemplocondicional {

    public static void main(String[] args) {
       
        
       
                
       
     
         //String res = JOptionPane.showInputDialog("teclee edad");
        //int edad = Integer.parseInt(res );
       //obx.verEdad(18);
      
       
        
        
       //String res = JOptionPane.showInputDialog("teclee edad");
        //int edad = Integer.parseInt(res ); //  utilizamos el metodo integer con el submetodo parseint
       //JOptionPane.showConfirmDialog(null, " Su edad es : " +  edad); // utilizo un metodo de  JOptionPane tiene uns sintancis lo dejamos nulo
      //null maneja todos  parametro y  aparece el icono del cuadro dialogo
      
      // CondicionalDobre obx = new CondicionalDobre();
       // obx.ConsultaEdad(edad);
       //obx.operarEdad(edad);
                  //CondicionalAnidados obx =  new CondicionalAnidados();
         //int edad = pedirInt("dame valor edad");
    //obx.verEdad(edad);
    CondicionalAnidados obx =  new CondicionalAnidados();
    int dia = pedirInt("Introduce el dia");
    obx.verDia(dia);

    
        
       
    }
 public   static int  pedirInt(String mensaje) {
     return Integer.parseInt(JOptionPane.showInputDialog(mensaje)); 
     
 }  
// public void ver(){
    // pedirInt("dame valor");
  
 }

