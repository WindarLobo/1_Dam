package casabombilla;

public class Bombilla {

    private boolean estaEncendida;

    public Bombilla() {

    }

    public void setEstaEncendida(boolean estaEncendida) {
       this.estaEncendida=estaEncendida;
    }

    public String getEstaEncendida() {
        if (estaEncendida == true) {
            return "La luz esta encendida";
        } else {

            return "La luz esta apagada";
        }

    }
   

}
