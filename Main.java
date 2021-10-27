package Nomor1.java;

public class Main {

    public static void main(String[] args) {
        Pengiriman barang1 = new Pengiriman(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        Pengiriman barang2 = new Pengiriman(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        Pengiriman barang3 = new Pengiriman(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");

        Pengiriman barang4 = new Pengiriman(4, "N0002", "siCepat", 24000, "Dropship2", "Pontianak", "Joko", "DayeuhKolot", true);
    }
}