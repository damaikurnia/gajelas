/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import Custom.Tanggal;

/**
 *
 * @author damaikurnia
 */
public class Main {
    public static void main(String[] args) {
        String tanggal = "2015-09-30";
        String jatuhTempo = "";
        int bulan = Integer.parseInt(tanggal.split("-")[1]);

        if (bulan <= 9) {
            jatuhTempo = tanggal.split("-")[0] + "-0" + Integer.toString(bulan) + "-10";
        } else {
            jatuhTempo = tanggal.split("-")[0] + "-" + Integer.toString(bulan) + "-10";
        }
        System.out.println(jatuhTempo);
    }
}
