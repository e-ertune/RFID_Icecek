/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.rfidicecek.model;

/**
 *
 * @author emin
 */
public class Urun {
    private int id;
    private String ad;
    private float fiyat;
    
    public void setId(int _id){
        this.id = _id;
    }
    public void setAd(String _ad){
        this.ad = _ad;
    }
    public void setFiyat(float _fiyat){
        this.fiyat = _fiyat;
    }
    public int getId(){
        return this.id;
    }
    public String getAd(){
        return this.ad;
    }
    public float getFiyat(){
        return this.fiyat;
    }
}
