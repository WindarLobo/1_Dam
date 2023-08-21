package ejemploeherdanza;

public class Estudiante extends Persona {

    private String nomeCole;
    private String nivel;

    public Estudiante() {
    
    }

    public Estudiante(String nome, String direccion, String cole, String nivel) {

        super(nome, direccion);
        nomeCole =cole;
        this.nivel = nivel;
    }
     public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getNomeCole() {
        return nomeCole;
    }
    

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return (super.toString() ) + " \n nomeCole =" + nomeCole + "\n nivel = " + nivel;
    }

   

}
