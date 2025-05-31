/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab9;

/**
 *
 * @author Nisa
 */
public abstract class Produk implements DeskripsiProduk { // Kelas abstrak Produk yang mengimplementasikan interface DeskripsiProduk

    protected String nama; // Nama produk, dapat diakses oleh subclass
    protected double harga; // Harga produk
    protected int stok; // Jumlah stok produk
    protected String kategori; // Kategori produk
    protected String deskripsi; // Deskripsi produk

    public Produk(String nama, double harga, int stok, String kategori, String deskripsi) {
        this.nama = nama; // Inisialisasi nama produk
        this.harga = harga; // Inisialisasi harga produk
        this.stok = stok; // Inisialisasi stok produk
        this.kategori = kategori; // Inisialisasi kategori produk
        this.deskripsi = deskripsi; // Inisialisasi deskripsi produk
    }

    public String getNama() {
        return nama;
    } // Getter nama produk

    public double getHarga() {
        return harga;
    } // Getter harga produk

    public int getStok() {
        return stok;
    } // Getter stok produk

    public String getKategori() {
        return kategori;
    } // Getter kategori produk

    public String getDeskripsi() {
        return deskripsi;
    } // Getter deskripsi produk

    @Override
    public String getInfoProduk() { // Implementasi method dari interface DeskripsiProduk
        return "Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok + ", Kategori: " + kategori + ", Deskripsi: " + deskripsi; // Format lengkap info produk
    }
}