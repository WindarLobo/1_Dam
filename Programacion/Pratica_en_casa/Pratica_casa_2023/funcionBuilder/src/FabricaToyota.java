public class FabricaToyota implements IFabrica {

    private Coche coche;
    @Override
    public Coche fabricar() {
        coche = new BuilderCoche()
                .setTapizadoDeCuero()
                .setAno(2018)
                .setMarca("Toyota")
                .setModelo("Sport")
                .setColor("Blanco")
                .build();
        return coche;
    }
}
