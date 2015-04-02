/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Konfigurasi;
import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author damaikurnia
 */
public class KonfigurasiKontrol {

    private Connection conn;

    public KonfigurasiKontrol(Connection conn) {
        this.conn = conn;
    }

    public static KonfigurasiKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        KonfigurasiKontrol login = new KonfigurasiKontrol(koneksi.getConnection());
        return login;
    }

    public void updateKonfigurasi(Konfigurasi agt) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update konfigurasi set abodemen = ?, pertama = ?,"
                + "kedua = ?,selanjutnya = ?, bagimeter = ?,tglterakhir = ?, denda = ?"
                + " where idkonfigurasi = 1";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, agt.getAbodemen());
        stmt.setInt(2, agt.getPertama());
        stmt.setInt(3, agt.getKedua());
        stmt.setInt(4, agt.getKetiga());
        stmt.setInt(5, agt.getBagimeter());
        stmt.setInt(6, agt.getTglTerakhir());
        stmt.setInt(7, agt.getDenda());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public Konfigurasi selectKonfigurasi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select abodemen, pertama, kedua, selanjutnya,bagimeter, tglterakhir, denda"
                + " from konfigurasi where idkonfigurasi = 1";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        Konfigurasi kon = new Konfigurasi();
        while (result.next()) {
            kon.setAbodemen(result.getInt(1));
            kon.setPertama(result.getInt(2));
            kon.setKedua(result.getInt(3));
            kon.setKetiga(result.getInt(4));
            kon.setBagimeter(result.getInt(5));
            kon.setTglTerakhir(result.getInt(6));
            kon.setDenda(result.getInt(7));
        }
        conn.close();
        return kon;
    }
}
