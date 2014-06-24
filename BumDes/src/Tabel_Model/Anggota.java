/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_Model;

/**
 *
 * @author Rafael Aweng
 */
public class Anggota {

    private String NIK;
    private String Nama;
    private String ttl;
    private String telp;
    private String alamat;
    private String tgl_bergabung;
    private double simpananPokok;

    public Anggota() {
    }

    public Anggota(String NIK, String Nama, String ttl, String telp, String alamat, String tgl_bergabung, double simpananPokok) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.ttl = ttl;
        this.telp = telp;
        this.alamat = alamat;
        this.tgl_bergabung = tgl_bergabung;
        this.simpananPokok = simpananPokok;
    }

    public String getTgl_bergabung() {
        return tgl_bergabung;
    }

    public void setTgl_bergabung(String tgl_bergabung) {
        this.tgl_bergabung = tgl_bergabung;
    }

    public double getSimpananPokok() {
        return simpananPokok;
    }

    public void setSimpananPokok(double simpananPokok) {
        this.simpananPokok = simpananPokok;
    }

   
    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
