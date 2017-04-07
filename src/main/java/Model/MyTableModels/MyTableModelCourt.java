package Model.MyTableModels;

import Model.DataBase.DataSets.Court;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelCourt implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Court> beans;

    public MyTableModelCourt(List<Court> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 7;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Key";
            case 1:
                return "Name";
            case 2:
                return "Rayon_Key";
            case 3:
                return "City";
            case 4:
                return "Street";
            case 5:
                return "House";
            case 6:
                return "Notice";

        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Court bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getName();
            case 2:
                return bean.getRayon_Key();
            case 3:
                return bean.getCity();
            case 4:
                return bean.getStreet();
            case 5:
                return bean.getHouse();
            case 6:
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