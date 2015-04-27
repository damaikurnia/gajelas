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

    //PEMBELIAN BARANG========================================================
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
                + "WHERE a.idbarang = b.idbarang and jenistransaksi = 'PEMBELIAN' AND tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang("", result.getString(2), 0, 0, ""));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public List<Transaksi> beli_selectTransaksi2() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT notransaksi,idbarang,jumlah,hargasatuan,total\n"
                + "FROM transaksi where jenistransaksi like 'PEMBELIAN%';";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang("", result.getString(2), 0, 0, ""));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public List<Transaksi> beli_selectTransaksiAll(String tDari, String tSampai) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.notransaksi, a.idbarang, b.namabarang, "
                + "a.tanggaltransaksi, a.jumlah, a.hargasatuan, a.total \n"
                + "FROM transaksi a, barang b "
                + "WHERE a.idbarang = b.idbarang AND a.tanggaltransaksi "
                + "BETWEEN ? AND ? AND a.jenistransaksi = 'PEMBELIAN' "
                + "ORDER BY a.tanggaltransaksi";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, tDari);
        stmt.setString(2, tSampai);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), result.getString(3), 0, 0, ""));
            String tgl = result.getString(4);
            trs.setTanggalTransaksi(tgl.split("-")[2] + "-" + tgl.split("-")[1] + "-" + tgl.split("-")[0]);
            trs.setJumlah(result.getInt(5));
            trs.setHargaSatuan(result.getInt(6));
            trs.setTotal(result.getDouble(7));
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
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, trans.getIdBarang().getIdBarang());
        stmt.setString(3, "-");
        stmt.setString(4, Tanggal.getTanggal2());
//        stmt.setString(5, "PEMBELIAN");
        stmt.setString(5, trans.getJenisTransaksi());
        stmt.setInt(6, trans.getJumlah());
        stmt.setDouble(7, 0);
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

//PENJUALAN AIR =========================================
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

    public Transaksi jual_selectTransaksi2(String noTrans) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT notransaksi, idanggota,jumlah,hargasatuan,total \n"
                + "FROM transaksi WHERE notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, noTrans);
        result = stmt.executeQuery();
        Transaksi trs = new Transaksi();
        while (result.next()) {
            trs.setNoTrans(result.getString(1));
            trs.setIdAnggota(new Anggota(result.getString(2), "", "", "", "", "", 0, 0, "", "", "", "", ""));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
        }

        conn.close();
        return trs;
    }

    public List<Transaksi> jual_selectTransaksiAll(String dari, String sampai) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT t.notransaksi,t.idanggota, a.namaanggota, t.tanggaltransaksi, t.jumlah,t.hargasatuan, t.denda,t.total\n"
                + "FROM transaksi t, anggota a \n"
                + "where t.idanggota = a.idanggota and (t.jenistransaksi = 'PENJUALAN' OR t.jenistransaksi = 'DAFTAR') \n"
                + "AND tanggaltransaksi between ? and ?;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dari);
        stmt.setString(2, sampai);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdAnggota(new Anggota(result.getString(2), result.getString(3), dari, dari, query, dari, 0, 0, query, dari, dari, dari, query));
            String tgl = result.getString(4);
            trs.setTanggalTransaksi(tgl.split("-")[2] + "-" + tgl.split("-")[1] + "-" + tgl.split("-")[0]);
            trs.setJumlah(result.getInt(5));
            trs.setHargaSatuan(result.getInt(6));
            trs.setDenda(result.getInt(7));
            trs.setTotal(result.getDouble(8));
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

    public String jual_tampilTotalBeliAll(String tgSampai, String tglDari) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select sum(total) from transaksi \n"
                + "where tanggaltransaksi between ? and ? and kode = '4.1.1'\n"
                + "group by kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, tgSampai);
        stmt.setString(2, tglDari);
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

    //PENDAFTARAN BARU PELANGGAN =============================================
    public void daftar_insertTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, "-");
        stmt.setString(3, trans.getIdAnggota().getIdAnggota());
        stmt.setString(4, Tanggal.getTanggal2());
        stmt.setString(5, "DAFTAR");
        stmt.setInt(6, 0);
        stmt.setDouble(7, trans.getHargaSatuan());
        stmt.setDouble(8, 0);
        stmt.setDouble(9, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    //TRANSAKSI PENGELUARAN (BEBAN)=============================================
    public List<Transaksi> keluar_selectTransaksi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String tanggal[] = Tanggal.getTanggal2().split("-");
        String query = "SELECT notransaksi,idbarang,tanggaltransaksi,jenistransaksi,"
                + "total FROM transaksi where notransaksi like '%" + tanggal[0] + tanggal[1] + "' "
                + "AND jenistransaksi = 'PENGELUARAN';";
        stmt = conn.prepareStatement(query);

        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0, 0, ""));
            trs.setTanggalTransaksi(result.getString(3));
            trs.setJenisTransaksi(result.getString(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public void keluar_insertTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, trans.getIdBarang().getIdBarang());
        stmt.setString(3, trans.getIdAnggota().getIdAnggota());
        stmt.setString(4, trans.getTanggalTransaksi());
        stmt.setString(5, trans.getJenisTransaksi());
        stmt.setInt(6, trans.getJumlah());
        stmt.setDouble(7, trans.getHargaSatuan());
        stmt.setDouble(8, trans.getDenda());
        stmt.setDouble(9, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void keluar_updateTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "update transaksi set tanggaltransaksi = ?, total = ? "
                + "where notransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getTanggalTransaksi());
        stmt.setDouble(2, trans.getTotal());
        stmt.setString(3, trans.getNoTrans());

        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public String keluar_tampilTotalKeluarBulanIni() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String tanggal[] = Tanggal.getTanggal2().split("-");
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PENGELUARAN' AND notransaksi like '%" + tanggal[0] + tanggal[1] + "';";
        stmt = conn.prepareStatement(query);

        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

    public List<Transaksi> keluar_selectTransaksi2(String tglDari, String tglSampai) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String tanggal[] = Tanggal.getTanggal2().split("-");
        String query = "SELECT notransaksi,idbarang,tanggaltransaksi,jenistransaksi,"
                + "total FROM transaksi where tanggaltransaksi BETWEEN ? AND ? "
                + "AND jenistransaksi = 'PENGELUARAN';";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, tglDari);
        stmt.setString(2, tglSampai);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0, 0, ""));
            trs.setTanggalTransaksi(result.getString(3));
            trs.setJenisTransaksi(result.getString(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public String keluar_tampilTotalKeluarBulanCustom(String tglDari, String tglSampai) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String tanggal[] = Tanggal.getTanggal2().split("-");
        String query = "select a.kode,b.keterangan, sum(a.total) from transaksi a, akun b \n"
                + "where a.kode = b.kode and a.tanggaltransaksi between ? and ? and a.kode like '5.1.%'\n"
                + "group by a.kode;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, tglDari);
        stmt.setString(2, tglSampai);
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(3);
        }

        conn.close();
        return total;
    }
    
    public String keluar_tampilKodeAkun(String notransaksi) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "select a.kodeakun from pengeluaran a, "
                + "transaksi b where a.kode = b.idbarang "
                + "and b.notransaksi = ?;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, notransaksi);
        result = stmt.executeQuery();
        String total = "";
        while (result.next()) {
            total = result.getString(1);
        }

        conn.close();
        return total;
    }

    //PEMAKAIAN BARANG =======================================================
    public List<Transaksi> pakai_selectTransaksi() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.notransaksi, b.namabarang,a.jumlah,a.hargasatuan,a.total \n"
                + "FROM transaksi a, barang b "
                + "WHERE a.idbarang = b.idbarang and a.jenistransaksi = 'PEMAKAIAN' and a.tanggaltransaksi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Tanggal.getTanggal2());
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang("", result.getString(2), 0, 0, ""));
            trs.setJumlah(result.getInt(3));
            trs.setHargaSatuan(result.getDouble(4));
            trs.setTotal(result.getDouble(5));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public List<Transaksi> pakai_selectTransaksi2() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM transaksi where jenistransaksi = 'PEMAKAIAN';";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> trans = new ArrayList<Transaksi>();
        while (result.next()) {
            Transaksi trs = new Transaksi();
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0, 0, ""));
            trs.setIdAnggota(new Anggota(result.getString(3)));
            trs.setTanggalTransaksi(result.getString(4));
            trs.setJumlah(result.getInt(6));
            trs.setTotal(result.getDouble(9));
            trans.add(trs);
        }

        conn.close();
        return trans;
    }

    public Transaksi pakai_selectTransaksi3(String idTrans) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM transaksi where notransaksi = ?;";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, idTrans);
        result = stmt.executeQuery();
        Transaksi trs = new Transaksi();
        while (result.next()) {
            trs.setNoTrans(result.getString(1));
            trs.setIdBarang(new Barang(result.getString(2), "", 0, 0, ""));
            trs.setIdAnggota(new Anggota(result.getString(3)));
            trs.setTanggalTransaksi(result.getString(4));
            trs.setJumlah(result.getInt(6));
            trs.setTotal(result.getDouble(9));
        }

        conn.close();
        return trs;
    }

    public void pakai_insertTransaksi(Transaksi trans) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO transaksi VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, trans.getNoTrans());
        stmt.setString(2, trans.getIdBarang().getIdBarang());
        stmt.setString(3, "-");
        stmt.setString(4, Tanggal.getTanggal2());
        stmt.setString(5, "PEMAKAIAN");
        stmt.setInt(6, trans.getJumlah());
        stmt.setDouble(7, trans.getHargaSatuan());
        stmt.setDouble(8, trans.getDenda());
        stmt.setDouble(9, trans.getTotal());
        stmt.executeUpdate();
        conn.commit();
        conn.close();
    }

    public void pakai_updateTransaksi(Transaksi trans) throws SQLException {
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

    public String pakai_tampilTotalPemakaianHariIni() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT SUM(total) FROM transaksi "
                + "WHERE jenistransaksi = 'PEMAKAIAN' "
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
}
