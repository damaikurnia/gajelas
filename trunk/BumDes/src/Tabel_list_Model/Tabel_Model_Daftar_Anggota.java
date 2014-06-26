/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabel_list_Model;

import Tabel_Model.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael Aweng
 */
public class Tabel_Model_Daftar_Anggota extends AbstractTableModel {

    private List<Anggota> aggta = new ArrayList<Anggota>();

    public Tabel_Model_Daftar_Anggota(List<Anggota> a) {
        this.aggta = a;
    }

    public int getRowCount() {
        return aggta.size();
    }

    public int getColumnCount() {
        return 5;//ini untuk menampilkan jumlah kolom.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Anggota aggt = aggta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aggt.getNIK();
            case 1:
                return aggt.getNama();
            case 2:
                return aggt.getTtl();
            case 3:
                return aggt.getTelp();
            case 4:
                return aggt.getAlamat();
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIK";
            case 1:
                return "Nama";
            case 2:
                return "TTL";
            case 3:
                return "Telp/Hp";
            case 4:
                return "Alamat";

            default:
                ;
                return "";
        }
    }
}