/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab4;

import ProjectRumah.Bab3.*; // Mengimpor semua class dari package ProjectRumah.Bab3

/**
 *
 * @author Nisa
 */

public class Elektronik extends Produk { // Membuat class Elektronik yang merupakan turunan dari class Produk
    private int garansi; // Variabel untuk menyimpan lama garansi dalam bulan
    private int daya; // Variabel untuk menyimpan daya listrik produk dalam watt

    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi,int garansi) { // Konstruktor Elektronik dengan parameter nama, harga, stok, kategori, deskripsi, dan garansi
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor class induk (Produk)
        this.garansi = garansi; // Mengisi nilai garansi
    }

    public int getGaransi() { return garansi; } // Method untuk mengambil nilai garansi
    public void setGaransi(int garansi) { this.garansi = garansi; } // Method untuk mengubah nilai garansi

    public int getDaya() { return daya; } // Method untuk mengambil nilai daya
    public void setDaya(int daya) { this.daya = daya; } // Method untuk mengubah nilai daya

    public String getInfoProduk() { // Method untuk menampilkan informasi lengkap produk elektronik
        return super.getInfoProduk() + "\nGaransi: " + garansi + " bulan" + "\nDaya: " + daya + " watt"; // Menambahkan info garansi dan daya ke info produk dari class induk
    }
}


