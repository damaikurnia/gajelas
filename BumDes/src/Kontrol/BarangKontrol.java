/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Barang;
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
public class BarangKontrol {

    private Connection conn;

    public BarangKontrol(Connection conn) {
        this.conn = conn;
    }

    public static BarangKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        BarangKontrol login = new BarangKontrol(koneksi.getConnection());
        return login;
    }

    public List<Barang> selectBarang() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from barang";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> brg = new ArrayList<Barang>();
        while (result.next()) {
            Barang bar = new Barang();
            bar.setIdBarang(result.getString(1));
            bar.setNamaBarang(result.getString(2));
            bar.setStok(result.getInt(3));
            bar.setTotalAset(result.getDouble(4));
            brg.add(bar);
        }
        conn.close();
        return brg;
    }
    
    public Barang selectBarang2(String idbarang) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT idbarang,namabarang,stokbarang,totalaset from barang where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, idbarang);
        result = stmt.executeQuery();
        Barang bar = new Barang();
        while (result.next()) {
            bar.setIdBarang(result.getString(1));
            bar.setNamaBarang(result.getString(2));
            bar.setStok(result.getInt(3));
            bar.setTotalAset(result.getDouble(4));
        }
        conn.close();
        return bar;
    }
    
     public void updateBarang(Barang brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update barang set stokbarang = ?, totalaset = ? where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, brg.getStok());
        stmt.setDouble(2, brg.getTotalAset());
        stmt.setString(3, brg.getIdBarang());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<Barang> selectBarang_peralatan() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from barang where kode = '1.2.2'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> brg = new ArrayList<Barang>();
        while (result.next()) {
            Barang bar = new Barang();
            bar.setIdBarang(result.getString(1));
            bar.setNamaBarang(result.getString(2));
            bar.setStok(result.getInt(3));
            bar.setTotalAset(result.getDouble(4));
            brg.add(bar);
        }
        conn.close();
        return brg;
    }

    public List<Barang> selectBarang_perlengkapan() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from barang where kode = '1.1.4'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> brg = new ArrayList<Barang>();
        while (result.next()) {
            Barang bar = new Barang();
            bar.setIdBarang(result.getString(1));
            bar.setNamaBarang(result.getString(2));
            bar.setStok(result.getInt(3));
            bar.setTotalAset(result.getDouble(4));
            brg.add(bar);
        }
        conn.close();
        return brg;
    }

    public void insertBarang(Barang brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO barang VALUES(?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getIdBarang());
        stmt.setString(2, brg.getNamaBarang());
        stmt.setInt(3, brg.getStok());
        stmt.setDouble(4, brg.getTotalAset());
        stmt.setString(5, brg.getKode());
        stmt.setString(6, brg.getKategori());
        stmt.setString(7, brg.getTanggalPenyusutan());
        stmt.setInt(8, brg.getJangkawaktu());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public String tampilTotalAset_peralatan() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(totalaset) FROM barang where kode = '1.2.2'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String data = "";
        while (result.next()) {
            data = result.getString(1);
        }
        conn.close();
        return data;
    }

    public String tampilTotalAset_perlengkapan() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(totalaset) FROM barang where kode = '1.1.4'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String data = "";
        while (result.next()) {
            data = result.getString(1);
        }
        conn.close();
        return data;
    }

    public String cariIdBarang(String nama) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT idbarang FROM barang where namabarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nama);
        result = stmt.executeQuery();
        String data = "";
        while (result.next()) {
            data = result.getString(1);
        }
        conn.close();
        return data;
    }

    public String cariKodeAkunBarang(String nama) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT kode FROM barang where namabarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nama);
        result = stmt.executeQuery();
        String data = "";
        while (result.next()) {
            data = result.getString(1);
        }
        conn.close();
        return data;
    }

    //new new-------------------------------------------------------------------
    public List<Barang> cariKategori() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select kategori from barang group by kategori";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> kat = new ArrayList<Barang>();
        while (result.next()) {
            Barang bar = new Barang();
            bar.setKategori(result.getString(1));
            kat.add(bar);
        }
        conn.close();
        return kat;
    }
    
    //----------------------AKUMULASI-------------------------------------------
    
    public List<Barang> cariBarangAkumulasi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM barang "
                + "where kode = '1.2.2' and sysdate()>tglakumulasi and jangkawaktu >0;";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Barang> kat = new ArrayList<Barang>();
        while (result.next()) {
            Barang bar = new Barang();
            bar.setIdBarang(result.getString(1));
            bar.setNamaBarang(result.getString(2));
            bar.setStok(result.getInt(3));
            bar.setTotalAset(result.getDouble(4));
            bar.setKode(result.getString(5));
            bar.setKategori(result.getString(6));
            bar.setTanggalPenyusutan(result.getString(7));
            bar.setJangkawaktu(result.getInt(8));
            kat.add(bar);
        }
        conn.close();
        return kat;
    }
    
    public void updateBarangAkumulasi(Barang brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update barang set totalaset = ?, tglakumulasi = ?,"
                + "jangkawaktu = ? where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setDouble(1, brg.getTotalAset());
        stmt.setString(2, brg.getTanggalPenyusutan());
        stmt.setInt(3, brg.getJangkawaktu());
        stmt.setString(4, brg.getIdBarang());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
}
