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
public class UASIF {
    public static void main(String[] args) {
        // 1. Deklarasi variabel yang benar
        String passwordBenar = "170707";
        String inputUser;
        Scanner input = new Scanner(System.in);

        System.out.println("=== Selamat Datang di Aplikasi ===");
        
        // 2. Meminta input dari user
        System.out.print("Masukkan Password: ");
        inputUser = input.nextLine();

        // 3. Logika Percabangan (IF-ELSE)
        if (inputUser.equals(passwordBenar)) {
            System.out.println("Selamat datang di aplikasi ini!");
        } else {
            System.out.println("Passwordnya salah, coba lagi.");
        }

        System.out.println("Terimakasih telah menggunakan aplikasi ini.");
        
        input.close(); // Menutup scanner
    }
}