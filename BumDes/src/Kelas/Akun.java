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
public class Akun {

    String kode;
    String keterangan;
    String gol_akun;
    String kel_akun;

    public Akun(String kode,String keterangan,String gol_akun,String kel_akun) {
        this.kode = kode;
        this.keterangan = keterangan;
        this.gol_akun = gol_akun;
        this.kel_akun = kel_akun;
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
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the gol_akun
     */
    public String getGol_akun() {
        return gol_akun;
    }

    /**
     * @param gol_akun the gol_akun to set
     */
    public void setGol_akun(String gol_akun) {
        this.gol_akun = gol_akun;
    }

    /**
     * @return the kel_akun
     */
    public String getKel_akun() {
        return kel_akun;
    }

    /**
     * @param kel_akun the kel_akun to set
     */
    public void setKel_akun(String kel_akun) {
        this.kel_akun = kel_akun;
    }

}
