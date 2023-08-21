package com.windar.base;

public class Vehiculo {

    // atributos
    private String modelo;
    private Double velocidad;
    private double velocidadMaxima;
    private boolean tieneABS;
    private boolean estaArrancando;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, double velocidadMaxima, boolean tieneABS) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneABS = tieneABS;
        this.velocidad = 0.0;
        this.color = color;

    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean getTieneABS() {
        return tieneABS;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public void Acelerar(double velocidad) {

        if (this.estaArrancando) {
            this.velocidad += velocidad;
            if (this.velocidad + velocidad > velocidadMaxima) {
                this.velocidad = velocidadMaxima;

            } else {
                this.velocidad += velocidad;

            }

        }

    }

    public void Frenar(double velocidad) {

        if (this.estaArrancando) {
            if (this.tieneABS) {
                this.velocidad -= velocidad + 1;
            } else {
                this.velocidad -= velocidad;

            }
        }

    }

    public void Arrancar() {
        this.estaArrancando = true;

    }

    public void Apagar() {
        this.estaArrancando = false;

    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo \n " + " modelo = " + modelo + "\n velocidad = " + velocidad + "\n velocidadMaxima = " + velocidadMaxima
                + "\n tieneABS = " + tieneABS + "\n estaArrancando = " + estaArrancando + "\n Color = " + color;
    }

}

/* Acelerar(velocidad) => Solo si esta arrancado
	Frenar(velocidad) => Solo si esta arrancado
	Arrancar() => EstaArrancado = true
	Apagar() => La velocidad se establece a 0km/h y EstaArrancado = false*/
