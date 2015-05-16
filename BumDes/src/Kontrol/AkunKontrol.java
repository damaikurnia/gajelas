/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Akun;
import Kelas.SHU;
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
public class AkunKontrol {

    private Connection conn;

    public AkunKontrol(Connection conn) {
        this.conn = conn;
    }

    public static AkunKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        AkunKontrol login = new AkunKontrol(koneksi.getConnection());
        return login;
    }

    public void insertAkun(SHU trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "Insert into akun values(?,?,?,?);";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getKode().getKode());
        stmt.setString(2, trans.getKode().getKeterangan());
        stmt.setString(3, "PEMBAGIAN_SHU");
        stmt.setString(4, "MODAL");

        stmt.executeUpdate();
        conn.commit();
        conn.close();
        AkunKontrol.getKoneksi().insertSHU(trans);
    }

    public void insertSHU(SHU trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "Insert into shu values(?,?);";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getKode().getKode());
        stmt.setInt(2, trans.getPersen());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void updateAkun(SHU trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update akun set keterangan = ? where kode = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getKode().getKeterangan());
        stmt.setString(2, trans.getKode().getKode());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
        AkunKontrol.getKoneksi().updateSHU(trans);
    }

    public void updateSHU(SHU trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update shu set persen = ? where kode = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, trans.getPersen());
        stmt.setString(2, trans.getKode().getKode());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<SHU> selectSHU() throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select a.kode, a.keterangan, b.persen from akun a, shu b "
                + "where a.kode = b.kode and (a.kode like '3.2.%' OR a.kode = '5.2.1');";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<SHU> shu = new ArrayList<SHU>();
        while (result.next()) {
            SHU s = new SHU(new Akun(result.getString(1), result.getString(2), "", ""), result.getInt(3));
            shu.add(s);
        }
        conn.close();
        return shu;
    }

    public int persenPajak() throws SQLException {//tampil total beban laba rugi
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select persen from shu "
                + "where kode = '5.2.1';";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        int persen = 0;
        while (result.next()) {
            persen = result.getInt(1);
        }
        conn.close();
        return persen;
    }
}
