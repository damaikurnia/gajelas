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
        String regex = "[0-9]+";
        String data = "2";
        System.out.println(data.matches(regex));
    }
}
