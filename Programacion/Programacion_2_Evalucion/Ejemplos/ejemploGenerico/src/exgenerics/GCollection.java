/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exgenerics;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author dam1
 */
public class GCollection <T> {
    public <T> void engadir (T ele,ArrayList<T>lista){
        lista.add(ele);
    }
    public <T> void amosar (ArrayList<T>lista){
        for(T ele: lista){
            System.out.println(ele);
        }
    }
    public <T> void amosarOrde (ArrayList<T>lista){
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());
        for(T ele: lista){
            System.out.println(ele);
        }
    }
}
