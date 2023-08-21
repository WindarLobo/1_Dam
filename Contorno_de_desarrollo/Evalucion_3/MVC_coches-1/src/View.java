public class View {

    public View(){
        // creamos la ventana
        IU.crearVentana();
    }

    /**
     * Muestra la velocidad
     * @param matricula del coche
     * @param v velocidad que ueremos mostrar
     * @return true si todo bien
     */
    boolean mostrarVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        System.out.println(mensaje);
        Dialog.mostrarMensaje(mensaje);
        return true;
    }

}
