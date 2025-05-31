/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab8;

import ProjectRumah.Bab7.*;

/**
 *
 * @author Nisa
 */
public class Elektronik extends Produk { // Class Elektronik turunan dari Produk

    private int garansi; // Buat nyimpen masa garansi
    private int daya; // Buat nyimpen konsumsi daya

    // Konstruktor
    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi) {
        super(nama, harga, stok, kategori, deskripsi); // Panggil konstruktor dari class Produk
        this.garansi = garansi; // Inisialisasi garansi (tapi belum dapet nilai, ini harus dibenerin)
        this.daya = daya; // Inisialisasi daya (juga belum dapet nilai)
    }

    // Getter yang udah diimplementasiin
    public int getGaransi() { // Buat ngambil nilai garansi
        return garansi;
    }

    public int getDaya() { // Buat ngambil nilai daya
        return daya;
    }

    // Metode buat nampilin info produk
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Garansi: " + garansi + " bulan, Daya: " + daya + " watt"; // Gabung info dari Produk sama garansi & daya
    }
}

