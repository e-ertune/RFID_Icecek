/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.rfidicecek.frm;

import com.gazi.rfidicecek.db.bl.UrunIslem;
import com.gazi.rfidicecek.model.Urun;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author emin
 */
public class frmUrunIslemleri extends javax.swing.JFrame {

    UrunIslem ui = new UrunIslem();

    /**
     * Creates new form frmUrunKayit
     */
    public frmUrunIslemleri() {
        initComponents();
    }

    public void Listele() {
        cmbUrun.removeAllItems();
        List<Urun> list = ui.UrunListele();
        for (int i = 0; i < list.size(); i++) {
            Urun u = list.get(i);
            cmbUrun.addItem(u.getAd());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnUrunKayit = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        lblMarka = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        spinnerFiyat = new javax.swing.JSpinner();
        lblUrun = new javax.swing.JLabel();
        cmbUrun = new javax.swing.JComboBox<>();
        btnSil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblGiris2 = new javax.swing.JLabel();

        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 600));

        btnUrunKayit.setBackground(new java.awt.Color(255, 255, 255));
        btnUrunKayit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnUrunKayit.setText("ÜRÜN KAYIT");
        btnUrunKayit.setBorder(null);
        btnUrunKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunKayitActionPerformed(evt);
            }
        });

        txtAd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblMarka.setBackground(new java.awt.Color(255, 255, 255));
        lblMarka.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblMarka.setText(" FİYAT");
        lblMarka.setOpaque(true);

        lblAd.setBackground(new java.awt.Color(255, 255, 255));
        lblAd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblAd.setText(" ÜRÜN ADI");
        lblAd.setOpaque(true);

        spinnerFiyat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        spinnerFiyat.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.5f), Float.valueOf(0.5f), Float.valueOf(10.0f), Float.valueOf(0.5f)));
        spinnerFiyat.setToolTipText("");

        lblUrun.setBackground(new java.awt.Color(255, 255, 255));
        lblUrun.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblUrun.setText(" SİLMEK İSTEDİĞİNİZ ÜRÜNÜ SEÇİNİZ");
        lblUrun.setOpaque(true);

        cmbUrun.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnSil.setBackground(new java.awt.Color(255, 255, 255));
        btnSil.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/rfidicecek/img/cof.png"))); // NOI18N

        lblGiris2.setBackground(new java.awt.Color(255, 255, 255));
        lblGiris2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblGiris2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGiris2.setText("ÜRÜN KAYIT VE SİLME İŞLEMLERİ");
        lblGiris2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblGiris2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGiris2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spinnerFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUrunKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addGap(181, 181, 181))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblGiris2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnUrunKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUrunKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunKayitActionPerformed
        Urun u = new Urun();
        String ad = txtAd.getText().trim();
        if (ui.AyniUrundenVarMi(ad)) {
            JOptionPane.showMessageDialog(null, "Aynı üründen bulunmakta.");
            txtAd.setText("");
            return;
        }
        if (ad == null || ad.equals("")) {
            JOptionPane.showMessageDialog(null, "Ad boş geçilemez.");
            return;
        }
        u.setAd(ad);
        u.setFiyat((float) spinnerFiyat.getValue());
        if (ui.UrunKayit(u)) {
            JOptionPane.showMessageDialog(null, "Ürün kayıt başarılı.");
        }
        txtAd.setText("");
        spinnerFiyat.setValue(1);
        Listele();
    }//GEN-LAST:event_btnUrunKayitActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        if (JOptionPane.showConfirmDialog(null, cmbUrun.getSelectedItem().toString() + " ürününü silmek istediğinize emin misiniz?") == JOptionPane.YES_OPTION) {
            ui.UrunSil(cmbUrun.getSelectedItem().toString());
            Listele();
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmMenu f = new frmMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Listele();
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
            java.util.logging.Logger.getLogger(frmUrunIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUrunIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUrunIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUrunIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUrunIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnUrunKayit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbUrun;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblGiris2;
    private javax.swing.JLabel lblMarka;
    private javax.swing.JLabel lblUrun;
    private javax.swing.JSpinner spinnerFiyat;
    private javax.swing.JTextField txtAd;
    // End of variables declaration//GEN-END:variables
}
