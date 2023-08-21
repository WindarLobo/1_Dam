
package pokemon;


public abstract class DatosComunes {
    
    private final int numPokedex;
    private final int temporada;
    private final String nome;
    private final String sexo;
    private final float peso;
    
    public DatosComunes(String nome, int numPokedex, String sexo, float peso,int temporada){
        this.nome = nome;
        this.numPokedex = numPokedex;
        this.sexo = sexo;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    public abstract void atacarPlacaje();
    
    public abstract void atacarMordisco();
    
    public abstract void atacarArañazo();
    
    public String getNome(){
        return nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getNumPokedex(){
        return numPokedex;
    }
    
    public int getTemporada(){
        return temporada;
    }
    
    public float getPeso(){
        return peso;
    }
    
}
