/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_FungsiparambangunRuangSTATIC {
    // membuat fungsi VolumeBalok
    static int VolumeBalok(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    // membuat fungsi VolumeKubus
    static int VolumeKubus(int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        return volume;
    }

    // membuat fungsi LuasPersegi
    static int LuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }    

    // main method
    public static void main(String args[]) {
        // memanggil fungsi
        System.out.println("Volume Balok " + VolumeBalok(5, 5, 5));
        System.out.println("Volume Kubus " + VolumeKubus(12));
        System.out.println("Luas Persegi " + LuasPersegi(7));
    }
}

