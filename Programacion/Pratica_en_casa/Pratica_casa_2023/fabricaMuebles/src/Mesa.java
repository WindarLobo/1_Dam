public class Mesa extends Mueble {
private String forma;
private int personasQueCaben;
    public Mesa(String nombre, float precio, String forma,int personasQueCaben) {
        super(nombre, precio);
        this.forma = forma;
        this.personasQueCaben=personasQueCaben;
    }

    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public int getPersonasQueCaben() {
        return personasQueCaben;
    }
    public void setPersonasQueCaben(int personasQueCaben) {
        this.personasQueCaben = personasQueCaben;
    }
    @Override
    public String toString() {
        return super.toString() + "," + forma  + ","+"de " +  personasQueCaben + " Plazas ";
    }
}
