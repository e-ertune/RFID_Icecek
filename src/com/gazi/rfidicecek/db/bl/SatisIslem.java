package com.gazi.rfidicecek.db.bl;

import com.gazi.rfidicecek.db.conn.ConnectionProvider;
import com.gazi.rfidicecek.model.Satis;
import com.gazi.rfidicecek.model.TableModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SatisIslem {

    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;

    public boolean SatisYap(Satis s, double bakiye) {
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("INSERT INTO \"tblsatis\"( \"kullaniciid\", \"urunid\", \"tutar\", \"adet\" ) VALUES (?, ?, ?, ?);");
            ps.setInt(1, s.getKullaniciId());
            ps.setInt(2, s.getUrunId());
            ps.setDouble(3, s.getTutar());
            ps.setInt(4, s.getAdet());
            sonuc = ps.executeUpdate();
            PreparedStatement ps1 = conn.prepareStatement("Update \"tblkullanici\" set \"bakiye\" = ? from \"tblsatis\" where \"tblkullanici\".\"id\" = \"tblsatis\".\"kullaniciid\" ;");
            bakiye -= s.getTutar();
            ps1.setDouble(1, bakiye);
            sonuc += ps1.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 1;
    }
    
    public List<TableModel> SatisList(String bas, String son, String ad){
        List<TableModel> list = new ArrayList<>();
        Date basTarih = Date.valueOf(bas);
        Date sonTarih = Date.valueOf(son);
        if (ad.equals("Tümü")) {
            ad = "%";
        }
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("SELECT \"tblkullanici\".adsoyad, \"tblurun\".ad as urun, \"tblsatis\".adet, \"tblsatis\".tutar, \"tblsatis\".tarih "
                    + "from \"tblsatis\" inner join \"tblkullanici\" on \"tblsatis\".kullaniciid = \"tblkullanici\".id inner join "
                    + "\"tblurun\" on \"tblsatis\".urunid = \"tblurun\".id "
                    + "where \"tblsatis\".tarih <= ? and \"tblsatis\".tarih >= ? and \"tblkullanici\".adsoyad like ?; ");
            ps.setDate(1, sonTarih);
            ps.setDate(2, basTarih);
            ps.setString(3, ad);
            rs = ps.executeQuery();
            while (rs.next()) {                
                TableModel tm = new TableModel();
                tm.setAdSoyad(rs.getString(1));
                tm.setUrun(rs.getString(2));
                tm.setAdet(rs.getInt(3));
                tm.setTutar(rs.getFloat(4));
                tm.setTarih(rs.getTimestamp(5).toString());
                list.add(tm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
