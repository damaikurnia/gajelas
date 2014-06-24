/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.Kontrol;

import Koneksi.Koneksi;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adhi
 */
public class Modal_Kontrol {

    Connection connection = null;

    public Modal_Kontrol(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Modal_Kontrol getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Modal_Kontrol kontrol = new Modal_Kontrol(koneksi.getConnection());
        return kontrol;
    }

    public void tambahModal_P(Modal mod) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "insert into per_modal (tanggal,penerimaankas,pengeluarankas,keterangan) values(?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        java.util.Date tgl = mod.getTanggal();
        statement.setDate(1, new java.sql.Date(tgl.getTime()));
        statement.setDouble(2, mod.getPenerimaanKas());
        statement.setDouble(3, mod.getPengeluaranKas());
        statement.setString(4, mod.getKeterangan());
        statement.executeUpdate();
        connection.commit();
    }

    public List<Modal> getAllModal_P() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from per_modal order by tanggal desc";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        rset = psmt.executeQuery();
        List<Modal> sm = new ArrayList<>();
        long saldo = 0;
        while (rset.next()) {
            Modal s = new Modal();
            s.setTanggal(rset.getDate(2));
            s.setPenerimaanKas(rset.getLong(3));
            s.setPengeluaranKas(rset.getLong(4));
            s.setKeterangan(rset.getString(5));
            saldo += (rset.getDouble(3) + rset.getDouble(4));
            s.setSaldo(saldo);
            sm.add(s);
        }
        connection.commit();
        return sm;
    }
}
