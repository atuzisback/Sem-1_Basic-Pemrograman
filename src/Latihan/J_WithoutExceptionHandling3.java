/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class J_WithoutExceptionHandling3 {
    public static void main(String[] args){
        System.out.println("\n********* PROGRAM DENGAN EXCEPTION HANDLING *********\n");
        try {
            int hasil = 9 / 0; // penyebab exception
            System.out.println("Hasil Pembagian = " + hasil);
            System.out.println("Pernyataan dalam blok try setelah bebas dari exception.");
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception hasil pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah: " + exc);
        } finally {
            System.out.println("\nBlok finally selalu dijalankan, baik ada exception maupun tidak.");
        }
        System.out.println("\nPernyataan di luar blok try-catch-finally.");
    }
}

//a. ArithmeticException menangkap exception hasil pembagian oleh nol.********* PROGRAM DENGAN EXCEPTION HANDLING ********* Exception yang ditangkap adalah: java.lang.ArithmeticException: / by zero Blok finally selalu dijalankan, baik ada exception maupun tidak. Pernyataan di luar blok try-catch-finally.
// b. Program dimulai dan mencetak header.
// Eksekusi masuk ke blok try.
// Baris int hasil = 9 / 0; menyebabkan ArithmeticException karena pembagian dengan nol.
// Karena terjadi exception, eksekusi langsung melompat ke blok catch, jadi baris berikutnya di try tidak dijalankan.
// Di dalam catch, program mencetak pesan kesalahan yang menunjukkan exception tertangkap.
// Setelah catch, blok finally selalu dijalankan, baik ada exception atau tidak.→ Ini berguna untuk membersihkan resource seperti menutup file, koneksi database, dll.
// Setelah selesai, program melanjutkan ke pernyataan di luar try-catch-finally.