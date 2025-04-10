/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

/**
 *
 * @author Nisa
 */
public class Pakaian extends Produk{ // Membuat class Pakaian yang merupakan turunan dari class Produk
    private String ukuran; // Variabel untuk menyimpan ukuran pakaian

    public Pakaian(String nama, double harga, int stok, String kategori, String deskripsi, String ukuran) { // Konstruktor untuk mengisi data saat objek Pakaian dibuat
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor class induk (Produk) untuk mengisi data umum produk
        this.ukuran = ukuran; // Mengisi data ukuran khusus untuk pakaian
    }

    public String getUkuran() { // Method untuk mengambil nilai ukuran
        return ukuran; // Mengembalikan nilai ukuran
    }

    public void setUkuran(String ukuran) { // Method untuk mengubah nilai ukuran
        this.ukuran = ukuran; // Variabel class (atribut) ukuran
    }

    @Override // Override method dari class Produk untuk menampilkan detail produk
    public void tampilkanDetailProduk() { // Menampilkan detail produk
        super.tampilkanDetailProduk(); // Menampilkan detail dari class induk
        System.out.println("Ukuran: " + ukuran); // Menampilkan ukuran khusus untuk pakaian
    }
}
