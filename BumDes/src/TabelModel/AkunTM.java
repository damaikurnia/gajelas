/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Akun;
import Kelas.Anggota;
import Kelas.SHU;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author damaikurnia
 */
public class AkunTM extends AbstractTableModel {

    private List<SHU> agt = new ArrayList<SHU>();

    public AkunTM(List<SHU> agt) {
        this.agt = agt;
    }

    @Override
    public int getRowCount() {
        return agt.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SHU d = agt.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getKode().getKode();
            case 1:
                return d.getKode().getKeterangan();
            case 2:
                return d.getPersen();
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
                return "KETERANGAN";
            case 2:
                return "PERSENTASE (%)";
            default:
                return "";
        }
    }
}
