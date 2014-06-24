/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.Kontrol;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mich
 */
public class Transaksi_Kontrol {

    private Connection conn;

    public Transaksi_Kontrol(Connection conn) {
        this.conn = conn;
    }

    public static Transaksi_Kontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        Transaksi_Kontrol login = new Transaksi_Kontrol(koneksi.getConnection());
        return login;
    }

    public void insertTransaksi(Transaksi s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "insert into per_transaksi (kodeTransaksi,idBarang,"
                + "jumlah,TotalPenjualan,idPembeli,jenisPembayaran,Status,"
                + "Tanggal)values(?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.kodeTransaksi);
        stmt.setString(2, s.idBarang);
        stmt.setInt(3, s.jumlah);
        stmt.setLong(4, s.totalPenjualan);
        stmt.setString(5, s.idPembeli);
        stmt.setString(6, s.jenisPembayaran);
        stmt.setString(7, s.status);
        stmt.setString(8, s.tanggal);
        stmt.executeUpdate();
        conn.commit();
    }

    public void deleteTransaksi(String kode) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String sql = "delete from per_transaksi where kodeTransaksi=?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, kode);
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update per_Transaksi set jenisPembayaran=?,status = ? "
                + "where kodeTransaksi=?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.jenisPembayaran);
        stmt.setString(2, trans.status);
        stmt.setString(3, trans.kodeTransaksi);
        stmt.executeUpdate();
        conn.commit();
    }

    public List<Transaksi> tampilAllTransaksi(String kodeTransaksi) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.idBarang,b.HargaSatuan,a.jumlah,a.totalPenjualan "
                + "FROM per_transaksi a, per_barang b "
                + "WHERE a.idBarang = b.namaBarang AND a.kodeTransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kodeTransaksi);
        result = stmt.executeQuery();
        List<Transaksi> brg = new ArrayList<>();
        while (result.next()) {
            Transaksi bum = new Transaksi();
            bum.idBarang = result.getString(1);
            bum.setHargaSatuan(result.getLong(2));
            bum.jumlah = result.getInt(3);
            bum.totalPenjualan = result.getLong(4);
            brg.add(bum);
        }
        return brg;
    }

    public void insertPiutang(Piutang s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "insert into per_piu values(?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.kodeTransaksi);
        stmt.setString(2, s.tanggal);
        stmt.executeUpdate();
        conn.commit();
    }

    public List<Transaksi> tampilPiutang() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM per_transaksi WHERE kodeTransaksi IN (SELECT kodeTransaksi FROM per_piu)";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> brg = new ArrayList<>();
        while (result.next()) {
            Transaksi bum = new Transaksi();
            bum.kodeTransaksi = result.getString(1);
            bum.idBarang = result.getString(2);
            bum.jumlah = result.getInt(3);
            bum.totalPenjualan = result.getLong(4);
            bum.idPembeli = result.getString(5);
            bum.jenisPembayaran = result.getString(6);
            bum.status = result.getString(7);
            bum.tanggal = result.getString(8);
            brg.add(bum);
        }
        return brg;
    }

    public void insertHutang(Hutang s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "insert into per_utg values(?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.kodeTransaksi);
        stmt.setString(2, s.tanggal);
        stmt.executeUpdate();
        conn.commit();
    }

    public List<Transaksi> tampilHutang() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM per_transaksi WHERE kodeTransaksi IN (SELECT kodeTransaksi FROM per_utg)";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> brg = new ArrayList<>();
        while (result.next()) {
            Transaksi bum = new Transaksi();
            bum.kodeTransaksi = result.getString(1);
            bum.idBarang = result.getString(2);
            bum.jumlah = result.getInt(3);
            bum.totalPenjualan = result.getLong(4);
            bum.idPembeli = result.getString(5);
            bum.jenisPembayaran = result.getString(6);
            bum.status = result.getString(7);
            bum.tanggal = result.getString(8);
            brg.add(bum);
        }
        return brg;
    }

    public String generateID() throws SQLException {
        ResultSet rset = null;
        String tangkepID = null;
        String sql = "SELECT IFNULL(MAX(kodeTransaksi),0) FROM per_transaksi WHERE kodeTransaksi LIKE 'T%'";
        Statement stat = conn.createStatement();

        rset = stat.executeQuery(sql);
        while (rset.next()) {
            tangkepID = rset.getString(1);
        }
        conn.close();

        if (tangkepID.equals("0")) {
            tangkepID = "T-" + (Integer.parseInt(tangkepID) + 1);
        } else {
            String[] bantu = tangkepID.split("-");
            tangkepID = "T-" + (Integer.parseInt(bantu[1]) + 1);
        }
        return tangkepID;
    }
    
    public String tampilHarga(String kodeTransaksi) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(totalPenjualan) FROM per_transaksi WHERE kodeTransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kodeTransaksi);
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }
        return total;
    }
}
