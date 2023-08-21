
package ficheroserializado;

import java.io.Serializable;


public class AlumnadoSerializado implements Serializable {


    private String nome;
    private int nota;

    public AlumnadoSerializado(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public AlumnadoSerializado() {
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
        return nome + ", " + nota;
    }

}

    

