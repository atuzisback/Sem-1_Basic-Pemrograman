/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class H_ContohString1_15MacamString {
    public static void main(String[] args) {
        String kata = "hai aku Atuz";

        // Menampilkan jumlah karakter
        int jumlahKarakter = kata.length();
        System.out.println("Jumlah karakter: " + jumlahKarakter);

        // Menampilkan karakter pertama
        char karakterPertama = kata.charAt(0);
        System.out.println("Karakter pertama: " + karakterPertama);

        // Mengubah ke huruf kecil
        String hurufKecil = kata.toLowerCase();
        System.out.println("Huruf kecil: " + hurufKecil);

        // Mengubah ke huruf besar
        String hurufBesar = kata.toUpperCase();
        System.out.println("Huruf besar: " + hurufBesar);

        // Mengambil sebagian teks dari string (5 karakter terakhir)
        String hasilSubstring = kata.substring(jumlahKarakter - 5);
        System.out.println("Substring (5 huruf terakhir): " + hasilSubstring);

        // Mengecek apakah string mengandung kata "Atuz"
        boolean contains = kata.contains("Atuz");
        System.out.println("Contains 'Atuz': " + contains);

        // Mengecek apakah string sama dengan teks tertentu
        boolean nilaiObjek = kata.equals("hai aku Atuz");
        System.out.println("Equals 'hai aku Atuz': " + nilaiObjek);

        // Mengecek apakah string kosong
        boolean kosong = kata.isEmpty();
        System.out.println("Apakah kosong?: " + kosong);

        // Menggabungkan string
        String concat = kata.concat(" cantik");
        System.out.println("Concat: " + concat);

        // Mengganti huruf 'a' menjadi 'o'
        String gantiKarakter = kata.replace('a', 'o');
        System.out.println("Replace: " + gantiKarakter);

        // Mencari posisi kata "hai" dalam string
        int index = kata.indexOf("hai");
        System.out.println("Index dari 'hai': " + index);

        // Menghapus spasi di awal dan akhir
        String kataSpasi = kata.trim();
        System.out.println("Trim: " + kataSpasi);

        // Mengubah angka menjadi string
        int angka = 7;
        String nilaiAngka = String.valueOf(angka);
        System.out.println("ValueOf: " + nilaiAngka);

        // Membandingkan urutan alfabet string
        int compareTo = kata.compareTo("hai aku Atuz");
        System.out.println("CompareTo: " + compareTo);

        // Format teks dengan String.format()
        String format = String.format("Kalimat: %s (%d huruf)", kata, kata.length());
        System.out.println("Format: " + format);
    }
}

