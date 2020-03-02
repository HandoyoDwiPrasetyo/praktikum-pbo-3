package com.kuliah;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Balok(double panjangBalok, double lebarBalok){
        super(panjangBalok, lebarBalok);
    }


    public double volume() {
        return (getPanjang()*getLebar()*tinggi);
    }
}
