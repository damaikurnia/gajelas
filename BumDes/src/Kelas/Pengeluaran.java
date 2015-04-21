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
public class Pengeluaran {

    String kode;
    String namaPengeluaran;
    String kodeAkun;

    public Pengeluaran(String kode, String nama,String kodeAkun) {
        this.kode = kode;
        this.namaPengeluaran = nama;
        this.kodeAkun = kodeAkun;
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

    /**
     * @return the namaPengeluaran
     */
    public String getNamaPengeluaran() {
        return namaPengeluaran;
    }

    /**
     * @param namaPengeluaran the namaPengeluaran to set
     */
    public void setNamaPengeluaran(String namaPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
    }

    /**
     * @return the kodeAkun
     */
    public String getKodeAkun() {
        return kodeAkun;
    }

    /**
     * @param kodeAkun the kodeAkun to set
     */
    public void setKodeAkun(String kodeAkun) {
        this.kodeAkun = kodeAkun;
    }

}
