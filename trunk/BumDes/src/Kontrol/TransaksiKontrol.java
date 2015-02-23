/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Barang;
import Kelas.Tanggal;
import Kelas.Transaksi;
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
public class TransaksiKontrol {

    private Connection conn;

    public TransaksiKontrol(Connection conn) {
        this.conn = conn;
    }

    public static TransaksiKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        TransaksiKontrol login = new TransaksiKontrol(koneksi.getConnection());
        return login;
    }

    public void beli_updateTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update transaksi set idbarang = ?, jumlah = ?,"
                + "hargasatuan = ?, total = ? where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getIdBarang().getIdBarang());
        stmt.setInt(2, trans.getJumlah());
        stmt.setDouble(3, trans.getHargaSatuan());
        stmt.setDouble(4, trans.getTotal());
        stmt.setString(5, trans.getNoTrans());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<Transaksi> beli_selectTransaksi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from transaksi where tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0));
            String tgl = result.getString(4);
            trs.setTanggalTransaksi(tgl.split("-")[2]+"-"+tgl.split("-")[1]+"-"+tgl.split("-")[0]);
            trs.setJenisTransaksi(result.getString(5));
            trs.setJumlah(result.getInt(6));
            trs.setHargaSatuan(result.getDouble(7));
            trs.setTotal(result.getDouble(8));
            trans.add(trs);
        }
        
        conn.close();
        return trans;
    }
    
    public List<Transaksi> beli_selectTransaksiAll() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from transaksi where jenistransaksi = 'PEMBELIAN'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0));
            String tgl = result.getString(4);
            trs.setTanggalTransaksi(tgl.split("-")[2]+"-"+tgl.split("-")[1]+"-"+tgl.split("-")[0]);
            trs.setJenisTransaksi(result.getString(5));
            trs.setJumlah(result.getInt(6));
            trs.setHargaSatuan(result.getDouble(7));
            trs.setTotal(result.getDouble(8));
            trans.add(trs);
        }
        
        conn.close();
        return trans;
    }

    public void beli_deleteTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "delete from transaksi where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void beli_insertTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, trans.getIdBarang().getIdBarang());
        stmt.setString(3, "-");
        stmt.setString(4, Tanggal.getTanggal2());
        stmt.setString(5, "PEMBELIAN");
        stmt.setInt(6, trans.getJumlah());
        stmt.setDouble(7, trans.getHargaSatuan());
        stmt.setDouble(8, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }
}
