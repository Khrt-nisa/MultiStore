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
public class Pakaian extends Produk{ // Membuat class Pakaian yang merupakan turunan dari class Produk
    private String ukuran; // Variabel untuk menyimpan ukuran pakaian
    private String bahan; // Variabel untuk menyimpan jenis bahan pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran) { // Konstruktor untuk mengisi nilai saat objek Pakaian dibuat
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class induk (Produk)
        this.ukuran = ukuran; // Menyimpan nilai ukuran ke variabel
        this.bahan = bahan; // Menyimpan nilai bahan ke variabel
    }

    public String getUkuran() { return ukuran; } // Getter untuk mengambil nilai ukuran
    public void setUkuran(String ukuran) { this.ukuran = ukuran; } // Setter untuk mengubah nilai ukuran

    public String getBahan() { return bahan; } // Getter untuk mengambil nilai bahan
    public void setBahan(String bahan) { this.bahan = bahan; } // Setter untuk mengubah nilai bahan

    public String getInfoProduk() { // Method untuk mengembalikan informasi lengkap produk pakaian
        return super.getInfoProduk() + "\nUkuran: " + ukuran + "\nBahan: " + bahan; // Menambahkan info ukuran dan bahan ke info produk umum
    }
}
