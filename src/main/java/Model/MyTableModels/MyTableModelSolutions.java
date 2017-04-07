package Model.MyTableModels;

import Model.DataBase.DataSets.Solutions;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelSolutions implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Solutions> beans;

    public MyTableModelSolutions(List<Solutions> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Key";
            case 1:
                return "Name";
            case 2:
                return "Postanovlenie";
            case 3:
                return "Notice";

        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Solutions bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getName();
            case 2:
                return bean.getPostanovlenie();
            case 3:
                return bean.getNotice();
        }
        return "";
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {

    }

}