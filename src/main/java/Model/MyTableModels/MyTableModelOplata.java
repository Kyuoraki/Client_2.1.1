package Model.MyTableModels;

import Model.DataBase.DataSets.Oplata;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelOplata implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Oplata> beans;

    public MyTableModelOplata(List<Oplata> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 8;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Key";
            case 1:
                return "Nomer";
            case 2:
                return "KBK_Key";
            case 3:
                return "OKATO_Key";
            case 4:
                return "Date";
            case 5:
                return "Summa";
            case 6:
                return "Subject_Key";
            case 7:
                return "Postanovlenie_Key";

        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Oplata bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getNomer();
            case 2:
                return bean.getKBK_Key();
            case 3:
                return bean.getOKATO_Key();
            case 4:
                return bean.getDate();
            case 5:
                return bean.getSumma();
            case 6:
                return bean.getSubject_Key();
            case 7:
                return bean.getPostanovlenie_Key();

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