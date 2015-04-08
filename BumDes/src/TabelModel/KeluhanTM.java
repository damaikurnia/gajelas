/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Kelas.Anggota;
import Kelas.Keluhan;
import Kontrol.AnggotaKontrol;
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
public class KeluhanTM extends AbstractTableModel {

    private List<Keluhan> agt = new ArrayList<Keluhan>();

    public KeluhanTM(List<Keluhan> agt) {
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
        Keluhan d = agt.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getTglPelaksanaan();
            case 1:
                List<Anggota> a = null;
                try {
                    a = AnggotaKontrol.getKoneksi().selectAnggota2(d.getIdAnggota().getIdAnggota());
                } catch (SQLException ex) {
                    Logger.getLogger(KeluhanTM.class.getName()).log(Level.SEVERE, null, ex);
                }
                return d.getIdAnggota().getIdAnggota() + "-" + a.get(0).getNamaAnggota();
            case 2:
                return d.getKeterangan();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TGL PELAKSANAAN";
            case 1:
                return "ANGGOTA";
            case 2:
                return "KETERANGAN";
            default:
                return "";
        }
    }
}
