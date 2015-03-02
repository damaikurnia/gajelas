/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class BarangTM extends AbstractTableModel {

    private List<Barang> brg = new ArrayList<Barang>();

    public BarangTM(List<Barang> brg) {
        this.brg = brg;
    }

    @Override
    public int getRowCount() {
        return brg.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang d = brg.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getIdBarang();
            case 1:
                return d.getNamaBarang();
            case 2:
                return d.getStok();
            case 3:
                return Double.toString(d.getTotalAset()).split("\\.")[0];
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE";
            case 1:
                return "NAMA BARANG";
            case 2:
                return "JUMLAH STOK";
            case 3:
                return "TOTAL ASET";
            default:
                return "";
        }
    }
}
