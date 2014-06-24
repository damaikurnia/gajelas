/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_Model;

import java.util.Date;

/**
 *
 * @author Rafael Aweng
 */
public class Pinjaman {

    private Anggota NIK;
    private double pokok_pinjaman;
    private double pokok_bunga;
    private double angsuran_pokok;
    private double angsuran_bunga;
    private double denda;
    private Date tgl;
    private String tgl_akhir;
    private double saldo_Pokok_pinjaman;
    private double saldo_Bunga;
    public String lamaPinjam;   

    public Pinjaman() {
    }

    public Pinjaman(Anggota NIK, double pokok_pinjaman, double bunga, Date tgl, String tgl_akhir, String Lamap) {
        this.NIK = NIK;
        this.pokok_pinjaman = pokok_pinjaman;
        this.pokok_bunga = bunga;
        this.tgl = tgl;
        this.tgl_akhir = tgl_akhir;
        this.lamaPinjam = Lamap;
    }

    public Pinjaman(Anggota NIK, double angsuran_pokok, double angsuran_bunga, double denda, Date tgl) {
        this.NIK = NIK;
        this.angsuran_pokok = angsuran_pokok;
        this.angsuran_bunga = angsuran_bunga;
        this.denda = denda;
        this.tgl = tgl;
    }

  

    public String getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(String lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }

    public double getPokok_bunga() {
        return pokok_bunga;
    }

    public void setPokok_bunga(double pokok_bunga) {
        this.pokok_bunga = pokok_bunga;
    }

    public Anggota getNIK() {
        return NIK;
    }

    public void setNIK(Anggota NIK) {
        this.NIK = NIK;
    }

    public double getAngsuran_bunga() {
        return angsuran_bunga;
    }

    public void setAngsuran_bunga(double angsuran_bunga) {
        this.angsuran_bunga = angsuran_bunga;
    }

    public double getAngsuran_pokok() {
        return angsuran_pokok;
    }

    public void setAngsuran_pokok(double angsuran_pokok) {
        this.angsuran_pokok = angsuran_pokok;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public double getPokok_pinjaman() {
        return pokok_pinjaman;
    }

    public void setPokok_pinjaman(double pokok_pinjaman) {
        this.pokok_pinjaman = pokok_pinjaman;
    }

    public double getSaldo_Bunga() {
        return saldo_Bunga;
    }

    public void setSaldo_Bunga(double saldo_Bunga) {
        this.saldo_Bunga = saldo_Bunga;
    }

    public double getSaldo_Pokok_pinjaman() {
        return saldo_Pokok_pinjaman;
    }

    public void setSaldo_Pokok_pinjaman(double saldo_Pokok_pinjaman) {
        this.saldo_Pokok_pinjaman = saldo_Pokok_pinjaman;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getTgl_akhir() {
        return tgl_akhir;
    }

    public void setTgl_akhir(String tgl_akhir) {
        this.tgl_akhir = tgl_akhir;
    }
}
