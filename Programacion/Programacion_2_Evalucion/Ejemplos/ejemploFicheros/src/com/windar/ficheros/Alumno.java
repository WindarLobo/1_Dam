package com.windar.ficheros;

public class Alumno {

    private String nome;
    private int nota;
    private int edad;
    private String direccion;
    private double peso;
         

    public Alumno(String nome, int nota,int edad,String direccion,double peso) {
        this.nome = nome;
        this.nota = nota;
        this.edad=edad;
        this.direccion=direccion;
        this.peso=peso;
    }

    public Alumno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + "," + nota +","+ edad + "," + direccion + "," + peso;
    }

}
