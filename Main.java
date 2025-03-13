/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk;

import java.util.ArrayList;
/**
 *
 * @author Nisa
 */

/**
 * Kelas utama untuk menjalankan program MultiStore.
 * Program ini dapat menyimpan dan menampilkan banyak produk.
 */
public class Main {
    public static void main(String[] args) {
        // Membuat daftar produk
        ArrayList<Produk> daftarProduk = new ArrayList<>();

        // Membuat dan menambahkan produk pertama
        Produk produk1 = new Produk(); // Membuat objek produk pertama
        produk1.setNamaProduk("Laptop ASUS ROG"); // Mengatur nama produk
        produk1.setHarga(15000000); // Mengatur harga produk
        produk1.setStok(10); // Mengatur jumlah stok produk
        produk1.setKategori("Elektronik"); // Mengatur kategori produk
        produk1.setDeskripsi("Laptop gaming dengan spesifikasi tinggi."); // Mengatur deskripsi produk
        daftarProduk.add(produk1); // Menambahkan produk ke dalam daftar

        // Membuat dan menambahkan produk kedua
        Produk produk2 = new Produk(); // Membuat objek produk kedua
        produk2.setNamaProduk("iPhone 14 Pro"); // Mengatur nama produk
        produk2.setHarga(20000000); // Mengatur harga produk
        produk2.setStok(5); // Mengatur jumlah stok produk
        produk2.setKategori("Smartphone"); // Mengatur kategori produk
        produk2.setDeskripsi("Smartphone flagship dengan kamera canggih."); // Mengatur deskripsi produk
        daftarProduk.add(produk2); // Menambahkan produk ke dalam daftar

        // Membuat dan menambahkan produk ketiga
        Produk produk3 = new Produk(); // Membuat objek produk ketiga
        produk3.setNamaProduk("Headset Logitech G733"); // Mengatur nama produk
        produk3.setHarga(2500000); // Mengatur harga produk
        produk3.setStok(15); // Mengatur jumlah stok produk
        produk3.setKategori("Aksesoris Gaming"); // Mengatur kategori produk
        produk3.setDeskripsi("Headset wireless dengan kualitas suara premium."); // Mengatur deskripsi produk
        daftarProduk.add(produk3); // Menambahkan produk ke dalam daftar

        // Menampilkan semua produk dalam daftar
        System.out.println("===== Daftar Produk MultiStore ====="); // Header daftar produk
        for (Produk produk : daftarProduk) { // Loop untuk menampilkan setiap produk dalam daftar
            produk.tampilkanDetailProduk(); // Memanggil metode untuk menampilkan detail produk
        }
    }
}


