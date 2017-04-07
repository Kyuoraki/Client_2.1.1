package Model.DataBase.DataSets;

import java.io.Serializable;

/**
 * Created by Андрей on 14.09.2016.
 */
public class Postanovlenie implements Serializable {

    private String Key;
    private String Protokol_Key;
    private String Nomer;
    private String Date;
    private String Court_Key;
    private String Judge_Key;
    private String Subject_Key;
    private String Sotrudnik_Key;
    private String Item_Nomer;
    private String Item_Part;
    private String Solution_Key;
    private String Penalty;
    private String PenaltyMROT;
    private String Notice;
    private String Date_Pay;
    private String InCourt;
    private String Warning;
    private String Kvit;
    private String KBK_Key;
    private String OKATO_Key;

    public Postanovlenie(String key, String protokol_Key, String nomer, String date, String court_Key, String judge_Key, String subject_Key, String sotrudnik_Key, String item_Nomer, String item_Part, String solution_Key, String penalty, String penaltyMROT, String notice, String date_Pay, String inCourt, String warning, String kvit, String KBK_Key, String OKATO_Key) {
        Key = key;
        Protokol_Key = protokol_Key;
        Nomer = nomer;
        Date = date;
        Court_Key = court_Key;
        Judge_Key = judge_Key;
        Subject_Key = subject_Key;
        Sotrudnik_Key = sotrudnik_Key;
        Item_Nomer = item_Nomer;
        Item_Part = item_Part;
        Solution_Key = solution_Key;
        Penalty = penalty;
        PenaltyMROT = penaltyMROT;
        Notice = notice;
        Date_Pay = date_Pay;
        InCourt = inCourt;
        Warning = warning;
        Kvit = kvit;
        this.KBK_Key = KBK_Key;
        this.OKATO_Key = OKATO_Key;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getProtokol_Key() {
        return Protokol_Key;
    }

    public void setProtokol_Key(String protokol_Key) {
        Protokol_Key = protokol_Key;
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

    public String getCourt_Key() {
        return Court_Key;
    }

    public void setCourt_Key(String court_Key) {
        Court_Key = court_Key;
    }

    public String getJudge_Key() {
        return Judge_Key;
    }

    public void setJudge_Key(String judge_Key) {
        Judge_Key = judge_Key;
    }

    public String getSubject_Key() {
        return Subject_Key;
    }

    public void setSubject_Key(String subject_Key) {
        Subject_Key = subject_Key;
    }

    public String getSotrudnik_Key() {
        return Sotrudnik_Key;
    }

    public void setSotrudnik_Key(String sotrudnik_Key) {
        Sotrudnik_Key = sotrudnik_Key;
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

    public String getSolution_Key() {
        return Solution_Key;
    }

    public void setSolution_Key(String solution_Key) {
        Solution_Key = solution_Key;
    }

    public String getPenalty() {
        return Penalty;
    }

    public void setPenalty(String penalty) {
        Penalty = penalty;
    }

    public String getPenaltyMROT() {
        return PenaltyMROT;
    }

    public void setPenaltyMROT(String penaltyMROT) {
        PenaltyMROT = penaltyMROT;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

    public String getDate_Pay() {
        return Date_Pay;
    }

    public void setDate_Pay(String date_Pay) {
        Date_Pay = date_Pay;
    }

    public String getInCourt() {
        return InCourt;
    }

    public void setInCourt(String inCourt) {
        InCourt = inCourt;
    }

    public String getWarning() {
        return Warning;
    }

    public void setWarning(String warning) {
        Warning = warning;
    }

    public String getKvit() {
        return Kvit;
    }

    public void setKvit(String kvit) {
        Kvit = kvit;
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
}
