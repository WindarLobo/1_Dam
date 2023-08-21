
package ejemploeherdanza;


public class Profesor extends Persona{
    private String materia;

    public Profesor(String materia, String nome, String direccion) {
        super(nome, direccion);
        this.materia = materia;
    }

    public Profesor() {
    }

    @Override
    public String toString() {
        return (super.toString() ) + " \n materia = " + materia ;
        
    }
    
    
    
    
    
}

