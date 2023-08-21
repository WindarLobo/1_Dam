package View;

import java.awt.Dimension;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Empleado;
import modelo.Permanente;
import repositorio.EmpleadoRepositorio;

public class Ventana extends javax.swing.JFrame {

    ArrayList<Empleado> empleados = new ArrayList<>();
    Empleado empleadoSeleccionado = new Permanente();
    EmpleadoRepositorio repositorio = new EmpleadoRepositorio();

    public Ventana() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);
        jTableListaEmpleado.setSize(new Dimension(300, 300));

        cmbTipoContrato.addItem("PERMANENTE");
        cmbTipoContrato.addItem("CONTRATADO");

        empleados = repositorio.obtenerEmpleados();
        cargar(empleados);
        establecerObjetoEnControles();

        jTableListaEmpleado.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    actualizarCamposEmpleadoSeleccionado();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPane2 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelFechaContartacion = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFielDni = new javax.swing.JTextField();
        jTextFielNombre = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        cmbTipoContrato = new javax.swing.JComboBox<>();
        jButtonNuevo = new javax.swing.JButton();
        jPanelClienteContratados = new javax.swing.JPanel();
        jTextFieldCientesContratado = new javax.swing.JTextField();
        jLabeClientesCaptado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaEmpleado = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSalarioTotal = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPane2.setBackground(java.awt.SystemColor.activeCaption);
        jPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelID.setText("ID:");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellidos:");

        jLabelDni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDni.setText("Dni:");

        jLabelSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSalario.setText("Salario:");

        jLabelFechaContartacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFechaContartacion.setText("Fecha de contratatcion:");

        jTextFieldFecha.setText(" \"d/M/yyyy\"");

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
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
        cmbTipoContrato.setBorder(null);
        cmbTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoContratoActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setText("NUEVO");
        jButtonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setMinimumSize(new java.awt.Dimension(89, 22));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jPanelClienteContratados.setBackground(java.awt.SystemColor.activeCaption);

        jLabeClientesCaptado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeClientesCaptado.setText("Clientes Contratados:");

        javax.swing.GroupLayout jPanelClienteContratadosLayout = new javax.swing.GroupLayout(jPanelClienteContratados);
        jPanelClienteContratados.setLayout(jPanelClienteContratadosLayout);
        jPanelClienteContratadosLayout.setHorizontalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteContratadosLayout.createSequentialGroup()
                .addComponent(jLabeClientesCaptado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jTextFieldCientesContratado))
        );
        jPanelClienteContratadosLayout.setVerticalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldCientesContratado)
                .addComponent(jLabeClientesCaptado))
        );

        jTableListaEmpleado.setAutoCreateRowSorter(true);
        jTableListaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListaEmpleado.setCellSelectionEnabled(true);
        jTableListaEmpleado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableListaEmpleado);

        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(89, 22));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTextFieldID.setEditable(false);

        jLabelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre1.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Salario Total:");

        jTextFieldSalarioTotal.setEditable(false);

        javax.swing.GroupLayout jPane2Layout = new javax.swing.GroupLayout(jPane2);
        jPane2.setLayout(jPane2Layout);
        jPane2Layout.setHorizontalGroup(
            jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane2Layout.createSequentialGroup()
                        .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPane2Layout.createSequentialGroup()
                                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelApellido)
                                    .addComponent(jLabelNombre1)
                                    .addComponent(jLabelID))
                                .addGap(182, 182, 182)
                                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                    .addComponent(jTextFielNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPane2Layout.createSequentialGroup()
                                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDni)
                                    .addComponent(jLabelSalario)
                                    .addComponent(jLabelFechaContartacion))
                                .addGap(94, 94, 94)
                                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFecha)
                                    .addComponent(jTextFielDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPane2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(163, 163, 163)
                                .addComponent(jTextFieldSalarioTotal)))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPane2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPane2Layout.setVerticalGroup(
            jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(8, 8, 8)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalario))
                .addGap(5, 5, 5)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaContartacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSalarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonGuardar, jButtonNuevo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPane2.getAccessibleContext().setAccessibleParent(jPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        try {
            establecerControlesAObjeto();

            if (empleadoSeleccionado.getIdEmpleado() == 0) {
                repositorio.insertarEmpleado(empleadoSeleccionado);
                establecerObjetoEnControles();
            } else {
                repositorio.actualizarEmpleado(empleadoSeleccionado);
            }
            empleados = repositorio.obtenerEmpleados();
            cargar(empleados);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al introducir : " + ex.toString());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error class no encontrada : " + ex.toString());

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

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
        Nuevo();
    }//GEN-LAST:event_jButtonNuevoActionPerformed
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        try {
            repositorio.eliminarEmpleado(empleadoSeleccionado);
            empleados = repositorio.obtenerEmpleados();
            cargar(empleados);
            Nuevo();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.toString());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error class no encontrada : " + ex.toString());

        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void Nuevo() {
        empleadoSeleccionado = new Permanente();
        establecerObjetoEnControles();
    }

    private void cargar(ArrayList<Empleado> obtenerEmpleados) {

        DefaultTableModel modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Clientes contratado");
        modeloTabla.addColumn("Salario base");
        modeloTabla.addColumn("Salario total");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Tipo de contrato");

        for (Empleado empleado : obtenerEmpleados) {
            Object[] fila = new Object[9];
            fila[0] = empleado.getIdEmpleado();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellidos();
            fila[3] = empleado.getDni();

            if (empleado instanceof Permanente) {
                Permanente permanente = (Permanente) empleado;
                fila[4] = permanente.getClientesCaptados();

            }
            fila[5] = empleado.getSalarioBase();
            fila[6] = empleado.calcularSalario();

            fila[7] = empleado.getFechaDeIngreso();
            fila[8] = empleado instanceof Permanente ? "Permanente" : "Contratado";
            modeloTabla.addRow(fila);

        }
        jTableListaEmpleado.setModel(modeloTabla);
        tamañoJtable();
    }

    private void tamañoJtable() {
        TableColumnModel columnModel = jTableListaEmpleado.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(300);
        columnModel.getColumn(5).setPreferredWidth(200);
        columnModel.getColumn(6).setPreferredWidth(200);
        columnModel.getColumn(7).setPreferredWidth(200);
        columnModel.getColumn(8).setPreferredWidth(300);
    }

    private void establecerControlesAObjeto() {

        try {
            empleadoSeleccionado.setNombre(jTextFielNombre.getText());
            empleadoSeleccionado.setDni(jTextFielDni.getText());
            empleadoSeleccionado.setApellidos(jTextFieldApellidos.getText());
            empleadoSeleccionado.setSalarioBase(Double.parseDouble(jTextFieldSalario.getText()));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaTexto = jTextFieldFecha.getText();
            LocalDate fecha = LocalDate.parse(fechaTexto, formatter);
            empleadoSeleccionado.setFechaDeIngreso(fecha);

            if (cmbTipoContrato.getSelectedItem().toString().equals("PERMANENTE")) {
                Permanente permanente = (Permanente) empleadoSeleccionado;
                permanente.setClientesCaptados(Integer.parseInt(jTextFieldCientesContratado.getText()));

            }
        } catch (java.time.format.DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha invalido");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de numero invalido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    private void establecerObjetoEnControles() {

        try {
            jTextFieldID.setText(String.valueOf(empleadoSeleccionado.getIdEmpleado()));
            jTextFielNombre.setText(empleadoSeleccionado.getNombre());
            jTextFielDni.setText(empleadoSeleccionado.getDni());
            jTextFieldApellidos.setText(empleadoSeleccionado.getApellidos());
            jTextFieldSalario.setText(String.valueOf(empleadoSeleccionado.getSalarioBase()));
            jTextFieldSalarioTotal.setText(String.valueOf(empleadoSeleccionado.calcularSalario()));

            if (empleadoSeleccionado.getFechaDeIngreso() != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                jTextFieldFecha.setText(empleadoSeleccionado.getFechaDeIngreso().format(formatter));
            } else {
                jTextFieldFecha.setText("dd/MM/yyyy");
            }

            if (empleadoSeleccionado instanceof Permanente) {
                Permanente permanente = (Permanente) empleadoSeleccionado;
                cmbTipoContrato.setSelectedItem("PERMANENTE");
                jTextFieldCientesContratado.setText(String.valueOf(permanente.getClientesCaptados()));
            } else {
                cmbTipoContrato.setSelectedItem("CONTRATADO");
            }
        } catch (java.time.format.DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha invalido");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de numero invalido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    private void actualizarCamposEmpleadoSeleccionado() {
        int filaSeleccionada = jTableListaEmpleado.getSelectedRow();
        if (filaSeleccionada != -1) {
            String idSeleccionado = jTableListaEmpleado.getValueAt(filaSeleccionada, 0).toString();

            for (Empleado empleado : empleados) {
                String getId = String.valueOf(empleado.getIdEmpleado());
                if (getId.equals(idSeleccionado)) {
                    empleadoSeleccionado = empleado;
                    break;
                }
            }
            establecerObjetoEnControles();
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoContrato;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabeClientesCaptado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaContartacion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JPanel jPane2;
    private javax.swing.JPanel jPanelClienteContratados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaEmpleado;
    private javax.swing.JTextField jTextFielDni;
    private javax.swing.JTextField jTextFielNombre;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCientesContratado;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSalarioTotal;
    // End of variables declaration//GEN-END:variables
}
