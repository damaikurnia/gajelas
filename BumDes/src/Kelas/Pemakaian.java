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
public class Pemakaian {
    private String notransaksi;
    private Anggota idanggota;
    private double airlunas;
    private double airterakhir;
    private double airdibayar;
    private String bulan;
    private String jatuhtempo;
    
    public Pemakaian(){}
    
    public Pemakaian(String no, Anggota agt, double airlun, double airter, double airbay, String bln, String jt) {
        this.notransaksi = no;
        this.idanggota = agt;
        this.airlunas = airlun;
        this.airterakhir = airter;
        this.airdibayar = airbay;
        this.bulan = bln;
        this.jatuhtempo = jt;
    }

    /**
     * @return the notransaksi
     */
    public String getNotransaksi() {
        return notransaksi;
    }

    /**
     * @param notransaksi the notransaksi to set
     */
    public void setNotransaksi(String notransaksi) {
        this.notransaksi = notransaksi;
    }

    /**
     * @return the idanggota
     */
    public Anggota getIdanggota() {
        return idanggota;
    }

    /**
     * @param idanggota the idanggota to set
     */
    public void setIdanggota(Anggota idanggota) {
        this.idanggota = idanggota;
    }

    /**
     * @return the airlunas
     */
    public double getAirlunas() {
        return airlunas;
    }

    /**
     * @param airlunas the airlunas to set
     */
    public void setAirlunas(double airlunas) {
        this.airlunas = airlunas;
    }

    /**
     * @return the airterakhir
     */
    public double getAirterakhir() {
        return airterakhir;
    }

    /**
     * @param airterakhir the airterakhir to set
     */
    public void setAirterakhir(double airterakhir) {
        this.airterakhir = airterakhir;
    }

    /**
     * @return the airdibayar
     */
    public double getAirdibayar() {
        return airdibayar;
    }

    /**
     * @param airdibayar the airdibayar to set
     */
    public void setAirdibayar(double airdibayar) {
        this.airdibayar = airdibayar;
    }

    /**
     * @return the bulan
     */
    public String getBulan() {
        return bulan;
    }

    /**
     * @param bulan the bulan to set
     */
    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    /**
     * @return the jatuhtempo
     */
    public String getJatuhtempo() {
        return jatuhtempo;
    }

    /**
     * @param jatuhtempo the jatuhtempo to set
     */
    public void setJatuhtempo(String jatuhtempo) {
        this.jatuhtempo = jatuhtempo;
    }

}
