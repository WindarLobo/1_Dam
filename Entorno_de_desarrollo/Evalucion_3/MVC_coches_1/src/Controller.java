public class Controller {

    // Modelo, maneja los datos
    static Model miModelo;
    // Vista, maneja la interacción con el usuarios
    static View miVista;

    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     * @param args no usadas
     */
    public static void main(String[] args) {

        // instanciamos modelo y vista
        miModelo = new Model();
        miVista = new View();

        System.out.println("fin del main");
    }

    /**
     * Crea un coche y manda mensaje a la vista para el usuario
     * @param modelo del coche a crear
     * @param matricula identificador único del coche
     */
    public void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo, matricula);
        if (aux != null) miVista.mostrarVelocidad(aux.matricula, aux.velocidad);
        // TODO mandar mensaje de error si no fue posible crear el coche
    }
}