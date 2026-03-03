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
public class D_ForBreakGcr {
    public static void main(String[] args) {
        // Scanner untuk input batas bawah dan atas
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka batas bawah: ");
        int angkaBawah = input.nextInt();

        System.out.print("Masukkan angka batas atas: ");
        int angkaAtas = input.nextInt();

        System.out.println("Bilangan prima antara " + angkaBawah + " dan " + angkaAtas + " adalah:");
        System.out.println("----------------------------------------");

        // Loop untuk mencari bilangan prima
        for (int i = angkaBawah; i <= angkaAtas; i++) {
            if (i < 2) continue; // bilangan < 2 bukan prima
            boolean prima = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + ", ");
            }
        }

        input.close();
    }
}

