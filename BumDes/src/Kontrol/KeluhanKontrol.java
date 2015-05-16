/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Anggota;
import Kelas.Keluhan;
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
public class KeluhanKontrol {

    private Connection conn;

    public KeluhanKontrol(Connection conn) {
        this.conn = conn;
    }

    public static KeluhanKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        KeluhanKontrol login = new KeluhanKontrol(koneksi.getConnection());
        return login;
    }

    public void updateKeluhan(Keluhan kel) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update keluhan set idanggota = ?, keterangan = ? where idkeluhan = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kel.getIdAnggota().getIdAnggota());
        stmt.setString(2, kel.getKeterangan());
        stmt.setString(3, kel.getIdKeluhan());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
    public void updateKeluhanSelesai(Keluhan kel) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update keluhan set status = ?, tglpelaksanaan = ? where idkeluhan = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kel.getStatus());
        stmt.setString(2, kel.getTglPelaksanaan());
        stmt.setString(3, kel.getIdKeluhan());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<Keluhan> selectKeluhanbelum() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from keluhan where status = 'BELUM'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Keluhan> agt = new ArrayList<Keluhan>();
        while (result.next()) {
            Keluhan bar = new Keluhan(result.getString(1), new Anggota(result.getString(2), query, query, query, query, query, 0, 0, query, query, query, query, query),
                    result.getString(3), result.getString(4), result.getString(5));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }

    public List<Keluhan> selectKeluhanAll() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from keluhan";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Keluhan> agt = new ArrayList<Keluhan>();
        while (result.next()) {
            Keluhan bar = new Keluhan(result.getString(1), new Anggota(result.getString(2), query, query, query, query, query, 0, 0, query, query, query, query, query),
                    result.getString(3), result.getString(4), result.getString(5));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }

    public void deleteKeluhan(Keluhan kel) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "delete from keluhan where idkeluhan = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kel.getIdKeluhan());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void insertKeluhan(Keluhan kel) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO keluhan(idkeluhan,idanggota,keterangan, status) VALUES(?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kel.getIdKeluhan());
        stmt.setString(2, kel.getIdAnggota().getIdAnggota());
        stmt.setString(3, kel.getKeterangan());
        stmt.setString(4, "BELUM");

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

//    public String cariIdKeluhan(Keluhan kel) throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * from keluhan where keterangan = ? AND idanggota = ? AND tglpelaksanaan = ?";
//        stmt = conn.prepareStatement(query);
//        stmt.setString(1, kel.getKeterangan());
//        stmt.setString(2, kel.getIdAnggota().getIdAnggota());
//        stmt.setString(3, kel.getTglPelaksanaan());
//        result = stmt.executeQuery();
//        String agt = "";
//        while (result.next()) {
//            agt = result.getString(1);
//        }
//        conn.close();
//        return agt;
//    }

}
