/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.Kontrol;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mich
 */
public class Piutang_Kontrol {

    private Connection conn;

    public Piutang_Kontrol(Connection conn) {
        this.conn = conn;
    }

    public static Piutang_Kontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        Piutang_Kontrol login = new Piutang_Kontrol(koneksi.getConnection());
        return login;
    }

    public List<Transaksi> tampilPiutang() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT kodeTransaksi,SUM(totalPenjualan),idPembeli,"
                + "jenisPembayaran,tanggal FROM per_transaksi "
                + "WHERE jenisPembayaran = 'PIUTANG' AND STATUS = 'BLM' "
                + "GROUP BY kodeTransaksi";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<Transaksi> brg = new ArrayList<>();
        while (result.next()) {
            Transaksi bum = new Transaksi();
            bum.kodeTransaksi = result.getString(1);
            bum.totalPenjualan = result.getLong(2);
            bum.idPembeli = result.getString(3);
            bum.jenisPembayaran = result.getString(4);
            bum.tanggal = result.getString(5);
            brg.add(bum);
        }
        return brg;
    }
}