/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

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
    
    //menambahkan konstruktor
    public Produk(String namaProduk, double harga, int stok, String kategori, String deskripsi) { // konstruktor yang menginisialisasi objek 
        this.namaProduk = namaProduk; // mengatur nilai atribut namaProduk
        this.harga = harga; // mengatur nama atribut harga
        this.stok = stok; // mengatur nama atribut stok
        this.kategori = kategori; // mengatur nama atribut kategori
        this.deskripsi = deskripsi; // mengatur nama atribut deskripsi
    }

  // Konstruktor overloading dengan parameter nama dan harga
    public Produk(String namaProduk, double harga) { // konstruktor yang menginisialisasi objek
        this.namaProduk = namaProduk; // mengatur nilai namaProduk
        this.harga = harga; // mengatur nama atribut harga
        this.stok = 0; // mengatur Stok = 0
        this.kategori = "Tidak Diketahui"; // mengatur kategori = tidak diketahui
        this.deskripsi = "Tidak ada deskripsi"; // mengatur tidak ada deskripsi
    }

    // Konstruktor overloading tanpa parameter (default)
    public Produk() {
        this.namaProduk = "Produk Default"; // nama produk diatur ke produk default
        this.harga = 0; //harga diatur ke 0
        this.stok = 0; //stok diatur ke 0
        this.kategori = "Tidak Diketahui"; //kategori diatur tidak diketahui
        this.deskripsi = "Tidak ada deskripsi"; //deskripsi diatur tidak diketahui
    }   
    
    // Metode untuk mengatur nama produk
    public void setNamaProduk(String nama) {
        namaProduk = nama; // Menyimpan nilai nama ke atribut namaProduk
    }

    // Metode untuk mendapatkan nama produk
    public String getNamaProduk() {
        return namaProduk; // Mengembalikan nilai namaProduk
    }

    // Metode untuk mendapatkan mengatur harga produk
    public void setHarga(double harga) {
        this.harga = harga; // Menyimpan nilai harga ke atribut harga
    }

    // Metode untuk mendapatkan harga produk
    public double getHarga() {
        return harga; // Mengembalikan nilai harga
    }

  // Metode untuk mengatur stok produk  
    public void setStok(int stok) {
        this.stok = stok; // Menyimpan nilai stok ke atribut stok
    }

    // Metode untuk mendapatkan stok produk
    public int getStok() {
        return stok; // Mengembalikan nilai stok
    }

     // Metode untuk mengatur kategori produk
    public void setKategori(String kategori) {
        this.kategori = kategori; // Menyimpan nilai kategori ke atribut kategori
    }

    // Metode untuk mendapatkan kategori produk
    public String getKategori() {
        return kategori; // Mengembalikan nilai kategori
    }

    // Metode untuk mengatur deskripsi produk
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi; // Menyimpan nilai deskripsi ke atribut deskripsi
    }

    // Metode untuk mendapatkan deskripsi produk
    public String getDeskripsi() {
        return deskripsi; // Menyimpan nilai deskripsi ke atribut deskripsi
    }

    // Menampilkan detail produk
    public void tampilkanDetailProduk() {
        System.out.println("Nama Produk: " + namaProduk); // menampilkan nama produk
        System.out.printf("Harga: Rp%,.0f%n", harga); // menampilkan harga produk
        System.out.println("Stok: " + stok + " unit"); // menampilkan stok produk
        System.out.println("Kategori: " + kategori); // menampilkan kategori produk
        System.out.println("Deskripsi: " + deskripsi); // menampilkan deskripsi produk
    }
}
