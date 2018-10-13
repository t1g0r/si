package com.tigorworks.hitungbangunruang;

public class PrismaSegitiga {
    private Segitiga segitiga;
    private int TinggiPrisma;

    public PrismaSegitiga(){
        segitiga = new Segitiga();
    }

    public int getTinggiPrisma() {
        return TinggiPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        TinggiPrisma = tinggiPrisma;
    }

    public Segitiga getSegitiga() {
        return segitiga;
    }

    public void setSegitiga(Segitiga segitiga) {
        this.segitiga = segitiga;
    }

    public double HitungVolume(){
        return segitiga.HitungLuas() * getTinggiPrisma();
    }
}
