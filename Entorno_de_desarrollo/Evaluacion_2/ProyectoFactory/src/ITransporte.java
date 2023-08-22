/**
 * public interface ITransporte
 */
public interface ITransporte {
    /**
     *
     * @return costoTotal
     */
    Float costoTotal(Integer cp);

    /**
     *
     * @return tipoEmbalajae
     */
    Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso);


}

