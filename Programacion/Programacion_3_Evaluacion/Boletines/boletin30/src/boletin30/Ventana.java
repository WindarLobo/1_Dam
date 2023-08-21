package boletin30;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam1
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(this);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/boletin30/images.jpg");
        setIconImage(miIcono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lname = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CboxCourse = new javax.swing.JComboBox<>();
        JtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LlastName = new javax.swing.JLabel();
        JtLastName = new javax.swing.JTextField();
        JBAgregarTabla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInfomacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Lname.setBackground(new java.awt.Color(204, 204, 204));
        Lname.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Name ");

        CboxCourse.setBackground(new java.awt.Color(204, 204, 204));
        CboxCourse.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        CboxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dam1", "Asir1", "Daw1" }));
        CboxCourse.setFocusCycleRoot(true);
        CboxCourse.setName("Modulo"); // NOI18N
        CboxCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxCourseActionPerformed(evt);
            }
        });

        JtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNameActionPerformed(evt);
            }
        });

        LlastName.setBackground(new java.awt.Color(204, 204, 204));
        LlastName.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        LlastName.setText("Last name");

        JtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtLastNameActionPerformed(evt);
            }
        });

        JBAgregarTabla.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JBAgregarTabla.setText("Add table");
        JBAgregarTabla.setDoubleBuffered(true);
        JBAgregarTabla.setMaximumSize(new java.awt.Dimension(96, 33));
        JBAgregarTabla.setMinimumSize(new java.awt.Dimension(96, 33));
        JBAgregarTabla.setPreferredSize(new java.awt.Dimension(96, 33));
        JBAgregarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarTablaActionPerformed(evt);
            }
        });

        jTableInfomacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Last name", "Modulo"
            }
        ));
        jScrollPane2.setViewportView(jTableInfomacion);

        javax.swing.GroupLayout LnameLayout = new javax.swing.GroupLayout(Lname);
        Lname.setLayout(LnameLayout);
        LnameLayout.setHorizontalGroup(
            LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LnameLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LnameLayout.createSequentialGroup()
                        .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LlastName)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtName, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(JtLastName)))
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBAgregarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LnameLayout.createSequentialGroup()
                        .addComponent(CboxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        LnameLayout.setVerticalGroup(
            LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LnameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CboxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LlastName)
                    .addComponent(JBAgregarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtLastName))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarTablaActionPerformed
       
      if (JtName.getText().equalsIgnoreCase("") || JtLastName.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Enter the data ");
            return ;
        }
        String name = JtName.getText();
        String lastName= JtLastName.getText();
        String course = (String) CboxCourse.getSelectedItem();

        Object[] row = {name, lastName, course};// Cell createCell(int column)

        DefaultTableModel model = (DefaultTableModel) jTableInfomacion.getModel();

        model.addRow(row);

       
    }//GEN-LAST:event_JBAgregarTablaActionPerformed

    private void JtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtLastNameActionPerformed

    }//GEN-LAST:event_JtLastNameActionPerformed

    private void JtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNameActionPerformed


    }//GEN-LAST:event_JtNameActionPerformed

    private void CboxCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxCourse;
    private javax.swing.JButton JBAgregarTabla;
    private javax.swing.JTextField JtLastName;
    private javax.swing.JTextField JtName;
    private javax.swing.JLabel LlastName;
    private javax.swing.JPanel Lname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInfomacion;
    // End of variables declaration//GEN-END:variables
}
