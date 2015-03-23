/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gambar;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Laurens_Widi
 */
public class bookTableModel extends AbstractTableModel {

    private List<book> listOfBook = new ArrayList<book>();

    public bookTableModel(List<book> listOfBook) {
        this.listOfBook = listOfBook;
    }

    public void save(book book){
        listOfBook.add(book);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
    public book findOne(int index){
        return listOfBook.get(index);
    }
    
    @Override
    public int getRowCount() {
        return listOfBook.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        book b = listOfBook.get(rowIndex);
        switch (columnIndex) {
            case 0 :
                return rowIndex+1;
            case 1:
                return b.getTitle();
            case 2:
                return b.getImage();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "Nomor";
            case 1:
                return "Title";
            case 2:
                return "Image";
            default:
                return "";
        }
    }
    
}
