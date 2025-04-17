/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab5;

import ProjectRumah.Bab4.*;

/**
 *
 * @author Nisa
 */
public class Pakaian extends Produk { // Membuat class Pakaian yang mewarisi (extends) class Produk

    private String ukuran; // Menyimpan ukuran pakaian
    private String warna;  // Menyimpan warna pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran, String warna) { // Konstruktor lengkap: dipanggil saat membuat objek pakaian dengan semua data lengkap
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class Produk
        this.ukuran = ukuran; // Menyimpan ukuran dari parameter ke variabel ukuran
        this.warna = warna;   // Menyimpan warna dari parameter ke variabel warna
    }

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran) { // Konstruktor overloading
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class Produk
        this.ukuran = ukuran; // Menyimpan ukuran dari parameter
        this.warna = "Tidak diketahui"; // Mengatur warna default jika tidak diberikan
    }

    public String getUkuran() { // Getter untuk mengambil ukuran pakaian
        return ukuran; // Menyimpan nilai ukuran
    }

    public void setUkuran(String ukuran) { // Setter untuk mengubah ukuran pakaian
        this.ukuran = ukuran; // Menyimpan nilai warna
    }

    public String getWarna() { // Getter untuk mengambil warna pakaian
        return warna; // Mengembalikan nilai warna
    }

    public void setWarna(String warna) { // Setter untuk mengubah warna pakaian
        this.warna = warna; // menyimpan nilai warna
    }

    // Method overriding: menambahkan informasi ukuran dan warna ke info produk
    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() + // Ambil info dasar dari class Produk
               "\nUkuran: " + ukuran + "cm" + // Tambahkan ukuran pakaian
               "\nWarna: " + warna; // Tambahkan warna pakaian
    }
}


