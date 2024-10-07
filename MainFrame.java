/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.*;
import java.sql.SQLException;

/**
 *
 * @author Afei
 */
public class MainFrame extends javax.swing.JFrame {
    int numberPosition = 0;
    databaseConnection dbConnector = new databaseConnection();
    String [][] ArraySoaldanJawaban;
    String [] ArrayOfAnswers = new String[16];
    Boolean [] ArrayOfAnswerStatus = new Boolean[16];
    SelectMatkulDanBabFrame selectFrame = new SelectMatkulDanBabFrame();
    public MainFrame(){

    }
    public MainFrame(int matkulId, int bagianId) throws SQLException {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        if(matkulId == 1){
            if(bagianId == 1) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul1Bagian1();
            else if(bagianId == 2) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul1Bagian2();
            else if(bagianId == 3) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul1Bagian3();
            else if(bagianId == 4) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul1Bagian4();
        }
        else if(matkulId == 2){
            if(bagianId == 1) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul2Bagian1();
            else if(bagianId == 2) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul2Bagian2();
            else if(bagianId == 3) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul2Bagian3();
            else if(bagianId == 4) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul2Bagian4();
        }
        else if(matkulId == 3){
            if(bagianId == 1) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul3Bagian1();
            else if(bagianId == 2) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul3Bagian2();
            else if(bagianId == 3) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul3Bagian3();
            else if(bagianId == 4) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul3Bagian4();
        }
        else if(matkulId == 4){
            if(bagianId == 1) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul4Bagian1();
            else if(bagianId == 2) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul4Bagian2();
            else if(bagianId == 3) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul4Bagian3();
            else if(bagianId == 4) this.ArraySoaldanJawaban = this.dbConnector.ImportSoaldanJawabanMatkul4Bagian4();
        }

        for(int i=0; i<16; i++){
            ArrayOfAnswerStatus[i] = false;
            ArrayOfAnswers[i] = "";
        }
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDialog1 = new javax.swing.JDialog();
        PanelJudul = new javax.swing.JPanel();
        LabelJudulUtama = new javax.swing.JLabel();
        PanelUtamaDaftarSoal = new javax.swing.JPanel();
        PanelJudulDaftarSoal = new javax.swing.JPanel();
        LabelJudulDaftarSoal = new javax.swing.JLabel();
        PanelDaftarSoal = new javax.swing.JPanel();
        Soal1 = new javax.swing.JButton();
        Soal2 = new javax.swing.JButton();
        Soal3 = new javax.swing.JButton();
        Soal4 = new javax.swing.JButton();
        Soal5 = new javax.swing.JButton();
        Soal6 = new javax.swing.JButton();
        Soal7 = new javax.swing.JButton();
        Soal8 = new javax.swing.JButton();
        Soal9 = new javax.swing.JButton();
        Soal10 = new javax.swing.JButton();
        Soal11 = new javax.swing.JButton();
        Soal12 = new javax.swing.JButton();
        Soal13 = new javax.swing.JButton();
        Soal14 = new javax.swing.JButton();
        Soal15 = new javax.swing.JButton();
        Soal16 = new javax.swing.JButton();
        PanelPreviousNextFinish = new javax.swing.JPanel();
        PanelNext = new javax.swing.JPanel();
        JudulNextButton = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();
        PanelPrevious = new javax.swing.JPanel();
        JudulPreviousButton = new javax.swing.JLabel();
        PreviousButton = new javax.swing.JButton();
        PanelFinish = new javax.swing.JPanel();
        JudulFinishButton = new javax.swing.JLabel();
        FinishButton = new javax.swing.JButton();
        PanelUtamaSoaldanPilihan = new javax.swing.JPanel();
        PanelSoal = new javax.swing.JPanel();
        LabelSoal = new javax.swing.JLabel();
        PanelUtamaPilihan = new javax.swing.JPanel();
        PanelUtamaPilihan1 = new javax.swing.JPanel();
        PanelButtonPilihan1 = new javax.swing.JPanel();
        ButtonPilihan1 = new javax.swing.JButton();
        PanelJawabanPilihan1 = new javax.swing.JPanel();
        LabelPilihan1 = new javax.swing.JLabel();
        PanelUtamaPilihan2 = new javax.swing.JPanel();
        PanelButtonPilihan2 = new javax.swing.JPanel();
        ButtonPilihan2 = new javax.swing.JButton();
        PanelJawabanPilihan2 = new javax.swing.JPanel();
        LabelPilihan2 = new javax.swing.JLabel();
        PanelUtamaPilihan3 = new javax.swing.JPanel();
        PanelButtonPilihan3 = new javax.swing.JPanel();
        ButtonPilihan3 = new javax.swing.JButton();
        PanelJawabanPilihan3 = new javax.swing.JPanel();
        LabelJawabanPilihan3 = new javax.swing.JLabel();
        PanelUtamaPilihan4 = new javax.swing.JPanel();
        PanelButtonPilihan4 = new javax.swing.JPanel();
        ButtonPilihan4 = new javax.swing.JButton();
        PanelJawabanPilihan4 = new javax.swing.JPanel();
        LabelJawabanPilihan4 = new javax.swing.JLabel();

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
        setTitle("QuizWizz");
        setMinimumSize(new java.awt.Dimension(900, 750));

        PanelJudul.setMinimumSize(new java.awt.Dimension(300, 300));
        PanelJudul.setPreferredSize(new java.awt.Dimension(746, 75));
        PanelJudul.setLayout(new java.awt.GridLayout(1, 0));

        LabelJudulUtama.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        LabelJudulUtama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelJudulUtama.setText("Aplikasi Kuis Seadanya Karena Kerjanya SKS (Sistem Kebut Semalam)");
        LabelJudulUtama.setMaximumSize(new java.awt.Dimension(200, 100));
        LabelJudulUtama.setMinimumSize(new java.awt.Dimension(100, 100));
        PanelJudul.add(LabelJudulUtama);

        getContentPane().add(PanelJudul, java.awt.BorderLayout.NORTH);

        PanelUtamaDaftarSoal.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        PanelUtamaDaftarSoal.setFocusCycleRoot(true);
        PanelUtamaDaftarSoal.setMaximumSize(new java.awt.Dimension(125, 100));
        PanelUtamaDaftarSoal.setMinimumSize(new java.awt.Dimension(125, 33));
        PanelUtamaDaftarSoal.setPreferredSize(new java.awt.Dimension(125, 58));
        PanelUtamaDaftarSoal.setLayout(new java.awt.BorderLayout());

        PanelJudulDaftarSoal.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 15, 0));
        PanelJudulDaftarSoal.setMaximumSize(new java.awt.Dimension(32767, 100));
        PanelJudulDaftarSoal.setPreferredSize(new java.awt.Dimension(100, 100));
        PanelJudulDaftarSoal.setLayout(new java.awt.GridLayout(1, 0));

        LabelJudulDaftarSoal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelJudulDaftarSoal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelJudulDaftarSoal.setText("Question List");
        LabelJudulDaftarSoal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelJudulDaftarSoal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelJudulDaftarSoal.setOpaque(true);
        PanelJudulDaftarSoal.add(LabelJudulDaftarSoal);

        PanelUtamaDaftarSoal.add(PanelJudulDaftarSoal, java.awt.BorderLayout.NORTH);

        Soal1.setText("1");
        Soal1.setFocusable(false);
        Soal1.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal1ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal1);

        Soal2.setText("2");
        Soal2.setFocusable(false);
        Soal2.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal2ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal2);

        Soal3.setText("3");
        Soal3.setFocusable(false);
        Soal3.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal3ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal3);

        Soal4.setText("4");
        Soal4.setFocusable(false);
        Soal4.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal4ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal4);

        Soal5.setText("5");
        Soal5.setFocusable(false);
        Soal5.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal5ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal5);

        Soal6.setText("6");
        Soal6.setFocusable(false);
        Soal6.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal6ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal6);

        Soal7.setText("7");
        Soal7.setFocusable(false);
        Soal7.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal7ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal7);

        Soal8.setText("8");
        Soal8.setFocusable(false);
        Soal8.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal8ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal8);

        Soal9.setText("9");
        Soal9.setFocusable(false);
        Soal9.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal9ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal9);

        Soal10.setText("10");
        Soal10.setFocusable(false);
        Soal10.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal10ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal10);

        Soal11.setText("11");
        Soal11.setFocusable(false);
        Soal11.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal11ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal11);

        Soal12.setText("12");
        Soal12.setFocusable(false);
        Soal12.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal12ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal12);

        Soal13.setText("13");
        Soal13.setFocusable(false);
        Soal13.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal13ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal13);

        Soal14.setText("14");
        Soal14.setFocusable(false);
        Soal14.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal14ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal14);

        Soal15.setText("15");
        Soal15.setFocusable(false);
        Soal15.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal15ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal15);

        Soal16.setText("16");
        Soal16.setFocusable(false);
        Soal16.setPreferredSize(new java.awt.Dimension(50, 23));
        Soal16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Soal16ActionPerformed(evt);
            }
        });
        PanelDaftarSoal.add(Soal16);

        PanelUtamaDaftarSoal.add(PanelDaftarSoal, java.awt.BorderLayout.CENTER);

        PanelPreviousNextFinish.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 45, 0));
        PanelPreviousNextFinish.setLayout(new java.awt.BorderLayout());

        PanelNext.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 15));
        PanelNext.setLayout(new java.awt.BorderLayout());

        JudulNextButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JudulNextButton.setText("Next Button");
        JudulNextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelNext.add(JudulNextButton, java.awt.BorderLayout.NORTH);

        NextButton.setText("-->");
        NextButton.setFocusable(false);
        NextButton.setPreferredSize(new java.awt.Dimension(60, 23));
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        PanelNext.add(NextButton, java.awt.BorderLayout.CENTER);

        PanelPreviousNextFinish.add(PanelNext, java.awt.BorderLayout.NORTH);

        PanelPrevious.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 15));
        PanelPrevious.setLayout(new java.awt.BorderLayout());

        JudulPreviousButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JudulPreviousButton.setText("Previous Button");
        JudulPreviousButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrevious.add(JudulPreviousButton, java.awt.BorderLayout.NORTH);

        PreviousButton.setText("<--");
        PreviousButton.setFocusable(false);
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });
        PanelPrevious.add(PreviousButton, java.awt.BorderLayout.SOUTH);

        PanelPreviousNextFinish.add(PanelPrevious, java.awt.BorderLayout.CENTER);

        PanelFinish.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 15));
        PanelFinish.setLayout(new java.awt.BorderLayout());

        JudulFinishButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JudulFinishButton.setText("Finish Button");
        JudulFinishButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelFinish.add(JudulFinishButton, java.awt.BorderLayout.NORTH);

        FinishButton.setText("Fin");
        FinishButton.setFocusable(false);
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });
        PanelFinish.add(FinishButton, java.awt.BorderLayout.SOUTH);

        PanelPreviousNextFinish.add(PanelFinish, java.awt.BorderLayout.PAGE_END);

        PanelUtamaDaftarSoal.add(PanelPreviousNextFinish, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(PanelUtamaDaftarSoal, java.awt.BorderLayout.WEST);

        PanelUtamaSoaldanPilihan.setLayout(new java.awt.BorderLayout());

        PanelSoal.setPreferredSize(new java.awt.Dimension(621, 100));
        PanelSoal.setLayout(new java.awt.GridLayout(1, 0));

        LabelSoal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelSoal.setText(ArraySoaldanJawaban[0][numberPosition]);
        LabelSoal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 95, 1, 1));
        LabelSoal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelSoal.add(LabelSoal);

        PanelUtamaSoaldanPilihan.add(PanelSoal, java.awt.BorderLayout.NORTH);

        PanelUtamaPilihan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelUtamaPilihan.setEnabled(false);
        PanelUtamaPilihan.setLayout(new javax.swing.BoxLayout(PanelUtamaPilihan, javax.swing.BoxLayout.Y_AXIS));

        PanelUtamaPilihan1.setPreferredSize(new Dimension(PanelUtamaPilihan1.getWidth(),PanelUtamaPilihan.getHeight()/4));
        PanelUtamaPilihan1.setLayout(new java.awt.BorderLayout());

        PanelButtonPilihan1.setPreferredSize(new java.awt.Dimension(100, 100));
        PanelButtonPilihan1.setLayout(new java.awt.GridBagLayout());

        ButtonPilihan1.setText("A");
        ButtonPilihan1.setFocusable(false);
        ButtonPilihan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonPilihan1.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonPilihan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilihan1ActionPerformed(evt);
            }
        });
        PanelButtonPilihan1.add(ButtonPilihan1, new java.awt.GridBagConstraints());

        PanelUtamaPilihan1.add(PanelButtonPilihan1, java.awt.BorderLayout.WEST);

        PanelJawabanPilihan1.setLayout(new java.awt.GridLayout(1, 0));

        LabelPilihan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelPilihan1.setText(ArraySoaldanJawaban[1][numberPosition]);
        LabelPilihan1.setToolTipText("");
        LabelPilihan1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PanelJawabanPilihan1.add(LabelPilihan1);

        PanelUtamaPilihan1.add(PanelJawabanPilihan1, java.awt.BorderLayout.CENTER);

        PanelUtamaPilihan.add(PanelUtamaPilihan1);

        PanelUtamaPilihan2.setPreferredSize(new Dimension(PanelUtamaPilihan2.getWidth(),PanelUtamaPilihan.getHeight()/4));
        PanelUtamaPilihan2.setLayout(new java.awt.BorderLayout());

        PanelButtonPilihan2.setPreferredSize(new java.awt.Dimension(100, 100));
        PanelButtonPilihan2.setLayout(new java.awt.GridBagLayout());

        ButtonPilihan2.setText("B");
        ButtonPilihan2.setFocusable(false);
        ButtonPilihan2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonPilihan2.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonPilihan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilihan2ActionPerformed(evt);
            }
        });
        PanelButtonPilihan2.add(ButtonPilihan2, new java.awt.GridBagConstraints());

        PanelUtamaPilihan2.add(PanelButtonPilihan2, java.awt.BorderLayout.WEST);

        PanelJawabanPilihan2.setLayout(new java.awt.GridLayout(1, 0));

        LabelPilihan2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelPilihan2.setText(ArraySoaldanJawaban[2][numberPosition]);
        LabelPilihan2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelJawabanPilihan2.add(LabelPilihan2);

        PanelUtamaPilihan2.add(PanelJawabanPilihan2, java.awt.BorderLayout.CENTER);

        PanelUtamaPilihan.add(PanelUtamaPilihan2);

        PanelUtamaPilihan3.setPreferredSize(new Dimension(PanelUtamaPilihan3.getWidth(),PanelUtamaPilihan.getHeight()/4));
        PanelUtamaPilihan3.setLayout(new java.awt.BorderLayout());

        PanelButtonPilihan3.setPreferredSize(new java.awt.Dimension(100, 100));
        PanelButtonPilihan3.setLayout(new java.awt.GridBagLayout());

        ButtonPilihan3.setText("C");
        ButtonPilihan3.setFocusable(false);
        ButtonPilihan3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonPilihan3.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonPilihan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilihan3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 0, 33, 0);
        PanelButtonPilihan3.add(ButtonPilihan3, gridBagConstraints);

        PanelUtamaPilihan3.add(PanelButtonPilihan3, java.awt.BorderLayout.WEST);

        PanelJawabanPilihan3.setLayout(new java.awt.GridLayout(1, 0));

        LabelJawabanPilihan3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelJawabanPilihan3.setText(ArraySoaldanJawaban[3][numberPosition]);
        LabelJawabanPilihan3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelJawabanPilihan3.add(LabelJawabanPilihan3);

        PanelUtamaPilihan3.add(PanelJawabanPilihan3, java.awt.BorderLayout.CENTER);

        PanelUtamaPilihan.add(PanelUtamaPilihan3);

        PanelUtamaPilihan4.setPreferredSize(new Dimension(PanelUtamaPilihan4.getWidth(),PanelUtamaPilihan.getHeight()/4));
        PanelUtamaPilihan4.setLayout(new java.awt.BorderLayout());

        PanelButtonPilihan4.setPreferredSize(new java.awt.Dimension(100, 100));
        PanelButtonPilihan4.setLayout(new java.awt.GridBagLayout());

        ButtonPilihan4.setText("D");
        ButtonPilihan4.setFocusable(false);
        ButtonPilihan4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonPilihan4.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonPilihan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilihan4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 31, 0);
        PanelButtonPilihan4.add(ButtonPilihan4, gridBagConstraints);

        PanelUtamaPilihan4.add(PanelButtonPilihan4, java.awt.BorderLayout.WEST);

        PanelJawabanPilihan4.setLayout(new java.awt.GridLayout(1, 0));

        LabelJawabanPilihan4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelJawabanPilihan4.setText(ArraySoaldanJawaban[4][numberPosition]);
        LabelJawabanPilihan4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelJawabanPilihan4.add(LabelJawabanPilihan4);

        PanelUtamaPilihan4.add(PanelJawabanPilihan4, java.awt.BorderLayout.CENTER);

        PanelUtamaPilihan.add(PanelUtamaPilihan4);

        PanelUtamaSoaldanPilihan.add(PanelUtamaPilihan, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelUtamaSoaldanPilihan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void Soal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal5ActionPerformed
        if(evt.getSource()==Soal5){
            numberPosition = 4;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal5ActionPerformed

    private void Soal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal6ActionPerformed
        if(evt.getSource()==Soal6){
            numberPosition = 5;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal6ActionPerformed

    private void Soal12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal12ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal12){
            numberPosition = 11;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal12ActionPerformed

    private void Soal13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal13ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal13){
            numberPosition = 12;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal13ActionPerformed

    private void Soal15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal15ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal15){
            numberPosition = 14;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal15ActionPerformed

    private void Soal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal1){
            numberPosition = 0;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal1ActionPerformed

    private void Soal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal2){
            numberPosition = 1;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal2ActionPerformed

    private void Soal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal3){
            numberPosition = 2;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal3ActionPerformed

    private void Soal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal4ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal4){
            numberPosition = 3;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal4ActionPerformed

    private void Soal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal7ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal7){
            numberPosition = 6;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal7ActionPerformed

    private void Soal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal8ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal8){
            numberPosition = 7;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal8ActionPerformed

    private void Soal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal9ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal9){
            numberPosition = 8;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal9ActionPerformed

    private void Soal10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal10ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal10){
            numberPosition = 9;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal10ActionPerformed

    private void Soal11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal11ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal11){
            numberPosition = 10;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal11ActionPerformed

    private void Soal14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal14ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal14){
            numberPosition = 13;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal14ActionPerformed

    private void Soal16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Soal16ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Soal16){
            numberPosition = 15;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_Soal16ActionPerformed

    private void ButtonPilihan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPilihan1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==ButtonPilihan1){
            ArrayOfAnswers[numberPosition] = "jawaban1";
            if(!ArrayOfAnswerStatus[numberPosition]){
                ArrayOfAnswerStatus[numberPosition] = true;
            }
            else{
                AnyActionPerformed(evt);
            }
            ButtonPilihan1.setBackground(Color.green);
            ButtonPilihan1.setOpaque(true);
            this.revalidate();
        }
    }//GEN-LAST:event_ButtonPilihan1ActionPerformed

    private void ButtonPilihan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPilihan2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==ButtonPilihan2){
            ArrayOfAnswers[numberPosition] = "jawaban2";
            if(!ArrayOfAnswerStatus[numberPosition]){
                ArrayOfAnswerStatus[numberPosition] = true;
            }
            else{
                AnyActionPerformed(evt);
            }
            ButtonPilihan2.setBackground(Color.green);
            ButtonPilihan2.setOpaque(true);
            this.revalidate();
        }
    }//GEN-LAST:event_ButtonPilihan2ActionPerformed

    private void ButtonPilihan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPilihan3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==ButtonPilihan3){
            ArrayOfAnswers[numberPosition] = "jawaban3";
            if(!ArrayOfAnswerStatus[numberPosition]){
                ArrayOfAnswerStatus[numberPosition] = true;
            }
            else{
                AnyActionPerformed(evt);
            }
            ButtonPilihan3.setBackground(Color.green);
            ButtonPilihan3.setOpaque(true);
            this.revalidate();
        }
    }//GEN-LAST:event_ButtonPilihan3ActionPerformed

    private void ButtonPilihan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==ButtonPilihan4){
            ArrayOfAnswers[numberPosition] = "jawaban4";
            if(!ArrayOfAnswerStatus[numberPosition]){
                ArrayOfAnswerStatus[numberPosition] = true;
            }
            else{
                AnyActionPerformed(evt);
            }
            ButtonPilihan4.setBackground(Color.green);
            ButtonPilihan4.setOpaque(true);
            this.revalidate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        if(numberPosition<15){
            numberPosition++;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed
        // TODO add your handling code here:
        if(numberPosition>0){
            numberPosition--;
            AnyActionPerformed(evt);
        }
    }//GEN-LAST:event_PreviousButtonActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        int nilaiTotal = 0;
        for(int i=0; i<16; i++){
            if(ArrayOfAnswers[i].equals(ArraySoaldanJawaban[5][i])){
                nilaiTotal += 10;
            }
        }
        int persentase = (nilaiTotal*100)/160;
        ScoreDisplayFrame scoreFrame = new ScoreDisplayFrame(persentase);
        this.setVisible(false);
        scoreFrame.setVisible(true);
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void AnyActionPerformed(java.awt.event.ActionEvent evt){
        LabelSoal.setText(ArraySoaldanJawaban[0][numberPosition]);
        LabelPilihan1.setText(ArraySoaldanJawaban[1][numberPosition]);
        LabelPilihan2.setText(ArraySoaldanJawaban[2][numberPosition]);
        LabelJawabanPilihan3.setText(ArraySoaldanJawaban[3][numberPosition]);
        LabelJawabanPilihan4.setText(ArraySoaldanJawaban[4][numberPosition]);

        ButtonPilihan1.setBackground(null);
        ButtonPilihan2.setBackground(null);
        ButtonPilihan3.setBackground(null);
        ButtonPilihan4.setBackground(null);

        if(ArrayOfAnswerStatus[numberPosition]==true){
            if(ArrayOfAnswers[numberPosition] == "jawaban1"){
                ButtonPilihan1.setBackground(Color.green);
                ButtonPilihan1.setOpaque(true);
            }
            else if(ArrayOfAnswers[numberPosition] == "jawaban2"){
                ButtonPilihan2.setBackground(Color.green);
                ButtonPilihan2.setOpaque(true);
            }
            else if(ArrayOfAnswers[numberPosition] == "jawaban3"){
                ButtonPilihan3.setBackground(Color.green);
                ButtonPilihan3.setOpaque(true);
            }
            else if(ArrayOfAnswers[numberPosition] == "jawaban4"){
                ButtonPilihan4.setBackground(Color.green);
                ButtonPilihan4.setOpaque(true);
            }
        }
        this.revalidate();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPilihan1;
    private javax.swing.JButton ButtonPilihan2;
    private javax.swing.JButton ButtonPilihan3;
    private javax.swing.JButton FinishButton;
    private javax.swing.JLabel JudulFinishButton;
    private javax.swing.JLabel JudulNextButton;
    private javax.swing.JLabel JudulPreviousButton;
    private javax.swing.JLabel LabelJawabanPilihan3;
    private javax.swing.JLabel LabelJawabanPilihan4;
    private javax.swing.JLabel LabelJudulDaftarSoal;
    private javax.swing.JLabel LabelJudulUtama;
    private javax.swing.JLabel LabelPilihan1;
    private javax.swing.JLabel LabelPilihan2;
    private javax.swing.JLabel LabelSoal;
    private javax.swing.JButton NextButton;
    private javax.swing.JPanel PanelButtonPilihan1;
    private javax.swing.JPanel PanelButtonPilihan2;
    private javax.swing.JPanel PanelButtonPilihan3;
    private javax.swing.JPanel PanelButtonPilihan4;
    private javax.swing.JPanel PanelDaftarSoal;
    private javax.swing.JPanel PanelFinish;
    private javax.swing.JPanel PanelJawabanPilihan1;
    private javax.swing.JPanel PanelJawabanPilihan2;
    private javax.swing.JPanel PanelJawabanPilihan3;
    private javax.swing.JPanel PanelJawabanPilihan4;
    private javax.swing.JPanel PanelJudul;
    private javax.swing.JPanel PanelJudulDaftarSoal;
    private javax.swing.JPanel PanelNext;
    private javax.swing.JPanel PanelPrevious;
    private javax.swing.JPanel PanelPreviousNextFinish;
    private javax.swing.JPanel PanelSoal;
    private javax.swing.JPanel PanelUtamaDaftarSoal;
    private javax.swing.JPanel PanelUtamaPilihan;
    private javax.swing.JPanel PanelUtamaPilihan1;
    private javax.swing.JPanel PanelUtamaPilihan2;
    private javax.swing.JPanel PanelUtamaPilihan3;
    private javax.swing.JPanel PanelUtamaPilihan4;
    private javax.swing.JPanel PanelUtamaSoaldanPilihan;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JButton Soal1;
    private javax.swing.JButton Soal10;
    private javax.swing.JButton Soal11;
    private javax.swing.JButton Soal12;
    private javax.swing.JButton Soal13;
    private javax.swing.JButton Soal14;
    private javax.swing.JButton Soal15;
    private javax.swing.JButton Soal16;
    private javax.swing.JButton Soal2;
    private javax.swing.JButton Soal3;
    private javax.swing.JButton Soal4;
    private javax.swing.JButton Soal5;
    private javax.swing.JButton Soal6;
    private javax.swing.JButton Soal7;
    private javax.swing.JButton Soal8;
    private javax.swing.JButton Soal9;
    private javax.swing.JButton ButtonPilihan4;
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}
