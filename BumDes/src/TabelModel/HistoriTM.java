/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Pemakaian;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class HistoriTM extends AbstractTableModel {

    private List<Pemakaian> pem = new ArrayList<Pemakaian>();

    public HistoriTM(List<Pemakaian> agt) {
        this.pem = agt;
    }

    @Override
    public int getRowCount() {
        return pem.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pemakaian d = pem.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getNotransaksi();
            case 1:
                return Double.toString(d.getAirlunas()).split("\\.")[0];
            case 2:
                return Double.toString(d.getAirterakhir()).split("\\.")[0];
            case 3:
                return Double.toString(d.getAirdibayar()).split("\\.")[0];
            case 4:
                return d.getBulan();
            case 5:
                String data = d.getJatuhtempo();
                return data.split("-")[2]+"-"+data.split("-")[1]+"-"+data.split("-")[0];
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
                return "AIR LUNAS";
            case 2:
                return "AIR TERAKHIR";
            case 3:
                return "AIR DIBAYAR";
            case 4:
                return "BULAN";
            case 5:
                return "JATUH TEMPO";
            default:
                return "";
        }
    }
}
