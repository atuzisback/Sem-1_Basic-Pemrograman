/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXCEPTION;

/**
 *
 * @author WINDOWS
 */
public class J_TugasNullPointerException {
    public static void main(String[] args) {
        System.out.println("=== Contoh NullPointerException dengan Handling ===");

        String nama = null;

        try {
            System.out.println("Panjang nama: " + nama.length());
        } catch (NullPointerException e) {
            System.err.println("Terjadi NullPointerException karena variabel belum diinisialisasi!");
            System.err.println("Detail error : " + e);
        }

        System.out.println("Program tetap berjalan setelah exception ditangani.");
    }
}

