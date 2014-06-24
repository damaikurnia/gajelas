/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Bumdes;
import Tabel_Model.Simpanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mich
 */
public class Barang_Kontrol {

    private Connection conn;

    public Barang_Kontrol(Connection conn) {
        this.conn = conn;
    }

    public static Barang_Kontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        Barang_Kontrol login = new Barang_Kontrol(koneksi.getConnection());
        return login;
    }

    public void insertBarang(Barang s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "insert into per_barang values(?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.getKodeBarang());
        stmt.setString(2, s.getNamaBarang());
        stmt.setInt(3, s.getJumlahStok());
        stmt.setString(4, s.getSatuanBarang());
        stmt.setDouble(5, s.getHargaSatuan());
        stmt.setLong(6, s.getHrgBarang()); 
        stmt.executeUpdate();
        conn.commit();
    }
    
    public void deleteBarang(String kode) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String sql = "delete from per_barang where kodeBarang=?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, kode);
        stmt.executeUpdate();
        conn.commit();
    }
    
    public void updateBarang(Barang s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update per_barang set namaBarang=?,jumlahStok=?,"
                + "satuanBarang=?,HargaSatuan=?,HrgBarang=? where kodeBarang=?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.getNamaBarang());
        stmt.setInt(2, s.getJumlahStok());
        stmt.setString(3, s.getSatuanBarang());
        stmt.setLong(4, s.getHargaSatuan());
        stmt.setLong(5, s.getHrgBarang()); 
        stmt.setString(6, s.getKodeBarang());
        stmt.executeUpdate();
        conn.commit();
    }
    
    public List<Barang> tampilAllBarang() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM per_barang";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> brg = new ArrayList<>();
        while (result.next()) {
            Barang bum = new Barang();
            bum.setKodeBarang(result.getString(1));
            bum.setNamaBarang(result.getString(2));
            bum.setJumlahStok(result.getInt(3));
            bum.setSatuanBarang(result.getString(4));
            bum.setHargaSatuan(result.getLong(5));
            bum.setHrgBarang(result.getLong(6));
            brg.add(bum);
        }
        return brg;
    }
    
    public Barang tampilBarang(String kode) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM per_barang where namabarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kode);
        result = stmt.executeQuery();
        Barang bum = new Barang();
        while (result.next()) {
            bum.setKodeBarang(result.getString(1));
            bum.setNamaBarang(result.getString(2));
            bum.setJumlahStok(result.getInt(3));
            bum.setSatuanBarang(result.getString(4));
            bum.setHargaSatuan(result.getLong(5));
            bum.setHrgBarang(result.getLong(6));
        }
        return bum;
    }
    
    public List<Barang> cariBarang(String key) throws SQLException{
        PreparedStatement psmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String sql = "select * from per_barang "
                + "where namaBarang LIKE '" + key + "%'"
                + "order by kodeBarang";
        psmt = conn.prepareStatement(sql);
        result = psmt.executeQuery();
        List<Barang> barang = new ArrayList<Barang>();
        while (result.next()) {
            Barang brg = new Barang();
            brg.setKodeBarang(result.getString(1));
            brg.setNamaBarang(result.getString(2));
            brg.setJumlahStok(result.getInt(3));
            brg.setSatuanBarang(result.getString(4));
            brg.setHargaSatuan(result.getLong(5));
            brg.setHrgBarang(result.getLong(6));
            barang.add(brg);
        }
        conn.commit();
        return barang;
    }
}
