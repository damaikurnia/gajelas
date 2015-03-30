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
        return 5;
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
                return d.getAlamat() +" RT/RW "+d.getRt()+"/"+d.getRw()+" "+d.getDusun()+" "+d.getDesa();
            case 3:
                return d.getDusun();
            case 4:
                return d.getNoTelp();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO PELANGGAN";
            case 1:
                return "NAMA";
            case 2:
                return "ALAMAT";
            case 3:
                return "DUSUN";
            case 4:
                return "TELP";
            default:
                return "";
        }
    }
}
