/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class UTS_programBangunRuang {
    // deklarasi jumlah sisi
    int sisi = 5;

    // Prosedur volume ruang kubus
    void ruangKubus() {
        int hasil = sisi * sisi * sisi;
        System.out.println("Volume Bangun Ruang Kubus = " + hasil + "cm3");
    }

    // Static Method volume rumus balok
    static int rumusBalok(int p, int l, int t) {
        return p * l * t;
    }

    public static void main(String[] args) {

        // Memulai scanner dengan try
        try (Scanner scan = new Scanner(System.in)) {
            
            // Tulisan diatas scanner
            System.out.println("Mau Menghitung apa? :");
            System.out.println("1. Volume Bangun Ruang Kubus");
            System.out.println("2. Volume Bangun Ruang Balok");

            // Scannernya
            int pilihan = scan.nextInt();

            // Inisialisasi class
            UTS_programBangunRuang p = new UTS_programBangunRuang();

            // Percabangan Switch
            switch (pilihan) {
                case 1 -> p.ruangKubus();
                case 2 -> System.out.println("Volume Balok = " + rumusBalok(5, 10, 4) + "cm3");
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}
