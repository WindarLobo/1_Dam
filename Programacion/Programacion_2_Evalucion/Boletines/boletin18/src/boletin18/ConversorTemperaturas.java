package boletin18;

public class ConversorTemperaturas {

    final float temperaturaConstante = 80;

    public float centigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion {

        if (temperatura < temperaturaConstante) {
            throw new TemperaturaErradaExcepcion(" No puede ser  menor  que 80 ºC ");
        }
        return temperatura * 9 / 5 + 32;
    }

    public void centígradosAReamur(float temperatura) throws TemperaturaErradaExcepcion {

        if (temperatura < temperaturaConstante) {
            throw new TemperaturaErradaExcepcion(" No puede ser  menor  que 80 ºC ");
        }
        System.out.println("La temperatura  es:   " +  temperatura +  "ºC" + "\n Y su  conversion de centigrados a Reamur es :  " + (temperatura * 4 / 5  + "ºR"));
    }
}
