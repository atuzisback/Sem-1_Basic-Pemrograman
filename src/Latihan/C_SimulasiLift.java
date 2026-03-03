/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class C_SimulasiLift {

    public static void main(String[] args) {
           // Inisiasi variabel lift
           Scanner scan = new Scanner(System.in);
           int lantaiSekarang = 3; 

           // misal lift sedang di lantai 3
           System.out.println("Lift sedang di lantai: " + lantaiSekarang);
           System.out.print("Masukkan lantai tujuan (1-5): ");
           
           // Mengambil input dari user
           int lantaiTujuan = scan.nextInt();
           
           if (lantaiTujuan < 1 || lantaiTujuan > 5) {
               System.out.println("Lantai tidak valid!");
           } else if (lantaiTujuan == lantaiSekarang) {
               System.out.println("Lift tetap di lantai " + lantaiSekarang);
           } else if (lantaiTujuan > lantaiSekarang) {
               System.out.println("Lift naik dari lantai " + lantaiSekarang + " ke lantai " + lantaiTujuan);
           } else {
               System.out.println("Lift turun dari lantai " + lantaiSekarang + " ke lantai " + lantaiTujuan);
           }
            // Tutup scanner
               scan.close();
    }
}
