/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_FungsiparambangunRuang1 {
    // ini fungsi dengan parameter
    int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        System.out.println("Panjang " + panjang);
        System.out.println("Lebar " + lebar);
        System.out.println("Tinggi " + tinggi);
        return volume;
    }
    // main method
    public static void main(String args[]) {
        // memanggil fungsi
        int panjang = 5;
        int lebar = 5;
        int tinggi = 5;
        F_FungsiparambangunRuang1 f = new F_FungsiparambangunRuang1();
        int volume = f.hitungVolumeBalok(panjang, lebar, tinggi);
        System.out.println("Volume Balok " + volume);
    }
}
