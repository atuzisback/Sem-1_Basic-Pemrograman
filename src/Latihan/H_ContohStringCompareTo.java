/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class H_ContohStringCompareTo {
    public static void main(String[] args) {
        String str1 = "irur";
        String str2 = "farel";

        // Membandingkan dua string secara leksikografis (berdasarkan urutan abjad Unicode)
        int hasil = str2.compareTo(str1);

        // Output akan negatif karena "farel" datang sebelum "irur" dalam urutan abjad
        System.out.println("Hasil perbandingan: " + hasil);

        // Penjelasan:
        // compareTo() membandingkan dua string karakter per karakter dari kiri ke kanan.
        // - Mengembalikan angka negatif jika string pemanggil < argumen.
        // - Mengembalikan angka 0 jika kedua string sama.
        // - Mengembalikan angka positif jika string pemanggil > argumen.

        // Contoh lain
        String s1 = "Hi";
        String s2 = "Hi";
        int hasil2 = s1.compareTo(s2);
        // Output: 0 karena kedua string sama
        System.out.println("Perbandingan s1 dan s2: " + hasil2);

        String s3 = "Hello";
        String s4 = "Hi";
        int hasil3 = s3.compareTo(s4);
        // Output: negatif karena 'e' (pada "Hello") < 'i' (pada "Hi") dalam urutan Unicode
        System.out.println("Perbandingan s3 dan s4: " + hasil3);
    }
}

