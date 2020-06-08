/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.rfidicecek.frm;

import com.gazi.rfidicecek.db.bl.KullaniciIslem;
import com.gazi.rfidicecek.model.Kullanici;
import javax.swing.JOptionPane;

/**
 *
 * @author emin
 */
public class frmKullaniciIslemleri extends javax.swing.JFrame {
    
    KullaniciIslem ki = new KullaniciIslem();
    String rfid = "";
    
    public frmKullaniciIslemleri() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlEkle1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRfid1 = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        txtAdSoyad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlSil = new javax.swing.JPanel();
        txtAdSoyad2 = new javax.swing.JTextField();
        btnSil = new javax.swing.JButton();
        btnRfid2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setPreferredSize(new java.awt.Dimension(1024, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlEkle1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText(" AD SOYAD");

        btnRfid1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnRfid1.setText("RFID");
        btnRfid1.setBorder(null);
        btnRfid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfidActionPerformed(evt);
            }
        });

        btnKaydet.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnKaydet.setText("KAYDET");
        btnKaydet.setBorder(null);
        btnKaydet.setEnabled(false);
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        txtAdSoyad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAdSoyad.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("            KULLANICI KAYIT");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/rfidicecek/img/adduser22.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(230, 230));
        jLabel2.setPreferredSize(new java.awt.Dimension(230, 230));

        javax.swing.GroupLayout pnlEkle1Layout = new javax.swing.GroupLayout(pnlEkle1);
        pnlEkle1.setLayout(pnlEkle1Layout);
        pnlEkle1Layout.setHorizontalGroup(
            pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEkle1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEkle1Layout.createSequentialGroup()
                        .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEkle1Layout.createSequentialGroup()
                                .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRfid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKaydet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(pnlEkle1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlEkle1Layout.setVerticalGroup(
            pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEkle1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRfid1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        getContentPane().add(pnlEkle1);

        pnlSil.setBackground(new java.awt.Color(255, 255, 255));

        txtAdSoyad2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtAdSoyad2.setBorder(null);
        txtAdSoyad2.setEnabled(false);

        btnSil.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSil.setText("SİL");
        btnSil.setBorder(null);
        btnSil.setEnabled(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnRfid2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnRfid2.setText("RFID");
        btnRfid2.setBorder(null);
        btnRfid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfid2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/rfidicecek/img/delete222.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("   KULLANICI SİL");

        javax.swing.GroupLayout pnlSilLayout = new javax.swing.GroupLayout(pnlSil);
        pnlSil.setLayout(pnlSilLayout);
        pnlSilLayout.setHorizontalGroup(
            pnlSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSilLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(pnlSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSilLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSilLayout.createSequentialGroup()
                        .addGroup(pnlSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txtAdSoyad2))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSilLayout.createSequentialGroup()
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSilLayout.createSequentialGroup()
                        .addComponent(btnRfid2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
        );
        pnlSilLayout.setVerticalGroup(
            pnlSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnRfid2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAdSoyad2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );

        getContentPane().add(pnlSil);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        ki = new KullaniciIslem();
        Kullanici k = new Kullanici();
        if (txtAdSoyad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ad soyad bilgisi boş geçilemez.");
            txtAdSoyad.grabFocus();
            return;
        }
        k.setAdSoyad(txtAdSoyad.getText());
        k.setRfid(rfid);
        if (ki.KullaniciKayit(k)) {
            JOptionPane.showMessageDialog(null, "Kayıt başarılı.");
        } else {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu.");
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnRfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfidActionPerformed
        rfid = ki.RfidOku();
        if (rfid.equals("") || rfid == null) {
            return;
        }
        if (ki.RfidKayitliMi(rfid)) {
            JOptionPane.showMessageDialog(null, "Bu ID ile kayıtlı başka bir kullanıcı bulundu. Lütfen farklı bir RFID tanımlaması yapın.");
            return;
        }
        btnKaydet.setEnabled(true);
    }//GEN-LAST:event_btnRfidActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Kullanıcıyı silmek istediğinize emin misiniz?") == JOptionPane.YES_OPTION) {
            KullaniciIslem ki = new KullaniciIslem();
            if (ki.KullaniciSil(rfid)) {
                JOptionPane.showMessageDialog(null, "Silme işlemi başarılı.");
                txtAdSoyad2.setText("");
            }
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnRfid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfid2ActionPerformed
        KullaniciIslem ki = new KullaniciIslem();
        rfid = ki.RfidOku();
        if (rfid.equals("") || rfid == null) {
            return;
        }
        Kullanici k = ki.KullaniciGetir(rfid);
        if (k == null) {
            return;
        }
        btnSil.setEnabled(true);
        txtAdSoyad.setText(k.getAdSoyad());
    }//GEN-LAST:event_btnRfid2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmMenu f = new frmMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmKullaniciIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKullaniciIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnRfid1;
    private javax.swing.JButton btnRfid2;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnlEkle1;
    private javax.swing.JPanel pnlSil;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAdSoyad2;
    // End of variables declaration//GEN-END:variables
}