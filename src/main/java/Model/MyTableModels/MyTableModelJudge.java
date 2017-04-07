package Model.MyTableModels;

import Model.DataBase.DataSets.Judge;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelJudge implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Judge> beans;

    public MyTableModelJudge(List<Judge> beans) {
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
                return "Dolgnost";
            case 3:
                return "F";
            case 4:
                return "I";
            case 5:
                return "O";
            case 6:
                return "Notice";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Judge bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getName();
            case 2:
                return bean.getDolgnost();
            case 3:
                return bean.getF();
            case 4:
                return bean.getI();
            case 5:
                return bean.getO();
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