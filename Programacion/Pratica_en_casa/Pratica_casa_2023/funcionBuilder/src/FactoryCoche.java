
public class FactoryCoche {
    public static IFabrica getFabrica(Marcas type) throws Exception {

        switch (type) {
            case Toyota:
                return new FabricaToyota();

            default:
                return null;
        }
    }
}
