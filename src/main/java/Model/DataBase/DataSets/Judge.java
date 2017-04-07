package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Judge implements Serializable {

    private String Key;
    private String Name;
    private String Dolgnost;
    private String F;
    private String I;
    private String O;
    private String Notice;

    public Judge(String key, String name, String dolgnost, String f, String i, String o, String notice) {
        Key = key;
        Name = name;
        Dolgnost = dolgnost;
        F = f;
        I = i;
        O = o;
        Notice = notice;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDolgnost() {
        return Dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        Dolgnost = dolgnost;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }

    public String getI() {
        return I;
    }

    public void setI(String i) {
        I = i;
    }

    public String getO() {
        return O;
    }

    public void setO(String o) {
        O = o;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
