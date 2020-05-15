
package tokobuku;

import java.text.DecimalFormat;
import static java.time.Clock.system;
import java.util.StringTokenizer;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTextField;

/**
 *
 * @author ariel jones dekock
 */
public class tokoonline extends javax.swing.JFrame {

    String pilihan = "";
    int harga_makanan;
    int harga_makanan1;
    int harga_makanan2;
    int harga_makanan3;
    int jml_harga;
    int bayar, beli, harga;
    private DecimalFormat angka;
    private Object integer;
    public tokoonline() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        bodypanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnproduk = new javax.swing.JButton();
        btnpembayaran = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        panelhome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelproduk = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtbeli = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        combopilihan = new javax.swing.JComboBox<>();
        btnharga = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelpembayaran = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menupanel.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("TORSOBOL");

        btnhome.setText("HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnproduk.setText("PRODUK");
        btnproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodukActionPerformed(evt);
            }
        });

        btnpembayaran.setText("PEMBAYARAN");
        btnpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpembayaranActionPerformed(evt);
            }
        });

        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnpembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnproduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(btnhome)
                .addGap(47, 47, 47)
                .addComponent(btnproduk)
                .addGap(50, 50, 50)
                .addComponent(btnpembayaran)
                .addGap(157, 157, 157)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpanel.setBackground(new java.awt.Color(255, 102, 102));
        mainpanel.setLayout(new java.awt.CardLayout());

        panelhome.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setText("HOME");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel4.setText("TORSOBOL");

        jLabel5.setText("SELAMAT DATANG DI TORSOBOL,SELAMAT BELANJA");

        javax.swing.GroupLayout panelhomeLayout = new javax.swing.GroupLayout(panelhome);
        panelhome.setLayout(panelhomeLayout);
        panelhomeLayout.setHorizontalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhomeLayout.createSequentialGroup()
                .addGroup(panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelhomeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(panelhomeLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel4))
                    .addGroup(panelhomeLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        panelhomeLayout.setVerticalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhomeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addContainerGap(610, Short.MAX_VALUE))
        );

        mainpanel.add(panelhome, "card2");

        panelproduk.setBackground(new java.awt.Color(0, 102, 102));
        panelproduk.setForeground(new java.awt.Color(240, 240, 240));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("PRODUK");

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("NAMA BARANG");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("HARGA BARANG");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JUMLAH BELI");

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("JUMLLAH HARGA");

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("JUMLAH BAYAR");

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("JUMLAH KEMBALIAN");

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        txtkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembalianActionPerformed(evt);
            }
        });

        combopilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENU PILIHAN", "SEPATU ", "HOODIE", "TOPI POLO", "CELANA JEANS", " " }));
        combopilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopilihanActionPerformed(evt);
            }
        });

        btnharga.setText("HITUNG");
        btnharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhargaActionPerformed(evt);
            }
        });

        jButton3.setText("KEMBALIAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelprodukLayout = new javax.swing.GroupLayout(panelproduk);
        panelproduk.setLayout(panelprodukLayout);
        panelprodukLayout.setHorizontalGroup(
            panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprodukLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelprodukLayout.createSequentialGroup()
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(161, 161, 161)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtbayar)
                            .addComponent(txtkembalian)
                            .addComponent(txtharga)
                            .addComponent(txtbeli)
                            .addComponent(combopilihan, 0, 0, Short.MAX_VALUE))))
                .addGap(81, 81, 81)
                .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        panelprodukLayout.setVerticalGroup(
            panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprodukLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprodukLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnharga))
                        .addGap(33, 33, 33)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jButton3))
                        .addGap(33, 33, 33)
                        .addGroup(panelprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(combopilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        mainpanel.add(panelproduk, "card3");

        panelpembayaran.setBackground(new java.awt.Color(0, 102, 153));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("PILIH SATU JENIS PEMBAYARAN:");

        jRadioButton1.setText("CASH ON DELIVERY");

        jRadioButton2.setText("OVO");

        jRadioButton3.setText("GOPAY");

        jRadioButton4.setText("LAINNYA");

        jButton1.setText("OK");

        jButton2.setText("CANCEL");

        javax.swing.GroupLayout panelpembayaranLayout = new javax.swing.GroupLayout(panelpembayaran);
        panelpembayaran.setLayout(panelpembayaranLayout);
        panelpembayaranLayout.setHorizontalGroup(
            panelpembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpembayaranLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelpembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(panelpembayaranLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jButton2))
                    .addGroup(panelpembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelpembayaranLayout.setVerticalGroup(
            panelpembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpembayaranLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel12)
                .addGap(84, 84, 84)
                .addComponent(jRadioButton1)
                .addGap(32, 32, 32)
                .addComponent(jRadioButton2)
                .addGap(34, 34, 34)
                .addComponent(jRadioButton3)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton4)
                .addGap(87, 87, 87)
                .addGroup(panelpembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        mainpanel.add(panelpembayaran, "card4");

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
         mainpanel.removeAll();
       mainpanel.repaint();
       mainpanel.revalidate();
       
       //menambahkan isi panel produk
       mainpanel.add(panelhome);
       mainpanel.repaint();
       mainpanel.revalidate();
        
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodukActionPerformed
        // TODO add your handling code here:
       mainpanel.removeAll();
       mainpanel.repaint();
       mainpanel.revalidate();
       
       //menambahkan isi panel produk
       mainpanel.add(panelproduk);
       mainpanel.repaint();
       mainpanel.revalidate();
       
       
       
    }//GEN-LAST:event_btnprodukActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void btnpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpembayaranActionPerformed
       mainpanel.removeAll();
       mainpanel.repaint();
       mainpanel.revalidate();
       
       //menambahkan isi panel produk
       mainpanel.add(panelpembayaran);
       mainpanel.repaint();
       mainpanel.revalidate();
    }//GEN-LAST:event_btnpembayaranActionPerformed

    private void combopilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopilihanActionPerformed
        // TODO add your handling code here:
         pilihan = (String) combopilihan.getSelectedItem();
        switch (pilihan) {
            case "SEPATU":
                harga_makanan = 200000;
                break;
            case "HOODIE":
                harga_makanan1= 250000;
                break;
            case "TOPI POLO":
                harga_makanan2 =150000;
                break;
            case "CELANA JEANS ":
                harga_makanan3 =300000;
        }
        JTextField setText = txtharga.setText(""+ integer.toString (harga_makanan+harga_makanan1+harga_makanan2+harga_makanan3));
    }//GEN-LAST:event_combopilihanActionPerformed

    private void btnhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhargaActionPerformed
        // TODO add your handling code here:
        int harga= integer.parseInt(txtharga.getText());
        int beli= integer.parseInt(txtbeli.getText());
        //membuat perkalian sederhana yang akan ditampilkan di jumlah harga.
        bayar=harga*beli;
        
        
        txtjumlah.setText(""+Integer.toString(bayar));
    }//GEN-LAST:event_btnhargaActionPerformed

    private void txtkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembalianActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtkembalianActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int kembali = Integer.parseInt (txtkembalian.getText());
        int total =kembali - bayar
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(tokoonline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tokoonline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tokoonline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tokoonline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tokoonline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnharga;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnpembayaran;
    private javax.swing.JButton btnproduk;
    private javax.swing.JComboBox<String> combopilihan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private java.awt.List list1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel panelpembayaran;
    private javax.swing.JPanel panelproduk;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkembalian;
    // End of variables declaration//GEN-END:variables
}
