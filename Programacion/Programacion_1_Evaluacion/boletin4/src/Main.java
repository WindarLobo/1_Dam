public class Main {
    public static void main(String[] args) {
        //Creando el objecto libro


        Libro libro1 = new Libro("******* Sin tetas no hay paraiso ****** ", "Gustavo Bolivar", 2015, (short) 193);

        Libro libro2 = new Libro();

        libro2.setTitulo(" ***** Al amanecer entederas la vida ***** ");
        libro2.setAutor("Gustavo Bolivar");
        libro2.setAno(2005);
        libro2.setNumerodepaginas((short) 240);
        libro2.setValoracion(9.1f);
        libro1.setValoracion(9.5f);

        libro1.mostrar();
        libro2.mostrar();

    }

}