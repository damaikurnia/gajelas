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
public class Simpanan {

    private String notransaksi;
    private Anggota NIK;
    private double setor_wajib;
    private double setor_sukarela;
    private double penarikan;
    private Date tgl;
    private double saldo;



    public Simpanan() {
    }

    public Simpanan(String notransaksi, Anggota NIK, double setor_wajib, double setor_sukarela, double penarikan, Date tgl) {
        this.notransaksi = notransaksi;
        this.NIK = NIK;
        this.setor_wajib = setor_wajib;
        this.setor_sukarela = setor_sukarela;
        this.penarikan = penarikan;
        this.tgl = tgl;       
    }

    public Anggota getNIK() {
        return NIK;
    }

    public void setNIK(Anggota NIK) {
        this.NIK = NIK;
    }

    public String getNotransaksi() {
        return notransaksi;
    }

    public void setNotransaksi(String notransaksi) {
        this.notransaksi = notransaksi;
    }

    public double getPenarikan() {
        return penarikan;
    }

    public void setPenarikan(double penarikan) {
        this.penarikan = penarikan;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSetor_sukarela() {
        return setor_sukarela;
    }

    public void setSetor_sukarela(double setor_sukarela) {
        this.setor_sukarela = setor_sukarela;
    }

    public double getSetor_wajib() {
        return setor_wajib;
    }

    public void setSetor_wajib(double setor_wajib) {
        this.setor_wajib = setor_wajib;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

}
