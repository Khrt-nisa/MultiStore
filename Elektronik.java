/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

/**
 *
 * @author Nisa
 */
public class Elektronik extends Produk { // Membuat class Elektronik yang merupakan turunan dari class Produk
    private int garansi; // Menyimpan lama garansi (dalam bulan)

    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi, int garansi) { // Konstruktor untuk mengisi data saat objek Elektronik dibuat
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class induk (Produk)
        this.garansi = garansi;  // Menyimpan nilai garansi ke atribut garansi
    }

    public int getGaransi() { // Method untuk mengambil nilai garansi
        return garansi; // Mengembalikan nilai garansi
    }

    public void setGaransi(int garansi) { // Method untuk mengubah nilai garansi
        this.garansi = garansi; // Menyimpan nilai garansi
    }

    @Override
    public void tampilkanDetailProduk() { // Menampilkan Detail Produk
        super.tampilkanDetailProduk(); // Menampilkan detail dari class induk
        System.out.println("Garansi: " + garansi + " bulan"); // Menampilkan informasi garansi khusus produk elektronik
    }
}
