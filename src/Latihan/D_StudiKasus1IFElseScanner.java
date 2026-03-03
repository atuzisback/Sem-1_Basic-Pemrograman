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
public class D_StudiKasus1IFElseScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        if (umur < 5) {
            System.out.println("Kategori: Balita");
        } else if (umur < 12) {
            System.out.println("Kategori: Anak-anak");
        } else if (umur < 18) {
            System.out.println("Kategori: Remaja");
        } else if (umur < 60) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia");
        }
    }
}

