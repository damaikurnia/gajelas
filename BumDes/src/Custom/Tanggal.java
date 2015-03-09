/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author damaikurnia
 */
public class Tanggal {
    public static String getTanggal() { 
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("EEEEEE,d MMM yyyy");
        Date date = new Date(); 
        return dateFormat.format(date); 
    } 
    
    public static String getTanggal2() { 
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(); 
        return dateFormat.format(date); 
    } 
//    
//    public static void main(String Args[]){ 
//        Tanggal tgl = new Tanggal(); 
////        System.out.println("Tanggal dan waktu sekarang : "+tgl.getTanggal2()); 
//        System.out.println("('-')"); 
//    } 
} 

