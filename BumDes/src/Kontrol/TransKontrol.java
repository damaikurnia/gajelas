/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Custom.Tanggal;
import Kelas.Trans;
import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author damaikurnia
 */
public class TransKontrol {
    private Connection conn;

    public TransKontrol(Connection conn) {
        this.conn = conn;
    }

    public static TransKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        TransKontrol login = new TransKontrol(koneksi.getConnection());
        return login;
    }
    
    public void insertTransaksi(Trans trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "Insert into trans (kode,debit,kredit,tanggaltransaksi) values(?,?,?,?);";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getKodeAkun());
        stmt.setLong(2, trans.getDebit());
        stmt.setLong(3, trans.getKredit());
        stmt.setString(4, Tanggal.getTanggal2());
        
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
}
