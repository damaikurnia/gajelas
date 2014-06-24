/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Koneksi.Koneksi;
import Tabel_Model.Bumdes;
import java.sql.SQLException;

/**
 *
 * @author Mich
 */
public class ProfilKontrol {

    private Connection conn;

    public ProfilKontrol(Connection conn) {
        this.conn = conn;
    }

    public static ProfilKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        ProfilKontrol login = new ProfilKontrol(koneksi.getConnection());
        return login;
    }

    public void ubahBumdes(Bumdes bum) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update profil set namaBumdes = ?, alamatBumdes = ?"
                + ",noTelpBumdes = ?,webBumdes = ?,emailBumdes = ? where no = 1";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, bum.getNamaBumdes());
        stmt.setString(2, bum.getAlamatBumdes());
        stmt.setString(3, bum.getNoTelpBumdes());
        stmt.setString(4, bum.getWebBumdes());
        stmt.setString(5, bum.getEmailBumdes());

        stmt.executeUpdate();
        conn.commit();
    }

    public void ubahDesa(Bumdes bum) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);

        String query = "update profil set namaDesa = ?, alamatDesa = ?"
                + ",provinsiDesa = ?,kabupaten = ?,kecamatan = ? where no = 1";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, bum.getNamaDesa());
        stmt.setString(2, bum.getAlamatDesa());
        stmt.setString(3, bum.getProvinsiDesa());
        stmt.setString(4, bum.getKabupaten());
        stmt.setString(5, bum.getKecamatan());

        stmt.executeUpdate();
        conn.commit();
    }

    public void ubahKepengurusan(Bumdes bum) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);

        String query = "update profil set dewanKomisaris = ?, direksi = ?"
                + ",ka_desa = ?,badanPengawas = ?, tahun = ? where no = 1";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, bum.getDewanKomisaris());
        stmt.setString(2, bum.getDireksi());
        stmt.setString(3, bum.getKa_desa());
        stmt.setString(4, bum.getBadanPengawas());
        stmt.setString(5, bum.getTahun());

        stmt.executeUpdate();
        conn.commit();
    }

    public Bumdes tampilBumdes() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM profil where no = 1";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();

        Bumdes bum = null;

        while (result.next()) {
            bum = new Bumdes();
            String no = result.getString(1);
            bum.setNamaBumdes(result.getString(2));
            bum.setAlamatBumdes(result.getString(3));
            bum.setNoTelpBumdes(result.getString(4));
            bum.setWebBumdes(result.getString(5));
            bum.setEmailBumdes(result.getString(6));
            bum.setNamaDesa(result.getString(7));
            bum.setAlamatDesa(result.getString(8));
            bum.setProvinsiDesa(result.getString(9));
            bum.setKabupaten(result.getString(10));
            bum.setKecamatan(result.getString(11));
            bum.setDewanKomisaris(result.getString(12));
            bum.setDireksi(result.getString(13));
            bum.setKa_desa(result.getString(14));
            bum.setBadanPengawas(result.getString(15));
            bum.setTahun(result.getString(16));
        }
        return bum;
    }
}
