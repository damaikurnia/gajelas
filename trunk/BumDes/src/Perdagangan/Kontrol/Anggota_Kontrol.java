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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mich
 */
public class Anggota_Kontrol {

    private Connection conn;

    public Anggota_Kontrol(Connection conn) {
        this.conn = conn;
    }

    public static Anggota_Kontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        Anggota_Kontrol login = new Anggota_Kontrol(koneksi.getConnection());
        return login;
    }

    public void insertAnggota(Anggota s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "insert into per_anggota values(?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.noIdentitas);
        stmt.setString(2, s.namaAnggota);
        stmt.setString(3, s.alamat);
        stmt.setString(4, s.noTelp);
        stmt.executeUpdate();
        conn.commit();
    }
    
//    public void deleteAnggota(String kode) throws SQLException {
//        PreparedStatement stmt = null;
//        conn.setAutoCommit(false);
//        String sql = "delete from per_anggota where noAnggota=?";
//        stmt = conn.prepareStatement(sql);
//        stmt.setString(1, kode);
//        stmt.executeUpdate();
//        conn.commit();
//    }
    
    public void updateAnggota(Anggota s) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update per_anggota set namaAnggota=?,alamat=?,"
                + "noTelp=? where noIdentitas=?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, s.namaAnggota);
        stmt.setString(2, s.alamat);
        stmt.setString(3, s.noTelp);
        stmt.setString(4, s.noIdentitas);
        stmt.executeUpdate();
        conn.commit();
    }
    
//    public List<Anggota> tampilAllAnggota() throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * FROM per_anggota";
//        stmt = conn.prepareStatement(query);
//        result = stmt.executeQuery();
//        List<Anggota> brg = new ArrayList<>();
//        while (result.next()) {
//            Anggota agt = new Anggota();
//            agt.noAnggota = result.getString(1);
//            agt.setNamaAnggota(result.getString(2));
//            agt.setAlamat(result.getString(3));
//            agt.statusTerakhir = result.getString(4);
//            brg.add(agt);
//        }
//        return brg;
//    }
    
    public Anggota cariAnggota(String key) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String sql = "select * from per_anggota "
                + "where namaAnggota LIKE '" + key + "'"
                + "order by kodeBarang";
        stmt = conn.prepareStatement(sql);
        result = stmt.executeQuery();
        Anggota agt = new Anggota();
        while (result.next()) {
            agt.noIdentitas = result.getString(1);
            agt.namaAnggota = result.getString(2);
            agt.alamat = result.getString(3);
            agt.noTelp = result.getString(4);
        }
        return agt;
    }
    
//    public Anggota tampilAnggota(String kode) throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * FROM per_Anggota where noAnggota = ?";
//        stmt = conn.prepareStatement(query);
//        stmt.setString(1, kode);
//        result = stmt.executeQuery();
//        Anggota bum = new Anggota();
//        while (result.next()) {
//            bum.noAnggota = result.getString(1);
//            bum.setNamaAnggota(result.getString(2));
//            bum.setAlamat(result.getString(3));
//            bum.statusTerakhir = result.getString(4);
//        }
//        return bum;
//    }    
}
