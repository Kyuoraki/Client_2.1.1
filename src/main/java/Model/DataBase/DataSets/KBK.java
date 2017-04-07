package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by BUHARIN on 02.09.2016.
 */
public class KBK implements Serializable {

    private String Key;
    private String Kod;
    private String Name;

    public KBK(String Key, String Kod, String Name) {
        this.setKey(Key);
        this.setKod(Kod);
        this.setName(Name);
    }

    public void setKey(String key) {
        this.Key = key;
    }

    public String getKey() {
        return Key;
    }

    public void setKod(String kod) {
        this.Kod = kod;
    }

    public String getKod() {
        return Kod;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}