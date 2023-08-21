import javax.swing.*;

public class Dialog extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;

    public Dialog() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * Mostramos un dialogo modal con información
     * @param msg información que queremos mostrar
     */
    public static void mostrarMensaje(String msg) {
        Dialog dialog = new Dialog();
        dialog.pack();
        // actualizamos mensaje
        dialog.mensaje.setText(msg);
        dialog.setVisible(true);
    }
}
