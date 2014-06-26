/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tambah_Anggota.java
 *
 * Created on May 8, 2014, 9:46:13 PM
 */
package Perdagangan;

import Perdagangan.Kontrol.Barang;
import Perdagangan.TabelModel.Tabel_Model_Barang;
import bumdes.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Rafael Aweng
 */
public class Per_Barang extends javax.swing.JFrame {

    String file = "../gambar/bg.jpg";

    /**
     * Creates new form Tambah_Anggota
     */
    public Per_Barang() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);

            updateTabel();
        } catch (Exception ex) {
            Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        tombolKembali = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        isian_kodeBarang = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        isian_namaBarang = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        isian_jumlahStok = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        isian_satuanBarang = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        isian_hargaSatuan = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        isian_hrgBarang = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        tombolBatal = new javax.swing.JButton();
        tombolRubah = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANSAKSI SIMPAN & PINJAM");

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMASI BARANG", 2, 3, new java.awt.Font("Times New Roman", 3, 24))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 204, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tombolKembali.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tombolKembali.setText("KEMBALI");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tombolKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tombolKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETIL BARANG", 2, 0, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel20.setText("Kode Barang");

        jLabel52.setText("Nama Barang");

        jLabel53.setText("Jumlah");

        isian_jumlahStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isian_jumlahStokKeyReleased(evt);
            }
        });

        jLabel54.setText("Satuan");

        jLabel55.setText("Harga Per @");

        isian_hargaSatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isian_hargaSatuanKeyReleased(evt);
            }
        });

        jLabel56.setText("Rp");

        jLabel57.setText("Total Harga");

        isian_hrgBarang.setEditable(false);

        tombolTambah.setText("TAMBAH");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolHapus.setText("HAPUS");
        tombolHapus.setEnabled(false);
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        tombolBatal.setText("BATAL");
        tombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBatalActionPerformed(evt);
            }
        });

        tombolRubah.setText("RUBAH");
        tombolRubah.setEnabled(false);
        tombolRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolRubahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(isian_jumlahStok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isian_satuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(isian_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isian_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel56)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isian_hargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isian_hrgBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(tombolTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolRubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolBatal)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(isian_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(isian_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(isian_jumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(isian_satuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(isian_hargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(isian_hrgBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolRubah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABEL BARANG", 2, 0, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        new Perdagangan_Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        try {
            Barang brg = new Barang();
            brg.kodeBarang = isian_kodeBarang.getText();
            brg.namaBarang = isian_namaBarang.getText();
            brg.jumlahStok = Integer.parseInt(isian_jumlahStok.getText());
            brg.satuanBarang = isian_satuanBarang.getText();
            brg.hargaSatuan = Long.parseLong(isian_hargaSatuan.getText());
            brg.hrgBarang = Long.parseLong(isian_hrgBarang.getText());

            Perdagangan.Kontrol.Barang_Kontrol.getKoneksi().insertBarang(brg);
            JOptionPane.showMessageDialog(rootPane, "Pengisian Barang Sukses");

            updateTabel();
            bersihkan();
        } catch (SQLException ex) {
            Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        int jwb = JOptionPane.showConfirmDialog(rootPane,"Yakin Hapus?");//O yes, 1 No, 2 Cancel
        if(jwb==0){
             try {
                Barang brg = new Barang();
                brg.kodeBarang = isian_kodeBarang.getText();
                Perdagangan.Kontrol.Barang_Kontrol.getKoneksi().deleteBarang(brg.kodeBarang);
                JOptionPane.showMessageDialog(rootPane, "Penghapusan Barang Sukses");
                updateTabel();
                bersihkan();
            } catch (SQLException ex) {
                Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        bersihkan();
    }//GEN-LAST:event_tombolBatalActionPerformed

    private void tombolRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolRubahActionPerformed
        try {
            Barang brg = new Barang();
            brg.kodeBarang = isian_kodeBarang.getText();
            brg.namaBarang = isian_namaBarang.getText();
            brg.jumlahStok = Integer.parseInt(isian_jumlahStok.getText());
            brg.satuanBarang = isian_satuanBarang.getText();
            brg.hargaSatuan = Long.parseLong(isian_hargaSatuan.getText());
            brg.hrgBarang = Long.parseLong(isian_hrgBarang.getText());
            Perdagangan.Kontrol.Barang_Kontrol.getKoneksi().updateBarang(brg);
            JOptionPane.showMessageDialog(rootPane, "Pengubahan Barang Sukses");
            updateTabel();
            bersihkan();
        } catch (SQLException ex) {
            Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Per_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombolRubahActionPerformed

    private void isian_jumlahStokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isian_jumlahStokKeyReleased
        if (!isian_jumlahStok.getText().equals("") && !isian_hargaSatuan.getText().equals("")) {
            int stok = Integer.parseInt(isian_jumlahStok.getText());
            long hargaSatuan = Long.parseLong(isian_hargaSatuan.getText());
            long harga = stok * hargaSatuan;
            isian_hrgBarang.setText(Long.toString(harga));
        } else {
            isian_hrgBarang.setText("");
        }
    }//GEN-LAST:event_isian_jumlahStokKeyReleased

    private void isian_hargaSatuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isian_hargaSatuanKeyReleased
        if (!isian_jumlahStok.getText().equals("") && !isian_hargaSatuan.getText().equals("")) {
            int stok = Integer.parseInt(isian_jumlahStok.getText());
            long hargaSatuan = Long.parseLong(isian_hargaSatuan.getText());
            long harga = stok * hargaSatuan;
            isian_hrgBarang.setText(Long.toString(harga));
        } else {
            isian_hrgBarang.setText("");
        }
    }//GEN-LAST:event_isian_hargaSatuanKeyReleased

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int row1 = tabelBarang.getSelectedRow();
        isian_kodeBarang.setText(tabelBarang.getValueAt(row1, 0).toString());//0 kolom pertama
        isian_namaBarang.setText(tabelBarang.getValueAt(row1, 1).toString());
        isian_jumlahStok.setText(tabelBarang.getValueAt(row1, 2).toString());
        isian_satuanBarang.setText(tabelBarang.getValueAt(row1, 3).toString());
        isian_hargaSatuan.setText(tabelBarang.getValueAt(row1, 4).toString());
        isian_hrgBarang.setText(tabelBarang.getValueAt(row1, 5).toString());
        tombolRubah.setEnabled(true);
        tombolHapus.setEnabled(true);
        isian_kodeBarang.setEditable(false);
    }//GEN-LAST:event_tabelBarangMouseClicked
//    public static String bulan(int b) {
//        String bb = "";
//        if (b == 1) {
//            bb = "JAN";
//        } else if (b == 2) {
//            bb = "FEB";
//        } else if (b == 3) {
//            bb = "MAR";
//        } else if (b == 4) {
//            bb = "APR";
//        } else if (b == 5) {
//            bb = "MAY";
//        } else if (b == 6) {
//            bb = "JUN";
//        } else if (b == 7) {
//            bb = "JUL";
//        } else if (b == 8) {
//            bb = "AUG";
//        } else if (b == 9) {
//            bb = "SEP";
//        } else if (b == 10) {
//            bb = "OKT";
//        } else if (b == 11) {
//            bb = "NOV";
//        } else if (b == 12) {
//            bb = "DEC";
//        }
//        return bb;
//    }

    public void tampilSimpanan(String nik) throws Exception {
//        List<Simpanan> a = Kontrol_Simpanan.getKoneksi().getAllSimpanan(nik);
//        Tabel_Model_Daftar_Simpanan model = new Tabel_Model_Daftar_Simpanan(a);
//        tabel_Daftar_Simpanan.setModel(model);
    }

    public void tampilPinjaman(String nik) throws Exception {
//        List<Pinjaman> a = Kontrol_Pinjaman.getKoneksi().getAllPinjaman(nik);
//        Tabel_Model_Daftar_Pinjaman model = new Tabel_Model_Daftar_Pinjaman(a);
//        tabel_Daftar_Pinjaman.setModel(model);
    }

    public void STATUSPinjaman(String nik) throws Exception {
//        List<Pinjaman> a = Kontrol_Pinjaman.getKoneksi().getAllPinjaman(nik);
//        double p = 0;
//        for (int i = 0; i < a.size(); i++) {
//            p += (a.get(i).getSaldo_Pokok_pinjaman() + a.get(i).getSaldo_Bunga());
//        }
//        if (p > 0) {
//            label_status_pinjam.setText(": Pinjam");
//        }
    }

    public void updateTabel() throws Exception {
        List<Barang> a = Perdagangan.Kontrol.Barang_Kontrol.getKoneksi().tampilAllBarang();
        Tabel_Model_Barang model = new Tabel_Model_Barang(a);
        tabelBarang.setModel(model);
    }

    public void bersihkan() {
        isian_kodeBarang.setText("");
        isian_namaBarang.setText("");
        isian_jumlahStok.setText("");
        isian_satuanBarang.setText("");
        isian_hargaSatuan.setText("");
        isian_hrgBarang.setText("");
        tombolRubah.setEnabled(false);
        tombolHapus.setEnabled(false);
        isian_kodeBarang.setEditable(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    new Per_Barang().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isian_hargaSatuan;
    private javax.swing.JTextField isian_hrgBarang;
    private javax.swing.JTextField isian_jumlahStok;
    private javax.swing.JTextField isian_kodeBarang;
    private javax.swing.JTextField isian_namaBarang;
    private javax.swing.JTextField isian_satuanBarang;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolRubah;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables
}