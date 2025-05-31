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
public class Pakaian extends Produk { // Class Pakaian turunan dari class Produk

    private String ukuran; // Atribut khusus buat menyimpan ukuran pakaian
    private String warna; // Atribut khusus buat menyimpan warna pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran) {
        super(nama, harga, stok, "Pakaian", deskripsi); // Panggil konstruktor class induk (Produk) dengan kategori langsung di-set ke "Pakaian"
        this.ukuran = ukuran; // Set nilai ukuran dari parameter
        this.warna = warna; // Set warna, tapi di sini belum ada nilai yang dikirim (harusnya ada parameter warna)
    }

    @Override
    public String getInfoProduk() { // Override method untuk nambahin info ukuran dan warna
        return super.getInfoProduk() + ", Ukuran: " + ukuran + ", Warna: " + warna; // Gabung info dari class induk sama tambahan dari class ini
    }

    public String getUkuran() { // Getter buat ambil nilai ukuran
        return ukuran;
    }

    public String getWarna() { // Getter buat ambil nilai warna
        return warna;
    }
    public void setWarna(String warna) { // Setter untuk mengatur nilai warna pakaian
    this.warna = warna;
}

}