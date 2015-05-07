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
public class SHU {

    Akun kode;
    int persen;

    public SHU(Akun kode,int persen) {
        this.kode = kode;
        this.persen = persen;
    }

    /**
     * @return the kode
     */
    public Akun getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(Akun kode) {
        this.kode = kode;
    }

    /**
     * @return the persen
     */
    public int getPersen() {
        return persen;
    }

    /**
     * @param persen the persen to set
     */
    public void setPersen(int persen) {
        this.persen = persen;
    }

}
