package boletin13;

import com.windar.otropaquete.Personal;

public class Boletin13 {

   

 
    public static void main(String[] args) {
        Personal obx1 = new Personal("85848756", "win@gmail.com");
    
        Academia obx2 = new Academia("Windar \n",0,obx1);
        obx2.devolverValorNota();
   

        System.out.println(obx2.toString());        
        

    }

}
