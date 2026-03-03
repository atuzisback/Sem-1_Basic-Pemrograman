/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_FungsiparambangunRuang3 {
    // ini fungsi dengan parameter
    int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Sisi " + sisi);
        return luas;
    }
    // main method
    public static void main(String args[]) {
        // memanggil fungsi
        int sisi = 7;
        F_FungsiparambangunRuang3 f = new F_FungsiparambangunRuang3();
        int luas = f.hitungLuasPersegi(sisi);
        System.out.println("Luas Persegi " + luas);
    }  
}
 
