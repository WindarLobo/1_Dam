package boletin15;
/**
 * @author dam1
 * @version 25.11.2022
 */

public class Pelicula extends Multimedia {


    private String actorPrincipal;
    private String actrizPrincipal;

    /**
     *
     * @param actorPrincipal
     * @param actrizPrincipal
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     */
    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, float duracion) {

        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }


    /**
     * Contructor por defecto
     */

    public Pelicula() {
    }

    /**
     * get
     * @return
     */
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    /**
     * get
     * @return
     */
    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    /**
     * set
     * @param actorPrincipal
     */
    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    /**
     * set
     * @param actrizPrincipal
     */
    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    /**
     *  toString
     * @return
     */
    @Override
    public String toString() {
        return (super.toString()) + " \n actorPrincipal : " + actorPrincipal + "\n actrizPrincipal : " + actrizPrincipal;
    }

}
