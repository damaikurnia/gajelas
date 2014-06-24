/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.TabelModel;

import Perdagangan.Kontrol.Anggota;
import Perdagangan.Kontrol.Transaksi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mich
 */
public class Tabel_Model_Transaksi extends AbstractTableModel {

    private List<Transaksi> aggta = new ArrayList<Transaksi>();

    public Tabel_Model_Transaksi(List<Transaksi> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 5;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaksi aggt = aggta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex+1;
            case 1:
                return aggt.idBarang;
            case 2:
                return aggt.hargaSatuan;
            case 3:
                return aggt.jumlah;
            case 4:
                return aggt.totalPenjualan;
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "Nama Barang";
            case 2:
                return "Harga Satuan";
            case 3:
                return "Jumlah";
            case 4:
                return "Total";
            default:;
                return "";
        }
    }
}
