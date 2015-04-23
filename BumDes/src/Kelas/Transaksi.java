/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author damaikurnia
 */
public class Transaksi {

    String noTrans;
    Barang idBarang;
    Anggota idAnggota;
    String tanggalTransaksi;
    String jenisTransaksi;
    int jumlah;
    double hargaSatuan;
    double denda;
    double total;
//    String kode;

    /**
     * @return the noTrans
     */
    public String getNoTrans() {
        return noTrans;
    }

    /**
     * @param noTrans the noTrans to set
     */
    public void setNoTrans(String noTrans) {
        this.noTrans = noTrans;
    }

    /**
     * @return the idBarang
     */
    public Barang getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(Barang idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the idAnggota
     */
    public Anggota getIdAnggota() {
        return idAnggota;
    }

    /**
     * @param idAnggota the idAnggota to set
     */
    public void setIdAnggota(Anggota idAnggota) {
        this.idAnggota = idAnggota;
    }

    /**
     * @return the tanggalTransaksi
     */
    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    /**
     * @param tanggalTransaksi the tanggalTransaksi to set
     */
    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    /**
     * @return the jenisTransaksi
     */
    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    /**
     * @param jenisTransaksi the jenisTransaksi to set
     */
    public void setJenisTransaksi(String jenisTransaksi) {
        this.jenisTransaksi = jenisTransaksi;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @return the hargaSatuan
     */
    public double getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * @param hargaSatuan the hargaSatuan to set
     */
    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the denda
     */
    public double getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(double denda) {
        this.denda = denda;
    }
//
//    /**
//     * @return the kode
//     */
//    public String getKode() {
//        return kode;
//    }
//
//    /**
//     * @param kode the kode to set
//     */
//    public void setKode(String kode) {
//        this.kode = kode;
//    }
}
