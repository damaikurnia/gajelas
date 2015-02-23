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
public class Anggota {
    private String idAnggota;
    private String namaAnggota;
    private String pekerjaan;
    private String alamat;
    private String noTelp;
    private String noKTP;

    public Anggota(String id,String nm,String pk,String almt,String telp,String ktp){
        this.idAnggota = id;
        this.namaAnggota = nm;
        this.pekerjaan = pk;
        this.alamat = almt;
        this.noTelp = telp;
        this.noKTP = ktp;
    }
    
    public Anggota(){}
    
    /**
     * @return the idAnggota
     */
    public String getIdAnggota() {
        return idAnggota;
    }

    /**
     * @param idAnggota the idAnggota to set
     */
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    /**
     * @return the namaAnggota
     */
    public String getNamaAnggota() {
        return namaAnggota;
    }

    /**
     * @param namaAnggota the namaAnggota to set
     */
    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the noTelp
     */
    public String getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    /**
     * @return the noKTP
     */
    public String getNoKTP() {
        return noKTP;
    }

    /**
     * @param noKTP the noKTP to set
     */
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
}
