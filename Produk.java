/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk; // kelas ini dalam package 'produk'

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

    // Metode untuk mengatur nama produk
    public void setNamaProduk(String nama) {
        namaProduk = nama;
    }

    // Metode untuk mendapatkan nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Metode untuk mendapatkan mengatur harga produk
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk mendapatkan harga produk
    public double getHarga() {
        return harga;
    }

  // Metode untuk mengatur stok produk  
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Metode untuk mendapatkan stok produk
    public int getStok() {
        return stok;
    }

     // Metode untuk mengatur kategori produk
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Metode untuk mendapatkan kategori produk
    public String getKategori() {
        return kategori;
    }

    // Metode untuk mengatur deskripsi produk
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode untuk mendapatkan deskripsi produk
    public String getDeskripsi() {
        return deskripsi;
    }

    // Menampilkan detail produk
    public void tampilkanDetailProduk() {
        System.out.println("Nama Produk: " + namaProduk); // menampilkan nama produk
        System.out.println("Harga: Rp" + harga); // menampilkan harga produk
        System.out.println("Stok: " + stok + " unit"); // menampilkan stok produk
        System.out.println("Kategori: " + kategori); // menampilkan kategori produk
        System.out.println("Deskripsi: " + deskripsi); // menampilkan deskripsi produk
    }
}
