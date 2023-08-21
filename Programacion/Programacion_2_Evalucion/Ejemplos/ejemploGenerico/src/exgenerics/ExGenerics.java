/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exgenerics;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class ExGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Container <Xogador> obx= new Container<>();
        Xogador x1 = new Xogador("Aspas",3);
        obx.setData(x1);
        System.out.println(obx.getData());
        */
        GCollection <Integer> obx = new GCollection<>();
        GCollection <Float> obx1 = new GCollection<>();
        ArrayList <Integer> lista = new ArrayList<>();
        ArrayList<Float>list = new ArrayList<>();
        obx.engadir(5, lista);
        obx.engadir(7, lista);
        obx.engadir(3, lista);
        obx1.engadir(11.8f, list);
        obx1.engadir(2.6f, list);
        obx1.engadir(3.9f, list);
        obx.amosarOrde(lista);
        obx1.amosarOrde(list);
        System.out.println("xogadores:");
        GCollection<Xogador> X = new GCollection<>();
        ArrayList<Xogador> listX = new ArrayList<>();
        X.engadir(new Xogador("Priscilla",1), listX);
        X.engadir(new Xogador("Cecilia",2), listX);
        X.engadir(new Xogador("Quintilia",3), listX);
        X.amosarOrde(listX);
    }
}
