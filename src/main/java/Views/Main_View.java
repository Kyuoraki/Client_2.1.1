package Views;

import javax.swing.*;
import java.awt.*;

import static com.sun.javafx.fxml.expression.Expression.add;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class Main_View {
    public static JFrame windowframe;
//    public JPanel glavnayapanel;
    public JPanel obschayapanel;
    public JPanel panelknopokup;
    public JPanel panelknopokdown;
    public JPanel panelvkladok;
    public JButton Protokols;
    public JButton Postanovlenie;
    public JButton Oplata;
    public JButton Otchets;
    public JButton Exit;
    public JButton Add;
    public JButton Rewrite;
    public JButton Delete;
    public JButton Close;
//    public JTextField textField;
//    public JLabel vivod;
    public JTable tableProtokol;
    public JTable tablePostanovlenie;
    public JTable tableSotrudniki;
    public JTable tableOplata;
    public JTable tableJudge;
    public JTable tableKBK;
    public JTable tableSubject;
    public JTable tableCourt;
    public JTable table;
    public JMenuBar menuBar;
    public JMenu fileMenu;
    public JMenu editMenu;
    public JMenu viewMenu;
    public JMenu systemeMenu;
    public JMenu helpMenu;
    public JMenuItem protokoliMenuItem;
    public JMenuItem postanovlenieMenuItem;
    public JMenuItem oplataMenuItem;
    public JMenuItem OtchetsMenuItem;
    public JMenuItem ExitMenuItem;
    public JMenuItem addMenuItem;
    public JMenuItem rewriteMenuItem;
    public JMenuItem deleteMenuItem;
    public JMenuItem filterMenuItem;
    public JMenuItem toolbarMenuItem;
    public JMenuItem sotrudnikiMenuItem;
    public JMenuItem subjectsMenuItem;
    public JMenuItem courtMenuItem;
    public JMenuItem judgeMenuItem;
    public JMenuItem glossaryMenuItem;
    public JMenuItem settingsMenuItem;
    public JMenuItem helpMenuItem;
    public JMenuItem aboutMenuItem;
    public JTabbedPane tabbedPane;
    public JTabbedPane tabbedPane1;
    public JTabbedPane tabbedPane2;



    public Main_View() {
        windowframe =new JFrame();
        //windowframe.getContentPane().setContentPane(null);
        windowframe.setTitle("Административная практика");
        windowframe.setSize(600,600);
        windowframe.setVisible(true);
        windowframe.setExtendedState(Frame.MAXIMIZED_BOTH);
//        glavnayapanel =new JPanel();
        tableProtokol =new JTable();
        tablePostanovlenie =new JTable();
        tableSotrudniki =new JTable();
        tableOplata =new JTable();
        obschayapanel =new JPanel();
        panelknopokup =new JPanel();
        panelknopokdown =new JPanel();
        panelvkladok =new JPanel();
        menuBar= new JMenuBar();



        fileMenu = new JMenu("Файл");
        protokoliMenuItem = new JMenuItem("Протоколы");
        postanovlenieMenuItem = new JMenuItem("Постановления");
        oplataMenuItem = new JMenuItem("Оплата");
        OtchetsMenuItem = new JMenuItem("Отчеты");
        ExitMenuItem = new JMenuItem("Выход");
        fileMenu.add(protokoliMenuItem);
        fileMenu.add(postanovlenieMenuItem);
        fileMenu.add(oplataMenuItem);
        fileMenu.add(OtchetsMenuItem);
        fileMenu.add(ExitMenuItem);
        editMenu = new JMenu("Правка");
        addMenuItem = new JMenuItem("Добавить");
        rewriteMenuItem = new JMenuItem("Изменить");
        deleteMenuItem = new JMenuItem("Удалить");
        editMenu.add(addMenuItem);
        editMenu.add(rewriteMenuItem);
        editMenu.add(deleteMenuItem);
        viewMenu = new JMenu("Вид");
        filterMenuItem = new JMenuItem("Фильтр");
        toolbarMenuItem = new JMenuItem("Панель инструментов");
        viewMenu.add(filterMenuItem);
        viewMenu.add(toolbarMenuItem);
        systemeMenu = new JMenu("Система");
        sotrudnikiMenuItem = new JMenuItem("Сотрудники");
        subjectsMenuItem = new JMenuItem("Субъекты");
        courtMenuItem = new JMenuItem("Суды");
        judgeMenuItem = new JMenuItem("Судьи");
        glossaryMenuItem = new JMenuItem("Словари");
        settingsMenuItem = new JMenuItem("Настройка");
        systemeMenu.add(sotrudnikiMenuItem);
        systemeMenu.add(subjectsMenuItem);
        systemeMenu.add(courtMenuItem);
        systemeMenu.add(judgeMenuItem);
        systemeMenu.add(glossaryMenuItem);
        systemeMenu.add(settingsMenuItem);
        helpMenu = new JMenu("Помощь");
        helpMenuItem = new JMenuItem("Справка");
        aboutMenuItem = new JMenuItem("О программе");
        helpMenu.add(helpMenuItem);
        helpMenu.add(aboutMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(systemeMenu);
        menuBar.add(helpMenu);
        Protokols =new JButton();
        Postanovlenie =new JButton();
        Oplata =new JButton();
        Otchets =new JButton();
        Exit =new JButton();
        Add =new JButton();
        Rewrite =new JButton();
        Delete =new JButton();
        Close =new JButton();

//        glavnayapanel.setLayout(new BorderLayout());
        obschayapanel.setLayout(new BorderLayout());
        panelknopokup.setLayout(new FlowLayout());
        panelknopokdown.setLayout(new FlowLayout());

        windowframe.add(menuBar, BorderLayout.NORTH);
        windowframe.add(obschayapanel);
//        windowframe.pack();
//        JDesktopPane desktopPane = new JDesktopPane();
//
//        tabbedPane=new JTabbedPane();
//        JScrollPane scrollPane = new JScrollPane(tableProtokol);
//
//
//
//        obschayapanel.add(desktopPane, BorderLayout.CENTER);
//        JInternalFrame frame2 = new JInternalFrame("Протоколы", true, true, true, true);
//        frame2.add(tabbedPane);
//        tabbedPane.addTab("Общий список", scrollPane);
//        tabbedPane.addTab("Подробнее", new Label("изменение/создание"));
//        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
//        desktopPane.add(frame2);
//        desktopPane.setBackground(white);
//        frame2.setLocation(80, 100);
//        frame2.setSize(200, 60);
//        frame2.setVisible(true);
//        try {
//            frame2.setMaximum(true);
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
//
//        JInternalFrame frame2;
//        JInternalFrame frame3;
//
//        JDesktopPane desktopPane = new JDesktopPane();
//        tabbedPane=new JTabbedPane();
//        JScrollPane scrollPane = new JScrollPane(tableProtokol);
//        tabbedPane.revalidate();
//        tabbedPane.repaint();
//        scrollPane.revalidate();
//        scrollPane.repaint();
//        obschayapanel.add(desktopPane, BorderLayout.CENTER);
//        frame2 = new JInternalFrame("Протоколы", true, true, true, true);
//        frame2.add(tabbedPane);
//        tabbedPane.addTab("Общий список протоколов", scrollPane);
//        tabbedPane.addTab("Подробнее о протоколе", new Label("в разработке"));
//        tabbedPane.addTab("Фильтр / Поиск", new Label("в разработке"));
//        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
//        desktopPane.add(frame2);
//        desktopPane.setBackground(white);
//        frame2.setLocation(80, 100);
//        frame2.setSize(200, 60);
//        frame2.setVisible(true);
//
//        try {
//            frame2.setMaximum(true);
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
//        frame3 = new JInternalFrame("Постановления", true, true, true, true);
//        frame3.add(tabbedPane);
//        tabbedPane.addTab("Общий список постановлений", scrollPane);
//        tabbedPane.addTab("Подробнее о постановлении", new Label("в разработке"));
//        tabbedPane.addTab("Фильтр / Поиск", new Label("в разработке"));
//        desktopPane.add(frame3);
//        frame3.setLocation(80, 100);
//        frame3.setSize(200, 60);
//        frame3.setVisible(true);
//        try {
//            frame3.setMaximum(true);
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
        obschayapanel.add(panelknopokup, BorderLayout.NORTH);
        obschayapanel.add(panelknopokdown, BorderLayout.SOUTH);
        panelknopokup.add(Protokols);
        Protokols.setText("Протоколы");
        panelknopokup.add(Postanovlenie);
        Postanovlenie.setText("Постановления");
        panelknopokup.add(Oplata);
        Oplata.setText("Оплата");
        panelknopokup.add(Otchets);
        Otchets.setText("Отчеты");
        panelknopokup.add(Exit);
        Exit.setText("Выход");
        panelknopokdown.add(Add);
        Add.setText("Добавить");
        panelknopokdown.add(Rewrite);
        Rewrite.setText("Изменить");
        panelknopokdown.add(Delete);
        Delete.setText("Удалить");
        panelknopokdown.add(Close);
        Close.setText("Закрыть");
        windowframe.setLocationRelativeTo(null);
    }
}
