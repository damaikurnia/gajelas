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
public class Konfigurasi {
    int abodemen;
    int pertama;
    int kedua;
    int ketiga;
    int bagimeter;
    int tglTerakhir;
    int denda;
    int registrasi;
    
    public Konfigurasi(){}
    public Konfigurasi(int abodemen, int pertama, int kedua, int ketiga, int bagi, int tgl, int dend){
        this.abodemen = abodemen;
        this.pertama = pertama;
        this.kedua = kedua;
        this.ketiga = ketiga;
        this.bagimeter = bagi;
        this.tglTerakhir = tgl;
        this.denda = dend;
    }
    
    /**
     * @return the abodemen
     */
    public int getAbodemen() {
        return abodemen;
    }

    /**
     * @param abodemen the abodemen to set
     */
    public void setAbodemen(int abodemen) {
        this.abodemen = abodemen;
    }

    /**
     * @return the pertama
     */
    public int getPertama() {
        return pertama;
    }

    /**
     * @param pertama the pertama to set
     */
    public void setPertama(int pertama) {
        this.pertama = pertama;
    }

    /**
     * @return the kedua
     */
    public int getKedua() {
        return kedua;
    }

    /**
     * @param kedua the kedua to set
     */
    public void setKedua(int kedua) {
        this.kedua = kedua;
    }

    /**
     * @return the ketiga
     */
    public int getKetiga() {
        return ketiga;
    }

    /**
     * @param ketiga the ketiga to set
     */
    public void setKetiga(int ketiga) {
        this.ketiga = ketiga;
    }

    /**
     * @return the bagimeter
     */
    public int getBagimeter() {
        return bagimeter;
    }

    /**
     * @param bagimeter the bagimeter to set
     */
    public void setBagimeter(int bagimeter) {
        this.bagimeter = bagimeter;
    }

    /**
     * @return the tglTerakhir
     */
    public int getTglTerakhir() {
        return tglTerakhir;
    }

    /**
     * @param tglTerakhir the tglTerakhir to set
     */
    public void setTglTerakhir(int tglTerakhir) {
        this.tglTerakhir = tglTerakhir;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
    }

    /**
     * @return the registrasi
     */
    public int getRegistrasi() {
        return registrasi;
    }

    /**
     * @param registrasi the registrasi to set
     */
    public void setRegistrasi(int registrasi) {
        this.registrasi = registrasi;
    }
}
