/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab7;

/**
 *
 * @author Nisa
 */
public class Pakaian extends Produk { // Class Pakaian turunan dari Produk

    private String ukuran; // Menyimpan ukuran pakaian
    private String warna; // Menyimpan warna pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran) {
        super(nama, harga, stok, "Pakaian", deskripsi); // Panggil konstruktor Produk dengan kategori "Pakaian"
        this.ukuran = ukuran; // Inisialisasi ukuran
        this.warna = warna; 
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Ukuran: " + ukuran + ", Warna: " + warna; // Tambahkan info ukuran dan warna
    }

    public String getUkuran() {
        return ukuran; // Getter ukuran
    }

    public String getWarna() {
        return warna; // Getter warna
    }
}




