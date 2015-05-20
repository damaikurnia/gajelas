/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom;

import java.text.DecimalFormat;

/**
 *
 * @author damaikurnia
 */
public class FormatRibuan {

    public FormatRibuan() {
    }

    public static String pisahRibuan(String value) {
        String totalRibuan[] = value.split("\\,");
        String totalCetak = "";
        for (int i = 0; i < totalRibuan.length; i++) {
            totalCetak = totalCetak + totalRibuan[i];
        }
        int values = Integer.parseInt(totalCetak);
//        DecimalFormat m = new DecimalFormat("###,###.##");
        DecimalFormat m = new DecimalFormat("###,###");
        String output = m.format(values);
        return output;
    }

    public static String gabungRibuan(String value) {
        //membuat terbaca tanpa koma
        String totalRibuan[] = value.split("\\,");
        String totalCetak = "";
        for (int i = 0; i < totalRibuan.length; i++) {
            totalCetak = totalCetak + totalRibuan[i];
        }
        return totalCetak;
    }

    public static String angkaToTerbilang(Long angka) {
        String[] huruf = {"", "SATU", "DUA", "TIGA", "EMPAT", "LIMA", "ENAM", "TUJUH", "DELAPAN", "SEMBILAN", "SEPULUH", "SEBELAS"};
        if (angka < 12) {
            return huruf[angka.intValue()];
        }
        if (angka >= 12 && angka <= 19) {
            return huruf[angka.intValue() % 10] + " BELAS ";
        }
        if (angka >= 20 && angka <= 99) {
            return angkaToTerbilang(angka / 10) + " PULUH " + huruf[angka.intValue() % 10];
        }
        if (angka >= 100 && angka <= 199) {
            return "SERATUS " + angkaToTerbilang(angka % 100);
        }
        if (angka >= 200 && angka <= 999) {
            return angkaToTerbilang(angka / 100) + " RATUS " + angkaToTerbilang(angka % 100);
        }
        if (angka >= 1000 && angka <= 1999) {
            return " SERIBU " + angkaToTerbilang(angka % 1000);
        }
        if (angka >= 2000 && angka <= 999999) {
            return angkaToTerbilang(angka / 1000) + " RIBU " + angkaToTerbilang(angka % 1000);
        }
        if (angka >= 1000000 && angka <= 999999999) {
            return angkaToTerbilang(angka / 1000000) + " JUTA " + angkaToTerbilang(angka % 1000000);
        }
        if (angka >= 1000000000 && angka <= 999999999999L) {
            return angkaToTerbilang(angka / 1000000000) + " MILYAR " + angkaToTerbilang(angka % 1000000000);
        }
        if (angka >= 1000000000000L && angka <= 999999999999999L) {
            return angkaToTerbilang(angka / 1000000000000L) + " TRILIUN " + angkaToTerbilang(angka % 1000000000000L);
        }
        if (angka >= 1000000000000000L && angka <= 999999999999999999L) {
            return angkaToTerbilang(angka / 1000000000000000L) + " QUADRILYUN " + angkaToTerbilang(angka % 1000000000000000L);
        }
        return "";
    }
}
