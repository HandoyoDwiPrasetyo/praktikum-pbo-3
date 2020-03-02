package com.kuliah;

public class Main {

    public static void main(String[] args) {
        //Persegi
        Persegi persegi = new Persegi(10);
        System.out.println("\n == Persegi");
        System.out.println("Luas : " + persegi.luas());
        System.out.println("Keliling : " + persegi.keliling());

        //Lingkaran
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("\n == Lingkaran");
        System.out.println("Luas : " + lingkaran.luas());
        System.out.println("Keliling : " + lingkaran.keliling());

        //Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(8,6);
        System.out.println("\n == Persegi Panjang");
        System.out.println("Luas : " + persegiPanjang.luas());
        System.out.println("Keliling : " + persegiPanjang.keliling());

        //Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(8);
        System.out.println("\n == Segitiga");
        System.out.println("Luas : " + segitiga.luas());
        System.out.println("Keliling : " + segitiga.keliling());

        //Kubus
        Kubus kubus = new Kubus(persegi.getSisi());
        System.out.println("\n == Kubus");
        System.out.println("Volume : " + kubus.volume());

        //Balok
        Balok balok = new Balok(persegiPanjang.getPanjang(),persegiPanjang.getLebar());
        balok.setTinggi(10);
        System.out.println("\n == Balok");
        System.out.println("Volume : " + balok.volume());

        //Silinder
        Silinder silinder = new Silinder(lingkaran.getR());
        silinder.setTinggi(5);
        System.out.println("\n == Silinder");
        System.out.println("Volume : " + silinder.volume());
    }
}
