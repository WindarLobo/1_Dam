package boletin34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public Ventana() {

        initComponents();
        this.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelFechaContartacion = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonVizualizar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        cmbTipoContrato = new javax.swing.JComboBox<>();
        jButtonNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVisualizar = new javax.swing.JTextArea();
        jPanelClienteContratados = new javax.swing.JPanel();
        jTextFieldCientesContratado = new javax.swing.JTextField();
        jLabeClientesCaptado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelApellido.setText("Apellidos:");

        jLabelDni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDni.setText("Dni:");

        jLabelSalario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSalario.setText("Salario:");

        jLabelFechaContartacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFechaContartacion.setText("Fecha de contratatcion  :");

        jTextFieldFecha.setText(" \"d/M/yyyy\"");

        jButtonCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCrear.setText("CREAR");
        jButtonCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearjButtonCrearActionPerformed(evt);
            }
        });

        jButtonVizualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVizualizar.setText("VISUALIZAR");
        jButtonVizualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVizualizarjButtonVizualizarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalir.setText("SALIR");
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirjButtonSalirActionPerformed(evt);
            }
        });

        cmbTipoContrato.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cmbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanente", "Contratado" }));
        cmbTipoContrato.setBorder(null);
        cmbTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoContratoActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setText("NUEVO");
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jTextAreaVisualizar.setBackground(new java.awt.Color(102, 153, 255));
        jTextAreaVisualizar.setColumns(20);
        jTextAreaVisualizar.setRows(5);
        jTextAreaVisualizar.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaVisualizar);

        jPanelClienteContratados.setBackground(new java.awt.Color(102, 153, 255));

        jLabeClientesCaptado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeClientesCaptado.setText("Clientes Contratados:");

        javax.swing.GroupLayout jPanelClienteContratadosLayout = new javax.swing.GroupLayout(jPanelClienteContratados);
        jPanelClienteContratados.setLayout(jPanelClienteContratadosLayout);
        jPanelClienteContratadosLayout.setHorizontalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteContratadosLayout.createSequentialGroup()
                .addComponent(jLabeClientesCaptado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldCientesContratado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelClienteContratadosLayout.setVerticalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteContratadosLayout.createSequentialGroup()
                .addGroup(jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCientesContratado)
                    .addComponent(jLabeClientesCaptado))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVizualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaContartacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDni)
                            .addComponent(jLabelSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCrear, jButtonNuevo, jButtonVizualizar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalario))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaContartacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrear)
                    .addComponent(jButtonVizualizar)
                    .addComponent(jButtonNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addGap(25, 25, 25))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCrear, jButtonNuevo, jButtonVizualizar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearjButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearjButtonCrearActionPerformed
        Empleado empleado;
        try {
            String dniIntroducido = jTextFieldDNI.getText();
            String nombreIntroducido = jTextFieldNombre.getText();
            String apellidosIntroducido = jTextFieldApellidos.getText();
            double salarioBaseIntroducido = Double.parseDouble(jTextFieldSalario.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(jTextFieldFecha.getText(), formatter);

            String selectedOption = cmbTipoContrato.getSelectedItem().toString();

            if (selectedOption.equalsIgnoreCase("PERMANENTE")) {
                int ClienteContratado = Integer.parseInt(jTextFieldCientesContratado.getText());

                empleado = new Permanente(dniIntroducido, nombreIntroducido, apellidosIntroducido, ClienteContratado, salarioBaseIntroducido, date);

            } else {
                empleado = new Contratado(dniIntroducido, nombreIntroducido, apellidosIntroducido, salarioBaseIntroducido, date);
            }

            empleados.add(empleado);
        } catch (java.time.format.DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha invalido");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de numero invalido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }//GEN-LAST:event_jButtonCrearjButtonCrearActionPerformed

    private void jButtonVizualizarjButtonVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVizualizarjButtonVizualizarActionPerformed

        jTextAreaVisualizar.setText(visualizar(empleados));

    }//GEN-LAST:event_jButtonVizualizarjButtonVizualizarActionPerformed

    private void jButtonSalirjButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirjButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirjButtonSalirActionPerformed

    private void cmbTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoContratoActionPerformed
        String selectedOption = cmbTipoContrato.getSelectedItem().toString();
        if (selectedOption.equalsIgnoreCase("PERMANENTE")) {
            jPanelClienteContratados.setVisible(true);
        } else {
            jPanelClienteContratados.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoContratoActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jTextFieldDNI.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldSalario.setText("");
        jTextFieldFecha.setText("");
        jTextFieldCientesContratado.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private static String visualizar(ArrayList<Empleado> empleados) {
        StringBuilder sb = new StringBuilder();
        if (empleados.isEmpty()) {
            sb.append("No hay empleados registrados");
        } else {
            for (Empleado emp : empleados) {
                if (emp instanceof Contratado) {
                    Contratado contratado = (Contratado) emp;
                    sb.append("Empleado Contratado:").append(emp.toString())
                            .append("\nEl salario basico: €").append(contratado.calcularSalario()).append("\n\n");
                } else if (emp instanceof Permanente) {
                    Permanente permanente = (Permanente) emp;
                    sb.append("\nEmpleado Permanente: ").append(emp.toString())
                            .append("\nEl salario basico: €").append(permanente.calcularSalario()).append("\n\n");
                }
            }
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoContrato;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVizualizar;
    private javax.swing.JLabel jLabeClientesCaptado;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaContartacion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelClienteContratados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaVisualizar;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCientesContratado;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
