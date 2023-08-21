public class Libro {

    private String titulo;
    private String autor;
    private int ano;
    private short numerodepaginas;
    private float valoracion;

    public Libro(String titulo, String autor, int ano, short numerodepaginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numerodepaginas = numerodepaginas;

    }
    //El  constructor por defecto

    public Libro() {
    }
    //getters and setterrs

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(short numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    //metodos
    public void mostrar() {

        System.out.println("El titulo es : " + titulo);
        System.out.println("El autor es : " + autor);
        System.out.println("El libro es del ano  es : " + ano);
        System.out.println("El libro tiene : " + numerodepaginas + " paginas ");
        System.out.println("La Valoracion es  : " + valoracion);


    }

}