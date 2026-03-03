/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class J_WithoutExceptionHandling2 {
    public static void main(String[] args){
    System.out.println("\n********* PROGRAM DENGAN EXCEPTION HANDLING *********\n");
    try
    {
        int hasil = 9/0; //penyebab exception
        System.out.println("Hasil Pembagian = "+hasil);
        System.out.println("Pernyataan dalam blok try setelah bebas dari exception.");
    }
    catch(ArithmeticException exc)
    {
        System.err.println("ArithmeticException menangkap exception hasil pembagian oleh nol.");
        System.err.println("\nException yang ditangkap adalah: "+exc);
    }
    System.out.println("\nPernyataan di luar blok try-catch.");
    }
}

//a. ArithmeticException menangkap exception hasil pembagian oleh nol.********* PROGRAM DENGAN EXCEPTION HANDLING *********Exception yang ditangkap adalah: java.lang.ArithmeticException: / by zero Pernyataan di luar blok try-catch.
//b. Program menjalankan eksekusi dengan memicu ArithmeticException diblok try, lalu berpindah ke catch, dan lok catch menangkap exception tersebut dan mencetak dua baris penjelasan kesalahan. program melanjutkan ke baris di luar try-catch, menampilkan: Pernyataan di luar blok try-catch.
//c. Karena 9 / 0 tidak menimbulkan exception, maka blok catch diabaikan. Semua pernyataan di dalam blok try dijalankan. Setelah selesai, eksekusi berlanjut ke pernyataan di luar try-catch.