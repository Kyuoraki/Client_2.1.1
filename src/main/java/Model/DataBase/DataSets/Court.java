package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Court implements Serializable{

    private String Key;
    private String Name;
    private String Rayon_Key;
    private String City;
    private String Street;
    private String House;
    private String Notice;

    public Court(String key, String name, String rayon_Key, String city, String street, String house, String notice) {
        Key = key;
        Name = name;
        Rayon_Key = rayon_Key;
        City = city;
        Street = street;
        House = house;
        Notice = notice;
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

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
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

    public String getRayon_Key() {
        return Rayon_Key;
    }

    public void setRayon_Key(String rayon_Key) {
        Rayon_Key = rayon_Key;
    }
}

