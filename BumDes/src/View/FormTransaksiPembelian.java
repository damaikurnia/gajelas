/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Kelas.Anggota;
import Kelas.Barang;
import Kelas.Profil;
import Kelas.Tanggal;
import Kelas.Transaksi;
import Kontrol.AnggotaKontrol;
import Kontrol.PengaturanKontrol;
import Kontrol.TransaksiKontrol;
import TabelModel.AnggotaTM;
import TabelModel.TransaksiBeliTM;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author damaikurnia
 */
public class FormTransaksiPembelian extends javax.swing.JFrame {

    /**
     * Creates new form FormAir
     */
    public FormTransaksiPembelian() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            Profil prof = PengaturanKontrol.getKoneksi().tampilProfil();
            label_namaDesa.setText("BADAN USAHA MILIK DESA " + prof.getNamadesa());
            label_alamatNotelp.setText(prof.getAlamatdesa() + " - " + prof.getNotelp());
            label_tanggal.setText(Tanggal.getTanggal());

            dialog_pembelian.setVisible(false);
            dialog_pembelian.setSize(688, 475);
            dialog_pembelian.setLocationRelativeTo(null);
            dialog_pembelian.setTitle("DATA ANGGOTA");
            update();
        } catch (SQLException ex) {
            Logger.getLogger(FormTransaksiPembelian.class.getName()).log(Level.SEVERE, null, ex);
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

        dialog_pembelian = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_tahun = new javax.swing.JComboBox();
        cb_tanggal = new javax.swing.JComboBox();
        cb_bulan = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_pembelian2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_namaDesa = new javax.swing.JLabel();
        label_alamatNotelp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_tambah = new javax.swing.JButton();
        button_ubah = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        button_tabel = new javax.swing.JButton();
        text_kodeBrg = new javax.swing.JTextField();
        text_noTrans = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        label_tanggal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_jmlBeli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_hargaSatuan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pembelian = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
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

        dialog_pembelian.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TABEL SELURUH TRANSAKSI PEMBELIAN");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("TANGGAL");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("TAMPIL BERDASARKAN");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cb_tahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2014", "2015" }));
        cb_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tahunActionPerformed(evt);
            }
        });
        jPanel6.add(cb_tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        cb_tanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tanggalActionPerformed(evt);
            }
        });
        jPanel6.add(cb_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        cb_bulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "JANUARI", "FEBRUARI", "MARET", "APRIL", "MEI", "JUNI", "JULI", "AGUSTUS", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DESEMBER" }));
        cb_bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bulanActionPerformed(evt);
            }
        });
        jPanel6.add(cb_bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 670, 70));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_pembelian2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabel_pembelian2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 270));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 670, 300));

        dialog_pembelian.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORM TRANSAKSI PEMBELIAN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("KODE BARANG");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, -1));

        button_tambah.setText("TAMBAH");
        button_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tambahActionPerformed(evt);
            }
        });
        jPanel3.add(button_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        button_ubah.setText("UBAH");
        button_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ubahActionPerformed(evt);
            }
        });
        jPanel3.add(button_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        button_hapus.setText("HAPUS");
        button_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(button_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        button_tabel.setText("TABEL TRANSAKSI PEMBELIAN");
        button_tabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tabelActionPerformed(evt);
            }
        });
        jPanel3.add(button_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));
        jPanel3.add(text_kodeBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));
        jPanel3.add(text_noTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NO TRANSAKSI");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, -1));

        label_tanggal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_tanggal.setText("Selasa, 17 Februari 2015");
        jPanel3.add(label_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Hari, Tanggal");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 80, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("JUMLAH BELI");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, -1));

        text_jmlBeli.setText("0");
        text_jmlBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_jmlBeliKeyReleased(evt);
            }
        });
        jPanel3.add(text_jmlBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("HARGA SATUAN");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, -1));

        text_hargaSatuan.setText("0");
        text_hargaSatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_hargaSatuanKeyReleased(evt);
            }
        });
        jPanel3.add(text_hargaSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TOTAL");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 120, -1));

        text_total.setText("0");
        jPanel3.add(text_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 120, -1));

        tabel_pembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_pembelian);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 690, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRANSAKSI HARI INI");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 690, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));

        jMenu1.setText("HOME");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("BARANG");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("ANGGOTA");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("TRANSAKSI");

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

        jMenuItem4.setText("BUM");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("BUK");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("JUNRAL");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("NERACA");
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("PENGATURAN");

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

    private void button_tabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tabelActionPerformed
        dialog_pembelian.setVisible(true);
        update2("%-%");
    }//GEN-LAST:event_button_tabelActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        FormAnggota a = new FormAnggota();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormTransaksiPembelian a = new FormTransaksiPembelian();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormTransaksiPenjualan a = new FormTransaksiPenjualan();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FormPengaturan a = new FormPengaturan();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void button_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tambahActionPerformed
        try {
            Transaksi trans = new Transaksi();
            trans.setNoTrans(text_noTrans.getText());
            trans.setIdBarang(new Barang(text_kodeBrg.getText(), "", 0));
            trans.setJumlah(Integer.parseInt(text_jmlBeli.getText()));
            trans.setHargaSatuan(Double.parseDouble(text_hargaSatuan.getText()));
            trans.setTotal(Double.parseDouble(text_total.getText()));

            TransaksiKontrol.getKoneksi().beli_insertTransaksi(trans);
            update();
        } catch (SQLException ex) {
            Logger.getLogger(FormTransaksiPembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_tambahActionPerformed

    private void button_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ubahActionPerformed

    private void button_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_hapusActionPerformed

    private void text_jmlBeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_jmlBeliKeyReleased
        if (text_jmlBeli.getText().equals("")) {

        } else {
            double total = Integer.parseInt(text_jmlBeli.getText())
                    * Integer.parseInt(text_hargaSatuan.getText());
            text_total.setText(Double.toString(total));
        }
    }//GEN-LAST:event_text_jmlBeliKeyReleased

    private void text_hargaSatuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_hargaSatuanKeyReleased
        if (text_hargaSatuan.getText().equals("")) {

        } else {
            double total = Integer.parseInt(text_jmlBeli.getText())
                    * Integer.parseInt(text_hargaSatuan.getText());
            text_total.setText(Double.toString(total));
        }
    }//GEN-LAST:event_text_hargaSatuanKeyReleased

    private void cb_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tanggalActionPerformed
        String tanggal = cb_tanggal.getSelectedItem().toString();
        String bulan = konversiBulan(cb_bulan.getSelectedItem().toString());
        String tahun = cb_tahun.getSelectedItem().toString();

        if (!tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%" + tanggal); //tanggal on, bulan off, tahun off
        } else if (!tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "-" + tanggal); //tanggal on, bulan on, tahun off
        } else if (!tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%" + tanggal); //tanggal on, bulan off, tahun on
        } else if (tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "%"); //tanggal off, bulan on, tahun off
        } else if (tanggal.equals("-") && !bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "-" + bulan + "%"); //tanggal off, bulan on, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%");//tanggal off, bulan off, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%-%");
        } else {
            update2(tahun + "-" + bulan + "-" + tanggal);
        }
    }//GEN-LAST:event_cb_tanggalActionPerformed

    private void cb_bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bulanActionPerformed
        String tanggal = cb_tanggal.getSelectedItem().toString();
        String bulan = konversiBulan(cb_bulan.getSelectedItem().toString());
        String tahun = cb_tahun.getSelectedItem().toString();

        if (!tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%" + tanggal); //tanggal on, bulan off, tahun off
        } else if (!tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "-" + tanggal); //tanggal on, bulan on, tahun off
        } else if (!tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%" + tanggal); //tanggal on, bulan off, tahun on
        } else if (tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "%"); //tanggal off, bulan on, tahun off
        } else if (tanggal.equals("-") && !bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "-" + bulan + "%"); //tanggal off, bulan on, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%");//tanggal off, bulan off, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%-%");
        } else {
            update2(tahun + "-" + bulan + "-" + tanggal);
        }
    }//GEN-LAST:event_cb_bulanActionPerformed

    private void cb_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tahunActionPerformed
        String tanggal = cb_tanggal.getSelectedItem().toString();
        String bulan = konversiBulan(cb_bulan.getSelectedItem().toString());
        String tahun = cb_tahun.getSelectedItem().toString();

        if (!tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%" + tanggal); //tanggal on, bulan off, tahun off
        } else if (!tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "-" + tanggal); //tanggal on, bulan on, tahun off
        } else if (!tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%" + tanggal); //tanggal on, bulan off, tahun on
        } else if (tanggal.equals("-") && !bulan.equals("-") && tahun.equals("-")) {
            update2("%" + bulan + "%"); //tanggal off, bulan on, tahun off
        } else if (tanggal.equals("-") && !bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "-" + bulan + "%"); //tanggal off, bulan on, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && !tahun.equals("-")) {
            update2(tahun + "%");//tanggal off, bulan off, tahun on
        } else if (tanggal.equals("-") && bulan.equals("-") && tahun.equals("-")) {
            update2("%-%");
        } else {
            update2(tahun + "-" + bulan + "-" + tanggal);
        }
    }//GEN-LAST:event_cb_tahunActionPerformed

    public void update() {
        try {
            List<Transaksi> agt = TransaksiKontrol.getKoneksi().beli_selectTransaksi();
            TransaksiBeliTM model = new TransaksiBeliTM(agt);
            tabel_pembelian.setModel(model);

//        tabelDosen.getColumnModel().getColumn(0).setMinWidth(70);
//        tabelDosen.getColumnModel().getColumn(0).setMaxWidth(70);
//        tabelDosen.getColumnModel().getColumn(1).setMinWidth(220);
//        tabelDosen.getColumnModel().getColumn(1).setMaxWidth(220);
//            tabelDosen.setDefaultRenderer(Object.class, new renderWarnaWarni(Color.lightGray, Color.white));
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update2(String tanggal) {
        try {
            List<Transaksi> agt = TransaksiKontrol.getKoneksi().beli_selectTransaksiAll(tanggal);
            TransaksiBeliTM model = new TransaksiBeliTM(agt);
            tabel_pembelian2.setModel(model);

//        tabelDosen.getColumnModel().getColumn(0).setMinWidth(70);
//        tabelDosen.getColumnModel().getColumn(0).setMaxWidth(70);
//        tabelDosen.getColumnModel().getColumn(1).setMinWidth(220);
//        tabelDosen.getColumnModel().getColumn(1).setMaxWidth(220);
//            tabelDosen.setDefaultRenderer(Object.class, new renderWarnaWarni(Color.lightGray, Color.white));
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String konversiBulan(String bulan) {
        if (bulan.equals("JANUARI")) {
            return "01";
        } else if (bulan.equals("FEBRUARI")) {
            return "02";
        } else if (bulan.equals("MARET")) {
            return "03";
        } else if (bulan.equals("APRIL")) {
            return "04";
        } else if (bulan.equals("MEI")) {
            return "05";
        } else if (bulan.equals("JUNI")) {
            return "06";
        } else if (bulan.equals("JULI")) {
            return "07";
        } else if (bulan.equals("AGUSTUS")) {
            return "08";
        } else if (bulan.equals("SEPTEMBER")) {
            return "09";
        } else if (bulan.equals("OKTOBER")) {
            return "10";
        } else if (bulan.equals("NOVEMBER")) {
            return "11";
        } else if (bulan.equals("DESEMBER")) {
            return "12";
        } else {
            return "-";
        }
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
            java.util.logging.Logger.getLogger(FormTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksiPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_tabel;
    private javax.swing.JButton button_tambah;
    private javax.swing.JButton button_ubah;
    private javax.swing.JComboBox cb_bulan;
    private javax.swing.JComboBox cb_tahun;
    private javax.swing.JComboBox cb_tanggal;
    private javax.swing.JDialog dialog_pembelian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_alamatNotelp;
    private javax.swing.JLabel label_namaDesa;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JTable tabel_pembelian;
    private javax.swing.JTable tabel_pembelian2;
    private javax.swing.JTextField text_hargaSatuan;
    private javax.swing.JTextField text_jmlBeli;
    private javax.swing.JTextField text_kodeBrg;
    private javax.swing.JTextField text_noTrans;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
