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
import java.sql.ResultSet;
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

    public int cekTrans() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select count(kodetrans) from trans;";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        int total = 0;
        while (result.next()) {
            total = result.getInt(1);
        }
        conn.close();
        return total;
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

    public double selectModal(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where kode in('3.1.1') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
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

    public double selectshu(double lababersih) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select (?*(persen/100)) as 'isi' \n"
                + "from shu \n"
                + "where kode like '3.2.%';";
        stmt = conn.prepareStatement(query);
        stmt.setDouble(1, lababersih);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = total + result.getDouble(1);
        }
        conn.close();
        return total;
    }

    public double selectAktivaLancar(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where \n"
                + "kode in('1.1.3','1.1.4') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = total + result.getDouble(1);
        }
        conn.close();
        return total;
    }
    
    public double selectAktivaLancar_kas(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where \n"
                + "kode in('1.1.1') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
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
    
    public double selectAktivaLancar_pendAir(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where \n"
                + "kode in('4.1.1','4.1.2') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = total + result.getDouble(1);
        }
        conn.close();
        return total;
    }

    public double selectAktivaTetap(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where kode in('1.2.2','1.2.2.1') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = total + result.getDouble(1);
        }
        conn.close();
        return total;
    }
    
    public double selectKewajibanLancar(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where kode in('2.1.1') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
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
    
    public double selectKewajibanTetap(String awal, String akhir) throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(debit)-sum(kredit) \n"
                + "from trans where kode in('5.1.1','5.1.2','5.1.3','5.1.4','5.1.5','5.1.6') \n"
                + "and tanggaltransaksi between ? and ? \n"
                + "group by kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, awal);
        stmt.setString(2, akhir);
        result = stmt.executeQuery();
        double total = 0;
        while (result.next()) {
            total = total + result.getDouble(1);
        }
        conn.close();
        return total;
    }
}
