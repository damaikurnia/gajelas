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
public class Keluhan {
    String idKeluhan;
    Anggota idAnggota;
    String keterangan;
    String tglPelaksanaan;
    String status;

    public Keluhan(String id_kel,Anggota id_agt, String ket,String tglPel,String stat){
        this.idKeluhan = id_kel;
        this.idAnggota = id_agt;
        this.keterangan = ket;
        this.tglPelaksanaan = tglPel;
        this.status = stat;
    }
    public Keluhan(){}
    
    /**
     * @return the idKeluhan
     */
    public String getIdKeluhan() {
        return idKeluhan;
    }

    /**
     * @param idKeluhan the idKeluhan to set
     */
    public void setIdKeluhan(String idKeluhan) {
        this.idKeluhan = idKeluhan;
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
     * @return the tglPelaksanaan
     */
    public String getTglPelaksanaan() {
        return tglPelaksanaan;
    }

    /**
     * @param tglPelaksanaan the tglPelaksanaan to set
     */
    public void setTglPelaksanaan(String tglPelaksanaan) {
        this.tglPelaksanaan = tglPelaksanaan;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
