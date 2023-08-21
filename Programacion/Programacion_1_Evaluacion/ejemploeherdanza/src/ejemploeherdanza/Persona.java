package ejemploeherdanza;

public class Persona {

    private String nome;
    private String direccion;

    public Persona() {

    }

    public Persona(String nome, String direccion) {
        this.nome = nome;
        this.direccion = direccion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return " nome= " + nome +  "\n direccion = " + direccion ;
    }
    
    
}
