import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UsuarioView {
    static Controller miControlador;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JButton crearUsuarioButton;
    private JTextField textField3;

    public UsuarioView() {
        miControlador = new Controller();

        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = textField1.getText();
                String apellido = textField2.getText();
                String edad = textField3.getText();
                textArea1.append("Nombre:" + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +"\n\n" );

            }
        });

        crearUsuarioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");

            }
        });


    }

    public static UsuarioView crearVentana() {
        JFrame jframe = new JFrame("App ");
        UsuarioView form = new UsuarioView();
        jframe.setContentPane(form.panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setBounds(700, 300, 400, 400);
        return form;
    }

    public void mostrarDetallesUsuario(String nombre, String Apellido) {
        UsuarioView.crearVentana();
    }

}
