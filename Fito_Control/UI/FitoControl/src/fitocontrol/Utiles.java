package fitocontrol;

import modelo.TipoMedida;

public class Utiles {
    public static String obtenerTiposMedida(TipoMedida tipoMedida) {
        String texto = "Introduce el tipo de medida:";
        if (tipoMedida == TipoMedida.Kilos || tipoMedida == TipoMedida.Gramos) {
            texto += "\n0--> Kilos \n1--> Gramos";
        } else {
            texto += "\n2--> Litros \n3--> Centilitros \n4--> Mililitros";
        }
        return texto;
    }
}
