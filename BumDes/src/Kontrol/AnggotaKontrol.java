/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Anggota;
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
public class AnggotaKontrol {

    private Connection conn;

    public AnggotaKontrol(Connection conn) {
        this.conn = conn;
    }

    public static AnggotaKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        AnggotaKontrol login = new AnggotaKontrol(koneksi.getConnection());
        return login;
    }

    public void updateAnggota(Anggota agt) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update anggota set namaanggota = ?, pekerjaan = ?,"
                + "alamat = ?,rt = ?, rw = ?, dusun = ?,desa = ?, kota = ?,"
                + "provinsi = ?, telp = ?, noKTP = ?,kecamatan = ?,logo = ? "
                + "where idanggota = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, agt.getNamaAnggota());
        stmt.setString(2, agt.getPekerjaan());
        stmt.setString(3, agt.getAlamat());
        stmt.setInt(4, agt.getRt());
        stmt.setInt(5, agt.getRw());
        stmt.setString(6, agt.getDusun());
        stmt.setString(7, agt.getDesa());
        stmt.setString(8, agt.getKota());
        stmt.setString(9, agt.getProvinsi());
        stmt.setString(10, agt.getNoTelp());
        stmt.setString(11, agt.getNoKTP());
        stmt.setString(12, agt.getKecamatan());
        stmt.setString(13, agt.getLogo());
        stmt.setString(14, agt.getIdAnggota());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<Anggota> selectAnggota() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from anggota";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Anggota> agt = new ArrayList<Anggota>();
        while (result.next()) {
            Anggota bar = new Anggota(result.getString(1), result.getString(2),
                    result.getString(3), result.getString(4), result.getString(5),
                    result.getString(6), result.getInt(7), result.getInt(8),
                    result.getString(9), result.getString(10), result.getString(11),
                    result.getString(12),result.getString(13));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }
    
    public List<Anggota> selectAnggota2(String key) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from anggota where idanggota like '%" + key + "%' OR "
                + "namaanggota like '%" + key + "%' OR pekerjaan like '%" + key + "%' OR "
                + "alamat like '%" + key + "%' OR telp like '%" + key + "%' OR "
                + "noKTP like '%" + key + "%' OR rt like '%" + key + "%' OR "
                + "rw like '%" + key + "%' OR dusun like '%" + key + "%' OR "
                + "desa like '%" + key + "%' OR kota like '%" + key + "%' OR "
                + "provinsi like '%" + key + "%' OR kecamatan like '%" + key + "%' "
                + "order by idanggota";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Anggota> agt = new ArrayList<Anggota>();
        while (result.next()) {
            Anggota bar = new Anggota(result.getString(1), result.getString(2),
                    result.getString(3), result.getString(4), result.getString(5),
                    result.getString(6), result.getInt(7), result.getInt(8),
                    result.getString(9), result.getString(10), result.getString(11),
                    result.getString(12),result.getString(13));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }

    public void deleteAnggota(Anggota agt) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "delete from anggota where idanggota = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, agt.getIdAnggota());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void insertAnggota(Anggota agt) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO anggota VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, agt.getIdAnggota());
        stmt.setString(2, agt.getNamaAnggota());
        stmt.setString(3, agt.getPekerjaan());
        stmt.setString(4, agt.getAlamat());
        stmt.setString(5, agt.getNoTelp());
        stmt.setString(6, agt.getNoKTP());
        stmt.setInt(7, agt.getRt());
        stmt.setInt(8, agt.getRw());
        stmt.setString(9, agt.getDusun());
        stmt.setString(10, agt.getDesa());
        stmt.setString(11, agt.getKota());
        stmt.setString(12, agt.getProvinsi());
        stmt.setString(13, agt.getKecamatan());
        stmt.setString(14, agt.getLogo());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
    public Anggota cariIdAnggota(String nama) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from anggota where namaanggota = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nama);
        result = stmt.executeQuery();
        Anggota agt = null;
        while (result.next()) {
            agt = new Anggota(result.getString(1), result.getString(2),
                    result.getString(3), result.getString(4), result.getString(5),
                    result.getString(6), result.getInt(7), result.getInt(8),
                    result.getString(9), result.getString(10), result.getString(11),
                    result.getString(12),result.getString(13));
        }

        conn.close();
        return agt;
    }
    
    public Anggota selectAnggota(String key) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from anggota where idanggota = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, key);
        result = stmt.executeQuery();
        Anggota bar = null;
        while (result.next()) {
            bar = new Anggota();
            bar.setIdAnggota(result.getString(1));
            bar.setNamaAnggota(result.getString(2));
            bar.setPekerjaan(result.getString(3));
            bar.setAlamat(result.getString(4));
            bar.setNoTelp(result.getString(5));
            bar.setNoKTP(result.getString(6));
            bar.setRt(result.getInt(7));
            bar.setRw(result.getInt(8));
            bar.setDusun(result.getString(9));
            bar.setDesa(result.getString(10));
            bar.setKota(result.getString(11));
            bar.setProvinsi(result.getString(12));
            bar.setKecamatan(result.getString(13));
            bar.setLogo(result.getString(14));
        }
        conn.close();
        return bar;
    }
    
    public List<Anggota> selectDusun() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select dusun from anggota group by dusun;";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Anggota> agt = new ArrayList<Anggota>();
        while (result.next()) {
            Anggota bar = new Anggota();
            bar.setDusun(result.getString(1));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }
    
    public List<Anggota> selectAnggotaPerDusun(String dusun) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select idanggota from anggota where dusun = ?;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dusun);
        result = stmt.executeQuery();
        List<Anggota> agt = new ArrayList<Anggota>();
        while (result.next()) {
            Anggota bar = new Anggota();
            bar.setIdAnggota(result.getString(1));
            agt.add(bar);
        }

        conn.close();
        return agt;
    }
}
