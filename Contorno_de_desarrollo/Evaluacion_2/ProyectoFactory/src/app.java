import enums.TipoEmbalaje;
import enums.TipoTransporte;

public class app {
    /**
     * static ITransporte Transporte
     */
    static ITransporte Transporte;

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Implementation Biclicleta");
        Transporte = FactorySencilla.getProducto(TipoTransporte.Bicicleta);
        System.out.println(Transporte.costoTotal(36470));
        /**
         * Con evalue Un tipo enumerado en Java es un tipo “especial” que en cierta medida puede usarse
         * como una clase y admite ciertas posibilidades especiales.
         */
        System.out.println(TipoEmbalaje.values()[Transporte.tipoEmbalajae(36470,2f,3f,5f,6f)]);
        /**
         * Sin values
         */
        System.out.println(Transporte.tipoEmbalajae(36470,2f,3f,5f,6f));

        System.out.println("Implementation Camion");
        Transporte = FactorySencilla.getProducto(TipoTransporte.Camion);
        System.out.println(Transporte.costoTotal(36470));
        /**
         * Con evalue Un tipo enumerado en Java es un tipo “especial” que en cierta medida puede usarse
         * como una clase y admite ciertas posibilidades especiales.
         */
        System.out.println(TipoEmbalaje.values()[Transporte.tipoEmbalajae(36470,2f,3f,5f,6f)]);
        /**
         * Sin values
         */
        System.out.println(Transporte.tipoEmbalajae(36470,2f,3f,5f,6f));
    }
}