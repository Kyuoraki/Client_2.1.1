//package Presenter;
//
//import Model.DataBase.DataBaseDAO;
//import Model.DataBase.DataSets.Protokol;
//import Model.DataBase.DataSets.Sotrudnik;
//import Model.DataBase.DataSets.Subject;
//import Model.MyTableModels.MyTableModelProtokol;
//import Views.Protokol_View;
//
//import javax.swing.*;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.TableModel;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// * Created by Андрей on 20.04.2017.
// */
//public class NoDoubleClickListener implements MouseListener { //перехватчик нажатия ЛКМ
//
//    ListSelectionModel lsm;
//    Protokol_View protokol_view;
//    DataBaseDAO dataBaseHelper;
//    MyTableModelProtokol myTableModelProtokol;
//    Solution solution;
//
//
////    public void buildView4Protokol(Protokol protokol) throws SQLException { //метод построения вида для протоколов ёпта
////        protokol_view.jTextFieldNumber.setText(protokol.getNomer()); //занос номера в текстфиелд в протоколе
////        ArrayList<Sotrudnik> sotr = null;
////        try {
////            sotr = (ArrayList<Sotrudnik>) dataBaseHelper.getSotrudnik();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        String items[]= new String[sotr.size()];
////        for (int i=0;i<sotr.size();i++){
////            items[i]=sotr.get(i).getName();
////        }
////        ArrayList<Subject> subj = null;
////        try {
////            subj = (ArrayList<Subject>) dataBaseHelper.getSubject();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        String itemssubj[]= new String[subj.size()];
////        for (int i=0;i<subj.size();i++){
////            itemssubj[i]=subj.get(i).getName();
////        }
////        SimpleDateFormat dateformat3 = new SimpleDateFormat("yyyy-MM-dd");
////        String[] date = protokol.getDate().split(" ");
////        Date date1 = null;
////        try {
////            date1 = dateformat3.parse(date[0]);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
////        String[] dateBreachD = protokol.getBreach_Date().split(" ");
////        Date dateBreach2 = null;
////        try {
////            dateBreach2 = dateformat3.parse(dateBreachD[0]);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
////        String[] dateCopy_Date = protokol.getCopy_Date().split(" ");
////        Date dateCopy_Date1 = null;
////        try {
////            dateCopy_Date1 = dateformat3.parse(dateCopy_Date[0]);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
////        String[] dateMail_Date = protokol.getMail_Date().split(" ");
////        Date dateMail_Date1 = null;
////        try {
////            dateMail_Date1 = dateformat3.parse(dateMail_Date[0]);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
////        if (protokol.getCopy_Date().contains("1899")){
////            protokol_view.jCheckBoxCopy_Date.setSelected(false);
////            protokol_view.jCheckBoxCopy_Date.setEnabled(false);
////            protokol_view.pickerCopy_Date.setEditable(false);
////        }
////        else {
////            protokol_view.jCheckBoxCopy_Date.setSelected(true);
////            protokol_view.jCheckBoxCopy_Date.setEnabled(true);
////            protokol_view.pickerCopy_Date.setEditable(true);
////        }
////        if (protokol.getMail_Date().contains("1899")){
//////            System.out.println(protokol.getMail_Date());
////            protokol_view.jCheckBoxMail_Date.setSelected(false);
////            protokol_view.jCheckBoxMail_Date.setEnabled(false);
////            protokol_view.pickerMail_Date.setEditable(false);
////        }
////        else {
//////            System.out.println(protokol.getMail_Date());
////            protokol_view.jCheckBoxMail_Date.setSelected(true);
////            protokol_view.jCheckBoxMail_Date.setEnabled(true);
////            protokol_view.pickerMail_Date.setEditable(true);
////        }
////
////        protokol_view.jComboBox.setModel(new DefaultComboBoxModel(items));
////        protokol_view.jComboBox.setSelectedItem(protokol.getSotrudnik_Key());
////        protokol_view.picker.setDate(date1);
////        protokol_view.pickerCriminal.setDate(dateBreach2);
////        protokol_view.pickerCopy_Date.setDate(dateCopy_Date1);
////        protokol_view.pickerMail_Date.setDate(dateMail_Date1);
////        protokol_view.jComboBoxSubject.setModel(new DefaultComboBoxModel(itemssubj));
////        protokol_view.jComboBoxSubject.setSelectedItem(protokol.getSubject_Key());
////        protokol_view.jTextFieldNasPunkt.setText(protokol.getCity());
////        protokol_view.jTextFieldRayon.setText(protokol.getRayon_Key());
////        protokol_view.jTextFieldStreet.setText(protokol.getStreet());
////        protokol_view.jTextFieldHouse.setText(protokol.getHouse());
////        protokol_view.jTextFieldBreach.setText(protokol.getBreache());
////        protokol_view.jTextFieldItem_Nomer.setText(protokol.getItem_Nomer());
////        protokol_view.jTextFieldItem_Part.setText(protokol.getItem_Part());
////        protokol_view.jTextFieldDocuments.setText(protokol.getDocuments());
////        protokol_view.jTextFieldNotice.setText(protokol.getNotice());
////
////        if (protokol.getInCourt().equals("1")) {
////            protokol_view.jCheckBoxCourt.setSelected(true);
////        }
////        else{
////            protokol_view.jCheckBoxCourt.setSelected(false);
////        }
////    }
//
//    public void mouseClicked(MouseEvent e) {
////            if (e.getClickCount() == 1) { // счетчик нажатий ЛКМ //нинужна //и'наче
//        if (lsm.isSelectionEmpty()) { // если выбор пуст
//            System.out.println("none"); // курлы
//        } else { //иначе
//            int minIndex = lsm.getMinSelectionIndex(); //макс индекс
//            int maxIndex = lsm.getMaxSelectionIndex(); //мин индекс
//            for (int i = minIndex; i <= maxIndex; i++) { //условие индекса
//                if( lsm.isSelectedIndex(i)) { //если выбрано что-то
////                            System.out.println("index " + i); //курлы
//                    try {
////                                buildView4Protokol(dataBaseHelper.getProtokols().get(i));
//
//                        solution.buildView4Protokol(myTableModelProtokol.beans.get(i));
//
//                    } catch (SQLException e1) {
//                        e1.printStackTrace();
//                    }
//                }
//            }
//        }
////            }
//
//    }
//
//    public void mousePressed(MouseEvent e) {
//
//    }
//
//    public void mouseReleased(MouseEvent e) {
//
//    }
//
//    public void mouseEntered(MouseEvent e) {
//
//    }
//
//    public void mouseExited(MouseEvent e) {
//
//    }
//}