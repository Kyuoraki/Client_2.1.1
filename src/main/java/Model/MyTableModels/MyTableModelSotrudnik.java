package Model.MyTableModels;

import Model.DataBase.DataSets.Sotrudnik;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelSotrudnik implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Sotrudnik> beans;

    public MyTableModelSotrudnik(List<Sotrudnik> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 10;
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
                return "Filial_Key";
            case 4:
                return "Otdel_Key";
            case 5:
                return "F";
            case 6:
                return "I";
            case 7:
                return "O";
            case 8:
                return "Judge";
            case 9:
                return "Notice";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Sotrudnik bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getName();
            case 2:
                return bean.getDolgnost();
            case 3:
                return bean.getFilial_Key();
            case 4:
                return bean.getOtdel_Key();
            case 5:
                return bean.getF();
            case 6:
                return bean.getI();
            case 7:
                return bean.getO();
            case 8:
                return bean.getJudge();
            case 9:
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