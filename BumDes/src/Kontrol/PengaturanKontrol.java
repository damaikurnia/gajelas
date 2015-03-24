/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Kelas.Profil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author damaikurnia
 */
public class PengaturanKontrol {

    private Connection conn;

    public PengaturanKontrol(Connection conn) {
        this.conn = conn;
    }

    public static PengaturanKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        PengaturanKontrol login = new PengaturanKontrol(koneksi.getConnection());
        return login;
    }

    public void updateProfil(Profil prof) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update profil set namadesa = ?, alamatdesa = ?, notelp = ?,"
                + "desa = ?, kecamatan = ?, kabupaten = ?, provinsi = ?,"
                + "email = ?,logo = ? where idprofil = 0";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, prof.getNamadesa());
        stmt.setString(2, prof.getAlamatdesa());
        stmt.setString(3, prof.getNotelp());
        stmt.setString(4, prof.getDesa());
        stmt.setString(5, prof.getKecamatan());
        stmt.setString(6, prof.getKabupaten());
        stmt.setString(7, prof.getProvinsi());
        stmt.setString(8, prof.getEmail());
        stmt.setString(9, prof.getLogo());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
    
    public Profil tampilProfil() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from profil where idprofil = 0";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        Profil prof = new Profil();
        while (result.next()) {
            prof.setNamadesa(result.getString(2));
            prof.setAlamatdesa(result.getString(3));
            prof.setNotelp(result.getString(4));
            prof.setDesa(result.getString(5));
            prof.setKecamatan(result.getString(6));
            prof.setKabupaten(result.getString(7));
            prof.setProvinsi(result.getString(8));
            prof.setEmail(result.getString(9));
            prof.setLogo(result.getString(10));
        }
        return prof;
    }
}
