/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exgenerics;

/**
 *
 * @author dam1
 */
public class Container <T> {
    private T data;
    public Container(){
        
    }

    public T getData() {
        return data;
    }

    public void setData(T value) {
        this.data = value;
    }
    
}
