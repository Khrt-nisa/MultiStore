/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

/**
 *
 * @author Nisa
 */
public class MainPakaian { // Class utama untuk menjalankan program Pakaian
    public static void main(String[] args) { // Method main
        java.awt.EventQueue.invokeLater(new Runnable() { // Menjalankan GUI_Pakaian
            public void run() { // Method yang akan dijalankan
                new GUI_Pakaian().setVisible(true); // Membuat dan menampilkan form GUI_Pakaian ke layar
            }
        });
    }
}
