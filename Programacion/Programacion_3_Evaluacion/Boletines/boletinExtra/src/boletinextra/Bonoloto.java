package boletinextra;

import java.awt.Color;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JTextField;

public class Bonoloto extends javax.swing.JFrame {

    private static final String[] miArray = new String[2];

    public Bonoloto() {
        initComponents();
 
        this.setLocationRelativeTo(this);
        jTextPane1.setHorizontalAlignment(JTextField.CENTER);


    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonTrenta = new javax.swing.JButton();
        jButtonCuarenta = new javax.swing.JButton();
        jButtonVeinte = new javax.swing.JButton();
        jLUno = new javax.swing.JLabel();
        jButtondiez = new javax.swing.JButton();
        jButtonUno = new javax.swing.JButton();
        jButtonOnce = new javax.swing.JButton();
        jButtonVeintiUno = new javax.swing.JButton();
        jButtonTrentayUno = new javax.swing.JButton();
        jButtonCuarentaYUno = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonDoce = new javax.swing.JButton();
        jButtonVeintiDos = new javax.swing.JButton();
        jButtonTrentaYDos = new javax.swing.JButton();
        jButtoncuarentaYDos = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonTrece = new javax.swing.JButton();
        jButtonVeintiTres = new javax.swing.JButton();
        jButtonTreintaYTres = new javax.swing.JButton();
        jButtonCuarentaYtres = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonCatorce = new javax.swing.JButton();
        jButtonVeintiCuatro = new javax.swing.JButton();
        jButtonTreintaYCuatro = new javax.swing.JButton();
        jButtonCuarentaYCuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonQuince = new javax.swing.JButton();
        jButtonVeinticinco = new javax.swing.JButton();
        jButtonTrentayCinco = new javax.swing.JButton();
        jButtonCuarentaYCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonDiecieis = new javax.swing.JButton();
        jButtonVeintiSeis = new javax.swing.JButton();
        jButtonTrentaYSeis = new javax.swing.JButton();
        jButtonSiete = new javax.swing.JButton();
        jButtonCuarentaYSeis = new javax.swing.JButton();
        jButtonDiesisite = new javax.swing.JButton();
        jButtonVeintiSiete = new javax.swing.JButton();
        jButtonTrentaYSiete = new javax.swing.JButton();
        jButtonCuarentaYSiete = new javax.swing.JButton();
        jButtonOcho = new javax.swing.JButton();
        jButtonDieciOcho = new javax.swing.JButton();
        jButtonVeintiOcho = new javax.swing.JButton();
        jButtonTrentaYOcho = new javax.swing.JButton();
        jButtonCuarentayOcho = new javax.swing.JButton();
        jButtonNueve = new javax.swing.JButton();
        jButtonDieciNueve = new javax.swing.JButton();
        jButtonVeintiNueve = new javax.swing.JButton();
        jButtonTreintaYNueve = new javax.swing.JButton();
        jButtonCuarentaYNueve = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonJugar = new javax.swing.JButton();
        jTextPane1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton13.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));

        jButtonTrenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrenta.setText("30");
        jButtonTrenta.setMultiClickThreshhold(30L);
        jButtonTrenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentaActionPerformed(evt);
            }
        });

        jButtonCuarenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarenta.setText("40");
        jButtonCuarenta.setName("40"); // NOI18N
        jButtonCuarenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaActionPerformed(evt);
            }
        });

        jButtonVeinte.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeinte.setText("20");
        jButtonVeinte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVeinte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeinte.setMaximumSize(new java.awt.Dimension(72, 23));
        jButtonVeinte.setMinimumSize(new java.awt.Dimension(72, 23));
        jButtonVeinte.setName("20"); // NOI18N
        jButtonVeinte.setPreferredSize(new java.awt.Dimension(72, 23));
        jButtonVeinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeinteActionPerformed(evt);
            }
        });

        jLUno.setBackground(new java.awt.Color(255, 255, 255));
        jLUno.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUno.setText("1");
        jLUno.setAlignmentX(0.5F);
        jLUno.setAutoscrolls(true);
        jLUno.setMaximumSize(new java.awt.Dimension(72, 23));

        jButtondiez.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtondiez.setText("10");
        jButtondiez.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtondiez.setName("10"); // NOI18N
        jButtondiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondiezActionPerformed(evt);
            }
        });

        jButtonUno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonUno.setText("1");
        jButtonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUno.setName("10"); // NOI18N
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });

        jButtonOnce.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonOnce.setText("11");
        jButtonOnce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOnce.setName("10"); // NOI18N
        jButtonOnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOnceActionPerformed(evt);
            }
        });

        jButtonVeintiUno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiUno.setText("21");
        jButtonVeintiUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiUno.setName("10"); // NOI18N
        jButtonVeintiUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiUnoActionPerformed(evt);
            }
        });

        jButtonTrentayUno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentayUno.setText("31");
        jButtonTrentayUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentayUno.setName("10"); // NOI18N
        jButtonTrentayUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentayUnoActionPerformed(evt);
            }
        });

        jButtonCuarentaYUno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYUno.setText("41");
        jButtonCuarentaYUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYUno.setName("10"); // NOI18N
        jButtonCuarentaYUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYUnoActionPerformed(evt);
            }
        });

        jButtonDos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDos.setText("2");
        jButtonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDos.setName("10"); // NOI18N
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });

        jButtonDoce.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDoce.setText("12");
        jButtonDoce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDoce.setName("10"); // NOI18N
        jButtonDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoceActionPerformed(evt);
            }
        });

        jButtonVeintiDos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiDos.setText("22");
        jButtonVeintiDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiDos.setName("10"); // NOI18N
        jButtonVeintiDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiDosActionPerformed(evt);
            }
        });

        jButtonTrentaYDos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentaYDos.setText("32");
        jButtonTrentaYDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentaYDos.setName("10"); // NOI18N
        jButtonTrentaYDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentaYDosActionPerformed(evt);
            }
        });

        jButtoncuarentaYDos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtoncuarentaYDos.setText("42");
        jButtoncuarentaYDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtoncuarentaYDos.setName("10"); // NOI18N
        jButtoncuarentaYDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncuarentaYDosActionPerformed(evt);
            }
        });

        jButtonTres.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTres.setName("10"); // NOI18N
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonTrece.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrece.setText("13");
        jButtonTrece.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrece.setName("10"); // NOI18N
        jButtonTrece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreceActionPerformed(evt);
            }
        });

        jButtonVeintiTres.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiTres.setText("23");
        jButtonVeintiTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiTres.setName("10"); // NOI18N
        jButtonVeintiTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiTresActionPerformed(evt);
            }
        });

        jButtonTreintaYTres.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTreintaYTres.setText("33");
        jButtonTreintaYTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTreintaYTres.setName("10"); // NOI18N
        jButtonTreintaYTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreintaYTresActionPerformed(evt);
            }
        });

        jButtonCuarentaYtres.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYtres.setText("43");
        jButtonCuarentaYtres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYtres.setName("10"); // NOI18N
        jButtonCuarentaYtres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYtresActionPerformed(evt);
            }
        });

        jButtonCuatro.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuatro.setText("4");
        jButtonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuatro.setName("10"); // NOI18N
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });

        jButtonCatorce.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCatorce.setText("14");
        jButtonCatorce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCatorce.setName("10"); // NOI18N
        jButtonCatorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatorceActionPerformed(evt);
            }
        });

        jButtonVeintiCuatro.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiCuatro.setText("24");
        jButtonVeintiCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiCuatro.setName("10"); // NOI18N
        jButtonVeintiCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiCuatroActionPerformed(evt);
            }
        });

        jButtonTreintaYCuatro.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTreintaYCuatro.setText("34");
        jButtonTreintaYCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTreintaYCuatro.setName("10"); // NOI18N
        jButtonTreintaYCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreintaYCuatroActionPerformed(evt);
            }
        });

        jButtonCuarentaYCuatro.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYCuatro.setText("44");
        jButtonCuarentaYCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYCuatro.setName("10"); // NOI18N
        jButtonCuarentaYCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYCuatroActionPerformed(evt);
            }
        });

        jButtonCinco.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCinco.setName("10"); // NOI18N
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonQuince.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonQuince.setText("15");
        jButtonQuince.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonQuince.setName("10"); // NOI18N
        jButtonQuince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuinceActionPerformed(evt);
            }
        });

        jButtonVeinticinco.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeinticinco.setText("25");
        jButtonVeinticinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeinticinco.setName("10"); // NOI18N
        jButtonVeinticinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeinticincoActionPerformed(evt);
            }
        });

        jButtonTrentayCinco.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentayCinco.setText("35");
        jButtonTrentayCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentayCinco.setName("10"); // NOI18N
        jButtonTrentayCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentayCincoActionPerformed(evt);
            }
        });

        jButtonCuarentaYCinco.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYCinco.setText("45");
        jButtonCuarentaYCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYCinco.setName("10"); // NOI18N
        jButtonCuarentaYCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYCincoActionPerformed(evt);
            }
        });

        jButtonSeis.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSeis.setName("10"); // NOI18N
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonDiecieis.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDiecieis.setText("16");
        jButtonDiecieis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDiecieis.setName("10"); // NOI18N
        jButtonDiecieis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiecieisActionPerformed(evt);
            }
        });

        jButtonVeintiSeis.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiSeis.setText("26");
        jButtonVeintiSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiSeis.setName("10"); // NOI18N
        jButtonVeintiSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiSeisActionPerformed(evt);
            }
        });

        jButtonTrentaYSeis.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentaYSeis.setText("36");
        jButtonTrentaYSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentaYSeis.setName("10"); // NOI18N
        jButtonTrentaYSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentaYSeisActionPerformed(evt);
            }
        });

        jButtonSiete.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonSiete.setText("7");
        jButtonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSiete.setName("10"); // NOI18N
        jButtonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSieteActionPerformed(evt);
            }
        });

        jButtonCuarentaYSeis.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYSeis.setText("46");
        jButtonCuarentaYSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYSeis.setName("10"); // NOI18N
        jButtonCuarentaYSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYSeisActionPerformed(evt);
            }
        });

        jButtonDiesisite.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDiesisite.setText("17");
        jButtonDiesisite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDiesisite.setName("10"); // NOI18N
        jButtonDiesisite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiesisiteActionPerformed(evt);
            }
        });

        jButtonVeintiSiete.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiSiete.setText("27");
        jButtonVeintiSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiSiete.setName("10"); // NOI18N
        jButtonVeintiSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiSieteActionPerformed(evt);
            }
        });

        jButtonTrentaYSiete.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentaYSiete.setText("37");
        jButtonTrentaYSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentaYSiete.setName("10"); // NOI18N
        jButtonTrentaYSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentaYSieteActionPerformed(evt);
            }
        });

        jButtonCuarentaYSiete.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYSiete.setText("47");
        jButtonCuarentaYSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYSiete.setName("10"); // NOI18N
        jButtonCuarentaYSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYSieteActionPerformed(evt);
            }
        });

        jButtonOcho.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonOcho.setText("8");
        jButtonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOcho.setName("10"); // NOI18N
        jButtonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOchoActionPerformed(evt);
            }
        });

        jButtonDieciOcho.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDieciOcho.setText("18");
        jButtonDieciOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDieciOcho.setName("10"); // NOI18N
        jButtonDieciOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDieciOchoActionPerformed(evt);
            }
        });

        jButtonVeintiOcho.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiOcho.setText("28");
        jButtonVeintiOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiOcho.setName("10"); // NOI18N
        jButtonVeintiOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiOchoActionPerformed(evt);
            }
        });

        jButtonTrentaYOcho.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTrentaYOcho.setText("38");
        jButtonTrentaYOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTrentaYOcho.setName("10"); // NOI18N
        jButtonTrentaYOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrentaYOchoActionPerformed(evt);
            }
        });

        jButtonCuarentayOcho.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentayOcho.setText("48");
        jButtonCuarentayOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentayOcho.setName("10"); // NOI18N
        jButtonCuarentayOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentayOchoActionPerformed(evt);
            }
        });

        jButtonNueve.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonNueve.setText("9");
        jButtonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNueve.setName("10"); // NOI18N
        jButtonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNueveActionPerformed(evt);
            }
        });

        jButtonDieciNueve.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonDieciNueve.setText("19");
        jButtonDieciNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDieciNueve.setName("10"); // NOI18N
        jButtonDieciNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDieciNueveActionPerformed(evt);
            }
        });

        jButtonVeintiNueve.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonVeintiNueve.setText("29");
        jButtonVeintiNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeintiNueve.setName("10"); // NOI18N
        jButtonVeintiNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeintiNueveActionPerformed(evt);
            }
        });

        jButtonTreintaYNueve.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonTreintaYNueve.setText("39");
        jButtonTreintaYNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTreintaYNueve.setName("10"); // NOI18N
        jButtonTreintaYNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreintaYNueveActionPerformed(evt);
            }
        });

        jButtonCuarentaYNueve.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButtonCuarentaYNueve.setText("49");
        jButtonCuarentaYNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuarentaYNueve.setName("10"); // NOI18N
        jButtonCuarentaYNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuarentaYNueveActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("Lipiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonJugar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonJugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonJugar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonJugar.setText("Jugar");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTextPane1.setToolTipText("");
        jTextPane1.setAutoscrolls(true);
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rellena 6 apusta ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDiesisite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTrentaYSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDiecieis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTrentaYSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonQuince, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeinticinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTrentayCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCatorce, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTreintaYCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTrece, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTreintaYTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYtres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtondiez, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonVeintiUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTrentayUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCuarentaYUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonVeinte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTrenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCuarenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTrentaYDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtoncuarentaYDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDieciOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTrentaYOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentayOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDieciNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVeintiNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTreintaYNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCuarentaYNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtondiez, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonTrenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCuarenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVeinte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonVeintiUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTrentayUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCuarentaYUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVeintiDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrentaYDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoncuarentaYDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTrece, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVeintiTres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTreintaYTres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCuarentaYtres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCatorce, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVeintiCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTreintaYCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCuarentaYCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuince, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVeinticinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrentayCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuarentaYCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiecieis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVeintiSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrentaYSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuarentaYSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiesisite, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVeintiSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrentaYSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuarentaYSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDieciOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVeintiOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTrentaYOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCuarentayOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTreintaYNueve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDieciNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCuarentaYNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonVeintiNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondiezActionPerformed
        jButtondiez.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + "10");
        miArray[0] = " 10";


    }//GEN-LAST:event_jButtondiezActionPerformed

    private void jButtonVeinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeinteActionPerformed
        jButtonVeinte.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,20");
 miArray[1] = ",20 ";
    }//GEN-LAST:event_jButtonVeinteActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed
        jButtonUno.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,1");

    }//GEN-LAST:event_jButtonUnoActionPerformed

    private void jButtonOnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOnceActionPerformed
        jButtonOnce.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,11");

    }//GEN-LAST:event_jButtonOnceActionPerformed

    private void jButtonVeintiUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiUnoActionPerformed
        jButtonVeintiUno.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,21");
    }//GEN-LAST:event_jButtonVeintiUnoActionPerformed

    private void jButtonTrentayUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentayUnoActionPerformed
        jButtonTrentayUno.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,31");
    }//GEN-LAST:event_jButtonTrentayUnoActionPerformed

    private void jButtonCuarentaYUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYUnoActionPerformed
        jButtonCuarentaYUno.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,41");

    }//GEN-LAST:event_jButtonCuarentaYUnoActionPerformed

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed
        jButtonDos.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,2");
    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoceActionPerformed
        jButtonDoce.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,12");
    }//GEN-LAST:event_jButtonDoceActionPerformed

    private void jButtonVeintiDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiDosActionPerformed
        jButtonVeintiDos.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,22");
    }//GEN-LAST:event_jButtonVeintiDosActionPerformed

    private void jButtonTrentaYDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentaYDosActionPerformed
        jButtonTrentaYDos.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,32");
    }//GEN-LAST:event_jButtonTrentaYDosActionPerformed

    private void jButtoncuarentaYDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncuarentaYDosActionPerformed
        jButtoncuarentaYDos.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,42");
    }//GEN-LAST:event_jButtoncuarentaYDosActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        jButtonTres.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,3");
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonTreceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreceActionPerformed
        jButtonTrece.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,13");
    }//GEN-LAST:event_jButtonTreceActionPerformed

    private void jButtonVeintiTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiTresActionPerformed
        jButtonVeintiTres.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,23");
    }//GEN-LAST:event_jButtonVeintiTresActionPerformed

    private void jButtonTreintaYTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreintaYTresActionPerformed
        jButtonTreintaYTres.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,33");
    }//GEN-LAST:event_jButtonTreintaYTresActionPerformed

    private void jButtonCuarentaYtresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYtresActionPerformed
        jButtonCuarentaYtres.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,43");
    }//GEN-LAST:event_jButtonCuarentaYtresActionPerformed

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuatroActionPerformed
        jButtonCuatro.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,4");
    }//GEN-LAST:event_jButtonCuatroActionPerformed

    private void jButtonCatorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatorceActionPerformed
        jButtonCatorce.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,14");
    }//GEN-LAST:event_jButtonCatorceActionPerformed

    private void jButtonVeintiCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiCuatroActionPerformed
        jButtonVeintiCuatro.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,24");
    }//GEN-LAST:event_jButtonVeintiCuatroActionPerformed

    private void jButtonTreintaYCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreintaYCuatroActionPerformed
        jButtonTreintaYCuatro.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,34");
    }//GEN-LAST:event_jButtonTreintaYCuatroActionPerformed

    private void jButtonCuarentaYCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYCuatroActionPerformed
        jButtonCuarentaYCuatro.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,44");
    }//GEN-LAST:event_jButtonCuarentaYCuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        jButtonCinco.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,5");
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonQuinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuinceActionPerformed
        jButtonQuince.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,15");
    }//GEN-LAST:event_jButtonQuinceActionPerformed

    private void jButtonVeinticincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeinticincoActionPerformed
        jButtonVeinticinco.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,25");
    }//GEN-LAST:event_jButtonVeinticincoActionPerformed

    private void jButtonTrentayCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentayCincoActionPerformed
        jButtonTrentayCinco.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,35");
    }//GEN-LAST:event_jButtonTrentayCincoActionPerformed

    private void jButtonCuarentaYCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYCincoActionPerformed
        jButtonCuarentaYCinco.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,45");
    }//GEN-LAST:event_jButtonCuarentaYCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        jButtonSeis.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,6");

    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonDiecieisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiecieisActionPerformed
        jButtonDiecieis.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,16");

    }//GEN-LAST:event_jButtonDiecieisActionPerformed

    private void jButtonVeintiSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiSeisActionPerformed
        jButtonVeintiSeis.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,26");

    }//GEN-LAST:event_jButtonVeintiSeisActionPerformed

    private void jButtonTrentaYSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentaYSeisActionPerformed
        jButtonTrentaYSeis.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,36");

    }//GEN-LAST:event_jButtonTrentaYSeisActionPerformed

    private void jButtonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSieteActionPerformed
        jButtonSiete.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,7");

    }//GEN-LAST:event_jButtonSieteActionPerformed

    private void jButtonCuarentaYSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYSeisActionPerformed
        jButtonCuarentaYSeis.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,46");

    }//GEN-LAST:event_jButtonCuarentaYSeisActionPerformed

    private void jButtonDiesisiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiesisiteActionPerformed
        jButtonDiesisite.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,17");

    }//GEN-LAST:event_jButtonDiesisiteActionPerformed

    private void jButtonVeintiSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiSieteActionPerformed
        jButtonVeintiSiete.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,27");

    }//GEN-LAST:event_jButtonVeintiSieteActionPerformed

    private void jButtonTrentaYSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentaYSieteActionPerformed
        jButtonTrentaYSiete.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,37");

    }//GEN-LAST:event_jButtonTrentaYSieteActionPerformed

    private void jButtonCuarentaYSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYSieteActionPerformed
        jButtonCuarentaYSiete.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,47");

    }//GEN-LAST:event_jButtonCuarentaYSieteActionPerformed

    private void jButtonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOchoActionPerformed
        jButtonOcho.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,8");

    }//GEN-LAST:event_jButtonOchoActionPerformed

    private void jButtonDieciOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDieciOchoActionPerformed
        jButtonDieciOcho.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,18");

    }//GEN-LAST:event_jButtonDieciOchoActionPerformed

    private void jButtonVeintiOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiOchoActionPerformed
        jButtonVeintiOcho.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,28");

    }//GEN-LAST:event_jButtonVeintiOchoActionPerformed

    private void jButtonTrentaYOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentaYOchoActionPerformed
        jButtonTrentaYOcho.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,38");

    }//GEN-LAST:event_jButtonTrentaYOchoActionPerformed

    private void jButtonCuarentayOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentayOchoActionPerformed
        jButtonCuarentayOcho.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,48");

    }//GEN-LAST:event_jButtonCuarentayOchoActionPerformed

    private void jButtonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNueveActionPerformed
        jButtonNueve.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,9");

    }//GEN-LAST:event_jButtonNueveActionPerformed

    private void jButtonDieciNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDieciNueveActionPerformed
        jButtonDieciNueve.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,19");

    }//GEN-LAST:event_jButtonDieciNueveActionPerformed

    private void jButtonVeintiNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeintiNueveActionPerformed
        jButtonVeintiNueve.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,29");

    }//GEN-LAST:event_jButtonVeintiNueveActionPerformed

    private void jButtonTreintaYNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreintaYNueveActionPerformed
        jButtonTreintaYNueve.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,39");

    }//GEN-LAST:event_jButtonTreintaYNueveActionPerformed

    private void jButtonCuarentaYNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaYNueveActionPerformed
        jButtonCuarentaYNueve.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,49");


    }//GEN-LAST:event_jButtonCuarentaYNueveActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
 
        int[] numeros = bonoloto();

        String[] numeros2 = miArray;
        mostrarNumeros(numeros,numeros2);
  

    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextPane1.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCuarentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuarentaActionPerformed
        jButtonCuarenta.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,40");

    }//GEN-LAST:event_jButtonCuarentaActionPerformed

    private void jButtonTrentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrentaActionPerformed
        jButtonTrenta.setBackground(Color.YELLOW);
        jTextPane1.setText(jTextPane1.getText() + " ,30");
    }//GEN-LAST:event_jButtonTrentaActionPerformed
    public int[] bonoloto() {
        Random aleatorio = new Random();

        int[] juego = new int[6];

        for (int posicion = 0; posicion < juego.length; posicion++) {

            int num = aleatorio.nextInt(50);

            juego[posicion] = num;

        }

        return juego;
    }

    private void mostrarNumeros(int[] juego, String[] miArray) {
  
        String contenido = "";
        String textoNumeros = Arrays.toString(juego);

        for (int i = 0; i < miArray.length; i++) {
            contenido += miArray[i] + "\n";

            jTextPane1.setText("El numero introducido  es :\n" + contenido
                    + " El resultado es : \n" + textoNumeros);
        }
    

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButtonCatorce;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonCuarenta;
    private javax.swing.JButton jButtonCuarentaYCinco;
    private javax.swing.JButton jButtonCuarentaYCuatro;
    private javax.swing.JButton jButtonCuarentaYNueve;
    private javax.swing.JButton jButtonCuarentaYSeis;
    private javax.swing.JButton jButtonCuarentaYSiete;
    private javax.swing.JButton jButtonCuarentaYUno;
    private javax.swing.JButton jButtonCuarentaYtres;
    private javax.swing.JButton jButtonCuarentayOcho;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDieciNueve;
    private javax.swing.JButton jButtonDieciOcho;
    private javax.swing.JButton jButtonDiecieis;
    private javax.swing.JButton jButtonDiesisite;
    private javax.swing.JButton jButtonDoce;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonNueve;
    private javax.swing.JButton jButtonOcho;
    private javax.swing.JButton jButtonOnce;
    private javax.swing.JButton jButtonQuince;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonTrece;
    private javax.swing.JButton jButtonTreintaYCuatro;
    private javax.swing.JButton jButtonTreintaYNueve;
    private javax.swing.JButton jButtonTreintaYTres;
    private javax.swing.JButton jButtonTrenta;
    private javax.swing.JButton jButtonTrentaYDos;
    private javax.swing.JButton jButtonTrentaYOcho;
    private javax.swing.JButton jButtonTrentaYSeis;
    private javax.swing.JButton jButtonTrentaYSiete;
    private javax.swing.JButton jButtonTrentayCinco;
    private javax.swing.JButton jButtonTrentayUno;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JButton jButtonVeinte;
    private javax.swing.JButton jButtonVeintiCuatro;
    private javax.swing.JButton jButtonVeintiDos;
    private javax.swing.JButton jButtonVeintiNueve;
    private javax.swing.JButton jButtonVeintiOcho;
    private javax.swing.JButton jButtonVeintiSeis;
    private javax.swing.JButton jButtonVeintiSiete;
    private javax.swing.JButton jButtonVeintiTres;
    private javax.swing.JButton jButtonVeintiUno;
    private javax.swing.JButton jButtonVeinticinco;
    private javax.swing.JButton jButtoncuarentaYDos;
    private javax.swing.JButton jButtondiez;
    private javax.swing.JLabel jLUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextPane1;
    // End of variables declaration//GEN-END:variables

}
