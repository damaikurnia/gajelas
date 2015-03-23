package Custom;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderWarnaWarni extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 47612794125L;
    private Color noDenda;
    private Color denda;
    private Color lunas;

    public RenderWarnaWarni(Color noDenda, Color denda, Color lunas) {
        this.noDenda = noDenda;
        this.denda = denda;
        this.lunas = lunas;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        double airLunas = Double.parseDouble(table.getValueAt(row, 1).toString());
        double airTerakhir = Double.parseDouble(table.getValueAt(row, 2).toString());
        double airDibayar = Double.parseDouble(table.getValueAt(row, 3).toString());
        String jatuhTempo = table.getValueAt(row, 5).toString();
        jatuhTempo = jatuhTempo.split("-")[2] + "-" + jatuhTempo.split("-")[1] + "-" + jatuhTempo.split("-")[0];
        String tanggal = Tanggal.getTanggal2();

        if (airLunas == airTerakhir && airTerakhir != 0) {
            component.setBackground(lunas);
        } else {
            if (tanggal.compareTo(jatuhTempo) == -1) {
                component.setBackground(noDenda);
            } else {
                component.setBackground(denda);
            }

        }
        return component;
    }
}
