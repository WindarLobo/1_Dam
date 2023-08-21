public class Coche {
    private String color;
    private boolean aireAcondicionado;
    private int numeroDePuertas;
    private boolean tapizadoDeCuero;
    private int ano;
    private String marca;
    private String modelo;

    public Coche(String color, boolean aireAcondicionado, int numeroDePuertas, boolean tapizadoDeCuero, int ano, String marca, String modelo) {
        this.color = color;
        this.aireAcondicionado = aireAcondicionado;
        this.numeroDePuertas = numeroDePuertas;
        this.tapizadoDeCuero = tapizadoDeCuero;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche() {
        color = "negro";
        numeroDePuertas = 4;
        ano = 2023;
        marca = null;
        modelo = null;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isTapizadoDeCuero() {
        return tapizadoDeCuero;
    }

    public void setTapizadoDeCuero(boolean tapizadoDeCuero) {
        this.tapizadoDeCuero = tapizadoDeCuero;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "color = " + color + "\n" +
                        " aireAcondicionado = " + aireAcondicionado + "\n" +
                        " numeroDePuertas = " + numeroDePuertas + "\n" +
                        " tapizadoDeCuero = " + tapizadoDeCuero + "\n" +
                        " ano = " + ano + "\n" +
                        " marca = " + marca + "\n" +
                        " fabricar = " + modelo + "\n";

    }
}
