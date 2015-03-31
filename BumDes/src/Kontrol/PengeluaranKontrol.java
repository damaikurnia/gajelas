/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Pengeluaran;
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
public class PengeluaranKontrol {

    private Connection conn;

    public PengeluaranKontrol(Connection conn) {
        this.conn = conn;
    }

    public static PengeluaranKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        PengeluaranKontrol login = new PengeluaranKontrol(koneksi.getConnection());
        return login;
    }

    public void updatePengeluaran(Pengeluaran pen) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update pengeluaran set namapengeluaran = ? where kode = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, pen.getNamaPengeluaran());
        stmt.setString(2, pen.getKode());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

//    public List<Pengeluaran> selectPengeluaran() throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * from pengeluaran";
//        stmt = conn.prepareStatement(query);
//        result = stmt.executeQuery();
//        List<Pengeluaran> brg = new ArrayList<Pengeluaran>();
//        while (result.next()) {
//            Pengeluaran bar = new Pengeluaran(result.getString(1), result.getString(2));
//            brg.add(bar);
//        }
//        conn.close();
//        return brg;
//    }

    public List<Pengeluaran> selectPengeluaran2(String id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from pengeluaran where kode like '%"+id+"%' OR namapengeluaran like '%"+id+"%'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Pengeluaran> bar = new ArrayList<Pengeluaran>();
        while (result.next()) {
            bar.add(new Pengeluaran(result.getString(1), result.getString(2)));
        }
        conn.close();
        return bar;
    }

    public void deletePengeluaran(Pengeluaran brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "delete from pengeluaran where kode = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getKode());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void insertPengeluaran(Pengeluaran brg) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO pengeluaran VALUES(?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, brg.getKode());
        stmt.setString(2, brg.getNamaPengeluaran());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
}
