/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Anggota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class AnggotaTM extends AbstractTableModel {

    private List<Anggota> agt = new ArrayList<Anggota>();

    public AnggotaTM(List<Anggota> agt) {
        this.agt = agt;
    }

    @Override
    public int getRowCount() {
        return agt.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anggota d = agt.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getIdAnggota();
            case 1:
                return d.getNamaAnggota();
            case 2:
                return d.getPekerjaan();
            case 3:
                return d.getAlamat();
            case 4:
                return d.getRt();
            case 5:
                return d.getRw();
            case 6:
                return d.getDusun();
            case 7:
                return d.getDesa();
            case 8:
                return d.getKota();
            case 9:
                return d.getProvinsi();
            case 10:
                return d.getNoTelp();
            case 11:
                return d.getNoKTP();
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
                return "NAMA";
            case 2:
                return "PEKERJAAN";
            case 3:
                return "ALAMAT";
            case 4:
                return "RT";
            case 5:
                return "RW";
            case 6:
                return "DUSUN";
            case 7:
                return "DESA";
            case 8:
                return "KOTA";
            case 9:
                return "PROVINSI";
            case 10:
                return "TELP";
            case 11:
                return "NO KTP";
            default:
                return "";
        }
    }
}
