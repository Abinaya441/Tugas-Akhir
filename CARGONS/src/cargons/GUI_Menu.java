/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargons;

/**
 *
 * @author Kiko
 */
public class GUI_Menu extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Menu
     */
    public GUI_Menu() {
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

        btnGrpjenis = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtnama1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jtberat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtnama2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtday = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtmm = new javax.swing.JTextField();
        jtyear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtbiaya = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARGONS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 660, 54));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 2, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CARGO OVERNIGHT SERVICE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 660, 20));

        jLabel3.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("NAMA PENGIRIM :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("JENIS BARANG :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        getContentPane().add(jtnama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 540, -1));

        btnGrpjenis.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jRadioButton1.setForeground(java.awt.Color.white);
        jRadioButton1.setText("NORMAL");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        btnGrpjenis.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jRadioButton2.setForeground(java.awt.Color.white);
        jRadioButton2.setText("PECAH BELAH");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        btnGrpjenis.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jRadioButton3.setForeground(java.awt.Color.white);
        jRadioButton3.setText("BERBAHAYA");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        btnGrpjenis.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jRadioButton4.setForeground(java.awt.Color.white);
        jRadioButton4.setText("MAKANAN/MINUMAN");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("NAMA PENERIMA :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        getContentPane().add(jtberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 480, -1));

        jLabel6.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("WILAYAH PENERIMA :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "JAKARTA", "SEMARANG", "SURABAYA", "BANDUNG", "YOGYAKARTA" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 540, -1));

        jLabel7.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("BERAT BARANG :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        getContentPane().add(jtnama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 540, -1));

        jLabel8.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("TANGGAL PENGIRIMAN :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));
        getContentPane().add(jtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 140, -1));

        jLabel9.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("/");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 420, 50, 24));
        getContentPane().add(jtmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 140, -1));
        getContentPane().add(jtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 140, -1));

        jLabel10.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MM");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 140, -1));

        jLabel11.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("KG");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 60, 20));

        jLabel12.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 140, -1));

        jLabel13.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 60, 24));

        jLabel15.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("TOTAL BIAYA :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, 20));

        jButton1.setText("OK");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 120, -1));

        jSeparator1.setBackground(java.awt.Color.black);
        jSeparator1.setForeground(java.awt.Color.black);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 680, 10));

        jButton2.setText("ULANGI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 100, -1));

        jButton3.setText("KONFIRMASI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, -1, -1));

        jtbiaya.setEditable(false);
        jtbiaya.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jtbiaya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtbiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 540, 40));

        jLabel17.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("YYYY");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 140, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargons/Metapolis.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int jenis1;
        int jenis2;
        int berat;
        int kali;

        //jenis barang
        setget satu = new setget();
        if (jRadioButton1.isSelected()){
            jenis1 = 10000;
            satu.setKali1(jenis1);
        } 
        else if (jRadioButton2.isSelected()){
            jenis1 = 11000;
            satu.setKali1(jenis1);
        }
        else if (jRadioButton3.isSelected()){
            jenis1 = 13000;
            satu.setKali1(jenis1);
        }
        else if (jRadioButton4.isSelected()){
            jenis1 = 12000;
            satu.setKali1(jenis1);
        }
        jenis2 = satu.getKali1();
        
        //wilayah penerimaan
        String tujuan = (String) jComboBox1.getSelectedItem();
        tempat dua = new tempat(tujuan);
        dua.jk();
        kali = dua.getKali2();
        
        //rumus
        berat = Integer.parseInt(jtberat.getText());
        rumus tiga = new rumus(berat, jenis2, kali);
        tiga.menu();
        
        //total harga
        jtbiaya.setText("Rp"+tiga.getHarga());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jtberat.setText("");
        jtbiaya.setText("");
        jtday.setText("");
        jtmm.setText("");
        jtnama1.setText("");
        jtnama2.setText("");
        jtyear.setText("");
        jComboBox1.setSelectedItem("-");
        btnGrpjenis.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nama1 = jtnama1.getText();
        String nama2 = jtnama2.getText();
        String wlyh = (String) jComboBox1.getSelectedItem();
        String tgl = jtday.getText()+" / "+jtmm.getText()+" / "+jtyear.getText();
        setget m = new setget();
        String jns;
        if (jRadioButton1.isSelected()){
            m.setGg("NORMAL");
        } 
        else if (jRadioButton2.isSelected()){
            m.setGg("PECAH BELAH");
        }
        else if (jRadioButton3.isSelected()){
            m.setGg("BERBAHAYA");
        }
        else if (jRadioButton4.isSelected()){
            m.setGg("MAKANAN/MINUMAN");
        }
        jns = m.getGg();
        String brt = jtberat.getText()+" kg";
        String hrg = jtbiaya.getText();
        new GUI_Nota(nama1, nama2, wlyh, tgl, jns, brt, hrg).setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpjenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtberat;
    private javax.swing.JTextField jtbiaya;
    private javax.swing.JTextField jtday;
    private javax.swing.JTextField jtmm;
    private javax.swing.JTextField jtnama1;
    private javax.swing.JTextField jtnama2;
    private javax.swing.JTextField jtyear;
    // End of variables declaration//GEN-END:variables
}
