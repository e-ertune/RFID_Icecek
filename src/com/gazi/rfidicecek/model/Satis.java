
package com.gazi.rfidicecek.model;


public class Satis {
   
    private int id, kullaniciid, urunid, adet;
    private double tutar;
    
    public void SetId(int _id){
        this.id= _id;
    }
    public void SetKullaniciId(int _kullaniciid){
        this.kullaniciid= _kullaniciid;
    }
    public void SetUrunId(int _urunid){
        this.urunid= _urunid;
    }
    public void SetAdet(int _adet){
        this.adet= _adet;
    }
    public void SetTutar(double _tutar){
        this.tutar= _tutar;
    }
    public int getId(){
        return this.id;
    }
    public int getKullaniciId(){
        return this.kullaniciid;
    }
    public int getUrunId(){
        return this.urunid;
    }
    public int getAdet(){
        return this.adet;
    }
    public double getTutar(){
        return this.tutar;
    }
}
