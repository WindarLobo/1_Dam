package com.mycompany.boletin8;

public class Circulo {

    private double radio;
  
    static final double PI = 3.1415;

    public Circulo(double radio) {
        this.radio = radio;

    }

    public Circulo() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;

    }

    public double getSuperficie3() {
      return  PI * Math.pow(radio, 2);
        
    }

    
}
