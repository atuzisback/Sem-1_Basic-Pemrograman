/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class J_WithoutExceptionHandling {
    public static void main(String[] args){
        System.out.println("\n********* PROGRAM TANPA HANDLING *********\n");
        int hasil = 9/0; //penyebab exception
        System.out.println("Hasil Pembagian = "+hasil);
        System.out.println("Pernyataan setelah bebas dari exception.");
    }
}

//a. baris int hasil = 9/0; tidak diperbolehkan secara matematis. program akan melempar Exception tipe ArithmeticException.

        