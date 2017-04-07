package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by BUHARIN on 31.03.2017.
 */
public class Protokol_Filter_View extends JPanel {
    public JTextField jTextFieldNomer;
    public JTextField jTextFieldSotrudnik;
    public JButton jButtonInstall;

    public Protokol_Filter_View() {

        jTextFieldNomer = new JTextField();
        jTextFieldSotrudnik = new JTextField();
        jButtonInstall = new JButton("Установить");
        jTextFieldNomer.setPreferredSize(new Dimension(100,20));
        jTextFieldSotrudnik.setPreferredSize(new Dimension(100,20));

        this.add(new JLabel("Номер"));
        this.add(jTextFieldNomer);
        this.add(new JLabel("Сотрудник"));
        this.add(jTextFieldSotrudnik);
        this.add(jButtonInstall);
    }
}
