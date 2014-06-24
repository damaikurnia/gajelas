/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perdagangan.Kontrol;

import java.util.Date;

/**
 *
 * @author Adhi
 */
public class Transaksi {
    public String kodeTransaksi;
    public String idBarang;
    public int jumlah;
    public long totalPenjualan;
    public String idPembeli;
    public String jenisPembayaran;
    public String status;
    public String tanggal;
    public long hargaSatuan;

    /**
     * @return the kodeTransaksi
     */
    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    /**
     * @return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @return the totalPenjualan
     */
    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    /**
     * @return the idPembeli
     */
    public String getIdPembeli() {
        return idPembeli;
    }

    /**
     * @return the jenisPembayaran
     */
    public String getJenisPembayaran() {
        return jenisPembayaran;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param kodeTransaksi the kodeTransaksi to set
     */
    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @param totalPenjualan the totalPenjualan to set
     */
    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    /**
     * @param idPembeli the idPembeli to set
     */
    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    /**
     * @param jenisPembayaran the jenisPembayaran to set
     */
    public void setJenisPembayaran(String jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the hargaSatuan
     */
    public long getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * @param hargaSatuan the hargaSatuan to set
     */
    public void setHargaSatuan(long hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    
}
