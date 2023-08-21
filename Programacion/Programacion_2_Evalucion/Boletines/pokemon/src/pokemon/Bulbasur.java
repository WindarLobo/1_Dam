
package pokemon;

    public class Bulbasur extends DatosComunes implements Planta{

    public Bulbasur(String nome, int numPokedex, String sexo, float peso, int temporada) {
        super(nome, numPokedex, sexo, peso, temporada);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con placaje");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con mordisco");
    }

    @Override
    public void atacarArañazo() {
       System.out.println("Soy " + super.getNome() + "y estoy atacando con Arañazo"); 
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy " + super.getNome() + "y estoy atacando con Latigo cepa");
    }
    

    
}
