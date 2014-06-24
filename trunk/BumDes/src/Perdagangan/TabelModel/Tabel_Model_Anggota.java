/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Perdagangan.TabelModel;

import Perdagangan.Kontrol.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mich
 */
public class Tabel_Model_Anggota extends AbstractTableModel {

    private List<Anggota> aggta = new ArrayList<Anggota>();

    public Tabel_Model_Anggota(List<Anggota> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 4;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Anggota aggt = aggta.get(rowIndex);
        switch (columnIndex) {
//            case 0:
//                return aggt.noAnggota;
//            case 1:
//                return aggt.getNamaAnggota();
//            case 2:
//                return aggt.getAlamat();
//            case 3:
//                return aggt.statusTerakhir;
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "kode";
            case 1:
                return "Nama Anggota";
            case 2:
                return "Alamat";
            case 3:
                return "Status Terakhir";
            default:;
                return "";
        }
    }
}
