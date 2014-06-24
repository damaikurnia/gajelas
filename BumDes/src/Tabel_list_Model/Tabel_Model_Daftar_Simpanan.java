/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_list_Model;

import Tabel_Model.Simpanan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael Aweng
 */
public class Tabel_Model_Daftar_Simpanan extends AbstractTableModel {

    private List<Simpanan> aggta = new ArrayList<>();

    public Tabel_Model_Daftar_Simpanan(List<Simpanan> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 5;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Simpanan aggt = aggta.get(rowIndex);
        SimpleDateFormat smp = new SimpleDateFormat("dd-MMM-yyyy");

        switch (columnIndex) {
//            case 0:
//                return aggt.getNotransaksi();
            case 0:
                String tanggal = smp.format(aggt.getTgl());
                return tanggal;
            case 1:
                return aggt.getSetor_wajib();
            case 2:
                return aggt.getSetor_sukarela();
            case 3:
                return aggt.getPenarikan();
            case 4:
                return aggt.getSaldo();
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
//            case 0:
//                return "No Transaksi";
            case 0:
                return "Tanggal";
            case 1:
                return "SW";
            case 2:
                return "SS";
            case 3:
                return "Penarikan";
            case 4:
                return "Saldo";
            default:
                ;
                return "";
        }
    }
}
