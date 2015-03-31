/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Barang;
import Kelas.Pengeluaran;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class PengeluaranTM extends AbstractTableModel {

    private List<Pengeluaran> brg = new ArrayList<Pengeluaran>();

    public PengeluaranTM(List<Pengeluaran> brg) {
        this.brg = brg;
    }

    @Override
    public int getRowCount() {
        return brg.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pengeluaran d = brg.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getKode();
            case 1:
                return d.getNamaPengeluaran();
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
                return "NAMA PENGELUARAN";
            default:
                return "";
        }
    }
}
