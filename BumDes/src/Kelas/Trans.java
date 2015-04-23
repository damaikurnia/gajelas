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
public class Trans {

    String kodeAkun;
    long debit;
    long kredit;
    String tglTrans;

    public Trans(String kode, long debit, long kredit) {
        this.kodeAkun = kode;
        this.debit = debit;
        this.kredit = kredit;
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

    /**
     * @return the debit
     */
    public long getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(long debit) {
        this.debit = debit;
    }

    /**
     * @return the kredit
     */
    public long getKredit() {
        return kredit;
    }

    /**
     * @param kredit the kredit to set
     */
    public void setKredit(long kredit) {
        this.kredit = kredit;
    }

    /**
     * @return the tglTrans
     */
    public String getTglTrans() {
        return tglTrans;
    }

    /**
     * @param tglTrans the tglTrans to set
     */
    public void setTglTrans(String tglTrans) {
        this.tglTrans = tglTrans;
    }
}
