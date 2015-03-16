/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Kelas.Barang;
import Custom.Tanggal;
import Kelas.Anggota;
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
        String query = "SELECT a.notransaksi, b.namabarang,a.jumlah,a.hargasatuan,a.total \n"
                + "FROM transaksi a, barang b "
                + "WHERE a.idbarang = b.idbarang AND tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang("", result.getString(2), 0, 0));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public List<Transaksi> beli_selectTransaksiAll(String t) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.tanggaltransaksi,a.notransaksi, "
                + "b.namabarang,a.jumlah,a.hargasatuan,a.total \n"
                + "FROM transaksi a, barang b "
                + "WHERE a.idbarang = b.idbarang AND a.jenistransaksi = 'PEMBELIAN' "
                + "AND a.tanggaltransaksi LIKE (?) "
                + "order by a.tanggaltransaksi";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, t);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            String tgl = result.getString(1);
            trs.setTanggalTransaksi(tgl.split("-")[2] + "-" + tgl.split("-")[1] + "-" + tgl.split("-")[0]);
            trs.setNoTrans(result.getString(2));
            trs.setIdBarang(new Barang("", result.getString(3), 0, 0));
            trs.setJumlah(result.getInt(4));
            trs.setHargaSatuan(result.getDouble(5));
            trs.setTotal(result.getDouble(6));
            trans.add(trs);
        }
        conn.close();
        return trans;
    }

    public void deleteTransaksi(Transaksi trans) throws SQLException {
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
        stmt.setDouble(8, 0);
        stmt.setDouble(9, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public String beli_tampilTotalBeliHariIni() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PEMBELIAN' "
                + "AND tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

    public String beli_tampilTotalBeliAll() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PEMBELIAN'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

//==============================================================================
    public void jual_insertTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, "-");
        stmt.setString(3, trans.getIdAnggota().getIdAnggota());
        stmt.setString(4, Tanggal.getTanggal2());
        stmt.setString(5, "PENJUALAN");
        stmt.setInt(6, trans.getJumlah());
        stmt.setDouble(7, trans.getHargaSatuan());
        stmt.setDouble(8, trans.getDenda());
        stmt.setDouble(9, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public List<Transaksi> jual_selectTransaksi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.notransaksi, b.namaanggota,a.jumlah,a.hargasatuan,a.total \n"
                + "FROM transaksi a, anggota b "
                + "WHERE a.idanggota = b.idanggota AND tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdAnggota(new Anggota("", result.getString(2), "", "", "", "", 0, 0, "", "", "", "", ""));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public List<Transaksi> jual_selectTransaksiAll(String t) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.tanggaltransaksi,a.notransaksi, "
                + "b.namaanggota,a.jumlah,a.hargasatuan,a.total \n"
                + "FROM transaksi a, anggota b "
                + "WHERE a.idanggota = b.idanggota AND a.jenistransaksi = 'PENJUALAN' "
                + "AND a.tanggaltransaksi LIKE (?) "
                + "order by a.tanggaltransaksi";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, t);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            String tgl = result.getString(1);
            trs.setTanggalTransaksi(tgl.split("-")[2] + "-" + tgl.split("-")[1] + "-" + tgl.split("-")[0]);
            trs.setNoTrans(result.getString(2));
            trs.setIdAnggota(new Anggota("", result.getString(3), "", "", "", "", 0, 0, "", "", "", "", ""));
            trs.setJumlah(result.getInt(4));
            trs.setHargaSatuan(result.getDouble(5));
            trs.setTotal(result.getDouble(6));
            trans.add(trs);
        }
        conn.close();
        return trans;
    }

    public void jual_updateTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update transaksi set idanggota = ?, jumlah = ?,"
                + "hargasatuan = ?, total = ? where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getIdAnggota().getIdAnggota());
        stmt.setInt(2, trans.getJumlah());
        stmt.setDouble(3, trans.getHargaSatuan());
        stmt.setDouble(4, trans.getTotal());
        stmt.setString(5, trans.getNoTrans());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public String jual_tampilTotalBeliHariIni() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PENJUALAN' "
                + "AND tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

    public String jual_tampilTotalBeliAll() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PENJUALAN'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

    public boolean jual_selectTransaksiCek(String t) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM transaksi where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, t);
        result = stmt.executeQuery();
        boolean cek = false;
        while (result.next()) {
            if (result.getString(1).equals(null)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        conn.close();
        return cek;
    }
}
