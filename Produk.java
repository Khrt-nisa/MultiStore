/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab8;

import ProjectRumah.Bab7.*;

/**
 *
 * @author Nisa
 */
public class Produk { // Kelas induk buat nyimpen data umum semua jenis produk

    protected String namaProduk; // Nama dari produk
    protected double harga; // Harga dari produk
    protected int stok; // Jumlah stok produk
    protected String kategori; // Kategori produk (misalnya: Elektronik, Pakaian)
    protected String deskripsi; // Penjelasan singkat soal produk

    public Produk(String nama, double harga, int stok, String kategori, String deskripsi) {
        this.namaProduk = nama; // Inisialisasi nama produk
        this.harga = harga; // Inisialisasi harga produk
        this.stok = stok; // Inisialisasi stok produk
        this.kategori = kategori; // Inisialisasi kategori produk
        this.deskripsi = deskripsi; // Inisialisasi deskripsi produk
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
        return "Nama: " + namaProduk
                + // Menampilkan nama produk
                ", Harga: " + harga
                + // Menampilkan harga produk
                ", Stok: " + stok
                + // Menampilkan stok produk
                ", Kategori: " + kategori
                + // Menampilkan kategori produk
                ", Deskripsi: " + deskripsi; // Menampilkan deskripsi produk
    }
}