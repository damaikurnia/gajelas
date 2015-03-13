/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Custom.Tanggal;
import Kelas.Anggota;
import Kelas.Pemakaian;
import Kelas.Profil;
import Kontrol.AnggotaKontrol;
import Kontrol.PemakaianKontrol;
import Kontrol.PengaturanKontrol;
import TabelModel.AnggotaTM;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author damaikurnia
 */
public class FormPemakaianAir extends javax.swing.JFrame {

    /**
     * Creates new form FormAir
     */
    public FormPemakaianAir() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            Profil prof = PengaturanKontrol.getKoneksi().tampilProfil();
            label_namaDesa.setText("BADAN USAHA MILIK DESA " + prof.getNamadesa());
            label_alamatNotelp.setText(prof.getAlamatdesa() + " - " + prof.getNotelp());

            dialog_cariP.setVisible(false);
            dialog_cariP.setSize(673, 413);
            dialog_cariP.setLocationRelativeTo(null);
            dialog_cariP.setTitle("DATA ANGGOTA");

            label_noTrans.setVisible(false);
            label_tanggal.setText(Tanggal.getTanggal());
        } catch (SQLException ex) {
            Logger.getLogger(FormPemakaianAir.class.getName()).log(Level.SEVERE, null, ex);
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

        dialog_cariP = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_key = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_pelanggan = new javax.swing.JTable();
        dialog_list = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_namaDesa = new javax.swing.JLabel();
        label_alamatNotelp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_noTrans = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_noPelanggan = new javax.swing.JTextField();
        button_pelanggan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_airdibayar = new javax.swing.JTextField();
        text_nama = new javax.swing.JTextField();
        text_airlunas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        text_airterakhir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_alamat = new javax.swing.JTextArea();
        button_simpan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        button_list = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        button_rubah = new javax.swing.JButton();
        label_tanggal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        dialog_cariP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DATA PELANGGAN");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 70));

        jLabel13.setText("KEYWORD");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 20));

        text_key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_keyKeyReleased(evt);
            }
        });
        jPanel4.add(text_key, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 470, -1));

        tabel_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_pelanggan);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 620, 220));

        dialog_cariP.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 380));

        javax.swing.GroupLayout dialog_listLayout = new javax.swing.GroupLayout(dialog_list.getContentPane());
        dialog_list.getContentPane().setLayout(dialog_listLayout);
        dialog_listLayout.setHorizontalGroup(
            dialog_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialog_listLayout.setVerticalGroup(
            dialog_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SISTEM INFORMASI PENGELOLAAN AIR BERSIH");

        label_namaDesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_namaDesa.setText("BADAN USAHA MILIK DESA <<NAMA DESA>>");

        label_alamatNotelp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_alamatNotelp.setText("<<ALAMAT, NO TELP>>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_namaDesa, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addComponent(label_alamatNotelp, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_namaDesa, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_alamatNotelp)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_noTrans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_noTrans.setText("FORM PEMAKAIAN AIR");
        jPanel3.add(label_noTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NO PELANGGAN");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 57, -1, 30));

        text_noPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_noPelangganKeyReleased(evt);
            }
        });
        jPanel3.add(text_noPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 30));

        button_pelanggan.setText("...");
        button_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pelangganActionPerformed(evt);
            }
        });
        jPanel3.add(button_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("DEBIT AIR HARUS DIBAYAR");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("NAMA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ALAMAT");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        text_airdibayar.setEditable(false);
        text_airdibayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(text_airdibayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, -1));

        text_nama.setEditable(false);
        jPanel3.add(text_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, -1));

        text_airlunas.setEditable(false);
        text_airlunas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(text_airlunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PENGGUNAAN AIR TERAKHIR");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        text_airterakhir.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        text_airterakhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_airterakhirKeyReleased(evt);
            }
        });
        jPanel3.add(text_airterakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 140, -1));

        text_alamat.setEditable(false);
        text_alamat.setColumns(20);
        text_alamat.setRows(5);
        jScrollPane1.setViewportView(text_alamat);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 70));

        button_simpan.setText("SIMPAN");
        button_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simpanActionPerformed(evt);
            }
        });
        jPanel3.add(button_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, 40));

        jButton4.setText("BATAL");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 80, 40));

        button_list.setText("LIST PELANGGAN");
        jPanel3.add(button_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 160, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("m³");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 20, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("m³");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 20, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("m³");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 20, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("PENGGUNAAN AIR LUNAS");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("FORM PEMAKAIAN AIR");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        button_rubah.setText("RUBAH");
        jPanel3.add(button_rubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, 40));

        label_tanggal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_tanggal.setText("jLabel2");
        jPanel3.add(label_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 200, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));

        jMenu1.setText("HOME");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("BARANG");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("ANGGOTA");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu7.setText("INFORMASI");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem3.setText("Pemakaian Air Pelanggan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("TRANSAKSI");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setText("Pembelian");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Penjualan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("LAPORAN");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem4.setText("BUM");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("BUK");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("JUNRAL");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("NERACA");
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("PENGATURAN");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem8.setText("Profil Desa");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        FormAir a = new FormAir();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        FormBarang a = new FormBarang();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        FormAnggota a = new FormAnggota();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormTransaksiPenjualan a = new FormTransaksiPenjualan();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked

    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormTransaksiPembelian a = new FormTransaksiPembelian();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FormPengaturan a = new FormPengaturan();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormPemakaianAir a = new FormPemakaianAir();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tabel_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pelangganMouseClicked
        try {
            int row1 = tabel_pelanggan.getSelectedRow();
            List<Anggota> agt = AnggotaKontrol.getKoneksi().selectAnggota2(tabel_pelanggan.getValueAt(row1, 1).toString());
            Pemakaian pem = PemakaianKontrol.getKoneksi().selectPemakaian(tabel_pelanggan.getValueAt(row1, 0).toString());

            text_noPelanggan.setText(pem.getIdanggota().getIdAnggota());
            text_nama.setText(agt.get(0).getNamaAnggota());
            text_alamat.setText(agt.get(0).getAlamat());
            text_airlunas.setText(Double.toString(pem.getAirlunas()).split("\\.")[0]);
            text_airdibayar.setText(Double.toString(pem.getAirdibayar()).split("\\.")[0]);
            label_noTrans.setText(pem.getNotransaksi());
            dialog_cariP.setVisible(false);
            label_noTrans.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FormPemakaianAir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabel_pelangganMouseClicked

    private void text_keyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_keyKeyReleased
        if (text_key.getText().equals("")) {
            update("");
        } else {
            update(text_key.getText());
        }
    }//GEN-LAST:event_text_keyKeyReleased

    private void button_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pelangganActionPerformed
        update("");
        dialog_cariP.setVisible(true);
    }//GEN-LAST:event_button_pelangganActionPerformed

    private void text_airterakhirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_airterakhirKeyReleased
        if (text_airterakhir.getText().equals("")) {
            text_airterakhir.setText("0");
        } else {
            double selisih = Double.parseDouble(text_airterakhir.getText()) - Double.parseDouble(text_airlunas.getText());
            text_airdibayar.setText(Double.toString(selisih).split("\\.")[0]);
        }
    }//GEN-LAST:event_text_airterakhirKeyReleased

    private void button_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpanActionPerformed
        try {
            Pemakaian pem = new Pemakaian();
            pem.setNotransaksi(label_noTrans.getText());
            pem.setIdanggota(new Anggota(text_noPelanggan.getText(), text_nama.getText(), "", "", "", "", 0, 0, "", "", "", "", ""));
            pem.setAirlunas(Double.parseDouble(text_airlunas.getText()));
            pem.setAirterakhir(Double.parseDouble(text_airterakhir.getText()));
            pem.setAirdibayar(Double.parseDouble(text_airdibayar.getText()));

            PemakaianKontrol.getKoneksi().updatePemakaian(pem);
            JOptionPane.showMessageDialog(null, "Pemakaian air pelanggan berhasil dirubah!");
            resetDefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormPemakaianAir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_simpanActionPerformed

    private void text_noPelangganKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_noPelangganKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_text_noPelangganKeyReleased

    public void update(String key) {
        try {
            List<Anggota> agt = AnggotaKontrol.getKoneksi().selectAnggota2(key);
            AnggotaTM model = new AnggotaTM(agt);
            tabel_pelanggan.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(FormPemakaianAir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetDefault() {
        text_noPelanggan.setText("");
        text_nama.setText("");
        text_alamat.setText("");
        text_airlunas.setText("");
        text_airdibayar.setText("");
        label_noTrans.setText("");
        text_airterakhir.setText("");
        label_noTrans.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(FormPemakaianAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPemakaianAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPemakaianAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPemakaianAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPemakaianAir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_list;
    private javax.swing.JButton button_pelanggan;
    private javax.swing.JButton button_rubah;
    private javax.swing.JButton button_simpan;
    private javax.swing.JDialog dialog_cariP;
    private javax.swing.JDialog dialog_list;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_alamatNotelp;
    private javax.swing.JLabel label_namaDesa;
    private javax.swing.JLabel label_noTrans;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JTable tabel_pelanggan;
    private javax.swing.JTextField text_airdibayar;
    private javax.swing.JTextField text_airlunas;
    private javax.swing.JTextField text_airterakhir;
    private javax.swing.JTextArea text_alamat;
    private javax.swing.JTextField text_key;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_noPelanggan;
    // End of variables declaration//GEN-END:variables
}
