package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 14.04.2017.
 */
public class Sotrudnik_View extends JPanel {
//    public JComboBox jComboBox = new JComboBox();
    JLabel jLabelName;
    JLabel jLabelDolgnost;
    JLabel jLabelFilial;
    JLabel jLabelOtdel;
    JLabel jLabel_F;
    JLabel jLabel_I;
    JLabel jLabel_O;
    JLabel jLabelNotice;
    public JTextField jTextFieldName;
    public JTextField jTextFieldDolgnost;
    public JTextField jTextFieldFilial;
    public JTextField jTextFieldOtdel;
    public JTextField jTextField_F;
    public JTextField jTextField_I;
    public JTextField jTextField_O;
    public JTextField jTextField_Notice;
    public Sotrudnik_View(){
        this.setLayout(new GridLayout(15, 1,0,0));
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jPanel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jLabelName = new JLabel("Псевдоним");
        jLabelDolgnost = new JLabel("Должность");
        jLabelFilial = new JLabel("Филиал");
        jLabelOtdel = new JLabel("Отдел");
        jLabel_F = new JLabel("Фамилия");
        jLabel_I = new JLabel("Имя");
        jLabel_O = new JLabel("Отчество");
        jLabelNotice = new JLabel(" Примечание");
        jTextFieldName = new JTextField();
        jTextFieldDolgnost = new JTextField();
        jTextFieldFilial = new JTextField();
        jTextFieldOtdel = new JTextField();
        jTextField_F = new JTextField();
        jTextField_I = new JTextField();
        jTextField_O = new JTextField();
        jTextField_Notice = new JTextField();
        jTextFieldName.setPreferredSize(new Dimension(350,20));
        jTextFieldDolgnost.setPreferredSize(new Dimension(350,20));
        jTextFieldFilial.setPreferredSize(new Dimension(350,20));
        jTextFieldOtdel.setPreferredSize(new Dimension(350,20));
        jTextField_F.setPreferredSize(new Dimension(350,20));
        jTextField_I.setPreferredSize(new Dimension(350,20));
        jTextField_O.setPreferredSize(new Dimension(350,20));
        jTextField_Notice.setPreferredSize(new Dimension(350,20));

        jPanel.add(jLabelName);
        jPanel.add(jTextFieldName);
        jPanel1.add(jLabelDolgnost);
        jPanel1.add(jTextFieldDolgnost);
        jPanel2.add(jLabelFilial);
        jPanel2.add(jTextFieldFilial);
        jPanel3.add(jLabelOtdel);
        jPanel3.add(jTextFieldOtdel);
        jPanel4.add(jLabel_F);
        jPanel4.add(jTextField_F);
        jPanel5.add(jLabel_I);
        jPanel5.add(jTextField_I);
        jPanel6.add(jLabel_O);
        jPanel6.add(jTextField_O);
        jPanel7.add(jLabelNotice);
        jPanel7.add(jTextField_Notice);

        this.add(jPanel);
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);
        this.add(jPanel4);
        this.add(jPanel5);
        this.add(jPanel6);
        this.add(jPanel7);
        this.setVisible(true);
    }
}
