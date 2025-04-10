/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab3;

/**
 *
 * @author Nisa
 */
public class MainElektronik { // Class utama untuk menjalankan program Elektronik
    public static void main(String[] args) { // Method main: titik awal program dijalankan
        java.awt.EventQueue.invokeLater(new Runnable() { // Menjalankan GUI_Elektronik
            public void run() { // Method yang akan dijalankan
                new GUI_Elektronik().setVisible(true); // Membuat dan menampilkan form GUI_Elektronik ke layar
            }
        });
    }
}
