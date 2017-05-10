package Model.DataBase.DataSets;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Андрей on 08.09.2016.
 */
public class Protokol implements Serializable {

        private String Key;
        private String Nomer;
        private String Date;
        private String Rayon_Key;
        private String City;
        private String Street;
        private String House;
        private String Sotrudnik_Key;
        private String Subject_Key;
        private String Breach_Date;
        private String Breache;
        private String Item_Nomer;
        private String Item_Part;
        private String Documents;
        private String Copy_Date;
        private String Mail_Date;
        private String Notice;
        private String InCourt;
        private String KBK_Key;
        private String OKATO_Key;
        private String IsPlan;

    public Protokol(String key, String nomer, String date, String rayon_Key, String city, String street, String house, String sotrudnik_Key, String subject_Key, String breach_Date, String breache, String item_Nomer, String item_Part, String copy_Date, String mail_Date, String notice, String inCourt, String KBK_Key, String OKATO_Key, String isPlan, String documents) {
        Key = key;
        Nomer = nomer;
        Date = date;
        Rayon_Key = rayon_Key;
        City = city;
        Street = street;
        House = house;
        Sotrudnik_Key = sotrudnik_Key;
        Subject_Key = subject_Key;
        Breach_Date = breach_Date;
        Breache = breache;
        Item_Nomer = item_Nomer;
        Item_Part = item_Part;
        Copy_Date = copy_Date;
        Mail_Date = mail_Date;
        Notice = notice;
        InCourt = inCourt;
        this.KBK_Key = KBK_Key;
        this.OKATO_Key = OKATO_Key;
        IsPlan = isPlan;
        Documents = documents;
    }


    public String getDocuments() {
        return Documents;
    }

    public void setDocuments(String documents) {
        Documents = documents;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getRayon_Key() {
        return Rayon_Key;
    }

    public void setRayon_Key(String rayon_Key) {
        Rayon_Key = rayon_Key;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public String getSotrudnik_Key() {
        return Sotrudnik_Key;
    }

    public void setSotrudnik_Key(String sotrudnik_Key) {
        Sotrudnik_Key = sotrudnik_Key;
    }

    public String getSubject_Key() {
        return Subject_Key;
    }

    public void setSubject_Key(String subject_Key) {
        Subject_Key = subject_Key;
    }

    public String getBreach_Date() {
        return Breach_Date;
    }

    public void setBreach_Date(String breach_Date) {
        Breach_Date = breach_Date;
    }

    public String getBreache() {
        return Breache;
    }

    public void setBreache(String breache) {
        Breache = breache;
    }

    public String getItem_Nomer() {
        return Item_Nomer;
    }

    public void setItem_Nomer(String item_Nomer) {
        Item_Nomer = item_Nomer;
    }

    public String getItem_Part() {
        return Item_Part;
    }

    public void setItem_Part(String item_Part) {
        Item_Part = item_Part;
    }

    public String getCopy_Date() {
        return Copy_Date;
    }

    public void setCopy_Date(String copy_Date) {
        Copy_Date = copy_Date;
    }

    public String getMail_Date() {
        return Mail_Date;
    }

    public void setMail_Date(String mail_Date) {
        Mail_Date = mail_Date;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

    public String getInCourt() {
        return InCourt;
    }

    public void setInCourt(String inCourt) {
        InCourt = inCourt;
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

    public String getIsPlan() {
        return IsPlan;
    }

    public void setIsPlan(String isPlan) {
        IsPlan = isPlan;
    }
}

