package com.gazi.rfidicecek.db.bl;

import com.gazi.rfidicecek.db.conn.ConnectionProvider;
import com.gazi.rfidicecek.model.Kullanici;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KullaniciIslem {

    static Connection conn;
    static PreparedStatement ps;

    public boolean KullaniciKayit(Kullanici k) {
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("INSERT INTO \"tblkullanici\"( \"adsoyad\", \"rfid\") VALUES (?, ?);");
            ps.setString(1, k.getAdSoyad());
            ps.setString(2, k.getRfid());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }

    public boolean KullaniciSil(String rfid) {
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("DELETE FROM \"tblkullanici\" WHERE \"rfid\" = ? ");
            ps.setString(1, rfid);
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }

    public boolean RfidKayitliMi(String rfid) {
        boolean kayitliMi = false;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("SELECT * FROM \"tblkullanici\" WHERE \"rfid\" = ? ");
            ps.setString(1, rfid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kayitliMi = true;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return kayitliMi;
    }

    public Kullanici KullaniciGetir(String rfid) {
        Kullanici k = new Kullanici();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("SELECT * FROM \"tblkullanici\" WHERE \"rfid\" = ? ");
            ps.setString(1, rfid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                k.setId(rs.getInt(1));
                k.setAdSoyad(rs.getString(2));
                k.setBakiye(rs.getFloat(3));
                k.setRfid(rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return k;
    }

    public String RfidOku() {
        String command = "sudo python3 /home/pi/Documents/RFID/IcecekAlmaSistemi/rfid-read.py";
        Process proc = null;
        String rfid = "";
        try {
            proc = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                rfid = line;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            proc.waitFor();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return rfid;
    }

    public boolean ParaYukle(String rfid, float tl) {
        double bakiye = 0;
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("SELECT * from \"tblkullanici\" WHERE \"rfid\" = ?");
            ps.setString(1, rfid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bakiye = rs.getDouble(3);
            } else {
                return false;
            }

            bakiye += tl;
            PreparedStatement ps2 = conn.prepareStatement("UPDATE \"tblkullanici\" set \"bakiye\"=? WHERE \"rfid\" = ? ");
            ps2.setDouble(1, bakiye);
            ps2.setString(2, rfid);
            sonuc = ps2.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc > 0;
    }

    public List<Kullanici> KullaniciList() {
        List<Kullanici> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("select * from \"tblkullanici\" ;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Kullanici k = new Kullanici();
                k.setId(rs.getInt(1));
                k.setAdSoyad(rs.getString(2));
                k.setBakiye(rs.getFloat(3));
                k.setRfid(rs.getString(4));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
