/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_list_Model;

import Tabel_Model.Modal_SP;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael Aweng
 */
public class Tabel_Model_Modal_SP extends AbstractTableModel {

    private List<Modal_SP> aggta = new ArrayList<Modal_SP>();

    public Tabel_Model_Modal_SP(List<Modal_SP> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 5;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Modal_SP aggt = aggta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aggt.getTanggal();
            case 1:
                return aggt.getPenerimaanKas();
            case 2:
                return aggt.getPengeluaranKas();
            case 3:
                return aggt.getSaldo();
            case 4:
                return aggt.getKeterangan();
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Tanggal";
            case 1:
                return "Penerimaan Kas";
            case 2:
                return "Pengeluaran Kas";
            case 3:
                return "Saldo";
            case 4:
                return "Keterangan";
            default:
                ;
                return "";
        }
    }
}
