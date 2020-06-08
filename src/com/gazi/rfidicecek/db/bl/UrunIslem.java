/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.rfidicecek.db.bl;

import com.gazi.rfidicecek.db.conn.ConnectionProvider;
import com.gazi.rfidicecek.model.Urun;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emin
 */
public class UrunIslem {
    static Connection conn;
    static PreparedStatement ps;
    
    public boolean UrunKayit(Urun u){
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("INSERT INTO \"tblurun\"( \"ad\", \"fiyat\") VALUES (?, ?);");
            ps.setString(1, u.getAd());
            ps.setFloat(2, u.getFiyat());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }
    
    public boolean AyniUrundenVarMi(String urunAdi){
        boolean ozelMi = false;
        try {
            conn = ConnectionProvider.getConn();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"tblurun\" ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Urun u = new Urun();
                u.setAd(rs.getString("ad"));
                if (urunAdi.equals(u.getAd())) {
                    ozelMi = true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ozelMi;
    }
    
    public boolean UrunSil(String urunAdi){
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("DELETE FROM \"tblurun\" WHERE \"ad\" = ? ");
            ps.setString(1, urunAdi);
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }
    
    public List<Urun> UrunListele(){
        List<Urun> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("SELECT * FROM \"tblurun\" ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Urun u = new Urun();
                u.setId(rs.getInt(1));
                u.setAd(rs.getString(2));
                u.setFiyat((rs.getFloat(3)));
                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public Urun UrunGetir(String urunAdi){
        Urun u = null;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("\"SELECT * FROM \"tblurun\" WHERE \"ad\" = ? ");
            ps.setString(1, urunAdi);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Urun();
                u.setAd(rs.getString(1));
                u.setFiyat((rs.getFloat(3)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return u;
    }
}
