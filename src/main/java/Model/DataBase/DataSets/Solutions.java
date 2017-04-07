package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Solutions implements Serializable {

    private String Key;
    private String Name;
    private String Postanovlenie;
    private String Notice;

    public Solutions(String key, String name, String postanovlenie, String notice) {
        Key = key;
        Name = name;
        Postanovlenie = postanovlenie;
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

    public String getPostanovlenie() {
        return Postanovlenie;
    }

    public void setPostanovlenie(String postanovlenie) {
        Postanovlenie = postanovlenie;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
