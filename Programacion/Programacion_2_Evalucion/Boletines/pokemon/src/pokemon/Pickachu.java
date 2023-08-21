
package pokemon;


public class Pickachu extends DatosComunes implements Electrico{

    public Pickachu(String nome, int numPokedex, String sexo, float peso, int temporada) {
        super(nome, numPokedex, sexo, peso, temporada);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Placaje");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Mordisco");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Arañazo");
    }
        

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Impactrueno");
    }
    
    @Override
    public void atacarPuñoTrueno() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Puño trueno");
    }
    
    @Override
    public void atacarRayo() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Rayo");
    }
  
    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Rayo cara");
    }
    
}    

