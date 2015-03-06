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
    String idAnggota;
    String namaAnggota;
    String pekerjaan;
    String alamat;
    String noTelp;
    String noKTP;
    int rt;
    int rw;
    String dusun;
    String desa;
    String kota;
    String provinsi;
    String kecamatan;

    public Anggota(String id, String nm, String pk, String almt, String telp, String ktp,
            int rt, int rw, String dusun, String dsa, String kota, String prov, String kec) {
        this.idAnggota = id;
        this.namaAnggota = nm;
        this.pekerjaan = pk;
        this.alamat = almt;
        this.noTelp = telp;
        this.noKTP = ktp;
        this.rt = rt;
        this.rw = rw;
        this.dusun = dusun;
        this.desa = dsa;
        this.kota = kota;
        this.provinsi = prov;
        this.kecamatan = kec;
    }

    public Anggota() {
    }

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

    /**
     * @return the rt
     */
    public int getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(int rt) {
        this.rt = rt;
    }

    /**
     * @return the rw
     */
    public int getRw() {
        return rw;
    }

    /**
     * @param rw the rw to set
     */
    public void setRw(int rw) {
        this.rw = rw;
    }

    /**
     * @return the dusun
     */
    public String getDusun() {
        return dusun;
    }

    /**
     * @param dusun the dusun to set
     */
    public void setDusun(String dusun) {
        this.dusun = dusun;
    }

    /**
     * @return the desa
     */
    public String getDesa() {
        return desa;
    }

    /**
     * @param desa the desa to set
     */
    public void setDesa(String desa) {
        this.desa = desa;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kecamatan the kecamatan to set
     */
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
}
