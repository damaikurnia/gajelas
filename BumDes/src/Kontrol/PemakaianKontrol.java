/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Anggota;
import Kelas.Pemakaian;
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
public class PemakaianKontrol {

    private Connection conn;

    public PemakaianKontrol(Connection conn) {
        this.conn = conn;
    }

    public static PemakaianKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        PemakaianKontrol login = new PemakaianKontrol(koneksi.getConnection());
        return login;
    }

    public void updatePemakaian(Pemakaian pem) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update pemakaian set airlunas = ?, airterakhir = ?,"
                + "airdibayar = ? where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setDouble(1, pem.getAirlunas());
        stmt.setDouble(2, pem.getAirterakhir());
        stmt.setDouble(3, pem.getAirdibayar());
        stmt.setString(4, pem.getNotransaksi());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public Pemakaian selectPemakaian(Pemakaian key) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM pemakaian WHERE idanggota = ? AND jatuhtempo = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, key.getIdanggota().getIdAnggota());
        stmt.setString(2, key.getJatuhtempo());
        result = stmt.executeQuery();
        Pemakaian agt = new Pemakaian();
        while (result.next()) {
            agt.setNotransaksi(result.getString(1));
            agt.setIdanggota(new Anggota(result.getString(2), "", "", "", "", "", 0, 0, "", "", "", "", ""));
            agt.setAirlunas(result.getDouble(3));
            agt.setAirterakhir(result.getDouble(4));
            agt.setAirdibayar(result.getDouble(5));
            agt.setBulan(result.getString(6));
            agt.setJatuhtempo(result.getString(7));
        }
        conn.close();
        return agt;
    }
    
//    public List<Anggota> selectAnggota2(String key) throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * from anggota where idanggota like '%" + key + "%' OR "
//                + "namaanggota like '%" + key + "%' OR pekerjaan like '%" + key + "%' OR "
//                + "alamat like '%" + key + "%' OR telp like '%" + key + "%' OR "
//                + "noKTP like '%" + key + "%' OR rt like '%" + key + "%' OR "
//                + "rw like '%" + key + "%' OR dusun like '%" + key + "%' OR "
//                + "desa like '%" + key + "%' OR kota like '%" + key + "%' OR "
//                + "provinsi like '%" + key + "%' OR kecamatan like '%" + key + "%' "
//                + "order by idanggota";
//        stmt = conn.prepareStatement(query);
//        result = stmt.executeQuery();
//        List<Anggota> agt = new ArrayList<Anggota>();
//        while (result.next()) {
//            Anggota bar = new Anggota(result.getString(1), result.getString(2),
//                    result.getString(3), result.getString(4), result.getString(5),
//                    result.getString(6), result.getInt(7), result.getInt(8),
//                    result.getString(9), result.getString(10), result.getString(11),
//                    result.getString(12),result.getString(13));
//            agt.add(bar);
//        }
//
//        conn.close();
//        return agt;
//    }

//    public void deleteAnggota(Anggota agt) throws SQLException {
//        PreparedStatement stmt = null;
//        conn.setAutoCommit(false);
//        String query = "delete from anggota where idanggota = ?";
//        stmt = conn.prepareStatement(query);
//        stmt.setString(1, agt.getIdAnggota());
//
//        stmt.executeUpdate();
//        conn.commit();
//        conn.close();
//    }

    public void insertPemakaian(Pemakaian pem) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO pemakaian VALUES(?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, pem.getNotransaksi());
        stmt.setString(2, pem.getIdanggota().getIdAnggota());
        stmt.setDouble(3, pem.getAirlunas());
        stmt.setDouble(4, pem.getAirterakhir());
        stmt.setDouble(5, pem.getAirdibayar());
        stmt.setString(6, pem.getBulan());
        stmt.setString(7, pem.getJatuhtempo());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
//    public Anggota cariIdAnggota(String nama) throws SQLException{
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * from anggota where namaanggota = ?";
//        stmt = conn.prepareStatement(query);
//        stmt.setString(1, nama);
//        result = stmt.executeQuery();
//        Anggota agt = null;
//        while (result.next()) {
//            agt = new Anggota(result.getString(1), result.getString(2),
//                    result.getString(3), result.getString(4), result.getString(5),
//                    result.getString(6), result.getInt(7), result.getInt(8),
//                    result.getString(9), result.getString(10), result.getString(11),
//                    result.getString(12),result.getString(13));
//        }
//
//        conn.close();
//        return agt;
//    }
    
//    public List<Pemakaian> selectPemakaianBulanan(Pemakaian pem) throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet result = null;
//        conn.setAutoCommit(false);
//        String query = "SELECT * from pemakaian where bulan = ? and tahun = ?";
//        stmt = conn.prepareStatement(query);
//        stmt.setString(1, pem.getBulan());
//        stmt.setString(2, pem.getTahun());
//        result = stmt.executeQuery();
//        List<Pemakaian> agt = new ArrayList<Pemakaian>();
//        while (result.next()) {
//            Pemakaian pemm = new Pemakaian();
//            pemm.setNotransaksi(result.getString(1));
//            pemm.setIdanggota(new Anggota(result.getString(2), "", "", "", "", "", 0, 0, "", "", "", "", ""));
//            pemm.setAirlunas(result.getDouble(3));
//            pemm.setAirterakhir(result.getDouble(4));
//            pemm.setAirdibayar(result.getDouble(5));
//            pemm.setBulan(result.getString(6));
//            pemm.setTahun(result.getString(7));
//        }
//        conn.close();
//        return agt;
//    }
    
    public List<Pemakaian> selectHistoriPemakaian(String idanggota) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM pemakaian WHERE idanggota = ? ORDER BY jatuhtempo";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, idanggota);
        result = stmt.executeQuery();
        List<Pemakaian> agt = new ArrayList<Pemakaian>();
        while (result.next()) {
            Pemakaian pemm = new Pemakaian();
            pemm.setNotransaksi(result.getString(1));
            pemm.setIdanggota(new Anggota(result.getString(2), "", "", "", "", "", 0, 0, "", "", "", "", ""));
            pemm.setAirlunas(result.getDouble(3));
            pemm.setAirterakhir(result.getDouble(4));
            pemm.setAirdibayar(result.getDouble(5));
            pemm.setBulan(result.getString(6));
            pemm.setJatuhtempo(result.getString(7));
            agt.add(pemm);
        }
        conn.close();
        return agt;
    }
}
