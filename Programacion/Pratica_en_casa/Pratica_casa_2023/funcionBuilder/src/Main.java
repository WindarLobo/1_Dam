public class Main {
    static IFabrica Fabrica;
    public static void main(String[] args) throws Exception {
//builer
        Coche coche = new BuilderCoche()
                .setTapizadoDeCuero()
                .setAno(2018)
                .setMarca("Toyota")
                .setModelo("Sport")
                .setColor("Blanco")
                .build();
        System.out.println("El coche es : \n "  + coche.toString());

        //factory

       Fabrica = FactoryCoche.getFabrica(Marcas.Toyota);
        System.out.println(Fabrica.fabricar());
    }
}
