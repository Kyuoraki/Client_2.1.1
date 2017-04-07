package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Rayon implements Serializable {

    private String Key;
    private String Filial_Key;
    private String Name;
    private String Notice;

    public Rayon(String key, String filial_Key, String name, String notice) {
        Key = key;
        Filial_Key = filial_Key;
        Name = name;
        Notice = notice;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getFilial_Key() {
        return Filial_Key;
    }

    public void setFilial_Key(String filial_Key) {
        Filial_Key = filial_Key;
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
