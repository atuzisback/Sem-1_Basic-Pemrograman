/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
import java.util.Scanner;
public class E_While2 {
    public static void main (String[] args){
        //Deklarasi Variabel
        int i, jumlah;
        
        //Deklarasi Scanner
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Perulangannya: ");
        jumlah = inputan.nextInt();
        
        //Perulangan While
        i = 1 ;
        while (i<=jumlah) {
            System.out.println("Dontol ke-: " +i);      //Kondii 
            i++;    //Increment
        }
    }
}
