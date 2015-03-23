/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * insertGambar.java
 *
 * Created on Mar 13, 2015, 1:18:43 PM
 */
package Gambar;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Laurens_Widi
 */
public class insertGambar extends javax.swing.JFrame {

    File file;

    /** Creates new form insertGambar */
    public insertGambar() {
        try {
            initComponents();
            isitable();
            setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void isitable() throws SQLException {
        List<book> kategori = bookKontrol.getKoneksiBook().getAllGambar();
        bookTableModel model = new bookTableModel(kategori);
        tabelGambar.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namaGambarText = new javax.swing.JTextField();
        pilihgambarButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelGambar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelGambar = new javax.swing.JTable();
        jLabelNamaFile = new javax.swing.JLabel();
        bersihkanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        pilihgambarButton.setText("Pilih Gambar");
        pilihgambarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihgambarButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelGambar.setBackground(new java.awt.Color(244, 244, 244));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelGambar.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelGambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelGambarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelGambar);

        jLabelNamaFile.setText("Gambar");

        bersihkanButton.setText("Bersihkan");
        bersihkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(namaGambarText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNamaFile))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bersihkanButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pilihgambarButton)
                                .addGap(18, 18, 18)
                                .addComponent(simpanButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNamaFile)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(namaGambarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihgambarButton)
                    .addComponent(simpanButton))
                .addGap(18, 18, 18)
                .addComponent(bersihkanButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihgambarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihgambarButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(jLabelGambar) == JFileChooser.APPROVE_OPTION) {

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized = image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(imagedResized);

            jLabelGambar.setIcon(imageIcon);
            jLabelNamaFile.setText(jfc.getSelectedFile().getName());

            file = new File(jfc.getSelectedFile().getPath()); // file untuk dikopi
        }
    }//GEN-LAST:event_pilihgambarButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        book book = new book();
        book.setTitle(namaGambarText.getText());
        book.setImage(jLabelNamaFile.getText());
        try {
            bookKontrol bk = bookKontrol.getKoneksiBook();
            try {
                bk.tambahBook(book);
            } catch (SQLException ex) {
                Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
            }
            String path = new File(".").getCanonicalPath();
//            System.out.println(file+ " " +path);
            FileUtils.copyFileToDirectory(file, new File(path + "/image")); //copy file ke folder image
        } catch (IOException ex) {
            Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            isitable();
            bersihkan();
        } catch (SQLException ex) {
            Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void tabelGambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelGambarMouseClicked
        try {
            int row1 = tabelGambar.getSelectedRow();
            namaGambarText.setText(tabelGambar.getValueAt(row1, 1).toString());
            jLabelNamaFile.setText(tabelGambar.getValueAt(row1, 2).toString());

            String path = new File(".").getCanonicalPath();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(path + "/image/" + jLabelNamaFile.getText());
            Image imagedResized = image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(imagedResized);
            jLabelGambar.setIcon(imageIcon);
            
        } catch (IOException ex) {
            Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabelGambarMouseClicked

    private void bersihkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanButtonActionPerformed
      bersihkan();
    }//GEN-LAST:event_bersihkanButtonActionPerformed

    private void bersihkan(){
        namaGambarText.setText("");
        jLabelNamaFile.setText("");
        jLabelGambar.setIcon(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    new insertGambar().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(insertGambar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihkanButton;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelNamaFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaGambarText;
    private javax.swing.JButton pilihgambarButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTable tabelGambar;
    // End of variables declaration//GEN-END:variables
}
