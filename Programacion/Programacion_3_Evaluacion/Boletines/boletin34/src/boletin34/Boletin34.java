package boletin34;

import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Boletin34 {

    public static void main(String[] args) {
        /*String[] opciones = {"Crear", "Visualizar", "Salir"};
        String Opcion = "";
        ArrayList<Empleado> empleados = new ArrayList<>();

        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Empresa ServiSoft", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (Opcion == null) {
                break;
            }
            try {
                switch (Opcion.toUpperCase()) {

                    case "CREAR":
                        empleados.add(crear());
                        break;

                    case "VISUALIZAR":
                        visualizar(empleados);
                        break;

                    case "SALIR":
                        break;
                }
            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(null, "Formato de fecha invalido");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }

    private static Empleado crear() {
        

        String[] tiposEmpleado = {"Contratado", "Permanente"};

        String tipoEmpleado = (String) JOptionPane.showInputDialog(null, "Tipo empleado", "Opcion",
                JOptionPane.QUESTION_MESSAGE, null, tiposEmpleado, tiposEmpleado[0]);

        String dniIntroducido = JOptionPane.showInputDialog("Introduce el dni :");

        String nombreIntroducido = JOptionPane.showInputDialog("Introduce su nombre :");

        String apellidosIntroducido = JOptionPane.showInputDialog("Introduce sus apelldios :");

        double salarioBaseIntroducido = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Salario Base :"));

        String fehcaContratacion = JOptionPane.showInputDialog("Introduce la Fecha DD/MM/YYYY :");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.ENGLISH);

        LocalDate date = LocalDate.parse(fehcaContratacion, formatter);

        if (tipoEmpleado.equalsIgnoreCase("PERMANENTE")) {
            int ClienteContratado = Integer.parseInt(JOptionPane.showInputDialog("Introduce Los cliente contratados :"));
            return new Permanente(dniIntroducido, nombreIntroducido, apellidosIntroducido, ClienteContratado, salarioBaseIntroducido, date);
        }
        
        return new Contratado(dniIntroducido, nombreIntroducido, apellidosIntroducido, salarioBaseIntroducido, date);
    }

    private static void visualizar(ArrayList<Empleado> empleados) {
        String datos = "";
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados");
        } else {
            for (Empleado emp : empleados) {
                if (emp instanceof Contratado) {
                    Contratado contratado = (Contratado) emp;
                    datos += "Empleado Contratado: " + emp.toString() + "\n El salario basico: €" + contratado.calcularSalario() + "\n\n";
                } else if (emp instanceof Permanente) {
                    Permanente permanente = (Permanente) emp;
                    datos += "Empleado Permanente: " + emp.toString() + "\n El salario basico: €" + permanente.calcularSalario() + "\n\n";
                }
            }
            JOptionPane.showMessageDialog(null, datos);
        }*/

            Ventana prueba = new Ventana();
            prueba.setVisible(true);
            prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);

        
    }

}
