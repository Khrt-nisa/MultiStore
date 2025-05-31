/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab8;

/**
 *
 * @author Nisa
 */
import java.util.InputMismatchException; // Mengimpor class untuk menangani kesalahan input bertipe data tidak sesuai
import java.util.Scanner; // Mengimpor class Scanner untuk mengambil input dari pengguna

public class PakaianConsole {

    public static void main(String[] args) { // Metode utama program
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        try {
            System.out.print("Nama pakaian: "); // Meminta input nama pakaian
            String nama = input.nextLine(); // Membaca input nama sebagai String

            System.out.print("Harga: "); // Meminta input harga pakaian
            double harga = input.nextDouble(); // Membaca input harga sebagai double

            System.out.print("Stok: "); // Meminta input stok pakaian
            int stok = input.nextInt(); // Membaca input stok sebagai integer
            input.nextLine(); // Membersihkan karakter newline setelah input angka

            System.out.print("Deskripsi: "); // Meminta input deskripsi pakaian
            String deskripsi = input.nextLine(); // Membaca input deskripsi sebagai String

            System.out.print("Ukuran: "); // Meminta input ukuran pakaian
            String ukuran = input.nextLine(); // Membaca input ukuran sebagai String

            System.out.print("Warna: "); // Meminta input warna pakaian
            String warna = input.nextLine(); // Membaca input warna sebagai String

            Pakaian p = new Pakaian(nama, harga, stok, "Pakaian", deskripsi, ukuran); // Membuat objek Pakaian dengan data yang telah dimasukkan
            p.setWarna(warna); // Mengatur warna menggunakan setter karena konstruktor belum mendukung parameter warna
            System.out.println("Info Pakaian: " + p.getInfoProduk()); // Menampilkan informasi lengkap produk pakaian

        } catch (InputMismatchException e) {
            System.out.println("Input salah! Harga dan stok harus berupa angka."); // Menangani kesalahan jika input tidak sesuai tipe data angka
        } finally {
            input.close(); // Menutup objek Scanner untuk mencegah kebocoran sumber daya
        }
    }
}