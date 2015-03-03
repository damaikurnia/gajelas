/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Transaksi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class TransaksiJualTM extends AbstractTableModel {

    private List<Transaksi> trans = new ArrayList<Transaksi>();

    public TransaksiJualTM(List<Transaksi> trs) {
        this.trans = trs;
    }

    @Override
    public int getRowCount() {
        return trans.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaksi d = trans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getNoTrans();
            case 1:
                return d.getIdAnggota().getNamaAnggota();
            case 2:
                return d.getJumlah();
            case 3:
                return Double.toString(d.getHargaSatuan()).split("\\.")[0];
            case 4:
                return Double.toString(d.getTotal()).split("\\.")[0];
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO TRANSAKSI";
            case 1:
                return "PELANGGAN";
            case 2:
                return "JUMLAH";
            case 3:
                return "HARGA SATUAN";
            case 4:
                return "TOTAL";
            default:
                return "";
        }
    }
}
