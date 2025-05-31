/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab6;

import ProjectRumah.Bab5.*;
import ProjectRumah.Bab4.*; // Mengimpor semua class dari package Bab4
/**
 *
 * @author Nisa
 */
public class Produk { // atribut kelas untuk menyimpan produk
    private String namaProduk; // nama produk
    double harga; // harga produk
    int stok; // stok produk
    private String kategori; // kategori produk
    private String deskripsi; // deskripsi produk
    
    public Produk(String nama, double harga, int stok, String kategori, String deskripsi) { // Konstruktor untuk mengatur data awal produk saat dibuat
        this.namaProduk = nama; // Mengisi nama produk
        this.harga = harga; // Mengisi harga produk
        this.stok = stok; // Mengisi stok produk
        this.kategori = kategori; // Mengisi kategori produk
        this.deskripsi = deskripsi; // Mengisi deskripsi produk
    }
    
    public String getNama() { // Getter untuk mengambil nilai namaProduk dari luar class
        return namaProduk; // Mengembalikan nilai namaProduk
    }

    public void setNama(String nama) { // Setter untuk mengubah nilai namaProduk dari luar class
        this.namaProduk = nama; // Mengatur namaProduk jadi nilai yang baru
    }

    public double getHarga() { // Getter untuk mengambil nilai harga
        return harga; // Mengembalikan nilai harga
    }

    public void setHarga(double harga) { // Setter untuk mengubah nilai harga
        this.harga = harga; // Mengatur harga dengan nilai baru
    }

    public int getStok() { // Getter untuk mengambil nilai stok
        return stok; // Mengembalikan nilai stok
    }

    public void setStok(int stok) { // Setter untuk mengubah nilai stok
        this.stok = stok; // Mengatur stok dengan nilai baru
    }

    public String getKategori() { // Getter untuk mengambil nilai kategori
        return kategori; // Mengembalikan nilai kategori
    }

    public void setKategori(String kategori) { // Setter untuk mengubah nilai kategori
        this.kategori = kategori; // Mengatur kategori dengan nilai baru
    }

    public String getDeskripsi() { // Getter untuk mengambil nilai deskripsi
        return deskripsi; // Mengembalikan nilai deskripsi
    }

    public void setDeskripsi(String deskripsi) { // Setter untuk mengubah nilai deskripsi
        this.deskripsi = deskripsi; // Mengatur deskripsi dengan nilai baru
    }

    public String getInfoProduk() { // Method untuk menampilkan semua info produk dalam format teks
        return "Nama: " + namaProduk + // Menampilkan nama produk
               ", Harga: " + harga + // Menampilkan harga produk
               ", Stok: " + stok + // Menampilkan stok produk
               ", Kategori: " + kategori + // Menampilkan kategori produk
               ", Deskripsi: " + deskripsi; // Menampilkan deskripsi produk
    }
}
