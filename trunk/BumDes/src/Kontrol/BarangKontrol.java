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

    public void updateBarang(Barang brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update barang set namabarang = ?, stokbarang = ?, totalaset = ? where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getNamaBarang());
        stmt.setInt(2, brg.getStok());
        stmt.setDouble(3, brg.getTotalAset());
        stmt.setString(4, brg.getIdBarang());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
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
            Barang bar = new Barang(result.getString(1), result.getString(2), result.getInt(3),result.getDouble(4));
            brg.add(bar);
        }
        conn.close();
        return brg;
    }
    
    public Barang selectBarang2(String id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from barang where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        Barang bar = null;
        while (result.next()) {
            bar = new Barang(result.getString(1), result.getString(2), result.getInt(3),result.getDouble(4));
        }
        conn.close();
        return bar;
    }
    
    public void deleteBarang(Barang brg) throws SQLException{
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "delete from barang where idbarang = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getIdBarang());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
    public void insertBarang(Barang brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO barang VALUES(?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getIdBarang());
        stmt.setString(2, brg.getNamaBarang());
        stmt.setInt(3, brg.getStok());
        stmt.setDouble(4,brg.getTotalAset());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
    public String tampilTotalAset() throws SQLException{
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(totalaset) FROM barang";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String data = "";
        while (result.next()) {
            data = result.getString(1);
        }
        conn.close();
        return data;
    }
    
    public String cariIdBarang(String nama) throws SQLException{
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
}