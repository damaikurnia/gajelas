/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Anggota;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Aweng
 */
public class Kontrol_Anggota {

    Connection connection = null;

    public Kontrol_Anggota(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Kontrol_Anggota getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Kontrol_Anggota kontrol = new Kontrol_Anggota(koneksi.getConnection());
        return kontrol;
    }

    public void tambahAnggota(Anggota aggta) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "insert into anggota values(?,?,?,?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, aggta.getNIK());
        statement.setString(2, aggta.getNama());
        statement.setString(3, aggta.getTtl());
        statement.setString(4, aggta.getTelp());
        statement.setString(5, aggta.getAlamat());
        statement.setString(6, aggta.getTgl_bergabung());
        statement.setDouble(7, aggta.getSimpananPokok());
        statement.executeUpdate();
        connection.commit();
    }

    public void updateAnggota(Anggota aggta) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "update anggota set nama=?,ttl=?,telp=?,alamat=?,simpananpokok=? where nik=?";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, aggta.getNama());
        statement.setString(2, aggta.getTtl());
        statement.setString(3, aggta.getTelp());
        statement.setString(4, aggta.getAlamat());
        statement.setString(6, aggta.getNIK());
        statement.setDouble(5, aggta.getSimpananPokok());
        statement.executeUpdate();
        connection.commit();

    }

    public void hapusAnggota(String nik) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "delete from anggota where nik=?";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setString(1, nik);
        statement.executeUpdate();
        connection.commit();
    }

    public List<Anggota> getAllAnggota() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from anggota order by nik";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        rset = psmt.executeQuery();
        List<Anggota> agt = new ArrayList<>();
        while (rset.next()) {
            Anggota gta = new Anggota();
            gta.setNIK(rset.getString(1));
            gta.setNama(rset.getString(2));
            gta.setTtl(rset.getString(3));
            gta.setTelp(rset.getString(4));
            gta.setAlamat(rset.getString(5));
            gta.setTgl_bergabung(rset.getString(6));
            gta.setSimpananPokok(rset.getDouble(7));
            agt.add(gta);
        }
        connection.commit();
        return agt;
    }

    public List<Anggota> CariAllAnggota(String key) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from anggota  where nik like '%"+key+"%' or nama like '%"+key+"%'";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
   
        rset = psmt.executeQuery();
        List<Anggota> agt = new ArrayList<>();
        while (rset.next()) {
            Anggota gta = new Anggota();
            gta.setNIK(rset.getString(1));
            gta.setNama(rset.getString(2));
            gta.setTtl(rset.getString(3));
            gta.setTelp(rset.getString(4));
            gta.setAlamat(rset.getString(5));
            gta.setTgl_bergabung(rset.getString(6));
            gta.setSimpananPokok(rset.getDouble(7));
            agt.add(gta);
        }
        connection.commit();
        return agt;
    }

    public Anggota getAnggota(String nik) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from anggota where nik=?";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
        psmt.setString(1, nik);
        rset = psmt.executeQuery();
        Anggota gta = new Anggota();
        while (rset.next()) {
            gta.setNIK(rset.getString(1));
            gta.setNama(rset.getString(2));
            gta.setTtl(rset.getString(3));
            gta.setTelp(rset.getString(4));
            gta.setAlamat(rset.getString(5));
            gta.setTgl_bergabung(rset.getString(6));
            gta.setSimpananPokok(rset.getDouble(7));
        }
        connection.commit();
        return gta;
    }
}
