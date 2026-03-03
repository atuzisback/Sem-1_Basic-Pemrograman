/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class UTS_Fungsi {
    int panjang = 10, lebar = 5;

    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    void luasPersegiPanjang() {
        int hasil = panjang * lebar;
        System.out.println("hasil = " + hasil);
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi" + luasPersegi(5));
        UTS_Fungsi p = new UTS_Fungsi();
        p.luasPersegiPanjang();
    }
}

