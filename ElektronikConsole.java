/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab8;

/**
 *
 * @author Nisa
 */
import java.util.InputMismatchException; // Mengimpor class untuk menangani exception jika input tidak sesuai tipe data
import java.util.Scanner; // Mengimpor class Scanner untuk mengambil input dari pengguna

public class ElektronikConsole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        try {
            System.out.print("Nama produk elektronik: "); // Meminta input nama produk
            String nama = input.nextLine(); // Membaca input nama sebagai string

            System.out.print("Harga: "); // Meminta input harga produk
            double harga = input.nextDouble(); // Membaca input harga sebagai double

            System.out.print("Stok: "); // Meminta input jumlah stok
            int stok = input.nextInt(); // Membaca input stok sebagai integer
            input.nextLine(); // Membersihkan buffer setelah membaca angka

            System.out.print("Deskripsi: "); // Meminta input deskripsi produk
            String deskripsi = input.nextLine(); // Membaca input deskripsi sebagai string

            System.out.print("Kategori: "); // Meminta input kategori produk
            String kategori = input.nextLine(); // Membaca input kategori sebagai string

            // Membuat objek Elektronik dengan data input
            Elektronik e = new Elektronik(nama, harga, stok, kategori,deskripsi);
            System.out.println("\nInfo Elektronik:\n" + e.getInfoProduk()); // Menampilkan informasi produk ke konsol

        } catch (InputMismatchException ex) {
            System.out.println("Input tidak valid! Harga dan stok harus berupa angka."); // Menangani kesalahan jika input tidak sesuai tipe angka
        } finally {
            input.close(); // Menutup scanner untuk menghindari kebocoran sumber daya
        }
    }
}
