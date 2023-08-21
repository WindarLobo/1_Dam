package com.windar.metodos;

public class Libro implements Comparable<Libro> {

    private String titulo;
    private String autor;
    private String iSBN;
    private double precio;
    private int numeroUnidad;

    public Libro(String titulo, String autor, String iSBN, double precio, int numeroUnidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.iSBN = iSBN;
        this.precio = precio;
        this.numeroUnidad = numeroUnidad;
    }

    public Libro() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    @Override
    public int compareTo(Libro libro) {

        Libro libros = (Libro) libro;
        if (this.titulo.compareToIgnoreCase(libros.titulo) > 0) {
            return 1;
        } else if (this.titulo.compareToIgnoreCase(libros.titulo) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "\n titulo es :" + titulo + "\n autor :" + autor + "\n iSBN :" + iSBN + "\n precio :" + precio + "\n numeroUnidad :" + numeroUnidad + "\n";
    }

}
