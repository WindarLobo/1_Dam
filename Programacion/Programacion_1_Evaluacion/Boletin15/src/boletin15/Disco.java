package boletin15;

/**
 * @author dam1
 * @version 25.11.2022
 */
class Disco extends Multimedia {


    private String genero;

    /**
     *
     * @param genero
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     */

    public Disco(String genero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    /**
     * Contructor vacio
     */
    public Disco() {

    }

    /**
     * setter
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Getter
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     * tosString
     * @return
     */
    @Override
    public String toString() {
        return (super.toString()) + " \n genero : " + genero;
    }

}
