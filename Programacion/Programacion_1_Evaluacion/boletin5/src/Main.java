public class Main {
    public static void main(String[] args) {

        //Creando el objecto Cosumo

        //a)
        Consumo consumo1 = new Consumo(); // creando un objecto de tipo cnsumo

        //b)
        consumo1.setLitros(50);
        consumo1.setPrecioGasolina(1.57f);
        //c)
        Consumo consumo2 = new Consumo(200, 10, 95.5f, 55.50f);

        //d)
        System.out.println("El consumo medio es : " + consumo2.getConsumoMedio());

        //e)
        consumo2.setLitros(30);

        //f)
        System.out.println("La velocidad media es : " + consumo2.getVelocidadMedia());



    }
}