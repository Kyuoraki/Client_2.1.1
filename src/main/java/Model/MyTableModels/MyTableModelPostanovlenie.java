package Model.MyTableModels; /**
 * Created by Андрей on 14.09.2016.
 */
import Model.DataBase.DataSets.Postanovlenie;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MyTableModelPostanovlenie implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Postanovlenie> beans;

    public MyTableModelPostanovlenie(List<Postanovlenie> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 20;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Ключ";
            case 1:
                return "Protokol_Key";
            case 2:
                return "Номер";
            case 3:
                return "Date";
            case 4:
                return "Court_Key";
            case 5:
                return "Judge_Key";
            case 6:
                return "Subject_Key";
            case 7:
                return "Sotrudnik_Key";
            case 8:
                return "Item_Nomer";
            case 9:
                return "Item_Part";
            case 10:
                return "Solution_Key";
            case 11:
                return "Penalty";
            case 12:
                return "PenaltyMROT";
            case 13:
                return "Notice";
            case 14:
                return "Date_Pay";
            case 15:
                return "InCourt";
            case 16:
                return "Warning";
            case 17:
                return "Kvit";
            case 18:
                return "КБК";
            case 19:
                return "ОКАТО";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Postanovlenie bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKey();
            case 1:
                return bean.getProtokol_Key();
            case 2:
                return bean.getNomer();
            case 3:
                return bean.getDate();
            case 4:
                return bean.getCourt_Key();
            case 5:
                return bean.getJudge_Key();
            case 6:
                return bean.getSubject_Key();
            case 7:
                return bean.getSotrudnik_Key();
            case 8:
                return bean.getItem_Nomer();
            case 9:
                return bean.getItem_Part();
            case 10:
                return bean.getSolution_Key();
            case 11:
                return bean.getPenalty();
            case 12:
                return bean.getPenaltyMROT();
            case 13:
                return bean.getNotice();
            case 14:
                return bean.getDate_Pay();
            case 15:
                return bean.getInCourt();
            case 16:
                return bean.getWarning();
            case 17:
                return bean.getKvit();
            case 18:
                return bean.getKBK_Key();
            case 19:
                return bean.getOKATO_Key();
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
