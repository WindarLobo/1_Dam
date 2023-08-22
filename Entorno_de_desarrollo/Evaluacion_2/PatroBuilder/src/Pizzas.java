import Tipos.TipoDeMasa;
import Tipos.TipoDePizza;
import Tipos.TipodeSalsa;

public class Pizzas {
    private TipoDeMasa tipoDeMasa;
    private boolean relleno;

    private TipoDePizza size;

    private TipodeSalsa salsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;


    public Pizzas(TipoDeMasa tipoDeMasa, boolean relleno, TipoDePizza size, TipodeSalsa salsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.tipoDeMasa = tipoDeMasa;
        this.relleno = relleno;
        this.size = size;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;


    }

    @Override
    public String toString() {
        return
                " tipoDeMasa=" + tipoDeMasa + "\n" +
                        " relleno=" + relleno + "\n" +
                        " size=" + size + "\n" +
                        " salsa=" + salsa + "\n" +
                        " cebolla=" + cebolla + "\n" +
                        " sinGluten=" + sinGluten + "\n" +
                        " extraQueso=" + extraQueso + "\n" +
                        " piña=" + piña + "\n" +
                        " champiñones=" + champiñones + "\n" +
                        " jamon=" + jamon + "\n";
    }
}
