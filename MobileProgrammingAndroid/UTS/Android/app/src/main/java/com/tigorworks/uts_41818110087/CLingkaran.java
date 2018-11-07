package com.tigorworks.uts_41818110087;

public class CLingkaran {
    private float r;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double HitungLuasLingkaran(){
        return Math.PI * (getR() * getR());
    }

    public double HitungKelilingLingkaran(){
        return 2 * (Math.PI * getR());
    }
}
