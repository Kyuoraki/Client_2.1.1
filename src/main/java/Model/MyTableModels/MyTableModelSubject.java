package Model.MyTableModels;

import Model.DataBase.DataSets.Subject;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelSubject implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Subject> beans;

    public MyTableModelSubject(List<Subject> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 21;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Key";
            case 1:
                return "Human";
            case 2:
                return "Predpr";
            case 3:
                return "F";
            case 4:
                return "I";
            case 5:
                return "O";
            case 6:
                return "Name";
            case 7:
                return "Dolgnost";
            case 8:
                return "Rayon_Key_1";
            case 9:
                return "City_1";
            case 10:
                return "Street_1";
            case 11:
                return "House_1";
            case 12:
                return "KV_1";
            case 13:
                return "Phone_1";
            case 14:
                return "Rayon_Key_2";
            case 15:
                return "City_2";
            case 16:
                return "Street_2";
            case 17:
                return "House_2";
            case 18:
                return "KV_2";
            case 19:
                return "Phone_2";
            case 20:
                return "Notice";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Subject bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getHuman();
            case 2:
                return bean.getPredpr();
            case 3:
                return bean.getF();
            case 4:
                return bean.getI();
            case 5:
                return bean.getO();
            case 6:
                return bean.getName();
            case 7:
                return bean.getDolgnost();
            case 8:
                return bean.getRayon_Key_1();
            case 9:
                return bean.getCity_1();
            case 10:
                return bean.getStreet_1();
            case 11:
                return bean.getHouse_1();
            case 12:
                return bean.getKV_1();
            case 13:
                return bean.getPhone_1();
            case 14:
                return bean.getRayon_Key_2();
            case 15:
                return bean.getCity_2();
            case 16:
                return bean.getStreet_2();
            case 17:
                return bean.getHouse_2();
            case 18:
                return bean.getKV_2();
            case 19:
                return bean.getPhone_2();
            case 20:
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