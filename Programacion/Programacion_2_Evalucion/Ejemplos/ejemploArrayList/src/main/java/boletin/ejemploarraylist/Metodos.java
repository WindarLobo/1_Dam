package boletin.ejemploarraylist;

import java.util.ArrayList;

public class Metodos {

    ArrayList lista = new ArrayList();// pidemos meter cualquier tipo de datos

    public void Crear() {
        lista.add(2);
        lista.add("aaaaaaa");
        lista.add(2.3);
        lista.add('b');
                
    }
    
    public void ver(){
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println(" ");
        
    }
    

}
