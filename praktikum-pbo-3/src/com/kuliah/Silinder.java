package com.kuliah;

public class Silinder extends Lingkaran {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Silinder(double rSilinder){
        super(rSilinder);
    }
    public double volume(){
        return (Math.PI*Math.pow(getR(),2)*tinggi);
    }
}
