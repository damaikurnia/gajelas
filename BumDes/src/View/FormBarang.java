/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Custom.RataKanan;
import Kelas.Barang;
import Kelas.Profil;
import Koneksi.Koneksi;
import Kontrol.BarangKontrol;
import Kontrol.PengaturanKontrol;
import TabelModel.BarangTM;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author damaikurnia
 */
public class FormBarang extends javax.swing.JFrame {

    /**
     * Creates new form FormAir
     */
    public FormBarang() {
        initComponents();
        this.setLocationRelativeTo(null);
        resetDefault();

        dialog_barang.setVisible(false);
        dialog_barang.setSize(627, 400);
        dialog_barang.setLocationRelativeTo(null);
        dialog_barang.setTitle("DATA BARANG");

        sinkronGambar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_barang = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        text_ttlaset = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_namaDesa = new javax.swing.JLabel();
        label_alamatNotelp = new javax.swing.JLabel();
        label_kop = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        button_simpan = new javax.swing.JButton();
        button_ubah = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        button_tabel = new javax.swing.JButton();
        text_stok = new javax.swing.JTextField();
        text_kode = new javax.swing.JTextField();
        text_nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_totalAset = new javax.swing.JTextField();
        button_cetak = new javax.swing.JButton();
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

        dialog_barang.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TABEL BARANG");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 70));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_barang);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 210));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL ASET");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 130, 20));

        text_ttlaset.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(text_ttlaset, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 140, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 610, 270));

        dialog_barang.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

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

        label_kop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(label_kop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_alamatNotelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_namaDesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(label_kop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("TOTAL ASET");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("FORM BARANG");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("KODE");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("NAMA BARANG");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        button_simpan.setText("SIMPAN");
        button_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simpanActionPerformed(evt);
            }
        });
        jPanel3.add(button_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        button_ubah.setText("UBAH");
        button_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ubahActionPerformed(evt);
            }
        });
        jPanel3.add(button_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        button_hapus.setText("HAPUS");
        button_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(button_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        button_tabel.setText("DAFTAR SELURUH BARANG");
        button_tabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tabelActionPerformed(evt);
            }
        });
        jPanel3.add(button_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));
        jPanel3.add(text_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, -1));
        jPanel3.add(text_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, -1));
        jPanel3.add(text_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, -1));

        jLabel9.setText("STOK SAAT INI");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel3.add(text_totalAset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, -1));

        button_cetak.setText("CETAK");
        button_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cetakActionPerformed(evt);
            }
        });
        jPanel3.add(button_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

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
        dialog_barang.setVisible(true);
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

    private void button_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpanActionPerformed
        try {
            Barang brg = new Barang();
            brg.setIdBarang(text_kode.getText());
            brg.setNamaBarang(text_nama.getText());
            brg.setStok(Integer.parseInt(text_stok.getText()));
            brg.setTotalAset(Double.parseDouble(text_totalAset.getText()));

            BarangKontrol.getKoneksi().insertBarang(brg);
            JOptionPane.showMessageDialog(null, "Barang berhasil ditambahkan!");
            resetDefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_simpanActionPerformed

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        int row1 = tabel_barang.getSelectedRow();
        text_kode.setText(tabel_barang.getValueAt(row1, 0).toString());
        text_nama.setText(tabel_barang.getValueAt(row1, 1).toString());
        text_stok.setText(tabel_barang.getValueAt(row1, 2).toString());
        text_totalAset.setText(tabel_barang.getValueAt(row1, 3).toString());

        text_kode.setEditable(false);
        button_simpan.setEnabled(false);
        button_ubah.setEnabled(true);
        button_hapus.setEnabled(true);
        dialog_barang.setVisible(false);
    }//GEN-LAST:event_tabel_barangMouseClicked

    private void button_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ubahActionPerformed
        try {
            Barang brg = new Barang();
            brg.setIdBarang(text_kode.getText());
            brg.setNamaBarang(text_nama.getText());
            brg.setStok(Integer.parseInt(text_stok.getText()));
            brg.setTotalAset(Double.parseDouble(text_totalAset.getText()));

            BarangKontrol.getKoneksi().updateBarang(brg);
            JOptionPane.showMessageDialog(null, "Barang Berhasil diupdate!");
            resetDefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_ubahActionPerformed

    private void button_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hapusActionPerformed
        try {
            Barang brg = new Barang(text_kode.getText(), null, WIDTH, WIDTH);
            BarangKontrol.getKoneksi().deleteBarang(brg);
            JOptionPane.showMessageDialog(null, "Barang Berhasil didelete!");
            resetDefault();
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_hapusActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormPemakaianAir a = new FormPemakaianAir();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void button_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cetakActionPerformed
        Connection kon = new Koneksi().getConnection();

        String reportSource = "./src/Lap/LapBarang.jasper";

        Map<String, Object> params = new HashMap<String, Object>();
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, kon);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_button_cetakActionPerformed

    public void update() {
        try {
            List<Barang> brg = BarangKontrol.getKoneksi().selectBarang();
            BarangTM model = new BarangTM(brg);
            tabel_barang.setModel(model);

            TableCellRenderer kanan = new RataKanan();
            tabel_barang.getColumnModel().getColumn(2).setCellRenderer(kanan);
            tabel_barang.getColumnModel().getColumn(3).setCellRenderer(kanan);
            
            text_ttlaset.setText(BarangKontrol.getKoneksi().tampilTotalAset());
//        tabelDosen.getColumnModel().getColumn(0).setMaxWidth(70);
//        tabelDosen.getColumnModel().getColumn(1).setMinWidth(220);
//        tabelDosen.getColumnModel().getColumn(1).setMaxWidth(220);
//            tabelDosen.setDefaultRenderer(Object.class, new renderWarnaWarni(Color.lightGray, Color.white));
        } catch (SQLException ex) {
            Logger.getLogger(FormBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetDefault() {
        button_ubah.setEnabled(false);
        button_hapus.setEnabled(false);
        text_kode.setEditable(true);
        text_kode.setText("");
        text_nama.setText("");
        text_stok.setText("");
        text_totalAset.setText("");
    }
    
    public void sinkronGambar() {
        try {
            Profil prof = PengaturanKontrol.getKoneksi().tampilProfil();
            label_namaDesa.setText("BADAN USAHA MILIK DESA " + prof.getNamadesa());
            label_alamatNotelp.setText(prof.getAlamatdesa()+" "+prof.getDesa()+" "+prof.getKecamatan()
                    +" "+prof.getKabupaten()+" "+prof.getProvinsi()
                    + " - " + prof.getNotelp());
            
            String path = new File(".").getCanonicalPath() + "/Gambar/" + prof.getLogo();

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(path);
            Image imagedResized = image.getScaledInstance(110, 100, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(imagedResized);
            label_kop.setIcon(imageIcon);
        } catch (IOException ex) {
            Logger.getLogger(FormPengaturan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormPengaturan.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cetak;
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_simpan;
    private javax.swing.JButton button_tabel;
    private javax.swing.JButton button_ubah;
    private javax.swing.JDialog dialog_barang;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_alamatNotelp;
    private javax.swing.JLabel label_kop;
    private javax.swing.JLabel label_namaDesa;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTextField text_kode;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_stok;
    private javax.swing.JTextField text_totalAset;
    private javax.swing.JTextField text_ttlaset;
    // End of variables declaration//GEN-END:variables
}
