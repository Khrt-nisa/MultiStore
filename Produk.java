/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab4;

import ProjectRumah.Bab3.*;
/**
 *
 * @author Nisa
 */
public class Produk { // atribut kelas untuk menyimpan produk
    private String namaProduk; // nama produk
    private double harga; // harga produk
    private int stok; // stok produk
    private String kategori; // kategori produk
    private String deskripsi; // deskripsi produk
    
    public Produk(String nama, double harga, int stok, String kategori, String deskripsi) { // Konstruktor: digunakan saat membuat objek baru dari class Produk
        this.namaProduk = nama; // Menyimpan nama produk
        this.harga = harga; // Menyimpan harga produk
        this.stok = stok; // Menyimpan stok produk
        this.kategori = kategori; // Menyimpan kategori produk
        this.deskripsi = deskripsi; // Menyimpan deskripsi produk
    }

    // Getter & Setter : untuk mengakses dan mengubah data dari luar class
    public String getNama() { // Mengambil nama produk
        return namaProduk; // Mengembalikan nilai namaProduk
    }

    public void setNama(String nama) { // Mengubah nama produk
        this.namaProduk = nama; // Mengisi namaProduk dengan nilai baru dari parameter
    }

    public double getHarga() { // Mengambil harga produk
        return harga; // Mengembalikan nilai harga
    }

    public void setHarga(double harga) { // Mengubah harga produk
        this.harga = harga; // Mengisi harga dengan nilai baru dari parameter
    }

    public int getStok() { // Mengambil jumlah stok produk
        return stok; // Mengembalikan nilai stok
    }

    public void setStok(int stok) { // Mengubah jumlah stok produk
        this.stok = stok; // Mengisi stok dengan nilai baru dari parameter
    }

    public String getKategori() { // Mengambil kategori produk
        return kategori; // Mengembalikan nilai kategori
    }

    public void setKategori(String kategori) { // Mengubah kategori produk
        this.kategori = kategori; // Mengisi kategori dengan nilai baru dari parameter
    }

    public String getDeskripsi() { // Mengambil deskripsi produk
        return deskripsi; // Mengembalikan nilai deskripsi
    }

    public void setDeskripsi(String deskripsi) { // Mengubah deskripsi produk
        this.deskripsi = deskripsi; // Mengisi deskripsi dengan nilai baru dari parameter
    }

    public String getInfoProduk() { // Method untuk menampilkan semua informasi produk dalam bentuk teks
        return "Nama: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok + ", Kategori: " + kategori + ", Deskripsi: " + deskripsi; //ditampilkan di tampilan seperti TextArea
    }
}
