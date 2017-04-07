package Presenter; /**
 * Created by BUHARIN on 29.08.2016.
 */
import Model.DataBase.DataBaseDAO;
import Model.DataBase.DataSets.*;
import Model.MyTableModels.*;
import Views.Main_View;
import Views.Protokol_Filter_View;
import Views.Protokol_View;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyVetoException;
import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.List;

import static java.awt.Color.white;

public class Solution  {
    Main_View view;
    private Connection conn;
    private Statement stat;
    JInternalFrame frame2;
    JInternalFrame frame3;
    JInternalFrame frame4;
    ResultSet rs;
    JDesktopPane desktopPane;
    ListSelectionModel lsm;
    Protokol_View protokol_view;
    Protokol_Filter_View protokolFilterView;
//    ArrayList<Protokol> protokols;
    DataBaseDAO dataBaseHelper;
    MyTableModelProtokol myTableModelProtokol;


    public Solution() throws IOException, SQLException, ClassNotFoundException {
        view = new Main_View();
        desktopPane = new JDesktopPane();
        protokol_view = new Protokol_View();
        protokolFilterView = new Protokol_Filter_View();
        dataBaseHelper= DataBaseDAO.getInstance();
        myTableModelProtokol = new MyTableModelProtokol(dataBaseHelper.getProtokols());
        view.Protokols.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    goProtokols();
            }
        });
        view.protokoliMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    goProtokols();
            }
        });
        view.Postanovlenie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goPostanovlenie();
            }
        });
        view.postanovlenieMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goPostanovlenie();
            }
        });
        view.sotrudnikiMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goSotrudnik();
            }
        });
        view.Oplata.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goOplata();
            }
        });
        view.oplataMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goOplata();
            }
        });
        view.subjectsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goSubject();
            }
        });
        view.courtMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goCourt();
            }
        });
        view.judgeMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goJudge();
            }
        });
        protokolFilterView.jButtonInstall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    List<Protokol> filterProtokols = new ArrayList<Protokol>();
                    List<Protokol> protokols = dataBaseHelper.getProtokols();
                    String x = protokolFilterView.jTextFieldNomer.getText();
                    String y = protokolFilterView.jTextFieldSotrudnik.getText();
                    if (x.equals("")){
                        for (int i=0;i<protokols.size();i++){
                                if (protokols.get(i).getSotrudnik_Key().contains(y)){
                                    filterProtokols.add(protokols.get(i));
//                                    System.out.println(protokols.get(i).getStreet());
                                }

                        }
                    }
                    for (int i=0;i<protokols.size();i++){
                        if (protokols.get(i).getNomer().contains(x)){
                            if (protokols.get(i).getSotrudnik_Key().contains(y)){
                                filterProtokols.add(protokols.get(i));
//                                System.out.println(protokols.get(i).getStreet());
                            }
                        }
                    }
                    myTableModelProtokol.beans = filterProtokols;
                    view.tableProtokol.revalidate();
                    view.tableProtokol.repaint();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        view.Close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (frame2.isSelected()){
                    frame2.doDefaultCloseAction();
                }
                else if (frame3.isSelected()){
                    frame3.doDefaultCloseAction();
                }
            }
        });
        view.Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        view.ExitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit( 0);
            }
        });
        view.windowframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

    public void goKBK () {
        try {
            view.tableProtokol.setModel(new MyTableModelKBK(dataBaseHelper.getKBK()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void goSotrudnik () {
        view.tabbedPane=new JTabbedPane();
        JScrollPane scrollPane = new JScrollPane(view.tableSotrudniki);
//        view.tableSotrudniki.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        lsm=view.tableSotrudniki.getSelectionModel();
//        view.tableSotrudniki.addMouseListener(new NoDoubleClickListener());
        view.obschayapanel.add(desktopPane, BorderLayout.CENTER);
        frame4 = new JInternalFrame("Сотрудники", true, true, true, true);
        frame4.add(view.tabbedPane);
        view.tabbedPane.addTab("Общий список сотрудников", scrollPane);
//        view.tabbedPane.addTab("Подробно о сотруднике", protokol_view);
        view.tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        desktopPane.add(frame4);
        desktopPane.setBackground(white);
        frame4.setLocation(80, 100);
        frame4.setSize(200, 600);
        frame4.setVisible(true);
        try {
            frame4.setMaximum(true);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        try {
            view.tableSotrudniki.setModel(new MyTableModelSotrudnik(dataBaseHelper.getSotrudnik()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void goJudge () {
        try {
            view.tableProtokol.setModel(new MyTableModelJudge(dataBaseHelper.getJudge()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void goProtokols () {
        view.tabbedPane=new JTabbedPane();
        JScrollPane scrollPane = new JScrollPane(view.tableProtokol);
        view.tableProtokol.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsm=view.tableProtokol.getSelectionModel();
        view.tableProtokol.addMouseListener(new NoDoubleClickListener());
        view.obschayapanel.add(desktopPane, BorderLayout.CENTER);
        frame2 = new JInternalFrame("Протоколы", true, true, true, true);
        frame2.add(view.tabbedPane);
        view.tabbedPane.addTab("Общий список протоколов", scrollPane);
        view.tabbedPane.addTab("Подробнее о протоколе", protokol_view);
        view.tabbedPane.addTab("Фильтр / Поиск", protokolFilterView);
        view.tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        desktopPane.add(frame2);
        desktopPane.setBackground(white);
        frame2.setLocation(80, 100);
        frame2.setSize(200, 600);
        frame2.setVisible(true);
        try {
            frame2.setMaximum(true);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        view.tableProtokol.setModel(myTableModelProtokol);
    }
    public void goPostanovlenie () {
        view.tabbedPane1=new JTabbedPane();
        JScrollPane scrollPane = new JScrollPane(view.tablePostanovlenie);
        view.tablePostanovlenie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsm=view.tablePostanovlenie.getSelectionModel();
        view.tablePostanovlenie.addMouseListener(new NoDoubleClickListener());
        view.obschayapanel.add(desktopPane, BorderLayout.CENTER);
        frame3 = new JInternalFrame("Постановления", true, true, true, true);
        frame3.add(view.tabbedPane1);
        view.tabbedPane1.addTab("Общий список постановлений", scrollPane);
        view.tabbedPane1.addTab("Подробнее о постановлении", new Label("в разработке"));
        view.tabbedPane1.addTab("Фильтр / Поиск", new Label("в разработке"));
        view.tabbedPane1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        desktopPane.add(frame3);
        desktopPane.setBackground(white);
        frame3.setLocation(80, 100);
        frame3.setSize(200, 60);
        frame3.setVisible(true);
        try {
            frame3.setMaximum(true);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        try {
            view.tablePostanovlenie.setModel(new MyTableModelPostanovlenie(dataBaseHelper.getPostanovlenie()));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void goOplata () {
        try {
            view.tableProtokol.setModel(new MyTableModelOplata(dataBaseHelper.getOplata()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void goSubject () {
        try {
            view.tableProtokol.setModel(new MyTableModelSubject(dataBaseHelper.getSubject()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void goCourt () {
        try {
            view.tableProtokol.setModel(new MyTableModelCourt(dataBaseHelper.getCourt()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Solution d = new Solution();
    }
    public void buildView4Protokol(Protokol protokol) throws SQLException { //метод построения вида для протоколов ёпта
        protokol_view.jTextFieldNumber.setText(protokol.getNomer()); //занос номера в текстфиелд в протоколе
        ArrayList<Sotrudnik> sotr = null;
        try {
            sotr = (ArrayList<Sotrudnik>) dataBaseHelper.getSotrudnik();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String items[]= new String[sotr.size()];
        for (int i=0;i<sotr.size();i++){
            items[i]=sotr.get(i).getName();
        }
        ArrayList<Subject> subj = null;
        try {
            subj = (ArrayList<Subject>) dataBaseHelper.getSubject();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String itemssubj[]= new String[subj.size()];
        for (int i=0;i<subj.size();i++){
            itemssubj[i]=subj.get(i).getName();
        }
        SimpleDateFormat dateformat3 = new SimpleDateFormat("yyyy-MM-dd");
        String[] date = protokol.getDate().split(" ");
        Date date1 = null;
        try {
            date1 = dateformat3.parse(date[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String[] dateBreachD = protokol.getBreach_Date().split(" ");
        Date dateBreach2 = null;
        try {
            dateBreach2 = dateformat3.parse(dateBreachD[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String[] dateCopy_Date = protokol.getCopy_Date().split(" ");
        Date dateCopy_Date1 = null;
        try {
            dateCopy_Date1 = dateformat3.parse(dateCopy_Date[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String[] dateMail_Date = protokol.getMail_Date().split(" ");
        Date dateMail_Date1 = null;
        try {
            dateMail_Date1 = dateformat3.parse(dateMail_Date[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (protokol.getCopy_Date().contains("1899")){
            protokol_view.jCheckBoxCopy_Date.setSelected(false);
            protokol_view.jCheckBoxCopy_Date.setEnabled(false);
            protokol_view.pickerCopy_Date.setEditable(false);
        }
        else {
            protokol_view.jCheckBoxCopy_Date.setSelected(true);
            protokol_view.jCheckBoxCopy_Date.setEnabled(true);
            protokol_view.pickerCopy_Date.setEditable(true);
        }
        if (protokol.getMail_Date().contains("1899")){
            System.out.println(protokol.getMail_Date());
            protokol_view.jCheckBoxMail_Date.setSelected(false);
            protokol_view.jCheckBoxMail_Date.setEnabled(false);
            protokol_view.pickerMail_Date.setEditable(false);
        }
        else {
            System.out.println(protokol.getMail_Date());
            protokol_view.jCheckBoxMail_Date.setSelected(true);
            protokol_view.jCheckBoxMail_Date.setEnabled(true);
            protokol_view.pickerMail_Date.setEditable(true);
        }

        protokol_view.jComboBox.setModel(new DefaultComboBoxModel(items));
        protokol_view.jComboBox.setSelectedItem(protokol.getSotrudnik_Key());
        protokol_view.picker.setDate(date1);
        protokol_view.pickerCriminal.setDate(dateBreach2);
        protokol_view.pickerCopy_Date.setDate(dateCopy_Date1);
        protokol_view.pickerMail_Date.setDate(dateMail_Date1);
        protokol_view.jComboBoxSubject.setModel(new DefaultComboBoxModel(itemssubj));
        protokol_view.jComboBoxSubject.setSelectedItem(protokol.getSubject_Key());
        protokol_view.jTextFieldNasPunkt.setText(protokol.getCity());
        protokol_view.jTextFieldRayon.setText(protokol.getRayon_Key());
        protokol_view.jTextFieldStreet.setText(protokol.getStreet());
        protokol_view.jTextFieldHouse.setText(protokol.getHouse());
        protokol_view.jTextFieldBreach.setText(protokol.getBreache());
        protokol_view.jTextFieldItem_Nomer.setText(protokol.getItem_Nomer());
        protokol_view.jTextFieldItem_Part.setText(protokol.getItem_Part());
        protokol_view.jTextFieldDocuments.setText(protokol.getDocuments());
        protokol_view.jTextFieldNotice.setText(protokol.getNotice());
        
        if (protokol.getInCourt().equals("1")) {
            protokol_view.jCheckBoxCourt.setSelected(true);
        }
        else{
            protokol_view.jCheckBoxCourt.setSelected(false);
        }
    }

    private class NoDoubleClickListener implements MouseListener { //перехватчик нажатия ЛКМ

        public void mouseClicked(MouseEvent e) {
//            if (e.getClickCount() == 1) { // счетчик нажатий ЛКМ //нинужна //и'наче
                if (lsm.isSelectionEmpty()) { // если выбор пуст
                    System.out.println("none"); // курлы
                } else { //иначе
                    int minIndex = lsm.getMinSelectionIndex(); //макс индекс
                    int maxIndex = lsm.getMaxSelectionIndex(); //мин индекс
                    for (int i = minIndex; i <= maxIndex; i++) { //условие индекса
                        if (lsm.isSelectedIndex(i)) { //если выбрано что-то
//                            System.out.println("index " + i); //курлы
                            try {
//                                buildView4Protokol(dataBaseHelper.getProtokols().get(i));
                                buildView4Protokol(myTableModelProtokol.beans.get(i));
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                }
//            }

        }

        public void mousePressed(MouseEvent e) {

        }
        public void mouseReleased(MouseEvent e) {

        }
        public void mouseEntered(MouseEvent e) {

        }
        public void mouseExited(MouseEvent e) {

        }
    }


}
