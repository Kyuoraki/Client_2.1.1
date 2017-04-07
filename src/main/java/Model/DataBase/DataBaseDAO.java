package Model.DataBase;

import Model.DataBase.DataSets.*;
import Model.MyTableModels.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseDAO {
    private Statement stat;
    private static DataBaseDAO dataBaseHelper;
    private DataBaseDAO(){
        try {
            Class.forName("org.postgresql.Driver"); //не подходит для мавена
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1");
            stat = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static DataBaseDAO getInstance(){
        if(dataBaseHelper == null){
            dataBaseHelper = new DataBaseDAO();
        }
        return dataBaseHelper;
    }
    public List<Protokol> getProtokols() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Protokol");
            rs = stat.executeQuery("SELECT t1.\"Key\", t1.\"Nomer\", t1.\"Date\", t2.\"Name\" as \"Rayon_Key\", t1.\"City\", t1.\"Street\", t1.\"House\", t3.\"Name\" as \"Sotrudnik_Key\"," +
                    " t4.\"Name\" as \"Subject_Key\", t1.\"Breach_Date\", t1.\"Breache\", t1.\"Item_Nomer\", t1.\"Item_Part\", t1.\"Copy_Date\", t1.\"Mail_Date\", t1.\"Notice\"," +
                    " t1.\"InCourt\", t5.\"Kod\" as \"KBK_Key\", t6.\"Kod\" as \"OKATO_Key\", t1.\"IsPlan\", t1.\"Documents\" FROM public.\"OKATO\" as t6 Right JOIN (public.\"KBK\" as t5 Right JOIN" +
                    " (public.\"Subject\" as t4 Right JOIN (public.\"Sotrudnik\" as t3 Right JOIN (public.\"Rayon\" as t2 Right JOIN public.\"Protokol\" as t1 ON t2.\"Key\" = t1.\"Rayon_Key\") \n" +
                    "ON t3.\"Key\" = t1.\"Sotrudnik_Key\") ON t4.\"Key\" = t1.\"Subject_Key\") ON t5.\"Key\" = t1.\"KBK_Key\") ON t6.\"Key\" = t1.\"OKATO_Key\";");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Protokol> protokols = new ArrayList<Protokol>();
        try {
            while (rs.next()) {
                try {
                    protokols.add(new Protokol(rs.getString("Key") , rs.getString("Nomer"),  rs.getString("Date"), rs.getString("Rayon_Key")
                            , rs.getString("City"), rs.getString("Street"), rs.getString("House"), rs.getString("Sotrudnik_Key")
                            , rs.getString("Subject_Key"), rs.getString("Breach_Date"), rs.getString("Breache"), rs.getString("Item_Nomer")
                            , rs.getString("Item_Part"), rs.getString("Copy_Date"), rs.getString("Mail_Date"), rs.getString("Notice")
                            , rs.getString("InCourt"), rs.getString("KBK_Key"), rs.getString("OKATO_Key"), rs.getString("IsPlan")
                            , rs.getString("Documents")));}
                catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
            rs.close();

        return protokols;
    }
    public List<Postanovlenie> getPostanovlenie() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Postanovlenie");
            rs = stat.executeQuery("SELECT t1.\"Key\", t2.\"Nomer\" as \"Protokol_Key\", t1.\"Nomer\", t1.\"Date\", t3.\"Name\" as \"Court_Key\", t4.\"Name\" as \"Judge_Key\", t5.\"Name\" as \"Subject_Key\"," +
                    " t4_1.\"Name\" as \"Sotrudnik_Key\", t1.\"Item_Nomer\", t1.\"Item_Part\", t6.\"Name\" as \"Solution_Key\", t1.\"Penalty\", t1.\"PenaltyMROT\", t1.\"Notice\", t1.\"Date_Pay\"," +
                    " t1.\"InCourt\", t1.\"Warning\", t1.\"Kvit\", t7.\"Kod\" as \"KBK_Key\", t8.\"Kod\" as \"OKATO_Key\" " +
                    "FROM public.\"OKATO\" t8 Right JOIN (public.\"KBK\" t7 Right JOIN (public.\"Solutions\" t6 Right JOIN (public.\"Sotrudnik\" AS t4_1 Right JOIN (public.\"Subject\" t5 " +
                    "Right JOIN (public.\"Sotrudnik\" t4 Right JOIN (public.\"Court\" t3 Right JOIN (public.\"Protokol\" t2 Right JOIN public.\"Postanovlenie\" t1 ON t2.\"Key\" = t1.\"Protokol_Key\") " +
                    "ON t3.\"Key\" = t1.\"Court_Key\") ON t4.\"Key\" = t1.\"Judge_Key\") ON t5.\"Key\" = t1.\"Subject_Key\") ON t4_1.\"Key\" = t1.\"Sotrudnik_Key\") ON t6.\"Key\" = t1.\"Solution_Key\")" +
                    " ON t7.\"Key\" = t1.\"KBK_Key\") ON t8.\"Key\" = t1.\"OKATO_Key\";\n");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Postanovlenie> postanovlenies = new ArrayList<Postanovlenie>();
        try {
            while (rs.next()) {
                try {
                    postanovlenies.add(new Postanovlenie(rs.getString("Key") , rs.getString("Protokol_Key"),  rs.getString("Nomer"), rs.getString("Date")
                            , rs.getString("Court_Key"), rs.getString("Judge_Key"), rs.getString("Subject_Key"), rs.getString("Sotrudnik_Key")
                            , rs.getString("Item_Nomer"), rs.getString("Item_Part"), rs.getString("Solution_Key"), rs.getString("Penalty"), rs.getString("PenaltyMROT")
                            , rs.getString("Notice"), rs.getString("Date_Pay"), rs.getString("InCourt"), rs.getString("Warning")
                            , rs.getString("Kvit"), rs.getString("KBK_Key"), rs.getString("OKATO_Key")));

                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}

            rs.close();

        return postanovlenies;
    }
    public List<Sotrudnik> getSotrudnik() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Sotrudnik");
            rs = stat.executeQuery("SELECT t3.\"Key\", t3.\"Name\", t3.\"Dolgnost\", t2.\"Name\" as \"Filial_Key\" , t1.\"Name\" as \"Otdel_Key\", t3.\"F\", t3.\"I\", " +
                    "t3.\"O\", t3.\"Judge\", t3.\"Notice\" FROM public.\"Otdel\" t1 INNER JOIN (public.\"Filial\" t2 " +
                    "INNER JOIN public.\"Sotrudnik\" t3 ON t2.\"Key\" = t3.\"Filial_Key\") ON t1.\"Key\" = t3.\"Otdel_Key\" WHERE (((t3.\"Judge\"::integer)=0));");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Sotrudnik> sotrudniks = new ArrayList<Sotrudnik>();
        try {
            while (rs.next()) {
                try {
                    sotrudniks.add(new Sotrudnik(rs.getString("Key"), rs.getString("Name"),
                            rs.getString("Dolgnost"), rs.getString("Filial_Key"),
                            rs.getString("Otdel_Key"), rs.getString("F"), rs.getString("I"),
                            rs.getString("O"), rs.getString("Judge"), rs.getString("Notice")));
                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();
        return sotrudniks;
    }
    public List<Oplata> getOplata() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Oplata");
            rs = stat.executeQuery("SELECT t1.\"Key\", t1.\"Nomer\", t1.\"Date\", t1.\"Summa\", t5.\"Nomer\" as \"Postanovlenie_Key\", t2.\"Kod\" as \"KBK_Key\", t3.\"Kod\" as \"OKATO_Key\", t4.\"Name\" as \"Subject_Key\"\n" +
                    "FROM public.\"Postanovlenie\" t5 RIGHT JOIN (public.\"Subject\" t4 RIGHT JOIN (public.\"OKATO\" t3 RIGHT JOIN (public.\"KBK\" t2 RIGHT JOIN public.\"Oplata\" t1 \n" +
                    "ON t2.\"Key\" = t1.\"KBK_Key\") ON t3.\"Key\" = t1.\"OKATO_Key\") ON t4.\"Key\" = t1.\"Subject_Key\") ON t5.\"Key\" = t1.\"Postanovlenie_Key\";");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Oplata> Oplatas = new ArrayList<Oplata>();
        try {
            while (rs.next()) {
                try {
                    Oplatas.add(new Oplata(rs.getString("Key") , rs.getString("Nomer"),  rs.getString("KBK_Key"), rs.getString("OKATO_Key")
                            , rs.getString("Date"), rs.getString("Summa"), rs.getString("Subject_Key"), rs.getString("Postanovlenie_Key")));

                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();

        return Oplatas;
    }
    public List<KBK> getKBK() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("KBK");
            rs = stat.executeQuery("SELECT * FROM \"public\".\"KBK\";");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<KBK> KBKs = new ArrayList<KBK>();
        try {
            while (rs.next()) {
                try {
                    KBKs.add(new KBK(rs.getString("Key"), rs.getString("Kod"), rs.getString("Name")));
                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();

        return KBKs;
    }
    public List<Judge> getJudge() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Judge");

            rs = stat.executeQuery("SELECT t3.\"Key\", t3.\"Name\", t3.\"Dolgnost\", t2.\"Name\" as \"Filial_Key\", t1.\"Name\" as \"Otdel_Key\", t3.\"F\", t3.\"I\", t3.\"O\", t3.\"Judge\", t3.\"Notice\"\n" +
                    "FROM public.\"Otdel\" t1 INNER JOIN (public.\"Filial\" t2 INNER JOIN public.\"Sotrudnik\" t3 ON t2.\"Key\" = t3.\"Filial_Key\") ON t1.\"Key\" = t3.\"Otdel_Key\"\n" +
                    "WHERE (((t3.\"Judge\"::integer)=1));");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Judge> Judges = new ArrayList<Judge>();
        try {
            while (rs.next()) {
                try {
                    Judges.add(new Judge(rs.getString("Key"), rs.getString("Name"),
                            rs.getString("Dolgnost"), rs.getString("F"), rs.getString("I"),
                            rs.getString("O"), rs.getString("Notice")));
                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();

        return Judges;
    }
    public List<Subject> getSubject() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Subject");
            rs = stat.executeQuery("SELECT t1.\"Key\", t1.\"Human\", t1.\"Predpr\", t1.\"F\", t1.\"I\", t1.\"O\", t1.\"Name\", t1.\"Dolgnost\", t2.\"Name\" as \"Rayon_Key_1\", t1.\"City_1\", t1.\"Street_1\", t1.\"House_1\", t1.\"Kv_1\", t1.\"Phone_1\", \"Rayon_1\".\"Name\" as \"Rayon_Key_2\", t1.\"City_2\", t1.\"Street_2\", t1.\"House_2\", t1.\"Kv_2\", t1.\"Phone_2\", t1.\"Notice\"" +
                    "FROM (public.\"Subject\" t1 INNER JOIN public.\"Rayon\" t2 ON t1.\"Rayon_Key_1\" = t2.\"Key\") " +
                    "INNER JOIN public.\"Rayon\" AS \"Rayon_1\" ON t1.\"Rayon_Key_2\" = \"Rayon_1\".\"Key\";");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Subject> Subjects = new ArrayList<Subject>();
        try {
            while (rs.next()) {
                try {
                    Subjects.add(new Subject(rs.getString("Key") , rs.getString("Human"),  rs.getString("Predpr"), rs.getString("F")
                            , rs.getString("I"), rs.getString("O"), rs.getString("Name"), rs.getString("Dolgnost")
                            , rs.getString("Rayon_Key_1"), rs.getString("City_1"), rs.getString("Street_1"), rs.getString("House_1"), rs.getString("KV_1")
                            , rs.getString("Phone_1"), rs.getString("Rayon_Key_2"), rs.getString("City_2"), rs.getString("Street_2")
                            , rs.getString("House_2"), rs.getString("KV_2"), rs.getString("Phone_2"), rs.getString("Notice")));

                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();

        return Subjects;
    }
    public List<Court> getCourt() throws SQLException {
        ResultSet rs = stat.getResultSet();
        try {
            System.out.println("Court");
            rs = stat.executeQuery(" select t1.\"Key\", t1.\"Name\", t1.\"City\", t1.\"Street\", t1.\"House\", t1.\"Notice\", coalesce(t2.\"Name\") \"Rayon_Key\"\n" +
                    "from public.\"Court\" t1 left join public.\"Rayon\" t2 on t1.\"Rayon_Key\" = t2.\"Key\"");
        } catch (SQLException e) {e.printStackTrace();}
        ArrayList<Court> Courts = new ArrayList<Court>();
        try {
            while (rs.next()) {
                try {
                    Courts.add(new Court(rs.getString("Key") , rs.getString("Name"), rs.getString("Rayon_Key"), rs.getString("City")
                            , rs.getString("Street"), rs.getString("House"), rs.getString("Notice")));

                } catch (SQLException e) {e.printStackTrace();}
            }
        } catch (SQLException e) {e.printStackTrace();}
        rs.close();

        return Courts;
    }
}
