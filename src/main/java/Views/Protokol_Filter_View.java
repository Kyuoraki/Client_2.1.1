package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by BUHARIN on 31.03.2017.
 */
public class Protokol_Filter_View extends JPanel {
    public JTextField jTextFieldNomer;
    public JTextField jTextFieldSotrudnik;
    public JTextField jTextFieldSubject;
    public JTextField jTextFieldRayon;
    public JTextField jTextFieldNas_Punkt;
    public JTextField jTextFieldStreet;
    public JTextField jTextFieldHouse;
    public JTextField jTextFieldItem_Nomer;
    public JTextField jTextFieldItem_Part;
    public JButton jButtonInstall;

    public Protokol_Filter_View() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        jTextFieldNomer = new JTextField();
        jTextFieldSotrudnik = new JTextField();
        jTextFieldSubject = new JTextField();
        jTextFieldRayon = new JTextField();
        jTextFieldNas_Punkt = new JTextField();
        jTextFieldStreet = new JTextField();
        jTextFieldHouse = new JTextField();
        jTextFieldItem_Nomer = new JTextField();
        jTextFieldItem_Part = new JTextField();
        jTextFieldNomer.setMaximumSize(new Dimension(100,20));
        jTextFieldSotrudnik.setMaximumSize(new Dimension(100,20));
        jTextFieldSubject.setMaximumSize(new Dimension(100,20));
        jTextFieldRayon.setMaximumSize(new Dimension(100,20));
        jTextFieldNas_Punkt.setMaximumSize(new Dimension(100,20));
        jTextFieldStreet.setMaximumSize(new Dimension(100,20));
        jTextFieldHouse.setMaximumSize(new Dimension(100,20));
        jTextFieldItem_Nomer.setMaximumSize(new Dimension(100,20));
        jTextFieldItem_Part.setMaximumSize(new Dimension(100,20));
        jButtonInstall = new JButton("Установить");


        this.add(new JLabel("Номер"));
        this.add(jTextFieldNomer);
        this.add(new JLabel("Сотрудник"));
        this.add(jTextFieldSotrudnik);
        this.add(new JLabel("Субъект"));
        this.add(jTextFieldSubject);
        this.add(new JLabel("Район"));
        this.add(jTextFieldRayon);
        this.add(new JLabel("Нас. Пункт"));
        this.add(jTextFieldNas_Punkt);
        this.add(new JLabel("Улица"));
        this.add(jTextFieldStreet);
        this.add(new JLabel("Дом"));
        this.add(jTextFieldHouse);
        this.add(new JLabel("Статья Номер"));
        this.add(jTextFieldItem_Nomer);
        this.add(new JLabel("Статья Часть"));
        this.add(jTextFieldItem_Part);
        this.add(jButtonInstall);
    }
}
