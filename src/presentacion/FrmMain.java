package presentacion;

import javax.swing.JOptionPane;

public class FrmMain extends javax.swing.JFrame {

    double MA[][] = null;
    double MB[][] = null;
    double MC[][] = null;
    String cadenaA = "";
    String cadenaB = "";
    int i = 0;
    int j = 0;

    public FrmMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaMA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMB = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaMCNormal = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNFilasA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNColA = new javax.swing.JTextField();
        btnCrearA = new javax.swing.JButton();
        txtNumeroA = new javax.swing.JTextField();
        btnAgregarA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNumA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNFilasB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNColB = new javax.swing.JTextField();
        btnCrearB = new javax.swing.JButton();
        txtNumeroB = new javax.swing.JTextField();
        btnAgregarB = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblNumB = new javax.swing.JLabel();
        btnLlenar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaMCHilos = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblTiempoHilos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaMA.setEditable(false);
        txaMA.setColumns(20);
        txaMA.setRows(5);
        jScrollPane1.setViewportView(txaMA);

        txaMB.setEditable(false);
        txaMB.setColumns(20);
        txaMB.setRows(5);
        jScrollPane2.setViewportView(txaMB);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("=");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("X");

        txaMCNormal.setColumns(20);
        txaMCNormal.setRows(5);
        jScrollPane3.setViewportView(txaMCNormal);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Matriz A");

        jLabel5.setText("N° Col");

        btnCrearA.setText("Crear Matriz");
        btnCrearA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAActionPerformed(evt);
            }
        });

        txtNumeroA.setEnabled(false);

        btnAgregarA.setText("Agregar");
        btnAgregarA.setEnabled(false);
        btnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAActionPerformed(evt);
            }
        });

        jLabel6.setText("Número");

        lblNumA.setText("M[0][0]");

        jLabel11.setText("N° Filas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(txtNFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNColA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(btnCrearA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumeroA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblNumA)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNColA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCrearA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblNumA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarA)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Matriz B");

        jLabel8.setText("N° Filas");

        txtNFilasB.setEnabled(false);

        jLabel9.setText("N° Col");

        btnCrearB.setText("Crear Matriz");
        btnCrearB.setEnabled(false);
        btnCrearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBActionPerformed(evt);
            }
        });

        txtNumeroB.setEnabled(false);

        btnAgregarB.setText("Agregar");
        btnAgregarB.setEnabled(false);
        btnAgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBActionPerformed(evt);
            }
        });

        jLabel10.setText("Número");

        lblNumB.setText("M[0][0]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtNColB)))
                        .addGap(30, 30, 30)
                        .addComponent(btnCrearB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNumeroB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblNumB)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNColB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCrearB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblNumB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarB)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38))
        );

        btnLlenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLlenar.setText("Llenar Matrices");
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        txaMCHilos.setColumns(20);
        txaMCHilos.setRows(5);
        jScrollPane4.setViewportView(txaMCHilos);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Multiplicación usando hilos");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Multiplicación normal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTiempo)
                            .addComponent(lblTiempoHilos))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1)
                        .addComponent(lblTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTiempoHilos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAActionPerformed

        String fa = txtNFilasA.getText();
        String ca = txtNColA.getText();

        if (!fa.equals("") && !ca.equals("")) {
            int filasMA = Integer.parseInt(fa);
            int columnasMA = Integer.parseInt(ca);

            MA = new double[filasMA][columnasMA];
            txtNFilasB.setText(ca);
            btnCrearB.setEnabled(true);
        }

    }//GEN-LAST:event_btnCrearAActionPerformed

    private void btnCrearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBActionPerformed
        
        String fb = txtNFilasB.getText();
        String cb = txtNColB.getText();
        if (!fb.equals("") && !cb.equals("")) {
            int filasMB = Integer.parseInt(fb);
            int columnasMB = Integer.parseInt(cb);

            MB = new double[filasMB][columnasMB];
        }
    }//GEN-LAST:event_btnCrearBActionPerformed

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed
      
        if (MA != null && MB != null) {
            btnAgregarA.setEnabled(true);
            btnAgregarB.setEnabled(true);
            txtNumeroA.setEnabled(true);
            txtNumeroB.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe crear las matrices a multiplicar");
        }
    }//GEN-LAST:event_btnLlenarActionPerformed

    private void btnAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAActionPerformed
        try {
            MA[i][j] = Double.parseDouble(txtNumeroA.getText());
            cadenaA += txtNumeroA.getText() + "  ";
            txaMA.setText(cadenaA);
            j++;
            if (j >= MA[0].length) {
                i++;
                j = 0;
                if (i >= MA.length) {
                    i = 0;
                    j = 0;
                    btnAgregarA.setEnabled(false);
                    btnAgregarB.setEnabled(true);
                    lblNumA.setText("");
                } else {
                    cadenaA += "\n";
                    lblNumA.setText("M[" + i + "][" + j + "]");
                }
            } else {
                lblNumA.setText("M[" + i + "][" + j + "]");
            }
            txtNumeroA.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número", "", 0);
        }

    }//GEN-LAST:event_btnAgregarAActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
     
        if (MC != null) {
            long inicialTime;
            long tiempo;

            MultiplicacionNormal MN = new MultiplicacionNormal();
            MultiplicacionHilos MH = new MultiplicacionHilos();
            txaMA.setText(imprimeMatriz(MA));
            txaMB.setText(imprimeMatriz(MB));

            inicialTime = System.currentTimeMillis();
            MC = MN.multiplicar(MA, MB);
            tiempo = System.currentTimeMillis() - inicialTime;
            lblTiempo.setText("Calculado en " + tiempo + " milisegundos");
            txaMCNormal.setText(imprimeMatriz(MC));

            inicialTime = System.currentTimeMillis();
            MC = MH.multiplicar(MA, MB);
            tiempo = System.currentTimeMillis() - inicialTime;
            lblTiempoHilos.setText("Calculado en " + tiempo + " milisegundos");
            txaMCHilos.setText(imprimeMatriz(MC));

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar las matrices a multiplicar");
        }


    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private String imprimeMatriz(double[][] Matriz) {
        String resultado = "";
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                resultado += Matriz[i][j] + "     ";
            }
            resultado += "\n";
        }
        return resultado;
    }
    private void btnAgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBActionPerformed
  
        try {
            MB[i][j] = Double.parseDouble(txtNumeroB.getText());
            cadenaB += txtNumeroB.getText() + "  ";
            txaMB.setText(cadenaB);

            j++;

            if (j >= MB[0].length) {
                i++;
                j = 0;
                if (i >= MB.length) {
                    i = 0;
                    j = 0;
                    btnAgregarB.setEnabled(false);
                    lblNumB.setText("");
                    MC = new double[MA.length][MB[0].length];
                } else {
                    cadenaB += "\n";
                    lblNumB.setText("M[" + i + "][" + j + "]");
                }
            } else {
                lblNumB.setText("M[" + i + "][" + j + "]");
            }
            txtNumeroB.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número", "", 0);
        }
    }//GEN-LAST:event_btnAgregarBActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    
        MA = null;
        MB = null;
        MC = null;
        txtNColA.setText("");
        txtNColB.setText("");
        txtNFilasA.setText("");
        txtNFilasB.setText("");
        txaMA.setText("");
        txaMB.setText("");
        txaMCNormal.setText("");
        txaMCHilos.setText("");
        lblTiempo.setText("");
        lblTiempoHilos.setText("");
        cadenaA = "";
        cadenaB = "";
        txtNFilasA.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed


//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JButton btnAgregarB;
    private javax.swing.JButton btnCrearA;
    private javax.swing.JButton btnCrearB;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNumA;
    private javax.swing.JLabel lblNumB;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempoHilos;
    private javax.swing.JTextArea txaMA;
    private javax.swing.JTextArea txaMB;
    private javax.swing.JTextArea txaMCHilos;
    private javax.swing.JTextArea txaMCNormal;
    private javax.swing.JTextField txtNColA;
    private javax.swing.JTextField txtNColB;
    private javax.swing.JTextField txtNFilasA;
    private javax.swing.JTextField txtNFilasB;
    private javax.swing.JTextField txtNumeroA;
    private javax.swing.JTextField txtNumeroB;
    // End of variables declaration//GEN-END:variables
}
