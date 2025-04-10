/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

/**
 *
 * @author Nisa
 */
public class MainProduk { // mendefinisikan kelas utama
    public static void main(String[] args) { // metode utama yang akan dieksekusi
        Produk produk1 = new Produk("Laptop ASUS ROG", 15000000, 10, "Elektronik", "Laptop gaming dengan spesifikasi tinggi."); // detail produk
        produk1.tampilkanDetailProduk(); // menampilkan detail produk
        System.out.println("==========="); // pemisah antar produk

        Produk produk2 = new Produk("iPhone 14 Pro", 20000000, 5, "Smartphone", "Smartphone flagship dengan kamera canggih."); // detail produk
        produk2.tampilkanDetailProduk(); // memampilkan detail produk
        System.out.println("==========="); // pemisah antar produk

        Produk produk3 = new Produk("Headset Logitech G733", 2500000, 15, "Aksesoris Gaming", "Headset wireless dengan kualitas suara premium.");// detail produk
        produk3.tampilkanDetailProduk(); // menampilkan detail produk
        System.out.println("==========="); // pemisah antar produk
    }
}
