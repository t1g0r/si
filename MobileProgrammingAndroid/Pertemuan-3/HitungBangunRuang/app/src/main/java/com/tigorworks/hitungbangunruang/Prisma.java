package com.tigorworks.hitungbangunruang;

public class Prisma {
    private int Alas;
    private int TinggiSegitiga;
    private int TinggiPrisma;

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int alas) {
        Alas = alas;
    }

    public int getTinggiSegitiga() {
        return TinggiSegitiga;
    }

    public void setTinggiSegitiga(int tinggiSegitiga) {
        TinggiSegitiga = tinggiSegitiga;
    }

    public int getTinggiPrisma() {
        return TinggiPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        TinggiPrisma = tinggiPrisma;
    }


    public double HitungVolume(){
        return (0.5 * Alas * TinggiSegitiga) * TinggiPrisma;
    }
}
