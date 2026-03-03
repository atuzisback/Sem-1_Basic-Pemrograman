/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_FungsiparambangunRuang2 {
    // ini fungsi dengan parameter
    int hitungVolumeKubus(int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        System.out.println("Rusuk " + rusuk);
        return volume;
    }
    // main method
    public static void main(String args[]) {
        // memanggil fungsi
        int rusuk = 12;
        F_FungsiparambangunRuang2 f = new F_FungsiparambangunRuang2();
        int volume = f.hitungVolumeKubus(rusuk);
        System.out.println("Volume kubus " + volume);
    }  
}
