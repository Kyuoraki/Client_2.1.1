package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Subject implements Serializable {

    private String Key;
    private String Human;
    private String Predpr;
    private String F;
    private String I;
    private String O;
    private String Name;
    private String Dolgnost;
    private String Rayon_Key_1;
    private String City_1;
    private String Street_1;
    private String House_1;
    private String KV_1;
    private String Phone_1;
    private String Rayon_Key_2;
    private String City_2;
    private String Street_2;
    private String House_2;
    private String KV_2;
    private String Phone_2;
    private String Notice;

    public Subject(String key, String human, String predpr, String f, String i, String o, String name, String dolgnost, String rayon_Key_1, String city_1, String street_1, String house_1, String KV_1, String phone_1, String rayon_Key_2, String city_2, String street_2, String house_2, String KV_2, String phone_2, String notice) {
        Key = key;
        Human = human;
        Predpr = predpr;
        F = f;
        I = i;
        O = o;
        Name = name;
        Dolgnost = dolgnost;
        Rayon_Key_1 = rayon_Key_1;
        City_1 = city_1;
        Street_1 = street_1;
        House_1 = house_1;
        this.KV_1 = KV_1;
        Phone_1 = phone_1;
        Rayon_Key_2 = rayon_Key_2;
        City_2 = city_2;
        Street_2 = street_2;
        House_2 = house_2;
        this.KV_2 = KV_2;
        Phone_2 = phone_2;
        Notice = notice;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getHuman() {
        return Human;
    }

    public void setHuman(String human) {
        Human = human;
    }

    public String getPredpr() {
        return Predpr;
    }

    public void setPredpr(String predpr) {
        Predpr = predpr;
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

    public String getRayon_Key_1() {
        return Rayon_Key_1;
    }

    public void setRayon_Key_1(String rayon_Key_1) {
        Rayon_Key_1 = rayon_Key_1;
    }

    public String getCity_1() {
        return City_1;
    }

    public void setCity_1(String city_1) {
        City_1 = city_1;
    }

    public String getStreet_1() {
        return Street_1;
    }

    public void setStreet_1(String street_1) {
        Street_1 = street_1;
    }

    public String getHouse_1() {
        return House_1;
    }

    public void setHouse_1(String house_1) {
        House_1 = house_1;
    }

    public String getKV_1() {
        return KV_1;
    }

    public void setKV_1(String KV_1) {
        this.KV_1 = KV_1;
    }

    public String getPhone_1() {
        return Phone_1;
    }

    public void setPhone_1(String phone_1) {
        Phone_1 = phone_1;
    }

    public String getRayon_Key_2() {
        return Rayon_Key_2;
    }

    public void setRayon_Key_2(String rayon_Key_2) {
        Rayon_Key_2 = rayon_Key_2;
    }

    public String getCity_2() {
        return City_2;
    }

    public void setCity_2(String city_2) {
        City_2 = city_2;
    }

    public String getStreet_2() {
        return Street_2;
    }

    public void setStreet_2(String street_2) {
        Street_2 = street_2;
    }

    public String getHouse_2() {
        return House_2;
    }

    public void setHouse_2(String house_2) {
        House_2 = house_2;
    }

    public String getKV_2() {
        return KV_2;
    }

    public void setKV_2(String KV_2) {
        this.KV_2 = KV_2;
    }

    public String getPhone_2() {
        return Phone_2;
    }

    public void setPhone_2(String phone_2) {
        Phone_2 = phone_2;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
