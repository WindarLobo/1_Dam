
package boletin15;
/**
 * @author dam1
 * @version 25.11.2022
 */

public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private float duracion;

    /**
     *
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     */

    public Multimedia(String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    /**
     * Contructor por defecto
     */
     public Multimedia() {
    }

    /**
     * setter
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * setter
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * setter
     * @param formato
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * setter
     * @param duracion
     */

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    /**
     * getter
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * getter
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * getter
     * @return
     */

    public String getFormato() {
        return formato;
    }

    /**
     * getter
     * @return
     */

    public float getDuracion() {
        return duracion;
    }

    /**
     * tosString
     * @return
     */

    @Override
    public String toString() {
        return "titulo : " + titulo + "\n autor : " + autor + "\n formato : " + formato + "\n duracion : " + duracion;
    }
    
}
