
package com.mycompany.boletinconcionales;

import javax.swing.JOptionPane;


public class Condicionales3 {
    public void organizacionDeEscuela(){
       
        System.out.println("Este programa calcula el precio a pagar por alumno en  \n"
        + "el viaje fin de curso, según la cantidad que se apunte: \n ");
        
        int numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos son? "));
        
        
        if(numeroAlumnos>=100)
            System.out.println("El pago por cada alumno es de 65 Euros \n"  + "El pago de la agencia es  : " + numeroAlumnos*65 + "Euros" );
        else if (numeroAlumnos<100 && numeroAlumnos>=50 )
            System.out.println("El pago por cada alumno es de 70 Euros \n"  + "El pago de la agencia es  : " + numeroAlumnos*70 + "Euros"  );
        else if (numeroAlumnos<50 && numeroAlumnos>=30 )
            System.out.println("El pago por cada alumno es de 95  Euros \n"  + "El pago de la agencia es  : " + numeroAlumnos*95 + "Euros" );
        else {
            System.out.println("El coste de la renta del autobus es de 4000 Euros \n"  + " El pago  de cada alumno es   : " + (4000/numeroAlumnos) + " Euros " );
        }
    }
    
}
/*O director dunha escola está a organizar unha viaxe de estudos e require determinar canto debe cobrar a cada alumno e canto debe pagar á compañía de viaxes polo servizo. A forma de cobrar é a seguinte: 
* Se son 100 alumnos ou máis, o custo por cada alumno é de 65 euros.
 * De 50 a 99 alumnos, o custo é de 70 euros. 
* De 30 a 49 alumnos, o custo é de 95 euros. 
* Menos de 30 alumnos, o custo da renda do autobús é de 4000 euros, sen importar o número de alumnos.
 Realiza un algoritmo que permita determinar o pago á compañía de autobuses e o que debe pagar cada alumno pola viaxe.

*/
