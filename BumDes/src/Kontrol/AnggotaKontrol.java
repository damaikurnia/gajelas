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
                + "alamat = ?, telp = ?, noKTP = ? where idanggota = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, agt.getNamaAnggota());
        stmt.setString(2, agt.getPekerjaan());
        stmt.setString(3, agt.getAlamat());
        stmt.setString(4, agt.getNoTelp());
        stmt.setString(5, agt.getNoKTP());
        stmt.setString(6, agt.getIdAnggota());

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
                    result.getString(6));
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
        String query = "INSERT INTO anggota VALUES(?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, agt.getIdAnggota());
        stmt.setString(2, agt.getNamaAnggota());
        stmt.setString(3, agt.getPekerjaan());
        stmt.setString(4, agt.getAlamat());
        stmt.setString(5, agt.getNoTelp());
        stmt.setString(6, agt.getNoKTP());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
}
