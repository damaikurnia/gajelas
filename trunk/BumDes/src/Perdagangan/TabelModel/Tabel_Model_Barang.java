/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.TabelModel;

import Perdagangan.Kontrol.Barang;
import Tabel_list_Model.*;
import Tabel_Model.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mich
 */
public class Tabel_Model_Barang extends AbstractTableModel {

    private List<Barang> aggta = new ArrayList<Barang>();

    public Tabel_Model_Barang(List<Barang> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 6;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang aggt = aggta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aggt.getKodeBarang();
            case 1:
                return aggt.getNamaBarang();
            case 2:
                return aggt.getJumlahStok();
            case 3:
                return aggt.getSatuanBarang();
            case 4:
                return aggt.getHargaSatuan();
            case 5:
                return aggt.getHrgBarang();
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode";
            case 1:
                return "Nama Barang";
            case 2:
                return "Stok";
            case 3:
                return "Satuan";
            case 4:
                return "Harga Satuan";
            case 5:
                return "Total Harga";
            default:;
                return "";
        }
    }
}
