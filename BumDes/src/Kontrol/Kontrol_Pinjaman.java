/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Anggota;
import Tabel_Model.Pinjaman;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael Aweng
 */
public class Kontrol_Pinjaman {

    Connection connection = null;

    public Kontrol_Pinjaman(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Kontrol_Pinjaman getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Kontrol_Pinjaman kontrol = new Kontrol_Pinjaman(koneksi.getConnection());
        return kontrol;
    }

    public void tambahPinjaman(Pinjaman pinj) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        Anggota a = pinj.getNIK();
        String nik = a.getNIK();
        String sql = "insert into pinjaman (nik,pokok_pinjaman,bunga_pokok,tgl,tgl_berakhir,lamapinjam) values(?,?,?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, nik);
        statement.setDouble(2, pinj.getPokok_pinjaman());
        statement.setDouble(3, pinj.getPokok_bunga());
        java.util.Date tgl = pinj.getTgl();
        statement.setDate(4, new java.sql.Date(tgl.getTime()));
        statement.setString(5, pinj.getTgl_akhir());
        statement.setString(6, pinj.getLamaPinjam());
        statement.executeUpdate();
        connection.commit();
    }

    public void tambahAnggsuran(Pinjaman pinj) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        Anggota a = pinj.getNIK();
        String nik = a.getNIK();
        String sql = "insert into pinjaman (nik,angsuran_pokok,angsuran_bunga,denda,tgl) values(?,?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, nik);
        statement.setDouble(2, pinj.getAngsuran_pokok());
        statement.setDouble(3, pinj.getAngsuran_bunga());
        statement.setDouble(4, pinj.getDenda());
        java.util.Date tgl = pinj.getTgl();
        statement.setDate(5, new java.sql.Date(tgl.getTime()));
        statement.executeUpdate();
        connection.commit();
    }

    public List<Pinjaman> getAllPinjaman(String nik) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from pinjaman where nik=? order by id asc";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        psmt.setString(1, nik);
        rset = psmt.executeQuery();
        List<Pinjaman> sm = new ArrayList<>();

        double saldo_pokokP = 0;
        double saldo_bunga = 0;
        while (rset.next()) {
            Pinjaman p = new Pinjaman();
            Anggota a = new Anggota();
            a.setNIK(rset.getString(2));
            p.setNIK(a);
            p.setPokok_pinjaman(rset.getDouble(3));
            p.setPokok_bunga(rset.getDouble(4));
            p.setAngsuran_pokok(rset.getDouble(5));
            p.setAngsuran_bunga(rset.getDouble(6));
            p.setDenda(rset.getDouble(7));
            p.setTgl(rset.getDate(8));
            p.setTgl_akhir(rset.getString(9));
            saldo_pokokP += rset.getDouble(3) - rset.getDouble(5);
            saldo_bunga += rset.getDouble(4) - rset.getDouble(6);
            p.setSaldo_Pokok_pinjaman(saldo_pokokP);
            p.setSaldo_Bunga(saldo_bunga);

            sm.add(p);

        }
        connection.commit();
        return sm;
    }

    public Pinjaman getAllAnggsuran(String nik) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from pinjaman where nik=? order by id desc";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        psmt.setString(1, nik);
        rset = psmt.executeQuery();
        Pinjaman p = new Pinjaman();

        double saldo_pokokP = 0;
        double saldo_bunga = 0;
        while (rset.next()) {

            Anggota a = new Anggota();
            a.setNIK(rset.getString(2));
            p.setNIK(a);
            p.setPokok_pinjaman(rset.getDouble(3));
            p.setPokok_bunga(rset.getDouble(4));
            p.setAngsuran_pokok(rset.getDouble(5));
            p.setAngsuran_bunga(rset.getDouble(6));
            p.setDenda(rset.getDouble(7));
            p.setTgl(rset.getDate(8));
            p.setTgl_akhir(rset.getString(9));
            saldo_pokokP += rset.getDouble(3) - rset.getDouble(5);
            saldo_bunga += rset.getDouble(4) - rset.getDouble(6);
            p.setSaldo_Pokok_pinjaman(saldo_pokokP);
            p.setSaldo_Bunga(saldo_bunga);
            p.setLamaPinjam(rset.getString(10));
        }
        connection.commit();
        return p;
    }
}
