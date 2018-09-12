/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author rjbr
 */
public class FrmPing extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public FrmPing() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public String url, pingRes, pingCmd, mtr = "";
    public boolean ejecutar = true;
    Thread hilo = null;

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("img/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtWeb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPing = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArRes = new javax.swing.JTextArea();
        lblEMail = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        btnDetener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Herramienta de ping ");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtWeb.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtWeb.setText("www.google.com -t");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel1.setText("Resultado de PING");

        btnPing.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        btnPing.setText("Ping");
        btnPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setText("Sitio web:");

        txtArRes.setEditable(false);
        txtArRes.setColumns(20);
        txtArRes.setRows(5);
        jScrollPane1.setViewportView(txtArRes);

        lblEMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email.png"))); // NOI18N
        lblEMail.setToolTipText("Correo de contacto");
        lblEMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEMailMousePressed(evt);
            }
        });

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        lblInfo.setToolTipText("Información.");
        lblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInfoMousePressed(evt);
            }
        });

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPing, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDetener))))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(lblEMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDetener)
                            .addComponent(btnPing))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(lblInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPingActionPerformed
        if (hilo == null) {
            Runnable miRunnable = new Runnable() // clase runnable para reutlizarlo con los hilos
            {
                public void run() {
                    try {
                        while (ejecutar) {
                            url = txtWeb.getText();
                            pingRes = "";
                            //comando al cmd
                            pingCmd = "ping " + url + "";
                            try {
                                Runtime r = Runtime.getRuntime();
                                Process p = r.exec(pingCmd);

                                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                String inputLine;
                                while ((inputLine = in.readLine()) != null) {
                                    System.out.println(inputLine);
                                    pingRes += inputLine;
                                    mtr += inputLine + "\n";
                                    txtArRes.append("Haciendo ping a " + txtWeb.getText());
                                    txtArRes.setText(mtr + ""); // muestra en el jtext area

                                }

                                in.close();

                            } catch (IOException e) {
                                System.out.println(e);
                            }
                            Thread.sleep(100000);
                        }

                    } catch (java.lang.InterruptedException ie) {
                        System.out.println(ie.getMessage());
                    }
                }

            };
            hilo = new Thread(miRunnable);
            // iniciando el hilo
            hilo.start();
        }

    }//GEN-LAST:event_btnPingActionPerformed

    private void lblEMailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEMailMousePressed
        JOptionPane.showMessageDialog(null, "Contacto: rjbr39@gmail.com");        // TODO add your handling code here:
    }//GEN-LAST:event_lblEMailMousePressed

    private void lblInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMousePressed
        JOptionPane.showMessageDialog(null, "Herramienta de Ping y ping sostenido.");        // TODO add your handling code here:
    }//GEN-LAST:event_lblInfoMousePressed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        try {
            String[] cmd = {"taskkill", "/f", "/im", "ping.exe"}; //Comando de apagado en windows
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        this.hilo.stop();
        hilo = null;
    }//GEN-LAST:event_btnDetenerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnPing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextArea txtArRes;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
