
package boletin16;

public class Persona {
    private String nome;
    private String apellido;
    private String nif;

    public Persona(String nome, String apellido, String nif) {
        this.nome = nome;
        this.apellido = apellido;
        this.nif = nif;
    }

    public Persona() {
    }

    public String getNome() {
        return nome;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return   nome + "  " + apellido + " \n con  nif = " + nif ;
    }
    
    
}
