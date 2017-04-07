package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Otdel implements Serializable {

    private String Key;
    private String Name;
    private String Notice;

    public Otdel(String key, String name, String notice) {
        Key = key;
        Name = name;
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

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
