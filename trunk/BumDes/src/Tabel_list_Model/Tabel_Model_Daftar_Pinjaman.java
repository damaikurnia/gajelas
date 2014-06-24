/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_list_Model;

import Tabel_Model.Pinjaman;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael Aweng
 */
public class Tabel_Model_Daftar_Pinjaman extends AbstractTableModel {

    private List<Pinjaman> aggta = new ArrayList<>();

    public Tabel_Model_Daftar_Pinjaman(List<Pinjaman> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 5;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Pinjaman aggt = aggta.get(rowIndex);
        SimpleDateFormat smp = new SimpleDateFormat("dd-MMM-yyyy");

        switch (columnIndex) {
            case 0:
                String tanggal = smp.format(aggt.getTgl());
                return tanggal;
            case 1:
                return aggt.getPokok_pinjaman() + aggt.getPokok_bunga();
            case 2:
                return aggt.getAngsuran_pokok() + aggt.getAngsuran_bunga();
            case 3:
                return aggt.getDenda();
            case 4:
                return aggt.getSaldo_Pokok_pinjaman() + aggt.getSaldo_Bunga();

            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Tgl";
            case 1:
                return "Pinjaman+Bunga";
            case 2:
                return "Ang.Pokok+Bunga";
            case 3:
                return "Denda";
            case 4:
                return "Blm.Bayar";

            default:
                ;
                return "";
        }
    }
}
