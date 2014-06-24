/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.Kontrol;

import java.util.Date;

/**
 *
 * @author Adhi
 */
public class Modal {

    public Date tanggal;
    public long penerimaanKas;
    public long pengeluaranKas;
    public String keterangan;
    public long saldo;

    public Modal() {
    }

    public Modal(Date tanggal, long penerimaanKas, long pengeluaranKas, String keterangan) {
        this.tanggal = tanggal;
        this.penerimaanKas = penerimaanKas;
        this.pengeluaranKas = pengeluaranKas;
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public long getPenerimaanKas() {
        return penerimaanKas;
    }

    public void setPenerimaanKas(long penerimaanKas) {
        this.penerimaanKas = penerimaanKas;
    }

    public long getPengeluaranKas() {
        return pengeluaranKas;
    }

    public void setPengeluaranKas(long pengeluaranKas) {
        this.pengeluaranKas = pengeluaranKas;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
