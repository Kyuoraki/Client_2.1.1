package Model.MyTableModels;

import Model.DataBase.DataSets.Protokol;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class MyTableModelProtokol implements TableModel {

    public Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    public List<Protokol> beans;

    public MyTableModelProtokol(List<Protokol> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 17;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Номер";
            case 1:
                return "Дата";
            case 2:
                return "Район";
            case 3:
                return "Город";
            case 4:
                return "Улица";
            case 5:
                return "Дом";
            case 6:
                return "Сотрудник";
            case 7:
                return "Субъект";
            case 8:
                return "Дата Нарушения";
            case 9:
                return "Нарушение";
            case 10:
                return "Номер Статьи";
            case 11:
                return "Часть Статьи";
            case 12:
                return "Документы";
            case 13:
                return "Копия Подписана";
            case 14:
                return "Копия Отправлена";
            case 15:
                return "Примечание";
            case 16:
                return "Направлено в суд";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Protokol bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getNomer();
            case 1:
                return bean.getDate();
            case 2:
                return bean.getRayon_Key();
            case 3:
                return bean.getCity();
            case 4:
                return bean.getStreet();
            case 5:
                return bean.getHouse();
            case 6:
                return bean.getSotrudnik_Key();
            case 7:
                return bean.getSubject_Key();
            case 8:
                return bean.getBreach_Date();
            case 9:
                return bean.getBreache();
            case 10:
                return bean.getItem_Nomer();
            case 11:
                return bean.getItem_Part();
            case 12:
                return bean.getDocuments();
            case 13:
                return bean.getCopy_Date();
            case 14:
                return bean.getMail_Date();
            case 15:
                return bean.getNotice();
            case 16:
                return bean.getInCourt();
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