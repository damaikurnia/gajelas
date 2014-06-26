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
public class Tabel_Model_Piutang extends AbstractTableModel {

    private List<Transaksi> aggta = new ArrayList<Transaksi>();

    public Tabel_Model_Piutang(List<Transaksi> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 6;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaksi aggt = aggta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return aggt.tanggal;
            case 2:
                return aggt.kodeTransaksi;
            case 3:
                return aggt.totalPenjualan;
            case 4:
                return aggt.idPembeli;
            case 5:
                return aggt.jenisPembayaran;
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
                return "TANGGAL";
            case 2:
                return "KODE TRANSAKSI";
            case 3:
                return "TOTAL BIAYA";
            case 4:
                return "PEMBELI";
            case 5:
                return "JENIS PEMBAYARAN";
            default:;
                return "";
        }
    }
}
