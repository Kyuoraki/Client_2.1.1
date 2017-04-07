package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Oplata implements Serializable {

    private String Key;
    private String Nomer;
    private String KBK_Key;
    private String OKATO_Key;
    private String Date;
    private String Summa;
    private String Subject_Key;
    private String Postanovlenie_Key;

    public Oplata(String key, String nomer, String KBK_Key, String OKATO_Key, String date, String summa, String subject_Key, String postanovlenie_Key) {
        Key = key;
        Nomer = nomer;
        this.KBK_Key = KBK_Key;
        this.OKATO_Key = OKATO_Key;
        Date = date;
        Summa = summa;
        Subject_Key = subject_Key;
        Postanovlenie_Key = postanovlenie_Key;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getNomer() {
        return Nomer;
    }

    public void setNomer(String nomer) {
        Nomer = nomer;
    }

    public String getKBK_Key() {
        return KBK_Key;
    }

    public void setKBK_Key(String KBK_Key) {
        this.KBK_Key = KBK_Key;
    }

    public String getOKATO_Key() {
        return OKATO_Key;
    }

    public void setOKATO_Key(String OKATO_Key) {
        this.OKATO_Key = OKATO_Key;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSumma() {
        return Summa;
    }

    public void setSumma(String summa) {
        Summa = summa;
    }

    public String getSubject_Key() {
        return Subject_Key;
    }

    public void setSubject_Key(String subject_Key) {
        Subject_Key = subject_Key;
    }

    public String getPostanovlenie_Key() {
        return Postanovlenie_Key;
    }

    public void setPostanovlenie_Key(String postanovlenie_Key) {
        Postanovlenie_Key = postanovlenie_Key;
    }
}
