package boletinextra;


import com.windar.datos.PedirDatos;
import java.util.Collections;
import java.util.LinkedList;

public class Impresora {
    LinkedList Cola = new LinkedList();
   
    

   public void  encolar(String datos){
        datos = PedirDatos.pedirString("introduce lo que quieres imprimir");
       Cola.addFirst(datos);
      
   
   }

    public String desenColar( ) {
       return (String) Cola.removeLast();
        
        
    }
    

    public void mostrar( LinkedList Cola) {
        
        System.out.println(Cola);
       
        
    }

    public void ordenar( LinkedList Cola  ){
        Collections.sort(Cola);
    }
        

}
