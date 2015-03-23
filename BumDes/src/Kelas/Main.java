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
        String tanggal = "2015-03-09";
        String jatuhTempo = "2015-03-10";
        
        System.out.println(tanggal.compareTo(jatuhTempo));
        //efek compare to
        // 0 --> sama
        // 1 --> tanggal1 lebih besar dari tanggal2
        //-1 --> tanggal1 lebih kecil dari tanggal2 (nodenda)
        jatuhTempo = jatuhTempo.split("-")[2]+"-"+jatuhTempo.split("-")[1]+"-"+jatuhTempo.split("-")[0];
        System.out.println(jatuhTempo);
    }
}
