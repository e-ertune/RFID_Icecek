
package com.gazi.rfidicecek.model;

public class Yonetici {
    private int id;
    private String kullaniciAdi, sifre;
    
    public void setKullaniciAd(String kAd){
        this.kullaniciAdi = kAd;
    }
    public void setSifre(String _sifre){
        this.sifre = _sifre;
    }
    public void setId(int _id){
        this.id = _id;
    }
    public int getId(){
        return this.id;
    }
    public String getKullaniciAd(){
        return this.kullaniciAdi;
    }
    public String getSifre(){
        return this.sifre;
    }
}
