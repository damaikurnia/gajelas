/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Modal_SP;
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
public class Kontrol_Modal_SP {

    Connection connection = null;

    public Kontrol_Modal_SP(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Kontrol_Modal_SP getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Kontrol_Modal_SP kontrol = new Kontrol_Modal_SP(koneksi.getConnection());
        return kontrol;
    }

    public void tambahModal_SP(Modal_SP mod) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "insert into modal_sp (tanggal,penerimaankas,pengeluarankas,keterangan) values(?,?,?,?)";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        java.util.Date tgl = mod.getTanggal();
        statement.setDate(1, new java.sql.Date(tgl.getTime()));
        statement.setDouble(2, mod.getPenerimaanKas());
        statement.setDouble(3, mod.getPengeluaranKas());
        statement.setString(4, mod.getKeterangan());
        statement.executeUpdate();
        connection.commit();
    }
    
     public List<Modal_SP> getAllModal_SP() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from modal_sp order by tanggal desc";
        psmt = (PreparedStatement) connection.prepareStatement(sql);     
        rset = psmt.executeQuery();
        List<Modal_SP> sm = new ArrayList<>();
        long saldo = 0;  
        while (rset.next()) {
            Modal_SP s = new Modal_SP(); 
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
