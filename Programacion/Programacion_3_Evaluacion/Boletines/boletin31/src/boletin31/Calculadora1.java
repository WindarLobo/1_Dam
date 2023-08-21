package boletin31;

import java.awt.Image;
import java.awt.Toolkit;

public class Calculadora1 extends javax.swing.JFrame {

    private float numeroUno;
    private float numeroSegundo;
    private String operador;
    private float acumulador;

    public Calculadora1() {
        initComponents();
        this.setLocationRelativeTo(this);
          Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/boletin31/c.jpg");
        setIconImage(miIcono);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPantalla = new javax.swing.JLabel();
        jButtonAC = new javax.swing.JButton();
        jButtonOFF = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonDivir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonpunto = new javax.swing.JButton();
        jButtonpuntoIgual = new javax.swing.JButton();
        jButtonpuntoSuma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));

        jLabelPantalla.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jLabelPantalla.setOpaque(true);

        jButtonAC.setBackground(new java.awt.Color(255, 51, 51));
        jButtonAC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAC.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAC.setText("AC");
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACjButtonACActionPerformed(evt);
            }
        });

        jButtonOFF.setBackground(new java.awt.Color(51, 51, 255));
        jButtonOFF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonOFF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOFF.setText("OFF");
        jButtonOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOFFjButtonAC1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonDivir.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDivir.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonDivir.setText("/");
        jButtonDivir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivirjButtonDivirActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMultiplicar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonResta.setBackground(new java.awt.Color(204, 204, 204));
        jButtonResta.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonResta.setText("-");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(204, 204, 204));
        jButton0.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonpunto.setBackground(new java.awt.Color(204, 204, 204));
        jButtonpunto.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonpunto.setText(".");
        jButtonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpuntoActionPerformed(evt);
            }
        });

        jButtonpuntoIgual.setBackground(new java.awt.Color(204, 204, 204));
        jButtonpuntoIgual.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonpuntoIgual.setText("=");
        jButtonpuntoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpuntoIgualActionPerformed(evt);
            }
        });

        jButtonpuntoSuma.setBackground(new java.awt.Color(204, 204, 204));
        jButtonpuntoSuma.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonpuntoSuma.setText("+");
        jButtonpuntoSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpuntoSumaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonpuntoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonpuntoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonDivir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonOFF)))))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonpuntoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpuntoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed

        jLabelPantalla.setText(jLabelPantalla.getText() + "0");

    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonDivirjButtonDivirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivirjButtonDivirActionPerformed

        String pantallaText = jLabelPantalla.getText();
        if (!pantallaText.isEmpty()) {
            numeroUno = Float.parseFloat(pantallaText);
            operador = "/";
            jLabelPantalla.setText(pantallaText + "/");
            jLabelPantalla.setText("");

        }
    }//GEN-LAST:event_jButtonDivirjButtonDivirActionPerformed

    private void jButton8jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton8ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "8");
    }//GEN-LAST:event_jButton8jButton8ActionPerformed

    private void jButtonOFFjButtonAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOFFjButtonAC1ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButtonOFFjButtonAC1ActionPerformed

    private void jButtonACjButtonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACjButtonACActionPerformed
        jLabelPantalla.setText("");
    }//GEN-LAST:event_jButtonACjButtonACActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpuntoActionPerformed

        if (!(jLabelPantalla.getText().contains("."))) {
            jLabelPantalla.setText(jLabelPantalla.getText() + ".");

        }
    }//GEN-LAST:event_jButtonpuntoActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabelPantalla.setText(jLabelPantalla.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonpuntoSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpuntoSumaActionPerformed

        String pantallaText = jLabelPantalla.getText();
        if (!pantallaText.isEmpty()) {
            numeroUno = Float.parseFloat(pantallaText);
            operador = "+";
            jLabelPantalla.setText(pantallaText + "+");
            jLabelPantalla.setText("");

        }
        
    }//GEN-LAST:event_jButtonpuntoSumaActionPerformed

    private void jButtonpuntoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpuntoIgualActionPerformed
        String pantallaText = jLabelPantalla.getText();
        
        if (!pantallaText.isEmpty()) {
            
            numeroSegundo = Float.parseFloat(pantallaText);

            switch (operador) {
                case "+":
                    jLabelPantalla.setText(reducirCeros(numeroUno + numeroSegundo));
                   
                    break;
                case "-":
                    jLabelPantalla.setText(reducirCeros(numeroUno - numeroSegundo));
                    break;
                case "*":
                    jLabelPantalla.setText(reducirCeros(numeroUno * numeroSegundo));
                    break;
                case "/":
                    if (numeroSegundo == 0) {
                        jLabelPantalla.setText("Error");
                    } else {

                        jLabelPantalla.setText(reducirCeros(numeroUno / numeroSegundo));
                        break;
                    }
            }
        }

    }//GEN-LAST:event_jButtonpuntoIgualActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        String pantallaText = jLabelPantalla.getText();
        if (!pantallaText.isEmpty()) {
            numeroUno = Float.parseFloat(pantallaText);
            operador = "-";
            jLabelPantalla.setText(pantallaText + "-");
            jLabelPantalla.setText("");

        }

    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed

        String pantallaText = jLabelPantalla.getText();
        if (!pantallaText.isEmpty()) {
            numeroUno = Float.parseFloat(pantallaText);
            operador = "*";
            jLabelPantalla.setText(pantallaText + "*");
            jLabelPantalla.setText("");

        }
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private String reducirCeros(Float resultado) {
        String numero = "";
        numero = Float.toString(resultado);
        if (resultado % 1 == 0) {
            numero = numero.substring(0, numero.length() - 2);

        }
        return numero;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonDivir;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonOFF;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonpunto;
    private javax.swing.JButton jButtonpuntoIgual;
    private javax.swing.JButton jButtonpuntoSuma;
    private javax.swing.JLabel jLabelPantalla;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
