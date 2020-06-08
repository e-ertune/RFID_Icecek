
package com.gazi.rfidicecek.db.bl;

import com.gazi.rfidicecek.db.conn.ConnectionProvider;
import com.gazi.rfidicecek.model.Yonetici;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class YoneticiIslem {
    static Connection conn;
    static PreparedStatement ps;
    
    public boolean YoneticiKayit(Yonetici y){
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("INSERT INTO \"tblyonetici\"( \"kullaniciadi\", \"sifre\") VALUES (?, ?);");
            ps.setString(1, y.getKullaniciAd());
            ps.setString(2, y.getSifre());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }
    
    public boolean YoneticiVarMi(){
        boolean varMi = false;
        try {
            conn = ConnectionProvider.getConn();
            PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM \"tblyonetici\"; ");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                varMi = true;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return varMi;
    }
    
    public boolean GirisDogruMu(Yonetici _y){
        boolean dogruMu = false;
        Yonetici y = null;
        try {
            conn = ConnectionProvider.getConn();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"tblyonetici\" WHERE \"kullaniciadi\" = ? AND \"sifre\" = ? ; ");
            ps.setString(1, _y.getKullaniciAd());
            ps.setString(2, _y.getSifre());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dogruMu = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dogruMu;
    }
    
    public boolean KullaniciAdiOzelMi(String kAdi){
        boolean ozelMi = false;
        try {
            conn = ConnectionProvider.getConn();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM \"tblyonetici\" ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Yonetici y = new Yonetici();
                y.setKullaniciAd(rs.getString(2));
                if (kAdi.equals(y.getKullaniciAd())) {
                    ozelMi = true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ozelMi;
    }
}
