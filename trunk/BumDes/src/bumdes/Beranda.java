/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Beranda.java
 *
 * Created on May 8, 2014, 4:30:32 PM
 */
package bumdes;

import Kontrol.ProfilKontrol;
import Tabel_Model.Bumdes;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Rafael Aweng
 */
public class Beranda extends javax.swing.JFrame {

    Thread th = new Thread();
    String file = "../gambar/bg.jpg";
    Bumdes bum;

    /** Creates new form Beranda */
    public Beranda() {
        initComponents();
        this.setLocationRelativeTo(null);
        tampilan();


    }

    public void tampilan() {
        try {
            bum = ProfilKontrol.getKoneksi().tampilBumdes();
            jLabel7.setText(bum.getNamaBumdes());
            jLabel10.setText(bum.getNamaDesa());
            jLabel8.setText(bum.getAlamatBumdes() + " - " + bum.getNoTelpBumdes());
        } catch (SQLException ex) {
            Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel3 = new javax.swing.JPanel();
        label_selamatDatang = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        label_simpanPinjam = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label_airbersih = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label_airbersih1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_airbersih2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new BackgroundImage(file);
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuProfile = new javax.swing.JMenuItem();
        MenuModal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuSimpanPinjam = new javax.swing.JMenuItem();
        MenuPasarDesa = new javax.swing.JMenuItem();
        MenuPengelolaanAirBersih = new javax.swing.JMenuItem();
        MenuPerdagangan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEM INFORMASI BUMDES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_selamatDatang.setFont(new java.awt.Font("NSimSun", 1, 36));
        label_selamatDatang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_selamatDatang.setText("SELAMAT DATANG DI SISTEM INFORMASI BUMDES");
        jPanel3.add(label_selamatDatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 940, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUMDes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/anggota.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Info.Anggota");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/money_safe.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Info.Modal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 270));

        jPanel6.setBackground(new java.awt.Color(204, 204, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UNIT USAHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(204, 204, 0));

        label_simpanPinjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_simpanPinjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/wallet.png"))); // NOI18N
        label_simpanPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_simpanPinjamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_simpanPinjamMouseEntered(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Simpan Pinjam");

        label_airbersih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_airbersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/water.png"))); // NOI18N
        label_airbersih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_airbersihMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_airbersihMouseEntered(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Air Bersih");

        label_airbersih1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_airbersih1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/truck.png"))); // NOI18N
        label_airbersih1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_airbersih1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_airbersih1MouseEntered(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Transportasi");

        label_airbersih2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_airbersih2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/basket_full.png"))); // NOI18N
        label_airbersih2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_airbersih2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_airbersih2MouseEntered(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Dagang");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_simpanPinjam)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_airbersih))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_airbersih1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_airbersih2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(212, 212, 212))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(label_simpanPinjam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_airbersih2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(label_airbersih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_airbersih1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel17))))))
                .addGap(148, 148, 148))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 660, 270));

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informasi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/info.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Bantuan");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/laporan.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Laporan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 130, 270));

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("NSimSun", 1, 36));
        jLabel6.setText("SISTEM INFORMASI BUMDES");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 760, -1));

        jLabel7.setFont(new java.awt.Font("NSimSun", 1, 18));
        jLabel7.setText("\"<<NAMA BUMDES>>\"");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 760, -1));

        jLabel8.setFont(new java.awt.Font("NSimSun", 1, 18));
        jLabel8.setText("<<ALAMAT & NO TELP>>");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 760, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ber.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 140));

        jLabel10.setFont(new java.awt.Font("NSimSun", 1, 18));
        jLabel10.setText("<<NAMA DESA>>");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 760, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jMenu1.setText("DATA UTAMA");

        MenuProfile.setText("PROFIL");
        MenuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProfileActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProfile);

        MenuModal.setText("MODAL");
        MenuModal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModalActionPerformed(evt);
            }
        });
        jMenu1.add(MenuModal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("UNIT USAHA");

        MenuSimpanPinjam.setText("SIMPAN PINJAM");
        MenuSimpanPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSimpanPinjamActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSimpanPinjam);

        MenuPasarDesa.setText("PASAR DESA");
        jMenu2.add(MenuPasarDesa);

        MenuPengelolaanAirBersih.setText("PENGELOLAAN AIR BERSIH");
        MenuPengelolaanAirBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPengelolaanAirBersihActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPengelolaanAirBersih);

        MenuPerdagangan.setText("PERDAGANGAN");
        MenuPerdagangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPerdaganganActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPerdagangan);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("PENGATURAN");

        jMenuItem1.setText("Bunga Pinjaman");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("BANTUAN");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Tutorial Aplikasi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProfileActionPerformed
        Profile asd = new Profile();
        asd.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_MenuProfileActionPerformed

    private void MenuModalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModalActionPerformed
//        ProfilBumdes asd = new ProfilBumdes();
//        asd.setVisible(true);
//        this.setVisible(false);
}//GEN-LAST:event_MenuModalActionPerformed

    private void MenuPengelolaanAirBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPengelolaanAirBersihActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_MenuPengelolaanAirBersihActionPerformed

    private void MenuPerdaganganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPerdaganganActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_MenuPerdaganganActionPerformed

    private void MenuSimpanPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSimpanPinjamActionPerformed
        // TODO add your handling code here:
        SimpanDanPinjam s = new SimpanDanPinjam();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuSimpanPinjamActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:


        File pdf = new File("laporan/bantuan.pdf");
        if (pdf.exists()) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(pdf);
                } catch (IOException ex) {
                    Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "File tidak bisa dibuka, Apa anda sudah menginstal Adobe Reader untuk membuka file PDF.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "File Tidak ditemukan");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void label_simpanPinjamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_simpanPinjamMouseEntered
        // TODO add your handling code here:
        try {

            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_label_simpanPinjamMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        try {
            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        try {
            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:

        try {

            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_jLabel2MouseEntered

    private void label_simpanPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_simpanPinjamMouseClicked
        // TODO add your handling code here:
        SimpanDanPinjam s = new SimpanDanPinjam();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_simpanPinjamMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Hal_Anggota h = new Hal_Anggota();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        try {

            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        File pdf = new File("laporan/bantuan.pdf");
        if (pdf.exists()) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(pdf);
                } catch (IOException ex) {
                    Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "File tidak bisa dibuka, Apa anda sudah menginstal Adobe Reader untuk membuka file PDF.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "File Tidak ditemukan");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Edit_Bunga e = new Edit_Bunga();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void label_airbersihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersihMouseClicked
        // TODO add your handling code here:
        AirBersih s = new AirBersih();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_airbersihMouseClicked

    private void label_airbersihMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersihMouseEntered
        // TODO add your handling code here:
        try {

            // Membuka audio input stream
            File pdf = new File("./laporan/Windows Restore.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(pdf);
            // membuat clip
            Clip clip = AudioSystem.getClip();
            // mengambil data dari audio input stream
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }//GEN-LAST:event_label_airbersihMouseEntered

    private void label_airbersih1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersih1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_airbersih1MouseClicked

    private void label_airbersih1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersih1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label_airbersih1MouseEntered

    private void label_airbersih2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersih2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_airbersih2MouseClicked

    private void label_airbersih2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_airbersih2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label_airbersih2MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    new Beranda().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuModal;
    private javax.swing.JMenuItem MenuPasarDesa;
    private javax.swing.JMenuItem MenuPengelolaanAirBersih;
    private javax.swing.JMenuItem MenuPerdagangan;
    private javax.swing.JMenuItem MenuProfile;
    private javax.swing.JMenuItem MenuSimpanPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_airbersih;
    private javax.swing.JLabel label_airbersih1;
    private javax.swing.JLabel label_airbersih2;
    private javax.swing.JLabel label_selamatDatang;
    private javax.swing.JLabel label_simpanPinjam;
    // End of variables declaration//GEN-END:variables
}
