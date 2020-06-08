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
public class Kullanici {

    private int id;
    private String adSoyad, rfid;
    private float bakiye;

    public void setRfid(String _rfid) {
        this.rfid = _rfid;
    }

    public void setBakiye(float _bakiye) {
        this.bakiye = _bakiye;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public int getId() {
        return this.id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getRfid() {
        return this.rfid;
    }

    public float getBakiye() {
        return this.bakiye;
    }
}
