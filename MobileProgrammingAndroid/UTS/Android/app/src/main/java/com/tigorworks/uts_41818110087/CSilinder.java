package com.tigorworks.uts_41818110087;

public class CSilinder {
    private float Tinggi;

    private CLingkaran Lingkaran;

    public CSilinder(){
        Lingkaran = new CLingkaran();
    }

    public float getTinggi() {
        return Tinggi;
    }

    public void setTinggi(float tinggi) {
        Tinggi = tinggi;
    }

    public CLingkaran getLingkaran() {
        return Lingkaran;
    }

    public void setLingkaran(CLingkaran lingkaran) {
        Lingkaran = lingkaran;
    }


    public double HitungVolumeSilinder(){
        return getLingkaran().HitungLuasLingkaran() * getTinggi();
    }
}
