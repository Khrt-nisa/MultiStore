/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab8;

/**
 *
 * @author Nisa
 */
import java.util.InputMismatchException; // Mengimpor class untuk menangani kesalahan input tipe data yang tidak sesuai
import java.util.Scanner; // Mengimpor class Scanner untuk menerima input dari pengguna melalui konsol

public class ProdukConsole {

    public static void main(String[] args) { // Metode utama sebagai titik awal program
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        try {
            System.out.print("Masukkan nama produk: "); // Meminta pengguna memasukkan nama produk
            String nama = input.nextLine(); // Membaca input nama produk sebagai String

            System.out.print("Masukkan harga produk: "); // Meminta pengguna memasukkan harga produk
            double harga = input.nextDouble(); // Membaca input harga sebagai nilai bertipe double

            System.out.print("Masukkan stok produk: "); // Meminta pengguna memasukkan stok produk
            int stok = input.nextInt(); // Membaca input stok sebagai bilangan bulat
            input.nextLine(); // Membersihkan newline setelah input angka agar tidak mengganggu input berikutnya

            System.out.print("Masukkan kategori: "); // Meminta pengguna memasukkan kategori produk
            String kategori = input.nextLine(); // Membaca input kategori sebagai String

            System.out.print("Masukkan deskripsi: "); // Meminta pengguna memasukkan deskripsi produk
            String deskripsi = input.nextLine(); // Membaca input deskripsi sebagai String

            Produk produk = new Produk(nama, harga, stok, kategori, deskripsi); // Membuat objek Produk dengan data yang telah dimasukkan
            System.out.println("Info Produk: " + produk.getInfoProduk()); // Menampilkan informasi lengkap produk

        } catch (InputMismatchException e) { // Menangani kesalahan jika pengguna memasukkan data dengan tipe yang tidak sesuai
            System.out.println("Terjadi kesalahan input. Pastikan harga dan stok berupa angka!"); // Memberikan pesan kesalahan yang informatif
        } finally {
            input.close(); // Menutup Scanner untuk mencegah kebocoran memori
        }
    }
}
