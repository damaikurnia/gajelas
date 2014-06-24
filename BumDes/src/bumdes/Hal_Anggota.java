/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tambah_Anggota.java
 *
 * Created on May 8, 2014, 9:46:13 PM
 */
package bumdes;

import Kontrol.Kontrol_Anggota;
import Tabel_Model.Anggota;
import Tabel_list_Model.Tabel_Model_Daftar_Anggota;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Rafael Aweng
 */
public class Hal_Anggota extends javax.swing.JFrame {

    String file = "../gambar/bg.jpg";

    /** Creates new form Tambah_Anggota */
    public Hal_Anggota() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            tampilAnggota();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        tek_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tek_nik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tek_tempat = new javax.swing.JTextField();
        tek_ttl_dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tek_telp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tek_simpanan_pokok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tek_alamat = new javax.swing.JTextArea();
        tombol_Simpan_Anggota = new javax.swing.JButton();
        tombol_hapus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_Daftar_Anggota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANSAKSI SIMPAN & PINJAM");

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMASI ANGGOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Times New Roman", 3, 24))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 204, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton8.setText("KEMBALI");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(934, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAMBAH ANGGOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nama Lengkap");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("No KTP");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TTL");

        tek_ttl_dateChooser.setDateFormatString("dd-MMM-yyyy");
        tek_ttl_dateChooser.setFont(new java.awt.Font("Times New Roman", 0, 12));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("/");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("No. Telp/Hp");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Simpanan Pokok Rp.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Alamat Lengkap");

        tek_alamat.setColumns(20);
        tek_alamat.setRows(5);
        jScrollPane2.setViewportView(tek_alamat);

        tombol_Simpan_Anggota.setFont(new java.awt.Font("Times New Roman", 0, 12));
        tombol_Simpan_Anggota.setText("Simpan");
        tombol_Simpan_Anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_Simpan_AnggotaActionPerformed(evt);
            }
        });

        tombol_hapus.setFont(new java.awt.Font("Times New Roman", 0, 12));
        tombol_hapus.setText("Hapus");
        tombol_hapus.setEnabled(false);
        tombol_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapusActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tek_nik, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tek_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(tombol_Simpan_Anggota)
                                .addGap(18, 18, 18)
                                .addComponent(tombol_hapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tek_simpanan_pokok, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tek_ttl_dateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(tek_tempat, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tek_telp, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(89, 89, 89))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tek_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tek_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tek_tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tek_ttl_dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tek_telp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tek_simpanan_pokok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol_Simpan_Anggota)
                    .addComponent(tombol_hapus)
                    .addComponent(jButton4))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DAFTAR ANGGOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        tabel_Daftar_Anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_Daftar_Anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_Daftar_AnggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_Daftar_Anggota);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Beranda().setVisible(true);
}//GEN-LAST:event_jButton8ActionPerformed

    private void tabel_Daftar_AnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_Daftar_AnggotaMouseClicked
        try {
            // TODO add your handling code here:
            int row1 = tabel_Daftar_Anggota.getSelectedRow();
            String nik = tabel_Daftar_Anggota.getValueAt(row1, 0).toString();//0 kolom pertama
            Anggota a = Kontrol_Anggota.getKoneksi().getAnggota(nik);

            tek_alamat.setText(a.getAlamat());
            tek_nama.setText(a.getNama());
            tek_nik.setText(a.getNIK());
            tek_telp.setText(a.getTelp());
            tek_simpanan_pokok.setText(String.valueOf(a.getSimpananPokok()));
            String[] split = a.getTtl().split(",");
            String tempat = split[0];
            String tgl = split[1];

            tek_tempat.setText(tempat);
            Date d = new Date(tgl);
            tek_ttl_dateChooser.setDate(d);

            tek_nik.setEditable(false);
            tombol_Simpan_Anggota.setText("Ubah");
            tombol_hapus.setEnabled(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tabel_Daftar_AnggotaMouseClicked

    private void tombol_Simpan_AnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_Simpan_AnggotaActionPerformed
        try {
            // TODO add your handling code here:
            Kontrol_Anggota k = Kontrol_Anggota.getKoneksi();
            if (tek_nik.getText().equals("") || tek_nama.getText().equals("") || tek_tempat.getText().equals("") || tek_ttl_dateChooser.getDate().equals("") || tek_telp.getText().equals("") || tek_alamat.getText().equals("") || tek_simpanan_pokok.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Masih terdapat data yang kosong, Silahkan lengkapi dulu !!!");
            } else {
                Date tgl = tek_ttl_dateChooser.getDate();
                Date tgl_gabung = new Date(new Date().toLocaleString());
                SimpleDateFormat smp = new SimpleDateFormat("dd-MMM-yyyy");
                String tanggal = smp.format(tgl);
                String tglG = smp.format(tgl_gabung);
                Anggota agta = new Anggota(tek_nik.getText(), tek_nama.getText(), tek_tempat.getText() + "," + tanggal, tek_telp.getText(), tek_alamat.getText(), tglG, new Double(tek_simpanan_pokok.getText()));
                if (tombol_Simpan_Anggota.getText().equalsIgnoreCase("Simpan")) {
                    k.tambahAnggota(agta);
                    try {
                        tampilAnggota();
                        bersih_layar_tambah_anggota();
                        JOptionPane.showMessageDialog(rootPane, "Tersimpan !!!");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    k.updateAnggota(agta);
                    try {
                        tampilAnggota();
                        bersih_layar_tambah_anggota();
                        JOptionPane.showMessageDialog(rootPane, "Tersimpan !!!");
                         tombol_Simpan_Anggota.setText("Simpan");
                        tombol_hapus.setEnabled(false);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tombol_Simpan_AnggotaActionPerformed

    private void tombol_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapusActionPerformed
        try {
            // TODO add your handling code here:
            Kontrol_Anggota k = Kontrol_Anggota.getKoneksi();
            k.hapusAnggota(tek_nik.getText());
            tombol_hapus.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "Terhapus");
            tombol_Simpan_Anggota.setText("Simpan");
            tek_nik.setEditable(true);
            bersih_layar_tambah_anggota();
            try {
                tampilAnggota();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_tombol_hapusActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        tombol_Simpan_Anggota.setText("Simpan");
        tek_nik.setEditable(true);
        bersih_layar_tambah_anggota();
}//GEN-LAST:event_jButton4ActionPerformed

    public void tampilAnggota() throws Exception {
        List<Anggota> a = Kontrol_Anggota.getKoneksi().getAllAnggota();
        Tabel_Model_Daftar_Anggota model = new Tabel_Model_Daftar_Anggota(a);
        tabel_Daftar_Anggota.setModel(model);
    }

    public void bersih_layar_tambah_anggota() {
        tek_alamat.setText("");
        tek_nama.setText("");
        tek_nik.setText("");
        tek_telp.setText("");
        tek_tempat.setText("");
        tek_simpanan_pokok.setText("");
        tek_ttl_dateChooser.setDate(null);
        tombol_hapus.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    new Hal_Anggota().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_Daftar_Anggota;
    private javax.swing.JTextArea tek_alamat;
    private javax.swing.JTextField tek_nama;
    private javax.swing.JTextField tek_nik;
    private javax.swing.JTextField tek_simpanan_pokok;
    private javax.swing.JTextField tek_telp;
    private javax.swing.JTextField tek_tempat;
    private com.toedter.calendar.JDateChooser tek_ttl_dateChooser;
    private javax.swing.JButton tombol_Simpan_Anggota;
    private javax.swing.JButton tombol_hapus;
    // End of variables declaration//GEN-END:variables
}
