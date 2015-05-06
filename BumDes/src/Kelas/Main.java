/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import Custom.Tanggal;
import java.util.Date;

/**
 *
 * @author damaikurnia
 */
public class Main {

    public static void main(String[] args) {
//        String regex = "[0-9]+";
//        String data = "2";
//        System.out.println(data.matches(regex));
        
//        double data = 0.0;
//        System.out.println(data==0);
        
//        String data= "1 Tahun";
//        System.out.println(data.split(" ")[0]);
        
//        int tahun = Integer.parseInt(Tanggal.getTanggal2().split("-")[0]);
//        tahun = tahun+1;
//        System.out.println(tahun);
        
        String tanggal = Tanggal.getTanggal2();
        System.out.println(tanggal);
        System.out.println(tanggal.split("-")[2]+"-"+tanggal.split("-")[1]+"-"+tanggal.split("-")[0]);
    }
}
