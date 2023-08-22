import enums.TipoEmbalaje;

public class Camion implements ITransporte {

    /**
     * @return precio
     */
    @Override
    public Float costoTotal(Integer cp) {
        Float precio = null;
        Integer codigo = 37382;
        precio = (float) ((codigo - cp) * 2.8);
        if (cp > 36791 || cp < 34908) {
            LibreriaEntradSalida.salida("Fuera de la zona ", LibreriaEntradSalida.CONSOLA);
        }

        if (precio == 0) ;
        return precio;
    }
    /**
     * @return total
     */
    @Override
    public Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso) {

        float totalDimencion = dimencionX + dimencionY + dimencionZ;
        if (totalDimencion <= 180 && peso <= 20) {
            return TipoEmbalaje.Pallet.ordinal();

        } else if (totalDimencion <= 350 && peso <= 800) {
            return TipoEmbalaje.CajaMadera.ordinal();

        } else {
            return TipoEmbalaje.CajaCarton.ordinal();
        }
    }


}