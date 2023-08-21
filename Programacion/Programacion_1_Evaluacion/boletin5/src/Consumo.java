public class Consumo {

    //Atributos
    private int kilometros;
    private int litros;
    private float velocidadMedia;
    private float precioGasolina;

    //Constructores
    public Consumo(int kilometros, int litros, float velocidadMedia, float precioGasolina) {
        this.kilometros = kilometros;
        this.litros = litros;
        this.precioGasolina = precioGasolina;
        this.velocidadMedia = velocidadMedia;
    }

    //Constructor por defecto
    public Consumo() {
    }

    //getters and setterrs
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public float getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(int velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public float getPrecioGasolina() {
        return precioGasolina;
    }

    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }
    public float getConsumoMedio() {
      return (litros * 100) / kilometros;
    }

    public float getTiempo() {
        return velocidadMedia * kilometros;
    }

    public float getConsumoEuros() {
        return litros * precioGasolina;
    }	
	
	
}