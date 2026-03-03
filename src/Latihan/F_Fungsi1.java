/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_Fungsi1 {
    //Deklarasi Variabel
    int sisi = 10;
    
    //ini Fungsi tanpa parameter
    int hitungLuasPersegi () {
        int luas = sisi*sisi;
        System.out.println("Sisi "+sisi);
        return luas;    
    }
    // main method
    public static void main (String args[]) {
        
    // memamnggil fungsi
    F_Fungsi1 f = new F_Fungsi1 (); 
        System.out.println("Luas Persegi; "+f.hitungLuasPersegi());
    }
}
