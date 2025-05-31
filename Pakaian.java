/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab9;

/**
 *
 * @author Nisa
 */
public class Pakaian extends Produk implements DeskripsiProduk { // Class Pakaian turunan Produk dan implementasi interface DeskripsiProduk

    private String ukuran; // Atribut ukuran pakaian
    private String warna;// Atribut warna pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran, String warna) {
        super(nama, harga, stok, kategori, deskripsi); // Panggil konstruktor superclass Produk
        this.ukuran = ukuran;// Inisialisasi ukuran pakaian
        this.warna = warna; // Inisialisasi warna pakaian
    }

    @Override
    public String getInfoProduk() { // Override method dari interface DeskripsiProduk
        return super.getInfoProduk() + ", Ukuran: " + ukuran + ", Warna: " + warna; // Tambahkan info ukuran dan warna
    }

    public String getUkuran() {
        return ukuran;
    } // Getter ukuran pakaian

    public String getWarna() {
        return warna;
    } // Getter warna pakaian
}