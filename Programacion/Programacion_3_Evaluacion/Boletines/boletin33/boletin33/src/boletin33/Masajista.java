package boletin33;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int añoDeExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int añoDeExperiencia) {
        super(id, nombre, apellido, edad);
        this.añoDeExperiencia = añoDeExperiencia;
        this.titulacion = titulacion;
    }

    void darMasaje() {
        System.out.println("Le toca  un masaje");

    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñoDeExperiencia() {
        return añoDeExperiencia;
    }

    public void setAñoDeExperiencia(int añoDeExperiencia) {
        this.añoDeExperiencia = añoDeExperiencia;
    }
     public void concentrarse() {
          System.out.println("El masajista no se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("Masajista Viaja");
       
    }

   
    @Override
    public void entrenar() {
        System.out.println("Masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega un partido");
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitulacion: " + titulacion + "\na\u00f1oDeExperiencia: " + añoDeExperiencia ;
    }

 

}
