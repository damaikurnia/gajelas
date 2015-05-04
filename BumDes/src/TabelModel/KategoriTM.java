/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Anggota;
import Kelas.Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class KategoriTM extends AbstractTableModel {

    private List<Barang> agt = new ArrayList<Barang>();

    public KategoriTM(List<Barang> agt) {
        this.agt = agt;
    }

    @Override
    public int getRowCount() {
        return agt.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang d = agt.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getKategori();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KATEGORI";
            default:
                return "";
        }
    }
}
