/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Anggota;
import Tabel_Model.Simpanan;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Aweng
 */
public class Kontrol_Simpanan {

    Connection connection = null;

    public Kontrol_Simpanan(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Kontrol_Simpanan getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Kontrol_Simpanan kontrol = new Kontrol_Simpanan(koneksi.getConnection());
        return kontrol;
    }

    public void tambahSimpanan(Simpanan simp) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        Anggota a = simp.getNIK();
        String nik = a.getNIK();
        String sql = "insert into simpanan (notransaksi,nik,setorwajib,setorsukarela,penarikan,tgl) values(?,?,?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, simp.getNotransaksi());
        statement.setString(2, nik);
        statement.setDouble(3, simp.getSetor_wajib());
        statement.setDouble(4, simp.getSetor_sukarela());
        statement.setDouble(5, simp.getPenarikan());
        java.util.Date tgl = simp.getTgl();
        statement.setDate(6, new java.sql.Date(tgl.getTime()));
        statement.executeUpdate();
        connection.commit();
    }

//    public void updateAnggota(Anggota aggta) throws SQLException {
//        PreparedStatement statement = null;
//        connection.setAutoCommit(false);
//        String sql = "update anggota set nama=?,ttl=?,telp=?,alamat=? where nik=?";
//        statement = (PreparedStatement) connection.prepareStatement(sql);
//        statement.setString(1, aggta.getNama());
//        statement.setString(2, aggta.getTtl());
//        statement.setString(3, aggta.getTelp());
//        statement.setString(4, aggta.getAlamat());
//        statement.setString(5, aggta.getNIK());
//        statement.executeUpdate();
//        connection.commit();
//
//    }

//    public void hapusAnggota(String nik) throws SQLException {
//        PreparedStatement statement = null;
//        connection.setAutoCommit(false);
//        String sql = "delete from anggota where nik=?";
//        statement = (PreparedStatement) connection.prepareStatement(sql);
//        statement.setString(1, nik);
//        statement.executeUpdate();
//        connection.commit();
//    }

    public List<Simpanan> getAllSimpanan(String nik) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from simpanan where nik=? order by notransaksi,tgl desc";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        psmt.setString(1, nik);
        rset = psmt.executeQuery();
        List<Simpanan> sm = new ArrayList<>();
        double saldo = 0;  
        while (rset.next()) {
            Simpanan s = new Simpanan();
            Anggota a = new Anggota();            
            a.setNIK(rset.getString(2));
            s.setNotransaksi(rset.getString(1));
            s.setNIK(a);
            s.setSetor_wajib(rset.getDouble(3));
            s.setSetor_sukarela(rset.getDouble(4));
            s.setPenarikan(rset.getDouble(5));     
            s.setTgl(rset.getDate(6));
            saldo += (rset.getDouble(3) + rset.getDouble(4)) - (rset.getDouble(5));        
            s.setSaldo(saldo);
            sm.add(s);          
        }
        connection.commit();
        return sm;
    }
    public int kodeotomatisSolusi() throws SQLException {
        ResultSet rset = null;
        int kode = 0;
        String sql = "select count(notransaksi) from simpanan";
        Statement stat = (Statement) connection.createStatement();
        rset = stat.executeQuery(sql);
        while (rset.next()) {
            kode = rset.getInt(1);
        }
        connection.close();
        return kode;
    }
}
