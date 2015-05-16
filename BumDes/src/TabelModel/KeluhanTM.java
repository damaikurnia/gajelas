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
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Keluhan d = agt.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getIdKeluhan();
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
            case 3:
                return d.getStatus();
            case 4:
                if (d.getStatus().equals("BELUM")) {
                    return "-";
                } else {
                    String tgl[] = d.getTglPelaksanaan().split("-");
                    return tgl[2]+"-"+tgl[1]+"-"+tgl[0];
                }
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
                return "ANGGOTA";
            case 2:
                return "KETERANGAN";
            case 3:
                return "STATUS";
            case 4:
                return "TGL PENYELESAIAN";
            default:
                return "";
        }
    }
}
