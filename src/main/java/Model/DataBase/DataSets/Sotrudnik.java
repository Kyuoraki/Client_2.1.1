package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Sotrudnik implements Serializable {

    private String Key;
    private String Name;
    private String Dolgnost;
    private String Filial_Key;
    private String Otdel_Key;
    private String F;
    private String I;
    private String O;
    private String Judge;
    private String Notice;

    public Sotrudnik(String key, String name, String dolgnost, String filial_Key, String otdel_Key, String f, String i, String o, String judge, String notice) {
        Key = key;
        Name = name;
        Dolgnost = dolgnost;
        Filial_Key = filial_Key;
        Otdel_Key = otdel_Key;
        F = f;
        I = i;
        O = o;
        Judge = judge;
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

    public String getFilial_Key() {
        return Filial_Key;
    }

    public void setFilial_Key(String filial_Key) {
        Filial_Key = filial_Key;
    }

    public String getOtdel_Key() {
        return Otdel_Key;
    }

    public void setOtdel_Key(String otdel_Key) {
        Otdel_Key = otdel_Key;
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

    public String getJudge() {
        return Judge;
    }

    public void setJudge(String judge) {
        Judge = judge;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
