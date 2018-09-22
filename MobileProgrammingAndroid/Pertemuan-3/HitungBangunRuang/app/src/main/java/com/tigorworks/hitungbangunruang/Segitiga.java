package com.tigorworks.hitungbangunruang;

public class Segitiga {
    private int alas;
    private int tinggi;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double HitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double HitungKeliling(){
        return alas + tinggi;
    }
}
