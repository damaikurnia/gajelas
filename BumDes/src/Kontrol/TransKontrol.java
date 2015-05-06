/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Custom.Tanggal;
import Kelas.Anggota;
import Kelas.Trans;
import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public double lr_pend(String awal, String akhir) throws SQLException {//tampil total pend laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(a.debit)-sum(a.kredit) as 'TOTAL' \n"
                + "from trans a, akun b \n"
                + "where a.kode = b.kode and a.kode like '4.1.%' and a.tanggaltransaksi between ? and ? \n"
                + "group by a.kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = result.getDouble(1);
        }
        conn.close();
        return total;
    }

    public double lr_beban(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(a.debit)-sum(a.kredit) as 'TOTAL' \n"
                + "from trans a, akun b where a.kode = b.kode and a.tanggaltransaksi between ? and ? \n"
                + "and a.kode in('5.1.1','5.1.2','5.1.3','5.1.4','5.1.5','5.1.6') group by a.kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = result.getDouble(1);
        }
        conn.close();
        return total;
    }
}
