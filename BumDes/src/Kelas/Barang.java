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
public class Barang {
    String idBarang;
    String namaBarang;
    int stok;
    double totalAset;
    String kode;

    public Barang(){}
    
    public Barang(String id, String nama, int stok,double aset,String kode){
        this.idBarang = id;
        this.namaBarang = nama;
        this.stok = stok;
        this.totalAset = aset;
        this.kode = kode;
    }
    
    /**
     * @return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the totalAset
     */
    public double getTotalAset() {
        return totalAset;
    }

    /**
     * @param totalAset the totalAset to set
     */
    public void setTotalAset(double totalAset) {
        this.totalAset = totalAset;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }
}
