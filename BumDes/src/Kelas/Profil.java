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
public class Profil {
    private String namadesa;
    private String alamatdesa;
    private String notelp;
    
    public Profil(String nama, String alamat, String notelp){
        this.namadesa = nama;
        this.alamatdesa = alamat;
        this.notelp = notelp;
    }
    
    /**
     * @return the namadesa
     */
    public String getNamadesa() {
        return namadesa;
    }

    /**
     * @param namadesa the namadesa to set
     */
    public void setNamadesa(String namadesa) {
        this.namadesa = namadesa;
    }

    /**
     * @return the alamatdesa
     */
    public String getAlamatdesa() {
        return alamatdesa;
    }

    /**
     * @param alamatdesa the alamatdesa to set
     */
    public void setAlamatdesa(String alamatdesa) {
        this.alamatdesa = alamatdesa;
    }

    /**
     * @return the notelp
     */
    public String getNotelp() {
        return notelp;
    }

    /**
     * @param notelp the notelp to set
     */
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    
    
}
