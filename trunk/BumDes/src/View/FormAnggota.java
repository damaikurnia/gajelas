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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author damaikurnia
 */
public class FormAnggota extends javax.swing.JFrame {

    /**
     * Creates new form FormAir
     */
    public FormAnggota() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            Profil prof = PengaturanKontrol.getKoneksi().tampilProfil();
            label_namaDesa.setText("BADAN USAHA MILIK DESA " + prof.getNamadesa());
            label_alamatNotelp.setText(prof.getAlamatdesa() + " - " + prof.getNotelp());

            resetdefault();
            dialog_anggota.setVisible(false);
            dialog_anggota.setSize(627, 350);
            dialog_anggota.setLocationRelativeTo(null);
            dialog_anggota.setTitle("DATA ANGGOTA");
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
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

        dialog_anggota = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_anggota = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_namaDesa = new javax.swing.JLabel();
        label_alamatNotelp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        button_tambah = new javax.swing.JButton();
        button_ubah = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        button_tabel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_ktp = new javax.swing.JTextField();
        text_idAnggota = new javax.swing.JTextField();
        text_nama = new javax.swing.JTextField();
        text_pekerjaan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_alamat = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        text_telp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        text_provinsi = new javax.swing.JTextField();
        text_rw = new javax.swing.JTextField();
        text_dusun = new javax.swing.JTextField();
        text_desa = new javax.swing.JTextField();
        text_kota = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        text_rt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        text_kecamatan = new javax.swing.JTextField();
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

        dialog_anggota.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TABEL ANGGOTA");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        tabel_anggota.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_anggotaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_anggota);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 590, 200));

        dialog_anggota.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 310));

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("NO KTP");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORM PELANGGAN BARU");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("NO PELANGGAN");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("NAMA PELANGGAN");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        button_tambah.setText("TAMBAH PELANGGAN");
        button_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tambahActionPerformed(evt);
            }
        });
        jPanel3.add(button_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        button_ubah.setText("UBAH");
        button_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ubahActionPerformed(evt);
            }
        });
        jPanel3.add(button_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        button_hapus.setText("HAPUS");
        button_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(button_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        button_tabel.setText("DAFTAR SELURUH PELANGGAN");
        button_tabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tabelActionPerformed(evt);
            }
        });
        jPanel3.add(button_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PEKERJAAN");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ALAMAT");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 40));
        jPanel3.add(text_ktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 190, -1));
        jPanel3.add(text_idAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 190, -1));
        jPanel3.add(text_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, -1));
        jPanel3.add(text_pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));

        text_alamat.setColumns(20);
        text_alamat.setRows(5);
        jScrollPane1.setViewportView(text_alamat);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 190, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PROVINSI");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 20));
        jPanel3.add(text_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TELP");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("DUSUN");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("/");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("KECAMATAN");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("KOTA / KAB");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 20));
        jPanel3.add(text_provinsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 190, -1));
        jPanel3.add(text_rw, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 60, -1));
        jPanel3.add(text_dusun, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));
        jPanel3.add(text_desa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 190, -1));
        jPanel3.add(text_kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("RT/RW");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));
        jPanel3.add(text_rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 60, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("KEL / DESA");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 20));
        jPanel3.add(text_kecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 190, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 310));

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

    private void button_tabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tabelActionPerformed
        dialog_anggota.setVisible(true);
        update();
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
            Anggota agt = new Anggota();
            agt.setIdAnggota(text_idAnggota.getText());
            agt.setNamaAnggota(text_nama.getText());
            agt.setPekerjaan(text_pekerjaan.getText());
            agt.setAlamat(text_alamat.getText());
            agt.setNoTelp(text_telp.getText());
            agt.setNoKTP(text_ktp.getText());
            agt.setRt(Integer.parseInt(text_rt.getText()));
            agt.setRw(Integer.parseInt(text_rw.getText()));
            agt.setDusun(text_dusun.getText());
            agt.setDesa(text_desa.getText());
            agt.setKota(text_kota.getText());
            agt.setProvinsi(text_provinsi.getText());

            AnggotaKontrol.getKoneksi().insertAnggota(agt);
            String tanggalBln = generateBulanTahun(Tanggal.getTanggal2());
            Pemakaian pem = new Pemakaian(generateKode(agt), agt, 0, 0, 0, tanggalBln.split("-")[0], tanggalBln.split("-")[1]);
            PemakaianKontrol.getKoneksi().insertPemakaian(pem);
            JOptionPane.showMessageDialog(null, "Anggota berhasil ditambahkan!");
            resetdefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_tambahActionPerformed

    private void button_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ubahActionPerformed
        try {
            Anggota agt = new Anggota();
            agt.setIdAnggota(text_idAnggota.getText());
            agt.setNamaAnggota(text_nama.getText());
            agt.setPekerjaan(text_pekerjaan.getText());
            agt.setAlamat(text_alamat.getText());
            agt.setNoTelp(text_telp.getText());
            agt.setNoKTP(text_ktp.getText());
            agt.setRt(Integer.parseInt(text_rt.getText()));
            agt.setRw(Integer.parseInt(text_rw.getText()));
            agt.setDusun(text_dusun.getText());
            agt.setDesa(text_desa.getText());
            agt.setKota(text_kota.getText());
            agt.setProvinsi(text_provinsi.getText());

            AnggotaKontrol.getKoneksi().updateAnggota(agt);
            JOptionPane.showMessageDialog(null, "Anggota berhasil dirubah!");
            resetdefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_ubahActionPerformed

    private void button_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hapusActionPerformed
        try {
            Anggota agt = new Anggota();
            agt.setIdAnggota(text_idAnggota.getText());

            AnggotaKontrol.getKoneksi().deleteAnggota(agt);
            JOptionPane.showMessageDialog(null, "Anggota berhasil dihapus!");
            resetdefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_hapusActionPerformed

    private void tabel_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_anggotaMouseClicked
        try {
            custom();
            int row1 = tabel_anggota.getSelectedRow();
            Anggota agt = AnggotaKontrol.getKoneksi().cariIdAnggota(tabel_anggota.getValueAt(row1, 1).toString());
            text_idAnggota.setText(agt.getIdAnggota());
            text_nama.setText(agt.getNamaAnggota());
            text_pekerjaan.setText(agt.getPekerjaan());
            text_alamat.setText(agt.getAlamat());
            text_rt.setText(Integer.toString(agt.getRt()));
            text_rw.setText(Integer.toString(agt.getRw()));
            text_dusun.setText(agt.getDusun());
            text_desa.setText(agt.getDesa());
            text_kota.setText(agt.getKota());
            text_provinsi.setText(agt.getProvinsi());
            text_telp.setText(agt.getNoTelp());
            text_ktp.setText(agt.getNoKTP());
            text_kecamatan.setText(agt.getKecamatan());

            dialog_anggota.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabel_anggotaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormPemakaianAir a = new FormPemakaianAir();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void resetdefault() {
        text_idAnggota.setText("");
        text_nama.setText("");
        text_pekerjaan.setText("");
        text_alamat.setText("");
        text_telp.setText("");
        text_ktp.setText("");
        text_rt.setText("");
        text_rw.setText("");
        text_dusun.setText("");
        text_desa.setText("");
        text_kota.setText("");
        text_provinsi.setText("");
        text_kecamatan.setText("");
        text_idAnggota.setEditable(true);
        button_tambah.setEnabled(true);
        button_ubah.setEnabled(false);
        button_hapus.setEnabled(false);
    }

    public void custom() {
        text_idAnggota.setEditable(false);
        button_tambah.setEnabled(false);
        button_ubah.setEnabled(true);
        button_hapus.setEnabled(true);
    }

    public void update() {
        try {
            List<Anggota> agt = AnggotaKontrol.getKoneksi().selectAnggota();
            AnggotaTM model = new AnggotaTM(agt);
            tabel_anggota.setModel(model);

//        tabelDosen.getColumnModel().getColumn(0).setMinWidth(70);
//        tabelDosen.getColumnModel().getColumn(0).setMaxWidth(70);
//        tabelDosen.getColumnModel().getColumn(1).setMinWidth(220);
//        tabelDosen.getColumnModel().getColumn(1).setMaxWidth(220);
//            tabelDosen.setDefaultRenderer(Object.class, new renderWarnaWarni(Color.lightGray, Color.white));
        } catch (SQLException ex) {
            Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String generateKode(Anggota agt) {
        return agt.getIdAnggota() + "-1";
    }

    public String generateBulanTahun(String tanggal) {
        if (tanggal.split("-")[1].equals("01")) {
            return "JANUARI-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("02")) {
            return "FEBRUARI-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("03")) {
            return "MARET-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("04")) {
            return "APRIL-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("05")) {
            return "MEI-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("06")) {
            return "JUNI-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("07")) {
            return "JULI-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("08")) {
            return "AGUSTUS-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("09")) {
            return "SEPTEMBER-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("10")) {
            return "OKTOBER-" + tanggal.split("-")[0];
        } else if (tanggal.split("-")[1].equals("11")) {
            return "NOVEMBER-" + tanggal.split("-")[0];
        } else {
            return "DESEMBER-" + tanggal.split("-")[0];
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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_tabel;
    private javax.swing.JButton button_tambah;
    private javax.swing.JButton button_ubah;
    private javax.swing.JDialog dialog_anggota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_alamatNotelp;
    private javax.swing.JLabel label_namaDesa;
    private javax.swing.JTable tabel_anggota;
    private javax.swing.JTextArea text_alamat;
    private javax.swing.JTextField text_desa;
    private javax.swing.JTextField text_dusun;
    private javax.swing.JTextField text_idAnggota;
    private javax.swing.JTextField text_kecamatan;
    private javax.swing.JTextField text_kota;
    private javax.swing.JTextField text_ktp;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_pekerjaan;
    private javax.swing.JTextField text_provinsi;
    private javax.swing.JTextField text_rt;
    private javax.swing.JTextField text_rw;
    private javax.swing.JTextField text_telp;
    // End of variables declaration//GEN-END:variables
}
