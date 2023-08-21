
package ejemploeherdanza;

public class EstudianteInternacional extends Estudiante {
    private String pais;

    public EstudianteInternacional() {
      
    }

    public EstudianteInternacional(String nome, String direccion, String cole, String nivel,String pais ) {
      
        super(nome, direccion, cole, nivel);
        this.pais = pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return  (super.toString() ) + " \n pais = " + pais;
    }
    
    
}
