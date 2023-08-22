import Tipos.TipoDeMasa;
import Tipos.TipoDePizza;
import Tipos.TipodeSalsa;

public class Main {
    public static void main(String[] args) {
        Pizzas pizzas1 = new Pizzas(TipoDeMasa.fina, true, TipoDePizza.familiar, TipodeSalsa.salsaSinGluteo, true, false, true, false, true, true);
        System.out.println("La primera pizza: \n" + pizzas1.toString());

        Pizzas pizzas2 = new Pizzas(TipoDeMasa.integral, true, TipoDePizza.mediana, TipodeSalsa.salsaDeBarbacoa, false, true, false, false, true, false);
        System.out.println("La segunda pizza: \n" + pizzas2.toString());


    }

}
