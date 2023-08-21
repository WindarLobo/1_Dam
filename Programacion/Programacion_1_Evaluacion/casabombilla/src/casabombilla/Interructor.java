package casabombilla;

public class Interructor {

    private Bombilla bombilla1;
    private Bombilla bombilla2;
    private Bombilla bombilla3;
    private boolean estaEncendido;

    public Interructor(Bombilla bombilla1, Bombilla bombilla2, Bombilla bombilla3, boolean estaEncendido) {
        this.bombilla1 = bombilla1;
        this.bombilla2 = bombilla2;
        this.bombilla3 = bombilla3;
        this.estaEncendido = estaEncendido;

    }

    public Bombilla getBombilla1() {
        return bombilla1;

    }

    public Bombilla getBombilla2() {
        return bombilla2;

    }

    public Bombilla getBombilla3() {
        return bombilla3;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
        bombilla1.setEstaEncendida(estaEncendido);
        bombilla2.setEstaEncendida(estaEncendido);
        bombilla3.setEstaEncendida(estaEncendido);

    }

    public String getEstaEncendido() {
        if (estaEncendido == true) {
            return "El interructor encendido";
        } else {

            return "El interructor apagado";
        }

    }

    public String getestadoBombillas() {
        return "bombilla1:" + bombilla1.getEstaEncendida() + "\n" + 
               "bombilla2:" + bombilla2.getEstaEncendida() + "\n" + 
               "bombilla3:" + bombilla3.getEstaEncendida() + "\n";
    }
}
