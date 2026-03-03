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
public class H_Modul1Pertemuan10ke4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// membuat objek Scanner
        String nama, alamat, hobi;
        System.out.print("Nama: ");
        nama = input.nextLine(); // membaca input nama
        System.out.print("Alamat: ");
        alamat = input.nextLine(); // membaca input alamat
        System.out.print("Hobi: ");
        hobi = input.nextLine(); // membaca input hobi
        System.out.println(); // baris kosong
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Hobi: " + hobi);
        input.close(); // menutup Scanner
    }
}

