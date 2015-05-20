/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Custom.FormatRibuan;
import Kelas.Pengeluaran;
import Kelas.Transaksi;
import Kontrol.PengeluaranKontrol;
import View.FormAnggota;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class TransaksiKeluarTM extends AbstractTableModel {

    private List<Transaksi> trans = new ArrayList<Transaksi>();

    public TransaksiKeluarTM(List<Transaksi> trs) {
        this.trans = trs;
    }

    @Override
    public int getRowCount() {
        return trans.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaksi d = trans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                String[] tanggal = d.getTanggalTransaksi().split("-");
                return tanggal[2]+"-"+tanggal[1]+"-"+tanggal[0];
            case 1:
                return d.getNoTrans();
            case 2:
                List<Pengeluaran> pen = null;
                try {
                    pen = PengeluaranKontrol.getKoneksi().selectPengeluaran2(d.getIdBarang().getIdBarang());
                } catch (SQLException ex) {
                    Logger.getLogger(FormAnggota.class.getName()).log(Level.SEVERE, null, ex);
                }
                return pen.get(0).getNamaPengeluaran();
            case 3:
                return FormatRibuan.pisahRibuan(Double.toString(d.getTotal()).split("\\.")[0]);
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TANGGAL";
            case 1:
                return "NO TRANSAKSI";
            case 2:
                return "NAMA PENGELUARAN";
            case 3:
                return "TOTAL";
            default:
                return "";
        }
    }
}
