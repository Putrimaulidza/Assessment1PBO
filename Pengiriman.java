package Nomor1.java;

    public class Pengiriman {
        private int Nomortransaksi;
        private String Namapenjual;
        private String Alamatpenjual;
        private String Namapembeli;
        private String Alamatpembeli;
        private double Ongkoskirim;
        private String Namaekspedisi;
        private String Nomorresi;
        private boolean Statusasuransi;
        private boolean Statusdropshipper;
        private double Nominalasuransi;

        Pengiriman(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapenjual, String Alamatpenjual, String Namapembeli, String Alamatpembeli, boolean Statusdropshipper, boolean Statusasuransi, int Nominalasuransi) {
            this.Nomortransaksi = Nomortransaksi;
            this.Nomorresi = Nomorresi;
            this.Namaekspedisi = Namaekspedisi;
            this.Ongkoskirim = Ongkoskirim;
            this.Namapenjual = Namapenjual;
            this.Alamatpenjual = Alamatpenjual;
            this.Namapembeli = Namapembeli;
            this.Alamatpembeli = Alamatpembeli;
            this.Statusdropshipper = Statusdropshipper;
            this.Statusasuransi = Statusasuransi;
            this.Nominalasuransi = Nominalasuransi;
            print(this.Statusasuransi, this.Statusdropshipper);
        }
        Pengiriman(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapenjual, String Alamatpenjual, String Namapembeli, String Alamatpembeli, boolean Statusasuransi, int Nominalasuransi) {
            this.Nomortransaksi = Nomortransaksi;
            this.Nomorresi = Nomorresi;
            this.Namaekspedisi = Namaekspedisi;
            if (Ongkoskirim > 20000) {
                Ongkoskirim = Ongkoskirim - 5000;
            }
            this.Ongkoskirim = Ongkoskirim;
            this.Namapenjual = Namapenjual;
            this.Alamatpenjual = Alamatpenjual;
            this.Namapembeli = Namapembeli;
            this.Alamatpembeli = Alamatpembeli;
            this.Statusasuransi = Statusasuransi;
            this.Nominalasuransi = Nominalasuransi;
            print(this.Statusasuransi, this.Statusdropshipper);
        }
        Pengiriman(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapenjual, String Alamatpenjual, String Namapembeli, String Alamatpembeli) {
            this.Nomortransaksi = Nomortransaksi;
            this.Nomorresi = Nomorresi;
            this.Namaekspedisi = Namaekspedisi;
            this.Ongkoskirim = Ongkoskirim;
            this.Namapenjual = Namapenjual;
            this.Alamatpenjual = Alamatpenjual;
            this.Namapembeli = Namapembeli;
            this.Alamatpembeli = Alamatpembeli;
            print(this.Statusasuransi, this.Statusdropshipper);
        }
        Pengiriman(int Nomortransaksi, String Nomorresi, String Namaekspedisi, double Ongkoskirim, String Namapenjual, String Alamatpenjual, String Namapembeli, String Alamatpembeli, boolean Statusdropshipper) {
            this.Nomortransaksi = Nomortransaksi;
            this.Nomorresi = Nomorresi;
            this.Namaekspedisi = Namaekspedisi;
            this.Ongkoskirim = Ongkoskirim;
            this.Namapenjual = Namapenjual;
            this.Alamatpenjual = Alamatpenjual;
            this.Namapembeli = Namapembeli;
            this.Alamatpembeli = Alamatpembeli;
            this.Statusdropshipper = Statusdropshipper;
            print(this.Statusasuransi, this.Statusdropshipper);
        }
        public void print(boolean Statusasuransi, boolean Statusdropshipper) {
            if (Statusasuransi == true && Statusdropshipper == true) {
                System.out.println("\nAsuransi dan Dropship");
                System.out.println("\nNo Transaksi :" + this.Nomortransaksi + "\nNo Resi : " + this.Nomorresi + "\nNama Ekspedisi : " + this.Namaekspedisi + "\nOngkos Kirim : " + this.Ongkoskirim + "\nNama Penjual : " + this.Namapenjual + "\nAlamat Penjual : " + this.Alamatpenjual + "\nNama Pembeli : " + this.Namapembeli + "\nAlamat Pembeli : " + this.Alamatpembeli + "\nNominal Asuransi : " + this.Nominalasuransi);
            } else if (Statusasuransi == true) {
                System.out.println("\nAsuransi");
                System.out.println("\nNo Transaksi : " + this.Nomortransaksi + "\nNo Resi : " + this.Nomorresi + "\nNama Ekspedisi : " + this.Namaekspedisi + "\nOngkos Kirim : " + this.Ongkoskirim + "\nNama Penjual : " + this.Namapenjual + "\nAlamat Penjual : " + this.Alamatpenjual + "\nNama Pembeli : " + this.Namapembeli + "\nAlamat Pembeli : " + this.Alamatpembeli + "\nNominal Asuransi : " + this.Nominalasuransi);
            } else if (Statusdropshipper == true) {
                System.out.println("\nDropship");
                System.out.println("\nNo Transaksi : " + this.Nomortransaksi + "\nNo Resi : " + this.Nomorresi + "\nNama Ekspedisi : " + this.Namaekspedisi + "\nOngkos Kirim : " + this.Ongkoskirim + "\nNama Penjual : " + this.Namapenjual + "\nAlamat Penjual : " + this.Alamatpenjual + "\nNama Pembeli : " + this.Namapembeli + "\nAlamat Pembeli : " + this.Alamatpembeli);
            } else {
                System.out.println("\nNormal");
                System.out.println("\nNo Transaksi : " + this.Nomortransaksi + "\nNo Resi : " + this.Nomorresi + "\nNama Ekspedisi : " + this.Namaekspedisi + "\nOngkos Kirim : " + this.Ongkoskirim + "\nNama Penjual : " + this.Namapenjual + "\nAlamat Penjual : " + this.Alamatpenjual + "\nNama Pembeli : " + this.Namapembeli + "\nAlamat Pembeli : " + this.Alamatpembeli);
            }
        }
    }